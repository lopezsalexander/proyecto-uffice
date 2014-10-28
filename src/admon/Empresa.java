
package admon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import lib.Conexion;

public class Empresa extends javax.swing.JFrame {

    //Instancia de método de conexión
    Conexion con = new Conexion();
    Connection cn = con.conexion();
    Statement st = con.conectar();

    public Empresa() {
        initComponents();
        //Centrar
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        //Cerrar como cuadro unico
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //Vaciar contenedores de jcombobox
        this.regimen.removeAllItems();
        this.ciudad.removeAllItems();
        this.sociedad.removeAllItems();
        try {
            // Consulta Regimen
            ResultSet resultado1 = st.executeQuery("SELECT tipoRegimen FROM Regimen");
            // Bucle while para la consulta
            while (resultado1.next()) {
                //Comenzamos a rellenar el combobox a partir de la consulta
                regimen.addItem(resultado1.getObject("tipoRegimen"));
            }
            //Consulta Ciudad
            ResultSet resultado2 = st.executeQuery("SELECT ciudad FROM Ciudad");
            // Bucle while para la consulta
            while (resultado2.next()) {
                // Comenzamos a rellenar el combobox a partir de la consulta
                ciudad.addItem(resultado2.getObject("ciudad"));
            }
            // Consulta Sociedad
            ResultSet resultado3 = st.executeQuery("SELECT tipoSociedad FROM Sociedad");
            // Bucle while para la consulta
            while (resultado3.next()) {
                // Comenzamos a rellenar el combobox a partir de la consulta
                sociedad.addItem(resultado3.getObject("tipoSociedad"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblnombre = new javax.swing.JLabel();
        lblregimen = new javax.swing.JLabel();
        lblactividad = new javax.swing.JLabel();
        lblnit = new javax.swing.JLabel();
        empresa = new javax.swing.JTextField();
        nit = new javax.swing.JTextField();
        actividad = new javax.swing.JTextField();
        regimen = new javax.swing.JComboBox();
        lblciudad = new javax.swing.JLabel();
        lblreplegal = new javax.swing.JLabel();
        lblsociedad = new javax.swing.JLabel();
        ciudad = new javax.swing.JComboBox();
        replegal = new javax.swing.JTextField();
        sociedad = new javax.swing.JComboBox();
        titulo = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblnombre.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblnombre.setText("Nombre empresa");

        lblregimen.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblregimen.setText("Tipo de régimen");

        lblactividad.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblactividad.setText("Actividad");

        lblnit.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblnit.setText("NIT");

        regimen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblciudad.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblciudad.setText("Ciudad");

        lblreplegal.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblreplegal.setText("Representante legal");

        lblsociedad.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblsociedad.setText("Tipo de sociedad");

        ciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sociedad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titulo.setText("Datos de la empresa");

        aceptar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        lbldireccion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbldireccion.setText("Dirección");

        lbltelefono.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbltelefono.setText("Teléfono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldireccion)
                    .addComponent(lblsociedad)
                    .addComponent(lblreplegal)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblnombre)
                        .addComponent(lblregimen, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblnit, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblactividad)
                    .addComponent(lbltelefono)
                    .addComponent(lblciudad))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aceptar)
                    .addComponent(empresa)
                    .addComponent(nit)
                    .addComponent(actividad)
                    .addComponent(regimen, 0, 200, Short.MAX_VALUE)
                    .addComponent(ciudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(replegal)
                    .addComponent(sociedad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direccion)
                    .addComponent(telefono))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titulo)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnit)
                    .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblregimen)
                    .addComponent(regimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccion)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefono)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblreplegal)
                    .addComponent(replegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsociedad)
                    .addComponent(sociedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblactividad)
                    .addComponent(actividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblciudad)
                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(aceptar)
                .addGap(22, 22, 22))
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

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed

        //Guardar en la base de datos
        
    }//GEN-LAST:event_aceptarActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Empresa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Empresa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField actividad;
    private javax.swing.JComboBox ciudad;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField empresa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblactividad;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblnit;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblregimen;
    private javax.swing.JLabel lblreplegal;
    private javax.swing.JLabel lblsociedad;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField nit;
    private javax.swing.JComboBox regimen;
    private javax.swing.JTextField replegal;
    private javax.swing.JComboBox sociedad;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
