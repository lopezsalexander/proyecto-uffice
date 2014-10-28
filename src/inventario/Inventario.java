/** Inventarios Uffice
 */

package inventario;

/**
 * @author GAES 2
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Constructor de interfaz principal
     */
    public Inventario() {
        initComponents();
        /**Centrar la ventana principal */
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * Componentes del formulario
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generalInv = new javax.swing.JPanel();
        lblmp = new javax.swing.JLabel();
        lblppr = new javax.swing.JLabel();
        lblpt = new javax.swing.JLabel();
        btnmp = new javax.swing.JLabel();
        btnppr = new javax.swing.JLabel();
        btnpt = new javax.swing.JLabel();
        menuInv = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        opciones = new javax.swing.JMenu();
        valuacion = new javax.swing.JMenuItem();
        reportes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblmp.setText("Materias primas");

        lblppr.setText("Productos en proceso");

        lblpt.setText("Productos en general");

        btnmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mPrima.png"))); // NOI18N
        btnmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmpMouseClicked(evt);
            }
        });

        btnppr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enProc.png"))); // NOI18N

        btnpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prodTerm.png"))); // NOI18N
        btnpt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnptMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout generalInvLayout = new javax.swing.GroupLayout(generalInv);
        generalInv.setLayout(generalInvLayout);
        generalInvLayout.setHorizontalGroup(
            generalInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalInvLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblmp)
                .addGap(115, 115, 115)
                .addComponent(lblppr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblpt)
                .addGap(53, 53, 53))
            .addGroup(generalInvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnmp)
                .addGap(18, 18, 18)
                .addComponent(btnppr)
                .addGap(18, 18, 18)
                .addComponent(btnpt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        generalInvLayout.setVerticalGroup(
            generalInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalInvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnppr)
                    .addComponent(btnmp)
                    .addComponent(btnpt))
                .addGap(18, 18, 18)
                .addGroup(generalInvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmp)
                    .addComponent(lblppr)
                    .addComponent(lblpt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        archivo.setText("Archivo");

        salir.setText("Salida");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        archivo.add(salir);

        menuInv.add(archivo);

        opciones.setText("Opciones");

        valuacion.setText("Tipo de valuación");
        valuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valuacionActionPerformed(evt);
            }
        });
        opciones.add(valuacion);

        reportes.setText("Reportes generales");
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });
        opciones.add(reportes);

        menuInv.add(opciones);

        setJMenuBar(menuInv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generalInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generalInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        /**Salida de interfaz*/
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void valuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valuacionActionPerformed
        /**Precargar el tipo de valuación*/
        new Valuacion().setVisible(true);
    }//GEN-LAST:event_valuacionActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        new Reportes().setVisible(true);
    }//GEN-LAST:event_reportesActionPerformed

    private void btnmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmpMouseClicked
        /**Abrir ventana de materias primas*/
        new Producto().setVisible(true);
    }//GEN-LAST:event_btnmpMouseClicked

    private void btnptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnptMouseClicked
        //Reporte
        lib.ReporteInventarios inventario = new lib.ReporteInventarios();
        inventario.GenerarReporte();
    }//GEN-LAST:event_btnptMouseClicked

    /**
     * @param args Argumentos de la clase
     */
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inventario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivo;
    private javax.swing.JLabel btnmp;
    private javax.swing.JLabel btnppr;
    private javax.swing.JLabel btnpt;
    private javax.swing.JPanel generalInv;
    private javax.swing.JLabel lblmp;
    private javax.swing.JLabel lblppr;
    private javax.swing.JLabel lblpt;
    private javax.swing.JMenuBar menuInv;
    private javax.swing.JMenu opciones;
    private javax.swing.JMenuItem reportes;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem valuacion;
    // End of variables declaration//GEN-END:variables
}
