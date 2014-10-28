package nomina;

//Llamado de Librerias
import lib.Empleado;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */

//Declaracion Clase Empleados
public class Empleados extends javax.swing.JFrame {
    //Declaracion Metodo Empleados
    public Empleados() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro Empleado");
        Deshabilitar();
    }
    //Declaracion Metodo Habilitar
    public void Habilitar(){
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtIdentificacion.setEnabled(true);
        cbxTipo.setEnabled(true);
        txtDomicilio.setEnabled(true);
        txtCiudad.setEnabled(true);
        txtPais.setEnabled(true);
        txtNacionalidad.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtFechaInicio.setEnabled(true);
        txtFechaaNacimiento.setEnabled(true);
        txtEmail.setEnabled(true);
        cbxEstadoCivil.setEnabled(true);
        cbxSexo.setEnabled(true);
        txtCargo.setEnabled(true);
        cbxTipoContrato.setEnabled(true);
        txtSueldo.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnLimpiar.setEnabled(true);
    }
    //Declaracion Metodo Deshabilitar
    public void Deshabilitar(){
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtIdentificacion.setEnabled(false);
        cbxTipo.setEnabled(false);
        txtDomicilio.setEnabled(false);
        txtCiudad.setEnabled(false);
        txtPais.setEnabled(false);
        txtNacionalidad.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtFechaInicio.setEnabled(false);
        txtFechaaNacimiento.setEnabled(false);
        txtEmail.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        txtCargo.setEnabled(false);
        cbxTipoContrato.setEnabled(false);
        txtSueldo.setEnabled(false);
        cbxSexo.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnLimpiar.setEnabled(false); 
    }
    //Declracion Metodo Limpiar
    public void Limpiar(){
        txtNombre.setText("");
        txtApellidos.setText("");
        txtIdentificacion.setText("");
        cbxTipo.setSelectedItem("");
        txtDomicilio.setText("");
        txtCiudad.setText("");
        txtPais.setText("");
        txtNacionalidad.setText("");
        txtTelefono.setText("");
        txtFechaInicio.setDate(null);
        txtFechaaNacimiento.setDate(null);
        txtEmail.setText("");
        cbxEstadoCivil.setSelectedItem(null);
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
        lblIdentificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox();
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
        lblFechaInicio = new javax.swing.JLabel();
        lblFachaNacimiento = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox();
        lblSexo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        lblTipoContrato = new javax.swing.JLabel();
        cbxTipoContrato = new javax.swing.JComboBox();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        txtFechaaNacimiento = new com.toedter.calendar.JDateChooser();

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

        lblIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        lblIdentificacion.setText("Identificacion");

        txtIdentificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "T.I", "C.C", "C.E" }));
        cbxTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdentificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdentificacion)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(28, 73, 5));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Datos Adicionales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        lblDomicilio.setForeground(new java.awt.Color(255, 255, 255));
        lblDomicilio.setText("Domicilio");

        txtDomicilio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });

        lblCiudad.setForeground(new java.awt.Color(255, 255, 255));
        lblCiudad.setText("Ciudad");

        txtCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblPais.setForeground(new java.awt.Color(255, 255, 255));
        lblPais.setText("Pais");

        txtPais.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblNacionalidad.setText("Nacionalidad");

        txtNacionalidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono");

        txtTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        lblFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaInicio.setText("Fecha Inicio");

        lblFachaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFachaNacimiento.setText("Fecha Nacimiento");

        lblEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoCivil.setText("Estado Civil");

        cbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Casado(a)", "Soltero(a)", "Divorciado(a)", "Separado(a)", "Viudo(a)" }));
        cbxEstadoCivil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoCivilActionPerformed(evt);
            }
        });

        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1390967819_left2.png"))); // NOI18N
        btnLimpiar.setToolTipText("LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1391041892_lock.png"))); // NOI18N
        btnGuardar.setToolTipText("GUARDAR");
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

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1391042805_plus.png"))); // NOI18N
        btnNuevo.setToolTipText("NUEVO");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Masculino", "Femenino" }));
        cbxSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoActionPerformed(evt);
            }
        });

        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo");

        txtCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblTipoContrato.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoContrato.setText("Tipo de Contrato");

        cbxTipoContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Termino Fijo", "Termino Indefinido", "Contrato Obra", "Prestacion Servicios", "Contrato de Aprendizaje", "Ocasional" }));
        cbxTipoContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoContratoActionPerformed(evt);
            }
        });

        lblSueldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSueldo.setText("Sueldo");

        txtSueldo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoContrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTipoContrato, 0, 1, Short.MAX_VALUE)
                        .addGap(325, 325, 325))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblDomicilio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblCiudad)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblTelefono)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblFechaInicio)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(lblPais)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(26, 26, 26))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblFachaNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(lblEstadoCivil)
                                .addGap(18, 18, 18)
                                .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNacionalidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblEmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblSueldo)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(lblSexo)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacionalidad)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefono)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaInicio)
                        .addComponent(lblEmail)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFachaNacimiento)
                                .addComponent(lblEstadoCivil)
                                .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSexo)
                                .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFechaaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCargo)
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTipoContrato)
                                .addComponent(cbxTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSueldo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Accion Caja de Texto Identificacion
    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        
    }//GEN-LAST:event_txtIdentificacionActionPerformed
    //Accion Caja de Texto Telefono
    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        
    }//GEN-LAST:event_txtTelefonoActionPerformed
    //Accion Boton Limpiar
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Llamado Metodo Limpiar
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    //Accion Boton Menu
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        //Llamado de la Interfaz Inicio
        Inicio in = new Inicio();        
        in.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed
    //Accion Boton Nuevo
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //Llamado Metodo Habilitar
        Habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed
    //Accion Boton Guardar    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Declaracion de Guardado Opcional
        int Respuesta;
        //Creacion de Mensaje de Confirmacion
        Respuesta = JOptionPane.showConfirmDialog(null, "Desea Guardar el Registro","Guardar",JOptionPane.YES_NO_OPTION);
        //Llamado de Datos y Valores de los Componentes
        String Cedula = txtIdentificacion.getText();
        String Tipo = cbxTipo.getSelectedItem().toString();
        String Nombre = txtNombre.getText();
        String Apellido = txtApellidos.getText();
        String Cargo = txtCargo.getText();
        String TipoContrato = cbxTipoContrato.getSelectedItem().toString();
        Integer Sueldo = Integer.valueOf(txtSueldo.getText());
        String Domicilio = txtDomicilio.getText();
        String Ciudad = txtCiudad.getText();
        String Pais = txtPais.getText();
        String Nacionalidad = txtNacionalidad.getText();
        String Telefono = txtTelefono.getText();
        String FechaInicio = new SimpleDateFormat("yyyy/MM/dd").format(txtFechaInicio.getDate());
        String FechaNacimiento = new SimpleDateFormat("yyyy/MM/dd").format(txtFechaaNacimiento.getDate());
        String Email = txtEmail.getText();
        String EstadoCivil = cbxEstadoCivil.getSelectedItem().toString();
        String Sexo = cbxSexo.getSelectedItem().toString();
        //Declaracion Instancia Empleado
        Empleado empleado = new Empleado();
        
        try {
            //Condicional a Respuesta Afirmativa
            if (Respuesta == JOptionPane.YES_OPTION) { 
                //Guardado de Datos
                empleado.setEmpl_ID(Cedula);
                empleado.setEmpl_TipoID(Tipo);
                empleado.setEmpl_Nombre(Nombre);
                empleado.setEmpl_Apellido(Apellido);
                empleado.setEmpl_Cargo(Cargo);
                empleado.setEmpl_TipoContrato(TipoContrato);
                empleado.setEmpl_Sueldo(Sueldo);
                empleado.setEmpl_Domicilio(Domicilio);
                empleado.setEmpl_Ciudad(Ciudad);
                empleado.setEmpl_Pais(Pais);
                empleado.setEmpl_Nacionalidad(Nacionalidad);
                empleado.setEmpl_Telefono(Telefono);
                empleado.setEmpl_FechaInicio(FechaInicio);
                empleado.setEmpl_FechaNac(FechaNacimiento);
                empleado.setEmpl_Email(Email);
                empleado.setEmpl_EstadoCivil(EstadoCivil);
                empleado.setEmpl_Sexo(Sexo);
                //Llamado Metodo Guardar
                empleado.Guardar();
                //LLamado Metodos Limpiar y Deshabilitar
                Limpiar();
                Deshabilitar();
            }
         else
            {
                JOptionPane.showMessageDialog(this, "Cancelado por el Usuario");
                Limpiar();
            }
        }catch(Exception error)
        {
            JOptionPane.showMessageDialog(this, error.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    //Accion Conbo Box Sexo
    private void cbxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexoActionPerformed
        
    }//GEN-LAST:event_cbxSexoActionPerformed
    //Accion Combo Boc Estado Civil
    private void cbxEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoCivilActionPerformed
        
    }//GEN-LAST:event_cbxEstadoCivilActionPerformed
    //Accion Cobo Box Tipo Contrato
    private void cbxTipoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoContratoActionPerformed
        
    }//GEN-LAST:event_cbxTipoContratoActionPerformed
    //Accion Caja de Texto Domicilio
    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
      
    }//GEN-LAST:event_txtDomicilioActionPerformed
    //Accion Caja de Texto Sueldo
    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        
    }//GEN-LAST:event_txtSueldoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNuevo;
    public javax.swing.JComboBox cbxEstadoCivil;
    public javax.swing.JComboBox cbxSexo;
    public javax.swing.JComboBox cbxTipo;
    public javax.swing.JComboBox cbxTipoContrato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFachaNacimiento;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoContrato;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtCargo;
    public javax.swing.JTextField txtCiudad;
    public javax.swing.JTextField txtDomicilio;
    public javax.swing.JTextField txtEmail;
    public com.toedter.calendar.JDateChooser txtFechaInicio;
    public com.toedter.calendar.JDateChooser txtFechaaNacimiento;
    public javax.swing.JTextField txtIdentificacion;
    public javax.swing.JTextField txtNacionalidad;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPais;
    public javax.swing.JTextField txtSueldo;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
