package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.formMultiplica;

/**
 *
 * @author joarevalos
 */
public class ControllerMultiplica implements ActionListener, KeyListener {

    formMultiplica vmultiplica;
    int valor1, valor2, resultado;

    public ControllerMultiplica(formMultiplica vmultiplica) {

        this.vmultiplica = vmultiplica;
        this.eventos();

    }

    public final void eventos() {

        vmultiplica.btnCalcular.addActionListener(this);
        vmultiplica.btnLimpiar.addActionListener(this);
        vmultiplica.txtValor1.addKeyListener(this);
        vmultiplica.txtValor2.addKeyListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(vmultiplica.btnCalcular)) {

            if (!validaValores(vmultiplica.txtValor1)) {
                return;
            }
            if (!validaValores(vmultiplica.txtValor2)) {
                return;
            }

            valor1 = Integer.parseInt(vmultiplica.txtValor1.getText());
            valor2 = Integer.parseInt(vmultiplica.txtValor2.getText());

            resultado = valor1 * valor2;

            vmultiplica.txtResultado.setText(String.valueOf(resultado));

        } else if (evt.equals(vmultiplica.btnLimpiar)) {

            vmultiplica.txtValor1.setText(null);
            vmultiplica.txtValor2.setText(null);
            vmultiplica.txtResultado.setText(null);

        }

    }

    public boolean validaValores(JTextField cajaTexto) {

        if (cajaTexto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Valor ingresado no válido", "Alerta", JOptionPane.ERROR_MESSAGE);
            cajaTexto.grabFocus();
            return false;
        }

        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Object evt = e.getSource();

        if (evt.equals(vmultiplica.txtValor1) || evt.equals(vmultiplica.txtValor2)) {

            char caracter = e.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
