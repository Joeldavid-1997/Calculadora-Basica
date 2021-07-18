package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.formSuma;

/**
 *
 * @author joarevalos
 */
public class ControllerSuma implements ActionListener, KeyListener {

    formSuma vsuma;
    int valor1, valor2, resultado;

    public ControllerSuma(formSuma vsuma) {

        this.vsuma = vsuma;
        this.eventos();

    }

    public final void eventos() {

        vsuma.btnCalcular.addActionListener(this);
        vsuma.btnLimpiar.addActionListener(this);
        vsuma.txtValor1.addKeyListener(this);
        vsuma.txtValor2.addKeyListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(vsuma.btnCalcular)) {

            if (!validaValores(vsuma.txtValor1)) {
                return;
            }
            if (!validaValores(vsuma.txtValor2)) {
                return;
            }

            valor1 = Integer.parseInt(vsuma.txtValor1.getText());
            valor2 = Integer.parseInt(vsuma.txtValor2.getText());

            resultado = valor1 + valor2;

            vsuma.txtResultado.setText(String.valueOf(resultado));

        } else if (evt.equals(vsuma.btnLimpiar)) {

            vsuma.txtValor1.setText(null);
            vsuma.txtValor2.setText(null);
            vsuma.txtResultado.setText(null);

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

        if (evt.equals(vsuma.txtValor1) || evt.equals(vsuma.txtValor2)) {

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
