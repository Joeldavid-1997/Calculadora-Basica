package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.formDivide;

/**
 *
 * @author joarevalos
 */
public class ControllerDivide implements ActionListener, KeyListener {

    formDivide vdivide;
    int valor1, valor2, resultado;

    public ControllerDivide(formDivide vdivide) {

        this.vdivide = vdivide;
        this.eventos();

    }

    public final void eventos() {

        vdivide.btnCalcular.addActionListener(this);
        vdivide.btnLimpiar.addActionListener(this);
        vdivide.txtValor1.addKeyListener(this);
        vdivide.txtValor2.addKeyListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(vdivide.btnCalcular)) {

            if (!validaValores(vdivide.txtValor1)) {
                return;
            }
            if (!validaValores(vdivide.txtValor2)) {
                return;
            }

            valor1 = Integer.parseInt(vdivide.txtValor1.getText());
            valor2 = Integer.parseInt(vdivide.txtValor2.getText());

            resultado = valor1 / valor2;

            vdivide.txtResultado.setText(String.valueOf(resultado));

        } else if (evt.equals(vdivide.btnLimpiar)) {

            vdivide.txtValor1.setText(null);
            vdivide.txtValor2.setText(null);
            vdivide.txtResultado.setText(null);

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

        if (evt.equals(vdivide.txtValor1) || evt.equals(vdivide.txtValor2)) {

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
