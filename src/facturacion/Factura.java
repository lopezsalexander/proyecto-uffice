package facturacion;
//Importaciones

import java.awt.Dimension;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Factura extends javax.swing.JFrame {

    DefaultTableModel modelo;
    lib.Conexion sql = new lib.Conexion();
    Connection conn = sql.conexion();

    //Constructor incial
    public Factura() {
        initComponents();
        //Centrar ventana
        //Línea 1
        this.setSize(new Dimension(874, 575));

        //Línea 2
        //this.setMinimumSize(new Dimension(200, 200));
        this.setLocationRelativeTo(null);
        //Metodos
        InHabilitar();
        cargarProductos("");
        DatosCliente("");
        DatosUsuario("");
        cargarIdFactu("");
    }

    //METODOS
    //Metodo Inhabilitar
    void InHabilitar() {
        tblProducto.setEnabled(false);
    }

//Lllamar datos datos personales
    public void DatosCliente(String idFact) {
        //Inicializaciones String
        String sSQL = "";
        String NomCli = "", Docu = "", Mail = "", Tel = "";

        //Sentencia SQLSERVER
        sSQL = ("SELECT Nombres, Documento, Telefono, Mail FROM DatosCliente" + idFact);
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            //Condicion
            while (rs.next()) {
                NomCli = rs.getString("Nombres");
                Docu = rs.getString("Documento");
                Tel = rs.getString("Telefono");
                Mail = rs.getString("Mail");
            }
            txtNomCliente2.setText(NomCli);
            txtDocuCliente.setText(Docu);
            txtTelCliente.setText(Tel);
            txtMailCliente.setText(Mail);

            id_actualizar = idFact;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //Lllamar datos datos personales
    public void DatosUsuario(String idUsua) {
        //Valores String
        String sSQL = "";
        String NomUsua = "", DocuUsua = "", TelUsua = "", MailUsua = "";

        //Sentencia SQLSERVER
        sSQL = ("SELECT NombreUsuario, DocuUsuario, Telefono, Cargo FROM DatosUsuario" + idUsua);
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            //Condicion
            while (rs.next()) {
                NomUsua = rs.getString("NombreUsuario");
                DocuUsua = rs.getString("DocuUsuario");
                TelUsua = rs.getString("Telefono");
                MailUsua = rs.getString("Cargo");
            }
            lblNomUsuario.setText(NomUsua);
            txtDocuUsuario.setText(DocuUsua);
            txtTelUsuario.setText(TelUsua);
            txtCargoUsuario.setText(MailUsua);

            id_actualizar = idUsua;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //MetodoCargar Productos
    public void cargarProductos(String valor) {
        //Datos en Base de datos
        //String [] titulos = {"Producto", "Detalle", "Cantidad", "Valor", "IVA"};
        String[] titulos = {"Producto", "Detalle", "Cantidad"};
        String[] registro = new String[3];
        String sSQL = "";

        //Titulo Tabla
        modelo = new DefaultTableModel(null, titulos);

        //Sentencia SQLSERVER
        sSQL = ("SELECT TOP 1 Producto, Detalle, Cantidad FROM Pedido ORDER BY idPedido DESC");
        //sSQL = ("SELECT Producto, Detalle, Cantidad, pizzaCarnes FROM Pedido INNER JOIN Precios ON Pedido.idPedido = Precios.idPrecio");

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            //Condicion
            while (rs.next()) {
                //registro [0] = rs.getString("idPedido");
                registro[0] = rs.getString("Producto");
                registro[1] = rs.getString("Detalle");
                registro[2] = rs.getString("Cantidad");
                //registro [3] = rs.getString("pizzaCarnes");

                modelo.addRow(registro);
            }
            //Tabla Productos
            tblProducto.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //Metodo Cantidad Precio e iva
    public void CargarCantidadPrecioIva() {
        //Sentencia SQL tipo String
        String sSQL = "";
        //String sSQL1 = "";

        //Sentencia SQLSERVER
        sSQL = ("SELECT Cantidad FROM Pedido");

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            //Condicion
            while (rs.next()) {
                String add1;
                txtCantidad.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        //Pasar de cantidad a tipo entero
        int Cantidad = Integer.parseInt(txtCantidad.getText());

        //Operación de cantidad por precio
        double CantidadTotal = (Cantidad);
        //TxtIvaTotal.setText(String.valueOf(CantidadPrecio));

        //Sentencia para obtener precio unitario
        sSQL = ("SELECT pizzaCarnes FROM Precios");
        //Try and catch de precios        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            //Condicion
            while (rs.next()) {
                String add1;
                txtPrecio.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        //Pasar de double a double de precio
        double PrecioCantidad = Double.parseDouble(txtPrecio.getText());

        //Operacion de precio por cantidad
        //Operación de cantidad por precio
        double TotalPrecioCantidad = (CantidadTotal * PrecioCantidad);
        txtPrecioTotal.setText(String.valueOf(TotalPrecioCantidad));

        //Sentencia SQLSERVER
        sSQL = ("SELECT pizzaCarnes FROM Precios");

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            //Condicion
            while (rs.next()) {
                String add1;
                txtIva.setText(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        //Pasar de iva texto a iva númerico
        double IVA = Double.parseDouble(txtIva.getText());
        //IVA Unidad
        double IvaUnidad = (IVA * 0.16);
        //Presentacion del iva unitario
        txtIva.setText(String.valueOf(IvaUnidad));

        //Operación iva
        double IvaTotal = (TotalPrecioCantidad * 0.16);
        txtIvaTotal.setText(String.valueOf(IvaTotal));

        //Valor total a pagar (Valor final)
        Double ValorTotal = (IvaTotal + TotalPrecioCantidad);
        txtValorTotal.setText(String.valueOf(ValorTotal));
    }

    //Metodo cargar id de la factura
    public void cargarIdFactu(String idFact) {
        //BOTON GUARDAR
        String sSQL = "";
        String IdFact = "";

        //Sentencia SQLSERVER
        sSQL = ("SELECT idFacturas FROM Facturas" + idFact);
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            //Condicion
            while (rs.next()) {
                IdFact = rs.getString("idFacturas");
            }
            txtIdFactura.setText(IdFact);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    String id_actualizar = "";
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        Volver = new javax.swing.JButton();
        dkpFacturas = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        txtCargoUsuario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDocuUsuario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelUsuario = new javax.swing.JTextField();
        lblNomUsuario = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMailCliente = new javax.swing.JTextField();
        txtDocuCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTelCliente = new javax.swing.JTextField();
        txtNomCliente2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdFactura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtIvaTotal = new javax.swing.JTextField();
        txtPrecioTotal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jToggleButton1.setText("jToggleButton1");

        Volver.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Factura");
        setResizable(false);

        dkpFacturas.setBackground(new java.awt.Color(240, 240, 240));
        dkpFacturas.setForeground(new java.awt.Color(240, 240, 240));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Precio Total");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("IVA Total:");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jScrollPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProducto);

        txtCargoUsuario.setEditable(false);
        txtCargoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoUsuarioActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Cargo:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Documento: ");

        txtDocuUsuario.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Telefono: ");

        txtTelUsuario.setEditable(false);
        txtTelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelUsuarioActionPerformed(evt);
            }
        });

        lblNomUsuario.setBackground(new java.awt.Color(215, 215, 140));
        lblNomUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Nombre: ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("Atendido por:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Mail: ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Documento: ");

        txtMailCliente.setEditable(false);
        txtMailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailClienteActionPerformed(evt);
            }
        });

        txtDocuCliente.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Telefono: ");

        txtTelCliente.setEditable(false);

        txtNomCliente2.setEditable(false);
        txtNomCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomCliente2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Nombre: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Datos cliente: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Factura Nº");

        txtIdFactura.setEditable(false);
        txtIdFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFacturaActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pizza (1).png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/9.png"))); // NOI18N
        jButton2.setText("Calcular");
        jButton2.setToolTipText("Calcular precios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cantidad: ");

        txtCantidad.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Precio Unitario: ");

        txtPrecio.setEditable(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtIvaTotal.setEditable(false);

        txtPrecioTotal.setEditable(false);

        txtIva.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Total a pagar: ");

        txtValorTotal.setEditable(false);
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("IVA Unitario: ");

        javax.swing.GroupLayout dkpFacturasLayout = new javax.swing.GroupLayout(dkpFacturas);
        dkpFacturas.setLayout(dkpFacturasLayout);
        dkpFacturasLayout.setHorizontalGroup(
            dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFacturasLayout.createSequentialGroup()
                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dkpFacturasLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dkpFacturasLayout.createSequentialGroup()
                                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                                        .addComponent(txtDocuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtMailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                        .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dkpFacturasLayout.createSequentialGroup()
                                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkpFacturasLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(dkpFacturasLayout.createSequentialGroup()
                                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(dkpFacturasLayout.createSequentialGroup()
                                                .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(txtIvaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11))
                                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkpFacturasLayout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dkpFacturasLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(lblNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(txtDocuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtTelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dkpFacturasLayout.setVerticalGroup(
            dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFacturasLayout.createSequentialGroup()
                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dkpFacturasLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dkpFacturasLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtNomCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtMailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(dkpFacturasLayout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(93, 93, 93))
                        .addGroup(dkpFacturasLayout.createSequentialGroup()
                            .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(dkpFacturasLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dkpFacturasLayout.createSequentialGroup()
                                    .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIvaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(36, 36, 36)))
                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                        .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dkpFacturasLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(dkpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        dkpFacturas.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(btnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtCargoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtDocuUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtTelUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(lblNomUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtMailCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtDocuCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtTelCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtNomCliente2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtIdFactura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(btnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtIvaTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtPrecioTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtIva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(txtValorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFacturas.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Consultar");

        jMenuItem1.setText("Facturas");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Generar");

        jMenuItem4.setText("Factura");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dkpFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpFacturas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtIdFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFacturaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        Pedido obj = new Pedido();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Boton guardar
        cargarIdFactu("");
        //Mensaje
        JOptionPane.showMessageDialog(null, "Se guardo correctamente");
        //Ventana Facturas
        Facturas vf = new Facturas();
        dkpFacturas.add(vf);
        vf.show();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jScrollPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1AncestorAdded

    private void txtMailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailClienteActionPerformed

    private void txtCargoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoUsuarioActionPerformed

    private void txtTelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelUsuarioActionPerformed

    private void txtNomCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomCliente2ActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Boton calcular
        //Metodo Calcular
        CargarCantidadPrecioIva();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Factura().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDesktopPane dkpFacturas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblNomUsuario;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCargoUsuario;
    private javax.swing.JTextField txtDocuCliente;
    private javax.swing.JTextField txtDocuUsuario;
    private javax.swing.JTextField txtIdFactura;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtIvaTotal;
    private javax.swing.JTextField txtMailCliente;
    private javax.swing.JTextField txtNomCliente2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioTotal;
    private javax.swing.JTextField txtTelCliente;
    private javax.swing.JTextField txtTelUsuario;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
