package nomina;

//Llamado de Librerias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lib.Conexion;
import lib.Empleado;

/**
 *
 * @author JP
 */

//Declaracion de la Clase Consulta Empleado
public class ConsultaEmpleado extends javax.swing.JFrame {
    
    //Declaracion Metodo Consulta Empleado
    public ConsultaEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Consulta Empleado");
        Deshabilitar();
    }
    //Declaracion Metodo Habilitar Campos
    public void Habilitar() {
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtIdentificacion.setEnabled(true);
        txtDomicilio.setEnabled(true);
        txtCiudad.setEnabled(true);
        txtPais.setEnabled(true);
        txtNacionalidad.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtEmail.setEnabled(true);
        cbxEstadoCivil.setEnabled(true);
        cbxSexo.setEnabled(true);
        txtCargo.setEnabled(true);
        cbxTipoContrato.setEnabled(true);
        txtSueldo.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    //Declaracion Metodo Deshabilitar Campos
    public void Deshabilitar() {
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtIdentificacion.setEnabled(false);
        txtDomicilio.setEnabled(false);
        txtCiudad.setEnabled(false);
        txtPais.setEnabled(false);
        txtNacionalidad.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtEmail.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        cbxSexo.setEnabled(false);
        txtCargo.setEnabled(false);
        cbxTipoContrato.setEnabled(false);
        txtSueldo.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    //Declaracion Metodo Limpiar Campos
    public void Limpiar() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtIdentificacion.setText("");
        txtDomicilio.setText("");
        txtCiudad.setText("");
        txtPais.setText("");
        txtNacionalidad.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
        cbxEstadoCivil.setSelectedItem(null);
        cbxSexo.setSelectedItem(null);
        txtCargo.setText("");
        cbxTipoContrato.setSelectedItem(null);
        txtSueldo.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDomicilio = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        lblNacionalidad = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblEstadoCivil = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        lblTipoContrato = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        cbxTipoContrato = new javax.swing.JComboBox();
        cbxSexo = new javax.swing.JComboBox();
        cbxEstadoCivil = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(28, 73, 5));

        jPanel1.setBackground(new java.awt.Color(28, 73, 5));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Datos Basicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellidos");

        txtApellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtIdentificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1391055880_search.png"))); // NOI18N
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Numero de Identificacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(lblApellido))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(272, 272, 272)
                        .addComponent(lblNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(txtApellidos))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblApellido)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(28, 73, 5));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Datos Adicionales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.Color.white)); // NOI18N

        lblDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        lblDomicilio.setText("Domicilio");

        txtDomicilio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblCiudad.setForeground(new java.awt.Color(255, 255, 255));
        lblCiudad.setText("Ciudad");

        txtCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblPais.setForeground(new java.awt.Color(255, 255, 255));
        lblPais.setText("Pais");

        txtPais.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblNacionalidad.setText("Nacionalidad");

        txtNacionalidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono");

        txtTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        lblEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoCivil.setText("Estado Civil");

        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1391041892_lock.png"))); // NOI18N
        btnGuardar.setToolTipText("GUARDAR CAMBIOS");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1391042940_archive.png"))); // NOI18N
        btnMenu.setToolTipText("MENU");
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1391042805_plus.png"))); // NOI18N
        btnNuevo.setToolTipText("NUEVA CONSULTA");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1394825613_delete.png"))); // NOI18N
        btnEliminar.setToolTipText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo");

        txtCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblTipoContrato.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoContrato.setText("Tipo Contrato");

        lblSueldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSueldo.setText("Sueldo");

        txtSueldo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        cbxTipoContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Termino Fijo", "Termino Indefinido", "Contrato Obra", "Prestacion Servicios", "Contrato de Aprendizaje", "Ocacional" }));
        cbxTipoContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoContratoActionPerformed(evt);
            }
        });

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Masculino", "Femenino" }));
        cbxSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Casado(a)", "Soltero(a)", "Divorsiado(a)", "Separado(a)", "Viudo(a)", " " }));
        cbxEstadoCivil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoCivilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenu)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblCiudad)
                                        .addGap(25, 25, 25)
                                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblTelefono)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblSexo)
                                                .addGap(36, 36, 36)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(cbxSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(17, 17, 17))
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEstadoCivil)
                                    .addComponent(lblPais))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxEstadoCivil, 0, 120, Short.MAX_VALUE)
                                    .addComponent(txtPais))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNacionalidad)
                                    .addComponent(lblEmail)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblDomicilio)
                                .addGap(20, 20, 20)
                                .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSueldo)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblCargo)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTipoContrato)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail)
                                .addComponent(txtNacionalidad)
                                .addComponent(cbxTipoContrato, 0, 212, Short.MAX_VALUE))
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPais))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEstadoCivil)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCiudad)
                                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNacionalidad)
                                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefono))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoContrato)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSueldo)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Acciones Campo Identificacion
    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed

    }//GEN-LAST:event_txtIdentificacionActionPerformed
    //Acciones Campo Telefono
    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed

    }//GEN-LAST:event_txtTelefonoActionPerformed
    //Acciones Boton Menu
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        //LLamado de la Interfaz de Inicio
        Inicio in = new Inicio();
        in.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed
    //Accion del label Buscar
    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        //Declaracion y llamado al dato dentro de la caja de texto Identificacion 
        String Empl_ID = txtIdentificacion.getText();
        
        try {
            //Conexion a la Base de Datos
            Conexion BaseDatos = new Conexion();
            Connection Con = BaseDatos.conexion();
            //Sentencia SQL
            String SQL = "SELECT * FROM empleado WHERE Empl_ID = ?";
            PreparedStatement Sentencia = Con.prepareStatement(SQL);
            Sentencia.setString(1, Empl_ID);
            ResultSet Consulta = Sentencia.executeQuery();
            //Estructura Repetitiva While hasta encontrar el Empleado
            while (Consulta.next()) {
                //Llenado de Informacion en las Cajas de Texto Correspondientes
                txtIdentificacion.setText(Consulta.getString("Empl_ID"));
                txtNombre.setText(Consulta.getString("Empl_Nombre"));
                txtApellidos.setText(Consulta.getString("Empl_Apellido"));
                txtDomicilio.setText(Consulta.getString("Empl_Domicilio"));
                txtCiudad.setText(Consulta.getString("Empl_Ciudad"));
                txtPais.setText(Consulta.getString("Empl_Pais"));
                txtNacionalidad.setText(Consulta.getString("Empl_Nacionalidad"));
                txtTelefono.setText(String.valueOf(Consulta.getInt("Empl_Telefono")));
                txtEmail.setText(Consulta.getString("Empl_Email"));
                cbxEstadoCivil.setSelectedItem(Consulta.getString("Empl_EstadoCivil"));
                cbxSexo.setSelectedItem(Consulta.getString("Empl_Sexo"));
                txtCargo.setText(Consulta.getString("Empl_Cargo"));
                cbxTipoContrato.setSelectedItem(Consulta.getString("Empl_TipoContrato"));
                txtSueldo.setText(String.valueOf(Consulta.getInt("Empl_Sueldo")));
            }
        } catch (SQLException ex) {
            try {
                throw new Exception("ERROR al Consultar al Empleado con Identificacion" + ex.getMessage());
            } catch (Exception e) {
                Logger.getLogger(ConsultaEmpleado.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_lblBuscarMouseClicked
    //Accion Boton Guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Declaracion de Guardado Afirmativo
        int Respuesta;
        //Creacion de Mensaje de Confirmacion
        Respuesta = JOptionPane.showConfirmDialog(null, "Desea Modificar el Registro ", "Modificar", JOptionPane.YES_NO_OPTION);
        //Llamado de Datos en las Cajas de Texto
        String Cedula = txtIdentificacion.getText();
        String Domicilio = txtDomicilio.getText();
        String Ciudad = txtCiudad.getText();
        String Pais = txtPais.getText();
        String Nacionalidad = txtNacionalidad.getText();
        String Telefono = txtTelefono.getText();
        String Email = txtEmail.getText();
        String EstadoCivil = cbxEstadoCivil.getSelectedItem().toString();
        String Sexo = cbxSexo.getSelectedItem().toString();
        String Cargo = txtCargo.getText();
        String TipoContrato = cbxTipoContrato.getSelectedItem().toString();
        Integer Sueldo = Integer.parseInt(txtSueldo.getText());
        //Declaracion Instancia de Empleado
        Empleado Empl = new Empleado();

        try {
            //Condicion If en la Afirmacion de Guardado de Datos
            if (Respuesta == JOptionPane.YES_OPTION) {
                //Guardado de Datos
                Empl.setEmpl_ID(Cedula);
                Empl.setEmpl_Domicilio(Domicilio);
                Empl.setEmpl_Ciudad(Ciudad);
                Empl.setEmpl_Pais(Pais);
                Empl.setEmpl_Nacionalidad(Nacionalidad);
                Empl.setEmpl_Telefono(Telefono);
                Empl.setEmpl_Email(Email);
                Empl.setEmpl_EstadoCivil(EstadoCivil);
                Empl.setEmpl_Sexo(Sexo);
                Empl.setEmpl_Cargo(Cargo);
                Empl.setEmpl_TipoContrato(TipoContrato);
                Empl.setEmpl_Sueldo(Sueldo);
                //Llamado Metodo Modificar
                Empl.Modificar();
                //LLamado Metodos Limpiar y Deshabilitar 
                Limpiar();
                Deshabilitar();
            } else {
                JOptionPane.showMessageDialog(this, "Cancelado por el Usuario");
                Limpiar();
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    //Accion Boton Nuevo
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //Llamado Metodo Habilitar
        Habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed
    //Accion Boton Eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Declaracion del Eliminacion Alternativa
        int Respuesta;
        //Creacion del Mensaje de Confirmacion de la Accion
        Respuesta = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Registro ", "Eliminar", JOptionPane.YES_NO_OPTION);
        //Declaracion y llamdo al dato dentro de la caja de texto Identificacion 
        String Cedula = txtIdentificacion.getText();
        //Creacion de Instancia de Empleado
        Empleado Empl = new Empleado();

        try {
            //Condicional para Respuesta Afirmativa
            if (Respuesta == JOptionPane.YES_OPTION) {
                //Guardado de Dato 
                Empl.setEmpl_ID(Cedula);
                //Llamado Metodo Eliminar Empleado
                Empl.Eliminar();
                //Llamado Metodo Limpiar y Deshabilitar 
                Limpiar();
                Deshabilitar();
            } else {
                JOptionPane.showMessageDialog(this, "Cancelado por el Usuario");
                Limpiar();
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    //Accion Caja de Texto Email
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
   
    }//GEN-LAST:event_txtEmailActionPerformed
    //Accion Caja de Texto Nacionalidad 
    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
 
    }//GEN-LAST:event_txtNacionalidadActionPerformed
    //Accion Combo Box Tipo Contrato
    private void cbxTipoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoContratoActionPerformed

    }//GEN-LAST:event_cbxTipoContratoActionPerformed
    //Accion ÇCombo Box Estado Civil
    private void cbxEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoCivilActionPerformed

    }//GEN-LAST:event_cbxEstadoCivilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(ConsultaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new ConsultaEmpleado().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNuevo;
    public javax.swing.JComboBox cbxEstadoCivil;
    public javax.swing.JComboBox cbxSexo;
    public javax.swing.JComboBox cbxTipoContrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoContrato;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
