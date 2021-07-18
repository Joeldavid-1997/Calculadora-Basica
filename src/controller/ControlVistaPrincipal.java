package controller;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.formDivide;
import view.formMultiplica;
import view.formPrincipal;
import view.formResta;
import view.formSuma;

/**
 *
 * @author joarevalos
 */
public class ControlVistaPrincipal implements ActionListener {

    formPrincipal vp;
    formSuma vsuma;
    formResta vresta;
    formMultiplica vmultiplica;
    formDivide vdivide;

    public ControlVistaPrincipal(formPrincipal vp) {

        this.vp = vp;
        this.eventos();
        this.vsuma = new formSuma();
        this.vresta = new formResta();
        this.vmultiplica = new formMultiplica();
        this.vdivide = new formDivide();

    }

    public final void eventos() {

        vp.btnInicio.addActionListener(this);
        vp.btnSuma.addActionListener(this);
        vp.btnResta.addActionListener(this);
        vp.btnMultiplica.addActionListener(this);
        vp.btnDivide.addActionListener(this);
        vp.btnSalir.addActionListener(this);

    }

    public void addPanel(JPanel panel) {

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        vp.panelOperaciones.add(panel, gridBagConstraints);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(vp.btnInicio)) {

            addPanel(vp.panelInicio);
            visualizarPanel("Inicio");
            vp.barraDesplazamientoOperaciones.setViewportView(vp.panelInicio);
            vp.panelOperaciones.validate();

        } else if (evt.equals(vp.btnSuma)) {

            addPanel(vsuma);
            visualizarPanel("Suma");
            vp.barraDesplazamientoOperaciones.setViewportView(vsuma);
            vp.panelOperaciones.validate();
            
        } else if (evt.equals(vp.btnResta)) {

            addPanel(vresta);
            visualizarPanel("Resta");
            vp.barraDesplazamientoOperaciones.setViewportView(vresta);
            vp.panelOperaciones.validate();

        } else if (evt.equals(vp.btnMultiplica)) {

            addPanel(vmultiplica);
            visualizarPanel("Multiplica");
            vp.barraDesplazamientoOperaciones.setViewportView(vmultiplica);
            vp.panelOperaciones.validate();
            
        } else if (evt.equals(vp.btnDivide)) {

            addPanel(vdivide);
            visualizarPanel("Multiplica");
            vp.barraDesplazamientoOperaciones.setViewportView(vdivide);
            vp.panelOperaciones.validate();

        } else if (evt.equals(vp.btnSalir)) {

            int confirmar = JOptionPane.showConfirmDialog(null,
                    "¿ESTA SEGURO QUE DESEA SALIR?", "Alerta", 
                    JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if (confirmar == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        }
    }

    public void visualizarPanel(String nombrePanel) {

        switch (nombrePanel) {

            case "Inicio":
                vp.panelInicio.setVisible(true);
                vsuma.setVisible(false);

                break;

            case "Suma":
                vsuma.setVisible(true);
                vp.panelInicio.setVisible(false);

                break;

            case "Resta":
                vresta.setVisible(true);
                vp.panelInicio.setVisible(false);

                break;

            case "Multiplica":
                vmultiplica.setVisible(true);
                vp.panelInicio.setVisible(false);

                break;

            case "Divide":
                vdivide.setVisible(true);
                vp.panelInicio.setVisible(false);

                break;
        }
    }

}
