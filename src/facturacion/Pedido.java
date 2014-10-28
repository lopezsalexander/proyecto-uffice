//Paquete
package facturacion;
//Importaciones

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import javax.swing.JOptionPane;

//Class
public class Pedido extends javax.swing.JFrame {

    //Conexión a DB

    lib.Conexion sql = new lib.Conexion();
    Connection conn = sql.conexion();
    //Inicializacion Fecha
    DateFormat df = DateFormat.getDateInstance();

    //Constructor incial
    public Pedido() {
        initComponents();
        //Titulo de la ventana
        this.setTitle("Ventana Pedido");
        //Centrar ventana
        this.setLocationRelativeTo(null);
        //Inicializacion de tipo de pedido
        RadioGrupoPedido();
        RadioGrupoCliente();
        //Metodo Inhabilitar
        Inhabilitar();
    }

    //METODOS
    //Radio grupo pedido
    private void RadioGrupoPedido() {
        rdgPedido.add(rbtPedidoPresencial);
        rdgPedido.add(rbtPedidoTelefonico);
        rdgPedido.add(rbtPedidoWeb);
    }

    //Radio grupo cliente
    private void RadioGrupoCliente() {
        rdgTipoCliente.add(rbtClienteNatural);
        rdgTipoCliente.add(rbtClienteFrecuente);
        rdgTipoCliente.add(rbtClienteMayorista);
    }

    //Metodo Habilitar
    public void Habilitar() {
        //Grupo tipo pedido
        rbtPedidoPresencial.setEnabled(true);
        rbtPedidoTelefonico.setEnabled(true);
        rbtPedidoWeb.setEnabled(true);

        //Grupo Tipo Cliente
        rbtClienteNatural.setEnabled(true);
        rbtClienteFrecuente.setEnabled(true);
        rbtClienteMayorista.setEnabled(true);

        //Datos cliente
        txtNomCliente.setEnabled(true);
        txtDocuCliente.setEnabled(true);
        txtTelCliente.setEnabled(true);
        txtMailCliente.setEnabled(true);

        txtNomCliente.setText("");
        txtDocuCliente.setText("");
        txtTelCliente.setText("");
        txtMailCliente.setText("");

        //Especificaciones adicionales
        txtaEspecificaciones.setEnabled(true);
        txtaEspecificaciones.setText("");

        //Observaciones
        txtaObservaciones.setEnabled(true);
        txtaObservaciones.setText("");

        //Botones Guardar, Cancelar, Enviar, AñadirFecha
        //btnGuarar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEnviar.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnAñadirFecha.setEnabled(true);

        //Posicion del cursor
        txtNomCliente.requestFocus();

        //Pedido
        txtProducto.setEnabled(true);
        txtDetalle.setEnabled(true);
        txtCantidad.setEnabled(true);

        txtProducto.setText("");
        txtDetalle.setText("");
        txtCantidad.setText("");

        //Fecha
        txtFechaEntrega.setEnabled(true);
        txtFechaEntrega.setText("");
        FechaCal.setEnabled(true);
    }

    //Metodo Inhabilitar
    void Inhabilitar() {
        //Grupo tipo pedido
        rbtPedidoPresencial.setEnabled(false);
        rbtPedidoTelefonico.setEnabled(false);
        rbtPedidoWeb.setEnabled(false);

        //Grupo Tipo Cliente
        rbtClienteNatural.setEnabled(false);
        rbtClienteFrecuente.setEnabled(false);
        rbtClienteMayorista.setEnabled(false);

        //Datos Cliente
        txtNomCliente.setEnabled(false);
        txtDocuCliente.setEnabled(false);
        txtTelCliente.setEnabled(false);
        txtMailCliente.setEnabled(false);

        txtNomCliente.setText("");
        txtDocuCliente.setText("");
        txtTelCliente.setText("");
        txtMailCliente.setText("");

        //Especificaciones adicionales
        txtaEspecificaciones.setEnabled(false);
        txtaEspecificaciones.setText("");

        //Observaciones
        txtaObservaciones.setEnabled(false);
        txtaObservaciones.setText("");

        //Botones Guardar, Cancelar, Enviar, AñadirFecha
        //btnGuarar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnEnviar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnAñadirFecha.setEnabled(false);

        //Pedido
        txtProducto.setEnabled(false);
        txtDetalle.setEnabled(false);
        txtCantidad.setEnabled(false);

        txtProducto.setText("");
        txtDetalle.setText("");
        txtCantidad.setText("");

        //Fecha
        txtFechaEntrega.setEnabled(false);
        txtFechaEntrega.setText("");
        FechaCal.setEnabled(false);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdgPedido = new javax.swing.ButtonGroup();
        rdgTipoCliente = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rbtPedidoPresencial = new javax.swing.JRadioButton();
        rbtPedidoTelefonico = new javax.swing.JRadioButton();
        rbtPedidoWeb = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbtClienteNatural = new javax.swing.JRadioButton();
        rbtClienteFrecuente = new javax.swing.JRadioButton();
        rbtClienteMayorista = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNomCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDocuCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTelCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMailCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtDetalle = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        FechaCal = new com.toedter.calendar.JDateChooser();
        txtFechaEntrega = new javax.swing.JTextField();
        btnAñadirFecha = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaEspecificaciones = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaObservaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedido");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pedido");

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Send.png"))); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setToolTipText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        btnNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNuevoKeyPressed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setToolTipText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo de pedido: ");

        rbtPedidoPresencial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtPedidoPresencial.setText("Presencial");

        rbtPedidoTelefonico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtPedidoTelefonico.setText("Telefonico");

        rbtPedidoWeb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtPedidoWeb.setText("Web");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tipo de cliente: ");

        rbtClienteNatural.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtClienteNatural.setText("Cliente natural");

        rbtClienteFrecuente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtClienteFrecuente.setText("Cliente frecuente");

        rbtClienteMayorista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtClienteMayorista.setText("Cliente mayorista");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtPedidoPresencial)
                            .addComponent(rbtPedidoTelefonico)
                            .addComponent(rbtPedidoWeb)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtClienteMayorista)
                            .addComponent(rbtClienteNatural)
                            .addComponent(rbtClienteFrecuente))))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(rbtPedidoPresencial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtPedidoTelefonico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtPedidoWeb)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(rbtClienteNatural)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtClienteFrecuente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtClienteMayorista)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tipo", jPanel2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Datos cliente: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Nombre: ");

        txtNomCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomClienteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Documento: ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Telefono: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mail: ");

        txtMailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(txtDocuCliente)
                            .addComponent(txtTelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(txtNomCliente)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtDocuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Cliente", jPanel3);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Pedido:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Fecha: ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Fecha entrega: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Producto(s): ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Detalle(s): ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Cantidad:");

        txtDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetalleActionPerformed(evt);
            }
        });

        txtCantidad.setToolTipText("Cantidad a pedir");
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnAñadirFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New_date.png"))); // NOI18N
        btnAñadirFecha.setText("Añadir");
        btnAñadirFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaEntrega)
                    .addComponent(FechaCal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAñadirFecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAñadirFecha)
                    .addComponent(FechaCal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedido", jPanel4);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Especificaciones adicionales: ");

        txtaEspecificaciones.setColumns(20);
        txtaEspecificaciones.setRows(5);
        jScrollPane2.setViewportView(txtaEspecificaciones);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Observaciones");

        txtaObservaciones.setColumns(20);
        txtaObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtaObservaciones);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Otras", jPanel5);

        jScrollPane3.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnviar)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btnNuevo)
                    .addComponent(btnAtras)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //Boton nuevo
        Habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Boton cancelar
        Inhabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        //Ir al inicio
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        //Enviar
        //Aceptar
        if (txtNomCliente.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "El campo Nombres está vacío");
        } else {
            if (txtDocuCliente.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "El campo Documento está vacío");
            } else {
                if (txtTelCliente.getText().trim().length() == 0) {
                    JOptionPane.showMessageDialog(this, "El campo Telefono está vacío");
                } else {
                    if (txtMailCliente.getText().trim().length() == 0) {
                        JOptionPane.showMessageDialog(this, "El campo Mail está vacío");
                    } else {
                        if (txtProducto.getText().trim().length() == 0) {
                            JOptionPane.showMessageDialog(this, "El campo Pedido está vacío");
                        } else {
                            if (txtDetalle.getText().trim().length() == 0) {
                                JOptionPane.showMessageDialog(this, "El campo Detalle está vacío");
                            } else {
                                if (txtCantidad.getText().trim().length() == 0) {
                                    JOptionPane.showMessageDialog(this, "El campo Cantidad está vacío");
                                } else if (txtFechaEntrega.getText().trim().length() == 0) {
                                    JOptionPane.showMessageDialog(this, "El campo Fecha de entrega está vacío");
                                }
                            }
                        }
                    }
                }
            }
            //Datos Enviados
            //JOptionPane.showMessageDialog(null, "Datos Enviados");

            //Interfaz Factura
            Factura obj = new Factura();
            obj.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetalleActionPerformed
    String accion = "Insertar";
    String id_actualizar = "";
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Boton guardar
        //Aceptar
        if (txtNomCliente.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "El campo Nombres está vacío");
        } else {
            if (txtDocuCliente.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "El campo Documento está vacío");
            } else {
                if (txtTelCliente.getText().trim().length() == 0) {
                    JOptionPane.showMessageDialog(this, "El campo Telefono está vacío");
                } else {
                    if (txtMailCliente.getText().trim().length() == 0) {
                        JOptionPane.showMessageDialog(this, "El campo Mail está vacío");
                    } else {
                        if (txtProducto.getText().trim().length() == 0) {
                            JOptionPane.showMessageDialog(this, "El campo Pedido está vacío");
                        } else {
                            if (txtDetalle.getText().trim().length() == 0) {
                                JOptionPane.showMessageDialog(this, "El campo Detalle está vacío");
                            } else {
                                if (txtCantidad.getText().trim().length() == 0) {
                                    JOptionPane.showMessageDialog(this, "El campo Cantidad está vacío");
                                } else {
                                    if (txtFechaEntrega.getText().trim().length() == 0) {
                                        JOptionPane.showMessageDialog(this, "El campo Fecha de entrega está vacío");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            //Valores String Datos Cliente
            String Nom, Docu, Tel, Mail;

            //Inicializaciones tipo Strin
            Nom = txtNomCliente.getText();
            Docu = txtDocuCliente.getText();
            Tel = txtTelCliente.getText();
            Mail = txtMailCliente.getText();

            //Valor String Sentencia SQL
            String sSQL = "";

            //Mensaje String
            String mensaje = "";

            //Accion guardar tipo de pedido radiobutton
            //Variables tipo String    
            String presencial;
            String Telefonico;
            String Web;

            presencial = rbtPedidoPresencial.getLabel();
            Telefonico = rbtPedidoTelefonico.getLabel();
            Web = rbtPedidoWeb.getLabel();
            //Condicion if
            if (accion.equals("Insertar")) {
                sSQL = "INSERT INTO DatosCliente (Nombres, Documento, Telefono, Mail, TipoPedido) VALUES (?,?,?,?,?)";
            }
            try {
                PreparedStatement pst = conn.prepareStatement(sSQL);
                pst.setString(1, Nom);
                pst.setString(2, Docu);
                pst.setString(3, Tel);
                pst.setString(4, Mail);
                pst.setString(5, presencial);

                //Condicion if
                if (rbtPedidoPresencial.isSelected()) {
                    pst.setString(5, presencial);
                } else {
                    if (rbtPedidoTelefonico.isSelected()) {
                        pst.setString(5, Telefonico);
                    } else {
                        if (rbtPedidoWeb.isSelected()) {
                            pst.setString(5, Web);
                        }
                    }
                }
                int n = pst.executeUpdate();
                //Condicion if
                if (n > 0) {
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            }

            //Valores String Pedido
            String Prod, Deta, Cant, Fc;

            //Inicializaciones tipo String
            Prod = txtProducto.getText();
            Deta = txtDetalle.getText();
            Cant = txtCantidad.getText();
            Fc = txtFechaEntrega.getText();

            //Condicion if
            if (accion.equals("Insertar")) {
                sSQL = "INSERT INTO Pedido (Producto, Detalle, Cantidad, FechaEntrega) VALUES (?,?,?,?)";
            }
            try {
                PreparedStatement pst = conn.prepareStatement(sSQL);
                pst.setString(1, Prod);
                pst.setString(2, Deta);
                pst.setString(3, Cant);
                pst.setString(4, Fc);

                int n = pst.executeUpdate();
            } catch (SQLException ex) {
            }

            //Valores String Especificaciones y observaciones
            String Esp, Obser;

            //Inicializaciones tipo String
            Esp = txtaEspecificaciones.getText();
            Obser = txtaObservaciones.getText();

            //Condicion if
            if (accion.equals("Insertar")) {
                sSQL = "INSERT INTO Otras (Especificaciones, Observaciones) VALUES (?,?)";
            }
            try {
                PreparedStatement pst = conn.prepareStatement(sSQL);
                pst.setString(1, Esp);
                pst.setString(2, Obser);

                int n = pst.executeUpdate();

                //Condicion if
                if (n > 0) {
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            /*
             //Mensaje
             mensaje = "Los datos se han guardado de manera satisfactoria";
             */

            //Accion conicional de radio grupo
            String cant = txtCantidad.getText();
            int numero = Integer.parseInt(cant);
            //Condicion if
            if (rbtClienteMayorista.isSelected()) {
                if (numero >= 500) {
                    JOptionPane.showMessageDialog(null, "Limite excedido");
                } else {
                    JOptionPane.showMessageDialog(null, "Datos guardados");
                }
            } else if (rbtClienteFrecuente.isSelected()) {
                if (numero >= 100) {
                    JOptionPane.showMessageDialog(null, "Cantidad no valida para cliente frecuente");
                } else {
                    JOptionPane.showMessageDialog(null, "Datos guardados");
                }
            } else if (rbtClienteNatural.isSelected()) {
                if (numero >= 20) {
                    JOptionPane.showMessageDialog(null, "Cantidad no valida para cliente natural");
                } else {
                    JOptionPane.showMessageDialog(null, "Datos guardados");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAñadirFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirFechaActionPerformed
        //Botón aladir fecha
        String Fecha = df.format(FechaCal.getDate());
        txtFechaEntrega.setText(Fecha);
    }//GEN-LAST:event_btnAñadirFechaActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtNomClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomClienteActionPerformed
        //Volver
        //Interfaz Principal
        dispose();
    }//GEN-LAST:event_txtNomClienteActionPerformed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
        //Presionar guardar con teclado
        btnGuardarActionPerformed(null);
    }//GEN-LAST:event_btnGuardarKeyPressed

    private void btnNuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNuevoKeyPressed
        //presionar boton nuevo
        btnNuevoActionPerformed(null);
    }//GEN-LAST:event_btnNuevoKeyPressed

    private void txtMailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailClienteActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pedido().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaCal;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAñadirFecha;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbtClienteFrecuente;
    private javax.swing.JRadioButton rbtClienteMayorista;
    private javax.swing.JRadioButton rbtClienteNatural;
    private javax.swing.JRadioButton rbtPedidoPresencial;
    private javax.swing.JRadioButton rbtPedidoTelefonico;
    private javax.swing.JRadioButton rbtPedidoWeb;
    private javax.swing.ButtonGroup rdgPedido;
    private javax.swing.ButtonGroup rdgTipoCliente;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtDocuCliente;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtMailCliente;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTelCliente;
    private javax.swing.JTextArea txtaEspecificaciones;
    private javax.swing.JTextArea txtaObservaciones;
    // End of variables declaration//GEN-END:variables
}
