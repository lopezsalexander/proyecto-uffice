package inventario;

/**
 * Librerías
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lib.LimpiarForms;

/**
 * @author GAES 2
 */
public class Producto extends javax.swing.JFrame {

    /**
     * Instancias de la clase Conexión
     */
    lib.Conexion conn = new lib.Conexion();
    Connection cn = conn.conexion();
    Statement st = conn.conectar();

    /**
     * Constructor
     */
    public Producto() {
        initComponents();
        /**
         * Centrar la ventana principal
         */
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.medida.removeAllItems();
        this.proveedor.removeAllItems();
        try {
            // Consulta Unidad
            ResultSet rs1 = st.executeQuery("SELECT unidad FROM UnidadMedida");
            // Bucle while para la consulta
            while (rs1.next()) {
                //Comenzamos a rellenar el combobox a partir de la consulta
                medida.addItem(rs1.getObject("unidad"));
            }
            // Consulta Proveedor
            ResultSet rs2 = st.executeQuery("SELECT nombreProveedor FROM Proveedor");
            // Bucle while para la consulta
            while (rs2.next()) {
                //Comenzamos a rellenar el combobox a partir de la consulta
                proveedor.addItem(rs2.getObject("nombreProveedor"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex);
        }
    }

    /**
     * Parametros del formulario
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblcod = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lbldescripcion = new javax.swing.JLabel();
        lblunidad = new javax.swing.JLabel();
        lblmarca = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        medida = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        lblproove = new javax.swing.JLabel();
        proveedor = new javax.swing.JComboBox();
        agregar = new javax.swing.JButton();
        agregarproov = new javax.swing.JButton();
        btnverInv = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        cod = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblcod.setText("Código Interno");

        lblnombre.setText("Nombre");

        lbldescripcion.setText("Descripción");

        lblunidad.setText("Unidad de medida");

        lblmarca.setText("Marca");

        medida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Productos");

        nuevo.setText("Nuevo Producto");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        lblproove.setText("Proveedor");

        proveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        agregar.setText("Agregar a Inventario");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        agregarproov.setText("Agregar proveedor");
        agregarproov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarproovActionPerformed(evt);
            }
        });

        btnverInv.setText("Ver Inventario");
        btnverInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverInvActionPerformed(evt);
            }
        });

        modificar.setText("Modificar Producto");

        eliminar.setText("Eliminar Producto");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        cod.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                codStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnverInv, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregarproov)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(lblcod)
                            .addGap(18, 18, 18)
                            .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(buscar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblunidad)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(lblmarca))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(lblnombre)))
                                .addComponent(lblproove)
                                .addComponent(lbldescripcion))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(marca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(medida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnverInv))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcod)
                    .addComponent(buscar)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmarca))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblunidad)
                    .addComponent(medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblproove)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarproov)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldescripcion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(modificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(agregar)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar)))
                .addGap(26, 27, Short.MAX_VALUE))
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

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        /**
         * Búsqueda de producto
         */
        lib.Producto.setCodigo(cod.getValue().toString());
        String sql = "SELECT * FROM Producto WHERE Id = " + lib.Producto.getCodigo();
        try {
            ResultSet rs = st.executeQuery(sql);
            rs.first();
            if (rs.first() == true) {
                nombre.setText(rs.getString(2));
                marca.setText(rs.getString(3));
                medida.setSelectedItem(rs.getObject(4));
                proveedor.setSelectedItem(rs.getObject(5));
                descripcion.setText(rs.getString(6));
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void agregarproovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarproovActionPerformed
        /**
         * Mostrar ventana del proveedor
         */
        new Proveedor().setVisible(true);
        if (Proveedor.getRes() == 1) {
            this.proveedor.removeAllItems();
            try {
                // Consulta Ciudad
                ResultSet rs = st.executeQuery("SELECT nombreProveedor FROM Proveedor");
                // Bucle while para la consulta
                while (rs.next()) {
                    //Comenzamos a rellenar el combobox a partir de la consulta
                    proveedor.addItem(rs.getObject("nombreProveedor"));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "Error: " + e);
            }
        }
    }//GEN-LAST:event_agregarproovActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        /**
         * Ingresar nuevo producto
         */
        LimpiarForms.limpiaFormulario(jPanel1);
        descripcion.setText("");
        try {
            int a = 1;
            ResultSet rs = st.executeQuery("SELECT * FROM Producto");
            rs.last();
            cod.setValue(rs.getInt(1) + a);
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Error: " + ex);
        }
        cod.setEnabled(false);
    }//GEN-LAST:event_nuevoActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        /**
         * Agregar elemento al inventario
         */
        lib.Producto.setCodigo(cod.getValue().toString());
        String sql = "SELECT * FROM Producto WHERE Id = " + lib.Producto.getCodigo();
        try {
            ResultSet rs = st.executeQuery(sql);
            if (rs.last() == true) {
                new Entrada().setVisible(true);
            } else {
                try {
                    PreparedStatement ps = cn.prepareStatement("INSERT INTO Producto VALUES (?,?,?,?,?)");
                    ps.setString(1, nombre.getText());
                    ps.setString(2, marca.getText());
                    ps.setString(3, medida.getSelectedItem().toString());
                    ps.setString(4, proveedor.getSelectedItem().toString());
                    ps.setString(5, descripcion.getText());
                    int res = ps.executeUpdate();
                    if (res == 1) {
                        JOptionPane.showMessageDialog(null, "Datos guardados.");
                        cod.setEnabled(true);
                        int add = JOptionPane.showConfirmDialog(null, "¿Desea agregar el producto al inventario?");
                        if (add == JOptionPane.YES_OPTION) {
                            new Entrada().setVisible(true);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, "Error: " + ex);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }

    }//GEN-LAST:event_agregarActionPerformed

    private void btnverInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverInvActionPerformed
        /**
         * Mostrar inventario de entrada
         */
        new TblEntrada().setVisible(true);
    }//GEN-LAST:event_btnverInvActionPerformed

    private void codStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_codStateChanged
        /**
         * Scroll de búsqueda
         */
        lib.Producto.setCodigo(cod.getValue().toString());
        String sql = "SELECT * FROM Producto WHERE Id = " + lib.Producto.getCodigo();
        try {
            ResultSet rs = st.executeQuery(sql);
            rs.first();
            if (rs.first() == true) {
                nombre.setText(rs.getString(2));
                marca.setText(rs.getString(3));
                medida.setSelectedItem(rs.getObject(4));
                proveedor.setSelectedItem(rs.getObject(5));
                descripcion.setText(rs.getString(6));
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_codStateChanged

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Producto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregarproov;
    private javax.swing.JButton btnverInv;
    private javax.swing.JButton buscar;
    private javax.swing.JSpinner cod;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcod;
    private javax.swing.JLabel lbldescripcion;
    private javax.swing.JLabel lblmarca;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblproove;
    private javax.swing.JLabel lblunidad;
    private javax.swing.JTextField marca;
    private javax.swing.JComboBox medida;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JComboBox proveedor;
    // End of variables declaration//GEN-END:variables
}
