package nomina;

//Llamado de Librerias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lib.Conexion;
import lib.Nomina;
import lib.ReporteNomina;

/**
 *
 * @author JP
 */

//Declaracion de la Clase Generacion Nomina
public class GeneracionNomina extends javax.swing.JFrame {
    //Declaracion Metodo Generacion Nomina
    public GeneracionNomina() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Generacion Nomina");
        Deshabilitar();
        
    }
    //Creacion Metodo Habilitar
    public void Habilitar() {
        txtIdentificacion.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtTipoContrato.setEnabled(true);
        txtDesde.setEnabled(true);
        txtHasta.setEnabled(true);
        txtNumeroComprobante.setEnabled(true);
        txtSueldo.setEnabled(true);
        txtAuxilio.setEnabled(true);
        txtVentas.setEnabled(true);
        txtComisiones.setEnabled(true);
        cbxHorasExtra.setEnabled(true);
        txtCantidadHorasExtra.setEnabled(true);
        txtHorasExtra.setEnabled(true);
        txtSalud.setEnabled(true);
        txtAFP.setEnabled(true);
        txtDias.setEnabled(true);
        txtValor.setEnabled(true);
        txtDias2.setEnabled(true);
        txtValor2.setEnabled(true);
        txtPagoNeto.setEnabled(true);
        txtElaborado.setEnabled(true);
        txtRevisado.setEnabled(true);
        txtAutorizado.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnPrestaciones.setEnabled(true);
        btnInforme.setEnabled(true);
        btnLimpiar.setEnabled(true);
    }
    //Declaracion Metodo Deshabilitar
    public void Deshabilitar() {
        txtIdentificacion.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtTipoContrato.setEnabled(false);
        txtDesde.setEnabled(false);
        txtHasta.setEnabled(false);
        txtNumeroComprobante.setEnabled(false);
        txtSueldo.setEnabled(false);
        txtAuxilio.setEnabled(false);
        txtVentas.setEnabled(false);
        txtComisiones.setEnabled(false);
        cbxHorasExtra.setEnabled(false);
        txtCantidadHorasExtra.setEnabled(false);
        txtHorasExtra.setEnabled(false);
        txtSalud.setEnabled(false);
        txtAFP.setEnabled(false);
        txtDias.setEnabled(false);
        txtValor.setEnabled(false);
        txtDias2.setEnabled(false);
        txtValor2.setEnabled(false);
        txtPagoNeto.setEnabled(false);
        txtElaborado.setEnabled(false);
        txtRevisado.setEnabled(false);
        txtAutorizado.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnPrestaciones.setEnabled(false);
        btnInforme.setEnabled(false);
        btnLimpiar.setEnabled(false);
    }
    //Creacion Metodo Limpiar
    public void Limpiar() {
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtTipoContrato.setText("");
        txtDesde.setDate(null);
        txtHasta.setDate(null);
        txtNumeroComprobante.setText("");
        txtSueldo.setText("");
        txtAuxilio.setText("");
        txtVentas.setText("");
        txtComisiones.setText("");
        cbxHorasExtra.setSelectedItem("");
        txtCantidadHorasExtra.setText("");
        txtHorasExtra.setText("");
        txtSalud.setText("");
        txtAFP.setText("");        
        txtDias.setText("");
        txtValor.setText("");
        txtDias2.setText("");
        txtValor2.setText("");
        txtPagoNeto.setText("");
        txtElaborado.setText("");
        txtRevisado.setText("");
        txtAutorizado.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtHoras = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblEmpleado = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        lblDesde = new javax.swing.JLabel();
        lblHasta = new javax.swing.JLabel();
        lblNumeroComprobante = new javax.swing.JLabel();
        txtNumeroComprobante = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblBusqueda = new javax.swing.JLabel();
        txtDesde = new com.toedter.calendar.JDateChooser();
        txtHasta = new com.toedter.calendar.JDateChooser();
        lblTipoContrato = new javax.swing.JLabel();
        txtTipoContrato = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        txtAuxilio = new javax.swing.JTextField();
        lblAuxilioTransporte = new javax.swing.JLabel();
        lblHorasExtra = new javax.swing.JLabel();
        txtCantidadHorasExtra = new javax.swing.JTextField();
        lblComisiones = new javax.swing.JLabel();
        txtComisiones = new javax.swing.JTextField();
        lblPagoNeto = new javax.swing.JLabel();
        txtPagoNeto = new javax.swing.JTextField();
        lblElaborado = new javax.swing.JLabel();
        txtElaborado = new javax.swing.JTextField();
        lblRevisado = new javax.swing.JLabel();
        txtRevisado = new javax.swing.JTextField();
        lblAutorizado = new javax.swing.JLabel();
        txtAutorizado = new javax.swing.JTextField();
        btnPrestaciones = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnInforme = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtHorasExtra = new javax.swing.JTextField();
        lblCantidadHoras = new javax.swing.JLabel();
        lblValorHoras = new javax.swing.JLabel();
        lblSalud = new javax.swing.JLabel();
        lblAFP = new javax.swing.JLabel();
        txtAFP = new javax.swing.JTextField();
        txtSalud = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblVentas = new javax.swing.JLabel();
        txtVentas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblIncapacidades = new javax.swing.JLabel();
        lblDiasNoTrabajados = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        txtDias2 = new javax.swing.JTextField();
        lblDias = new javax.swing.JLabel();
        lblDias2 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        cbxHorasExtra = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 73, 5));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Datos Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setToolTipText("Empleado");

        lblEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleado.setText("Empleado");

        txtIdentificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblDesde.setForeground(new java.awt.Color(255, 255, 255));
        lblDesde.setText("Desde");

        lblHasta.setForeground(new java.awt.Color(255, 255, 255));
        lblHasta.setText("Hasta");

        lblNumeroComprobante.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroComprobante.setText("Numero de Comprobante");

        txtNumeroComprobante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNumeroComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroComprobanteActionPerformed(evt);
            }
        });

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos");

        txtApellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1391055880_search.png"))); // NOI18N
        lblBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        lblBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBusquedaMouseClicked(evt);
            }
        });

        lblTipoContrato.setForeground(new java.awt.Color(240, 240, 240));
        lblTipoContrato.setText("Tipo de Contrato");

        txtTipoContrato.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBusqueda)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(76, 76, 76))
                            .addComponent(txtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidos)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoContrato))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroComprobante))
                        .addGap(206, 206, 206))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDesde)
                            .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHasta))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumeroComprobante)
                        .addComponent(lblNombre)
                        .addComponent(lblApellidos)
                        .addComponent(lblTipoContrato))
                    .addComponent(lblEmpleado)
                    .addComponent(lblBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesde)
                    .addComponent(lblHasta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(28, 73, 5));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Datos Nomina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        lblSueldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSueldo.setText("Sueldo");

        txtSueldo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        txtAuxilio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblAuxilioTransporte.setForeground(new java.awt.Color(255, 255, 255));
        lblAuxilioTransporte.setText("Auxilio Transporte");

        lblHorasExtra.setForeground(new java.awt.Color(255, 255, 255));
        lblHorasExtra.setText("Horas Extra");

        txtCantidadHorasExtra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblComisiones.setForeground(new java.awt.Color(255, 255, 255));
        lblComisiones.setText("Comisiones");

        txtComisiones.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtComisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComisionesActionPerformed(evt);
            }
        });

        lblPagoNeto.setForeground(new java.awt.Color(255, 255, 255));
        lblPagoNeto.setText("Pago Neto");

        txtPagoNeto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPagoNeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoNetoActionPerformed(evt);
            }
        });

        lblElaborado.setForeground(new java.awt.Color(255, 255, 255));
        lblElaborado.setText("Elaborado Por");

        txtElaborado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblRevisado.setForeground(new java.awt.Color(255, 255, 255));
        lblRevisado.setText("Revisado Por");

        txtRevisado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblAutorizado.setForeground(new java.awt.Color(255, 255, 255));
        lblAutorizado.setText("Autorizado Por");

        txtAutorizado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnPrestaciones.setText("Reserva Prestaciones");
        btnPrestaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrestaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestacionesActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1391042940_archive.png"))); // NOI18N
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1391311158_document.png"))); // NOI18N
        btnInforme.setToolTipText("GENERAR INFORME");
        btnInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1390967819_left2.png"))); // NOI18N
        btnLimpiar.setToolTipText("LIMPIAR ");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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

        txtHorasExtra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtHorasExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasExtraActionPerformed(evt);
            }
        });

        lblCantidadHoras.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadHoras.setText("Cantidad");

        lblValorHoras.setForeground(new java.awt.Color(255, 255, 255));
        lblValorHoras.setText("Valor");

        lblSalud.setForeground(new java.awt.Color(255, 255, 255));
        lblSalud.setText("Salud");

        lblAFP.setForeground(new java.awt.Color(255, 255, 255));
        lblAFP.setText("AFP");

        txtAFP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAFPActionPerformed(evt);
            }
        });

        txtSalud.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaludActionPerformed(evt);
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

        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setText("Ventas");

        txtVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(28, 73, 5));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblIncapacidades.setForeground(new java.awt.Color(240, 240, 240));
        lblIncapacidades.setText("Incapacidades");

        lblDiasNoTrabajados.setForeground(new java.awt.Color(240, 240, 240));
        lblDiasNoTrabajados.setText("Dias No Trabajados");

        txtDias.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtDias2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblDias.setForeground(new java.awt.Color(240, 240, 240));
        lblDias.setText("Dias");

        lblDias2.setForeground(new java.awt.Color(240, 240, 240));
        lblDias2.setText("Dias");

        lblValor.setForeground(new java.awt.Color(240, 240, 240));
        lblValor.setText("Valor");

        lblValor2.setForeground(new java.awt.Color(240, 240, 240));
        lblValor2.setText("Valor");

        txtValor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        txtValor2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiasNoTrabajados)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblIncapacidades)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDias2)
                                    .addComponent(lblDias))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDias2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(txtDias))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblValor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIncapacidades))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDias)
                            .addComponent(lblValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addComponent(lblDiasNoTrabajados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDias2)
                    .addComponent(lblValor2)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cbxHorasExtra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "HEOD", "HEON", "DOM.FEST", "HEFD", "HEFN", "REC.NOCT" }));
        cbxHorasExtra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(4, 467, Short.MAX_VALUE)
                        .addComponent(txtPagoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblRevisado)
                                .addGap(18, 18, 18)
                                .addComponent(txtRevisado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblElaborado)
                                .addGap(18, 18, 18)
                                .addComponent(txtElaborado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblAutorizado)
                                .addGap(18, 18, 18)
                                .addComponent(txtAutorizado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(btnPrestaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(lblPagoNeto)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbxHorasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblCantidadHoras)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblValorHoras))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtCantidadHorasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtHorasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSalud))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAFP)
                                            .addComponent(txtAFP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblHorasExtra))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblSueldo))
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAuxilio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVentas))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblAuxilioTransporte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblVentas)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComisiones)
                            .addComponent(txtComisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInforme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSueldo)
                    .addComponent(lblComisiones)
                    .addComponent(lblAuxilioTransporte)
                    .addComponent(lblVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuxilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHorasExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadHoras)
                    .addComponent(lblValorHoras)
                    .addComponent(lblSalud)
                    .addComponent(lblAFP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadHorasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAFP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxHorasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElaborado)
                    .addComponent(txtElaborado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrestaciones)
                    .addComponent(lblPagoNeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPagoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRevisado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRevisado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutorizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAutorizado))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Empleado");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Accion Boton Limpiar
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Llamado Metodo Limpiar
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    //Acion Boton Prestaciones
    private void btnPrestacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestacionesActionPerformed
        //LLamadfo Interfaz Reserva Prestaciones
        ReservaPrestaciones rp = new ReservaPrestaciones();
        rp.setVisible(true);
        //Enviar Valores de una Caja de Texto a otra y Cambio de Interfaz
        rp.txtSueldo.setText(txtSueldo.getText());
        rp.txtComprobante.setText(txtNumeroComprobante.getText());
    }//GEN-LAST:event_btnPrestacionesActionPerformed
    //Accion Caja de Texto Pago Neto
    private void txtPagoNetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoNetoActionPerformed
        //Llamado de Valoeres de las Cajas de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int HorasExtra = Integer.valueOf(txtHorasExtra.getText());
        int AuxilioTransporte = Integer.valueOf(txtAuxilio.getText());
        int Comisiones = Integer.valueOf(txtComisiones.getText());
        int Incapacidades = Integer.valueOf(txtValor.getText());
        int DiasNoTrabajados = Integer.valueOf(txtValor2.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo + HorasExtra + AuxilioTransporte + Comisiones + Incapacidades - DiasNoTrabajados;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtPagoNeto.setText(Resultados);
    }//GEN-LAST:event_txtPagoNetoActionPerformed
    //Accion Caja de Texto Sueldo
    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed

    }//GEN-LAST:event_txtSueldoActionPerformed
    //Accion Caja de Texto VAlor Horas Extra
    private void txtHorasExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasExtraActionPerformed
        //Condicionales de Acuerdo a la Eleccion Escogida
        if (cbxHorasExtra.getSelectedItem().toString().equals("HEOD")) {
            //Lamado de Valores de la Caja de Texto
            int Horas = Integer.valueOf(txtCantidadHorasExtra.getText());
            int ValorHora = 3250;
            int Resultado;
            String Resultados;
            //Operacion
            Resultado = ValorHora * Horas * 175 / 100;
            //Muestra de Resultado
            Resultados = String.valueOf(Resultado);
            txtHorasExtra.setText(Resultados);
        }
        //Condicionales de Acuerdo a la Eleccion Escogida
        if (cbxHorasExtra.getSelectedItem().toString().equals("HEON")) {
            //Lamado de Valores de la Caja de Texto
            int Horas = Integer.valueOf(txtCantidadHorasExtra.getText());
            int ValorHora = 3250;
            int Resultado;
            String Resultados;
            //Operacion
            Resultado = ValorHora * Horas * 175 /100;
            //Muestra de Resultado
            Resultados = String.valueOf(Resultado);
            txtHorasExtra.setText(Resultados);
        }
        //Condicionales de Acuerdo a la Eleccion Escogida
        if (cbxHorasExtra.getSelectedItem().toString().equals("DOM.FEST")) {
            //Lamado de Valores de la Caja de Texto
            int Horas = Integer.valueOf(txtCantidadHorasExtra.getText());
            int ValorHora = 3250;
            int Resultado;
            String Resultados;
            //Operacion
            Resultado = ValorHora * Horas * 175 / 100;
            //Muestra de Resultado
            Resultados = String.valueOf(Resultado);
            txtHorasExtra.setText(Resultados);
        }
        //Condicionales de Acuerdo a la Eleccion Escogida
        if (cbxHorasExtra.getSelectedItem().toString().equals("HEFD")) {
            //Lamado de Valores de la Caja de Texto
            int Horas = Integer.valueOf(txtCantidadHorasExtra.getText());
            int ValorHora = 3250;
            int Resultado;
            String Resultados;
            //Operacion
            Resultado = ValorHora * Horas * 2 / 100;
            //Muestra de Resultado
            Resultados = String.valueOf(Resultado);
            txtHorasExtra.setText(Resultados);
        }
        //Condicionales de Acuerdo a la Eleccion Escogida
        if (cbxHorasExtra.getSelectedItem().toString().equals("HEFN")) {
            //Lamado de Valores de la Caja de Texto
            int Horas = Integer.valueOf(txtCantidadHorasExtra.getText());
            int ValorHora = 3250;
            int Resultado;
            String Resultados;
            //Operacion
            Resultado = ValorHora * Horas * 25 / 100;
            //Muestra de Resultado
            Resultados = String.valueOf(Resultado);
            txtHorasExtra.setText(Resultados);
        }
        //Condicionales de Acuerdo a la Eleccion Escogida
        if (cbxHorasExtra.getSelectedItem().toString().equals("REC.NOCT")) {
            //Lamado de Valores de la Caja de Texto
            int Horas = Integer.valueOf(txtCantidadHorasExtra.getText());
            int ValorHora = 3250;
            int Resultado;
            String Resultados;
            //Operacion
            Resultado = ValorHora * Horas * 35 / 100;
            //Muestra de Resultado
            Resultados = String.valueOf(Resultado);
            txtHorasExtra.setText(Resultados);
        }
    }//GEN-LAST:event_txtHorasExtraActionPerformed
    //Accion Caja de Texto AFP
    private void txtAFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAFPActionPerformed
        //Lamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 4 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtAFP.setText(Resultados);
    }//GEN-LAST:event_txtAFPActionPerformed
    //Accion Caja de Texto
    private void txtSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaludActionPerformed
        //Lamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 4 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtSalud.setText(Resultados);
    }//GEN-LAST:event_txtSaludActionPerformed
    //Accion Boton Nuevo
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //Llamado Metodo Habilitar
        Habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed
    //Accion Boton Inicio
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        //Llamdo Interfaz Inicio
        Inicio in = new Inicio();
        in.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed
    //Accion Caja de Texto Comisiones
    private void txtComisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComisionesActionPerformed
        //Lamado de Valores de la Caja de Texto
        int Ventas = Integer.valueOf(txtVentas.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Ventas * 15 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtComisiones.setText(Resultados);
    }//GEN-LAST:event_txtComisionesActionPerformed
//Accion Label Busqueda Empleado
    private void lblBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBusquedaMouseClicked
        //Llamado y obtencion del Valor de la Caja de Texto
        String Empl_ID = txtIdentificacion.getText();
        
        try {
            //Conexion a la Base de Datos
            Conexion BaseDatos = new Conexion();
            Connection Con = BaseDatos.conexion();
            //Consulta SQL
            String SQL = "SELECT * FROM empleado WHERE Empl_ID = ?";
            PreparedStatement Sentencia = Con.prepareStatement(SQL);
            Sentencia.setString(1, Empl_ID);
            ResultSet Consulta = Sentencia.executeQuery();
            //Declaracion Ciclo Repetitivo While para la Busqueda del Empleado
            while (Consulta.next()) {
                //Llenado de Campos de Txto con la Informacion en la Base de Datos
                txtIdentificacion.setText(Consulta.getString("Empl_ID"));
                txtNombre.setText(Consulta.getString("Empl_Nombre"));
                txtApellidos.setText(Consulta.getString("Empl_Apellido"));
                txtTipoContrato.setText(Consulta.getString("Empl_TipoContrato"));
                txtSueldo.setText(String.valueOf(Consulta.getInt("Empl_Sueldo")));
            }
        } catch (SQLException e) {
            try {
                throw new Exception("ERROR al Consultar al Empleado con Identificacion" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(ConsultaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblBusquedaMouseClicked
    //Accion Boton Guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Asignacion Guardado Alternativo
        int Respuesta;
        //Creacion del Mensaje de Confirmacion paera el Guardado de la Informacion
        Respuesta = JOptionPane.showConfirmDialog(null, "Desea Guardar los Datos", "Guardar", JOptionPane.YES_NO_OPTION);
        //Llamado de Datos y Valores de los Componentes
        Integer NumeroComprobante = Integer.valueOf(txtNumeroComprobante.getText());
        String EmpleadoID = txtIdentificacion.getText();
        String Desde = new SimpleDateFormat("yyyy/MM/dd").format(txtDesde.getDate());
        String Hasta = new SimpleDateFormat("yyyy/MM/dd").format(txtHasta.getDate());
        Integer Sueldo = Integer.valueOf(txtSueldo.getText());
        Integer AuxTrans = Integer.valueOf(txtAuxilio.getText());
        Integer Ventas = Integer.valueOf(txtVentas.getText());
        Integer Comisiones = Integer.valueOf(txtComisiones.getText());
        String HorasExtra = cbxHorasExtra.getSelectedItem().toString();
        Integer Cantidad = Integer.valueOf(txtCantidadHorasExtra.getText());
        Integer ValorHoras = Integer.valueOf(txtHorasExtra.getText());
        Integer DiasIncapacidad = Integer.valueOf(txtDias.getText());
        Integer ValorIncapacidad = Integer.valueOf(txtValor.getText());
        Integer DiasNoTrabajados = Integer.valueOf(txtDias2.getText());
        Integer ValorDiasNoTrabajados = Integer.valueOf(txtValor2.getText());
        Integer Salud = Integer.valueOf(txtSalud.getText());
        Integer AFP = Integer.valueOf(txtAFP.getText());
        Integer PagoNeto = Integer.valueOf(txtPagoNeto.getText());
        String Elaborado = txtElaborado.getText();
        String Revisado = txtRevisado.getText();
        String Autorizado = txtAutorizado.getText();
        //Instanciacion de Nomina
        Nomina Nomi = new Nomina();

        try {
            //Condicion si es Afirmativa la Respuesta
            if (Respuesta == JOptionPane.YES_OPTION) {
                //Guardado de la Informacion en los Campos de Texto
                Nomi.setNomi_Comprobante(NumeroComprobante);
                Nomi.setFK_Empl_ID(EmpleadoID);
                Nomi.setNomi_Desde(Desde);
                Nomi.setNomi_Hasta(Hasta);
                Nomi.setNomi_Sueldo(Sueldo);
                Nomi.setNomi_AuxTransporte(AuxTrans);
                Nomi.setNomi_Ventas(Ventas);
                Nomi.setNomi_Comisiones(Comisiones);
                Nomi.setNomi_HorasExtra(HorasExtra);
                Nomi.setNomi_Cantidad(Cantidad);
                Nomi.setNomi_ValorHoras(ValorHoras);
                Nomi.setNomi_DiasIncapacidad(DiasIncapacidad);
                Nomi.setNomi_ValorIncapacidad(ValorIncapacidad);
                Nomi.setNomi_DiasNoTrabajados(DiasNoTrabajados);
                Nomi.setNomi_ValorDiasNoTrabajados(ValorDiasNoTrabajados);
                Nomi.setNomi_Salud(Salud);
                Nomi.setNomi_AFP(AFP);
                Nomi.setNomi_PagoNeto(PagoNeto);
                Nomi.setNomi_Realizado(Elaborado);
                Nomi.setNomi_Revisado(Revisado);
                Nomi.setNomi_Aprovado(Autorizado);
                //Llamado de Metod Guardar
                Nomi.Guardar();                   
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    //Accion Boton Informe
    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        //Llamado de la Clase ReporteNomina y Metodo Generacion de ReporteNomina
        ReporteNomina R = new ReporteNomina();
        R.GenerarReporte();        
    }//GEN-LAST:event_btnInformeActionPerformed
//Accion Caja de Texto Valor
    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        //Lamado de Valores de la Caja de Texto
        int Dias = Integer.valueOf(txtDias.getText());
        int Valor = 20533;
        int Valor2 = 13551;
        int Resultado;
        String Resultados;
        //Condicion de los Dias 
        if(Dias <= 3){
            //Opreacion
            Resultado = Dias * Valor;
            //Muestra de Resultado
            Resultados = String.valueOf(Resultado);
            txtValor.setText(Resultados);
        }
        else {
            //Operacion
            Resultado = Dias * Valor2;
            //Muestra de Resultado
            Resultados = String.valueOf(Resultado);
            txtValor.setText(Resultados);
        }
    }//GEN-LAST:event_txtValorActionPerformed
//Accion Caja de Texto Valor2
    private void txtValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor2ActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Dias = Integer.valueOf(txtDias2.getText());
        int ValorDia = 20533;
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Dias * ValorDia;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtValor2.setText(Resultados);
    }//GEN-LAST:event_txtValor2ActionPerformed
    //Accion Caja de Texto Tipo Contrato
    private void txtTipoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoContratoActionPerformed

    }//GEN-LAST:event_txtTipoContratoActionPerformed
    //Accion Caja de Texto Numero Comprobante
    private void txtNumeroComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroComprobanteActionPerformed
        
    }//GEN-LAST:event_txtNumeroComprobanteActionPerformed

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
            java.util.logging.Logger.getLogger(GeneracionNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new GeneracionNomina().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(GeneracionNomina.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrestaciones;
    private javax.swing.JComboBox cbxHorasExtra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAFP;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblAutorizado;
    private javax.swing.JLabel lblAuxilioTransporte;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCantidadHoras;
    private javax.swing.JLabel lblComisiones;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblDias2;
    private javax.swing.JLabel lblDiasNoTrabajados;
    private javax.swing.JLabel lblElaborado;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblHorasExtra;
    private javax.swing.JLabel lblIncapacidades;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroComprobante;
    private javax.swing.JLabel lblPagoNeto;
    private javax.swing.JLabel lblRevisado;
    private javax.swing.JLabel lblSalud;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblTipoContrato;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JLabel lblValorHoras;
    private javax.swing.JLabel lblVentas;
    private javax.swing.ButtonGroup rbtHoras;
    private javax.swing.JTextField txtAFP;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtAutorizado;
    private javax.swing.JTextField txtAuxilio;
    private javax.swing.JTextField txtCantidadHorasExtra;
    private javax.swing.JTextField txtComisiones;
    private com.toedter.calendar.JDateChooser txtDesde;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtDias2;
    private javax.swing.JTextField txtElaborado;
    private com.toedter.calendar.JDateChooser txtHasta;
    private javax.swing.JTextField txtHorasExtra;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumeroComprobante;
    private javax.swing.JTextField txtPagoNeto;
    private javax.swing.JTextField txtRevisado;
    private javax.swing.JTextField txtSalud;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTipoContrato;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValor2;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables
    
}
