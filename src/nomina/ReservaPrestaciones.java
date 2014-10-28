package nomina;

//Llamdo de las Librerias
import lib.Reserva;
import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */

//Declaracion Clase Reserva
public class ReservaPrestaciones extends javax.swing.JFrame {
    //Declaracion Metodo Reserva
    public ReservaPrestaciones() {
        initComponents();
        setTitle("Reserva Prestaciones");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEPS = new javax.swing.JLabel();
        lblAFP = new javax.swing.JLabel();
        txtEPS = new javax.swing.JTextField();
        txtAFP = new javax.swing.JTextField();
        lblARL = new javax.swing.JLabel();
        txtARL = new javax.swing.JTextField();
        lblCesantias = new javax.swing.JLabel();
        txtCesantias = new javax.swing.JTextField();
        lnlIntCesantias = new javax.swing.JLabel();
        txtIntCesantias = new javax.swing.JTextField();
        lblPrimaServicios = new javax.swing.JLabel();
        txtPrimaServicios = new javax.swing.JTextField();
        lblVacaciones = new javax.swing.JLabel();
        txtVacaciones = new javax.swing.JTextField();
        lblCCompesacion = new javax.swing.JLabel();
        txtCCompensacion = new javax.swing.JTextField();
        lblICBF = new javax.swing.JLabel();
        txtICBF = new javax.swing.JTextField();
        lblSENA = new javax.swing.JLabel();
        txtSENA = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        lblSubTotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        lblComprovante = new javax.swing.JLabel();
        txtComprobante = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblReservaNo = new javax.swing.JLabel();
        txtReservaNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 73, 5));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Reserva Prestaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblEPS.setForeground(new java.awt.Color(255, 255, 255));
        lblEPS.setText("EPS");

        lblAFP.setForeground(new java.awt.Color(255, 255, 255));
        lblAFP.setText("AFP");

        txtEPS.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEPSActionPerformed(evt);
            }
        });

        txtAFP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAFPActionPerformed(evt);
            }
        });

        lblARL.setForeground(new java.awt.Color(255, 255, 255));
        lblARL.setText("ARL");

        txtARL.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtARL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtARLActionPerformed(evt);
            }
        });

        lblCesantias.setForeground(new java.awt.Color(255, 255, 255));
        lblCesantias.setText("Cesantias");

        txtCesantias.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCesantias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCesantiasActionPerformed(evt);
            }
        });

        lnlIntCesantias.setForeground(new java.awt.Color(255, 255, 255));
        lnlIntCesantias.setText("Int.Cesantias");

        txtIntCesantias.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIntCesantias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntCesantiasActionPerformed(evt);
            }
        });

        lblPrimaServicios.setForeground(new java.awt.Color(255, 255, 255));
        lblPrimaServicios.setText("Prima.Servicios");

        txtPrimaServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrimaServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaServiciosActionPerformed(evt);
            }
        });

        lblVacaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblVacaciones.setText("Vacaciones");

        txtVacaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVacacionesActionPerformed(evt);
            }
        });

        lblCCompesacion.setForeground(new java.awt.Color(255, 255, 255));
        lblCCompesacion.setText("C.Compensacion");

        txtCCompensacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCCompensacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCompensacionActionPerformed(evt);
            }
        });

        lblICBF.setForeground(new java.awt.Color(255, 255, 255));
        lblICBF.setText("ICBF");

        txtICBF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtICBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtICBFActionPerformed(evt);
            }
        });

        lblSENA.setForeground(new java.awt.Color(255, 255, 255));
        lblSENA.setText("SENA");

        txtSENA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSENA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSENAActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1390967819_left2.png"))); // NOI18N
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblSubTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotal.setText("SubTotal");

        txtSubTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
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

        lblComprovante.setForeground(new java.awt.Color(255, 255, 255));
        lblComprovante.setText("Comprovante No.");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1391041892_lock.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblReservaNo.setForeground(new java.awt.Color(240, 240, 240));
        lblReservaNo.setText("Reserva No.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEPS)
                    .addComponent(lblAFP)
                    .addComponent(txtEPS)
                    .addComponent(txtAFP)
                    .addComponent(lblARL)
                    .addComponent(txtARL)
                    .addComponent(lblCesantias)
                    .addComponent(txtCesantias, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnlIntCesantias)
                    .addComponent(txtIntCesantias, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPrimaServicios, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPrimaServicios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtVacaciones, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lblVacaciones)
                    .addComponent(lblCCompesacion)
                    .addComponent(txtCCompensacion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSENA)
                                    .addComponent(lblICBF)
                                    .addComponent(txtICBF)
                                    .addComponent(txtSENA, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblComprovante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtComprobante))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblReservaNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtReservaNo))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSubTotal)
                            .addComponent(lblSueldo))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEPS)
                    .addComponent(lnlIntCesantias)
                    .addComponent(lblICBF)
                    .addComponent(lblComprovante)
                    .addComponent(lblReservaNo))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntCesantias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtICBF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReservaNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAFP)
                    .addComponent(lblPrimaServicios)
                    .addComponent(lblSENA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrimaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSENA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblARL)
                    .addComponent(lblVacaciones)
                    .addComponent(lblSueldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtARL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCesantias)
                    .addComponent(lblCCompesacion)
                    .addComponent(lblSubTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCesantias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCCompensacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Accion Boton Atras
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.hide();
    }//GEN-LAST:event_btnAtrasActionPerformed
    //Accion Caja de Texto Sueldo
    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed

    }//GEN-LAST:event_txtSueldoActionPerformed
    //Accion Caja de Texto EPS
    private void txtEPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEPSActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 4 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtEPS.setText(Resultados);
    }//GEN-LAST:event_txtEPSActionPerformed
    //Accion Caja de Texto AFP
    private void txtAFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAFPActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 4 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtAFP.setText(Resultados);
    }//GEN-LAST:event_txtAFPActionPerformed
    //Accion Caja de Texto ARL
    private void txtARLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtARLActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 52 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtARL.setText(Resultados);
    }//GEN-LAST:event_txtARLActionPerformed
    //Accion Caja de Texto Cesantias
    private void txtCesantiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCesantiasActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 8 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtCesantias.setText(Resultados);
    }//GEN-LAST:event_txtCesantiasActionPerformed
    //Accion Caja de Texto IntCesantias
    private void txtIntCesantiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntCesantiasActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 1 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtIntCesantias.setText(Resultados);
    }//GEN-LAST:event_txtIntCesantiasActionPerformed
    //Accion Caja de Texto Prima
    private void txtPrimaServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaServiciosActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 8 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtPrimaServicios.setText(Resultados);
    }//GEN-LAST:event_txtPrimaServiciosActionPerformed
    //Accion Caja de Texto Vacaciones
    private void txtVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVacacionesActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 4 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtVacaciones.setText(Resultados);
    }//GEN-LAST:event_txtVacacionesActionPerformed
    //Accion Caja de Texto CCompensacion
    private void txtCCompensacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCompensacionActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 4 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtCCompensacion.setText(Resultados);
    }//GEN-LAST:event_txtCCompensacionActionPerformed
    //Accion Caja de Texto ICBF
    private void txtICBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtICBFActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 3 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtICBF.setText(Resultados);
    }//GEN-LAST:event_txtICBFActionPerformed
    //Accion Caja de Texto SENA
    private void txtSENAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSENAActionPerformed
        //Llamado de Valores de la Caja de Texto
        int Sueldo = Integer.valueOf(txtSueldo.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = Sueldo * 2 / 100;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtSENA.setText(Resultados);
    }//GEN-LAST:event_txtSENAActionPerformed
    //Accion Caja de Texto SubTotal
    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        //Llamado de Valores de la Caja de Texto
        int EPS = Integer.valueOf(txtEPS.getText());
        int AFP = Integer.valueOf(txtAFP.getText());
        int ARL = Integer.valueOf(txtARL.getText());
        int Cesantias = Integer.valueOf(txtCesantias.getText());
        int IntCesantias = Integer.valueOf(txtIntCesantias.getText());
        int PrimaServicios = Integer.valueOf(txtPrimaServicios.getText());
        int Vacaciones = Integer.valueOf(txtVacaciones.getText());
        int CCompensacion = Integer.valueOf(txtCCompensacion.getText());
        int ICBF = Integer.valueOf(txtICBF.getText());
        int SENA = Integer.valueOf(txtSENA.getText());
        int Resultado;
        String Resultados;
        //Operacion
        Resultado = EPS + AFP + ARL + Cesantias + IntCesantias + PrimaServicios + Vacaciones + CCompensacion + ICBF + SENA;
        //Muestra de Resultado
        Resultados = String.valueOf(Resultado);
        txtSubTotal.setText(Resultados);
    }//GEN-LAST:event_txtSubTotalActionPerformed
    //Accion Boton Guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Asignacion Guardado Alternativo
        int Respuesta;
        //Creacion del Mensaje de Confirmacion paera el Guardado de la Informacion
        Respuesta = JOptionPane.showConfirmDialog(null, "Desea Guardar los Datos", "Guardar", JOptionPane.YES_NO_OPTION);
        //Llamado de Datos y Valores de los Componentes
        Integer Rese_ID = Integer.valueOf(txtReservaNo.getText());
        Integer FK_Nomi_Comprobante = Integer.valueOf(txtComprobante.getText());
        Integer EPS = Integer.valueOf(txtEPS.getText());
        Integer AFP = Integer.valueOf(txtAFP.getText());
        Integer ARL = Integer.valueOf(txtARL.getText());
        Integer Cesantias = Integer.valueOf(txtCesantias.getText());
        Integer IntCesantias = Integer.valueOf(txtIntCesantias.getText());
        Integer PrimaServicios = Integer.valueOf(txtPrimaServicios.getText());
        Integer Vacaciones = Integer.valueOf(txtVacaciones.getText());
        Integer CCompensacion = Integer.valueOf(txtCCompensacion.getText());
        Integer ICBF = Integer.valueOf(txtICBF.getText());
        Integer SENA = Integer.valueOf(txtSENA.getText());
        Integer SubTotal = Integer.valueOf(txtSubTotal.getText());
        //Instanciacion de Reserva
        Reserva Rese = new Reserva();

        try {
            //Condicion si es Afirmativa la Respuesta
            if (Respuesta == JOptionPane.YES_OPTION) {
                //Guardado de la Informacion en los Campos de Texto
                Rese.setRese_ID(Rese_ID);
                Rese.setFK_Nomi_Comprobante(FK_Nomi_Comprobante);
                Rese.setRese_EPS(EPS);
                Rese.setRese_AFP(AFP);
                Rese.setRese_ARL(ARL);
                Rese.setRese_Cesantias(Cesantias);
                Rese.setRese_IntCesantias(IntCesantias);
                Rese.setRese_PrimaServicios(PrimaServicios);
                Rese.setRese_Vacaciones(Vacaciones);
                Rese.setRese_CCompensacion(CCompensacion);
                Rese.setRese_ICBF(ICBF);
                Rese.setRese_SENA(SENA);
                Rese.setRese_Subtotal(SubTotal);
                //Llamado de Metod Guardar
                Rese.Guardar();
            }
        } catch (Exception ERROR) {
            JOptionPane.showMessageDialog(this, ERROR.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaPrestaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAFP;
    private javax.swing.JLabel lblARL;
    private javax.swing.JLabel lblCCompesacion;
    private javax.swing.JLabel lblCesantias;
    private javax.swing.JLabel lblComprovante;
    private javax.swing.JLabel lblEPS;
    private javax.swing.JLabel lblICBF;
    private javax.swing.JLabel lblPrimaServicios;
    private javax.swing.JLabel lblReservaNo;
    private javax.swing.JLabel lblSENA;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblVacaciones;
    private javax.swing.JLabel lnlIntCesantias;
    private javax.swing.JTextField txtAFP;
    private javax.swing.JTextField txtARL;
    private javax.swing.JTextField txtCCompensacion;
    private javax.swing.JTextField txtCesantias;
    public javax.swing.JTextField txtComprobante;
    private javax.swing.JTextField txtEPS;
    private javax.swing.JTextField txtICBF;
    private javax.swing.JTextField txtIntCesantias;
    private javax.swing.JTextField txtPrimaServicios;
    private javax.swing.JTextField txtReservaNo;
    private javax.swing.JTextField txtSENA;
    private javax.swing.JTextField txtSubTotal;
    public javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtVacaciones;
    // End of variables declaration//GEN-END:variables
}
