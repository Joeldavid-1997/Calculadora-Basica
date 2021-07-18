package view;

import controller.ControlVistaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author joarevalos
 */
public class formPrincipal extends JFrame {

    ControlVistaPrincipal controller;

    public formPrincipal() {
        initComponents();
      
        controller = new ControlVistaPrincipal(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        barraDesplazamiento = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplica = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        panelOperaciones = new javax.swing.JPanel();
        barraDesplazamientoOperaciones = new javax.swing.JScrollPane();
        panelInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraDesplazamiento.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        barraDesplazamiento.setAlignmentX(1.0F);
        barraDesplazamiento.setAlignmentY(1.0F);
        barraDesplazamiento.setPreferredSize(new java.awt.Dimension(400, 99));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setAlignmentX(1.0F);
        panelMenu.setAlignmentY(1.0F);
        panelMenu.setPreferredSize(new java.awt.Dimension(396, 100));
        panelMenu.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("MENU PRINCIPAL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        panelMenu.add(jLabel3, gridBagConstraints);

        btnSalir.setBackground(new java.awt.Color(255, 204, 153));
        btnSalir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit-Sign-icon.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir.setIconTextGap(20);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelMenu.add(btnSalir, gridBagConstraints);

        btnInicio.setBackground(new java.awt.Color(255, 204, 153));
        btnInicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home-icon.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setIconTextGap(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        panelMenu.add(btnInicio, gridBagConstraints);

        btnSuma.setBackground(new java.awt.Color(255, 204, 153));
        btnSuma.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plus2-Math-icon.png"))); // NOI18N
        btnSuma.setText("Suma");
        btnSuma.setIconTextGap(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelMenu.add(btnSuma, gridBagConstraints);

        btnResta.setBackground(new java.awt.Color(255, 204, 153));
        btnResta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Minus-Math-icon.png"))); // NOI18N
        btnResta.setText("Resta");
        btnResta.setIconTextGap(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelMenu.add(btnResta, gridBagConstraints);

        btnMultiplica.setBackground(new java.awt.Color(255, 204, 153));
        btnMultiplica.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnMultiplica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Math-Product-icon.png"))); // NOI18N
        btnMultiplica.setText("Multiplicación");
        btnMultiplica.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMultiplica.setIconTextGap(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelMenu.add(btnMultiplica, gridBagConstraints);

        btnDivide.setBackground(new java.awt.Color(255, 204, 153));
        btnDivide.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnDivide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Math-Div-icon.png"))); // NOI18N
        btnDivide.setText("División");
        btnDivide.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDivide.setIconTextGap(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panelMenu.add(btnDivide, gridBagConstraints);

        barraDesplazamiento.setViewportView(panelMenu);

        getContentPane().add(barraDesplazamiento, java.awt.BorderLayout.WEST);

        panelOperaciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOperaciones.setLayout(new java.awt.GridBagLayout());

        panelInicio.setBackground(new java.awt.Color(255, 255, 255));
        panelInicio.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Math-header.png"))); // NOI18N
        panelInicio.add(jLabel1, new java.awt.GridBagConstraints());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("CALCULADORA BÁSICA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        panelInicio.add(jLabel2, gridBagConstraints);

        barraDesplazamientoOperaciones.setViewportView(panelInicio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelOperaciones.add(barraDesplazamientoOperaciones, gridBagConstraints);

        getContentPane().add(panelOperaciones, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane barraDesplazamiento;
    public javax.swing.JScrollPane barraDesplazamientoOperaciones;
    public javax.swing.JButton btnDivide;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnMultiplica;
    public javax.swing.JButton btnResta;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelMenu;
    public javax.swing.JPanel panelOperaciones;
    // End of variables declaration//GEN-END:variables
}
