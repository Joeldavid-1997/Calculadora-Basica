package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.formResta;

/**
 *
 * @author joarevalos
 */
public class ControllerResta implements ActionListener, KeyListener {

    formResta vresta;
    int valor1, valor2, resultado;

    public ControllerResta(formResta vresta) {

        this.vresta = vresta;
        this.eventos();

    }

    public final void eventos() {

        vresta.btnCalcular.addActionListener(this);
        vresta.btnLimpiar.addActionListener(this);
        vresta.txtValor1.addKeyListener(this);
        vresta.txtValor2.addKeyListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(vresta.btnCalcular)) {

            if (!validaValores(vresta.txtValor1)) {
                return;
            }
            if (!validaValores(vresta.txtValor2)) {
                return;
            }

            valor1 = Integer.parseInt(vresta.txtValor1.getText());
            valor2 = Integer.parseInt(vresta.txtValor2.getText());

            resultado = valor1 - valor2;

            vresta.txtResultado.setText(String.valueOf(resultado));

        } else if (evt.equals(vresta.btnLimpiar)) {

            vresta.txtValor1.setText(null);
            vresta.txtValor2.setText(null);
            vresta.txtResultado.setText(null);

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

        if (evt.equals(vresta.txtValor1) || evt.equals(vresta.txtValor2)) {

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
