package inventario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author GAES 2
 */
public class Valuacion extends javax.swing.JFrame {

    /**
     * Constructor
     */
    public Valuacion() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * Componentes del formulario
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        PEPS = new javax.swing.JRadioButton();
        UEPS = new javax.swing.JRadioButton();
        PromP = new javax.swing.JRadioButton();
        guardar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTipo.setText("Seleccione el tipo de valuación");

        PEPS.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        PEPS.setText("Primeras en entrar - Primeras en salir");
        PEPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PEPSActionPerformed(evt);
            }
        });

        UEPS.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        UEPS.setText("Ultimas en entrar - Primeras en salir");
        UEPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UEPSActionPerformed(evt);
            }
        });

        PromP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        PromP.setText("Promedio Ponderado");
        PromP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromPActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTipo)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PromP)
                    .addComponent(UEPS)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(PEPS)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTipo)
                .addGap(33, 33, 33)
                .addComponent(PEPS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UEPS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PromP)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(salir))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PEPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PEPSActionPerformed
        /**Parametriza el inventario a PEPS*/
        lib.Valuacion.setTipo(1);
    }//GEN-LAST:event_PEPSActionPerformed

    private void UEPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UEPSActionPerformed
        /**Parametriza el inventario a UEPS*/
        lib.Valuacion.setTipo(2);
    }//GEN-LAST:event_UEPSActionPerformed

    private void PromPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromPActionPerformed
        /**Parametriza el inventario a Promedio Ponderado*/
        lib.Valuacion.setTipo(3);
    }//GEN-LAST:event_PromPActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        /**Insertar tipo de valuación en la base de datos*/
        lib.Conexion conn = new lib.Conexion();
        Statement st = conn.conectar();
        String SQL = "SELECT * FROM TipoValuacion WHERE ID = "+lib.Valuacion.getTipo()+";";
        try {
            ResultSet rs = st.executeQuery(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(Valuacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Valuación cargada correctamente.");
    }//GEN-LAST:event_guardarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        /**Salida de valuación*/
        if (lib.Valuacion.getTipo() == 0){
        JOptionPane.showMessageDialog(null, "No se han guardado los cambios, Intente nuevamente.");
        } else {
            dispose();
        }
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args Argumentos de la clase
     */
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Valuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Valuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Valuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Valuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Valuacion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PEPS;
    private javax.swing.JRadioButton PromP;
    private javax.swing.JRadioButton UEPS;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
