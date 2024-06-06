/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucb.programacionii.inventariopro;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OMEN
 */
public class FrmKardex extends javax.swing.JFrame {

    /**
     * Creates new form Kardex
     */
    public FrmKardex() {
        initComponents();

        this.CargarProductos();
        this.CargarKardex(tblKardex);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new ucb.programacionii.inventariopro.PanelRound();
        panelRound2 = new ucb.programacionii.inventariopro.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKardex = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBoxCodProducto = new javax.swing.JComboBox<>();
        txtCodProducto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblEntra = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCantEntrada = new javax.swing.JTextField();
        txtCantSalida = new javax.swing.JTextField();
        jDateEntrada = new com.toedter.calendar.JDateChooser();
        jDateSalida = new com.toedter.calendar.JDateChooser();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRound1.setBackground(new java.awt.Color(0, 153, 153));
        panelRound1.setForeground(new java.awt.Color(102, 255, 204));

        panelRound2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("KARDEX");

        tblKardex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Marca", "Fecha de Entrada", "Entra", "Fecha de Salida", "Sale", "Saldo (Stock)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKardex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKardexMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKardex);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Cod. Producto");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Entrada");

        jCBoxCodProducto.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jCBoxCodProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona:", "Item 2", "Item 3", "Item 4" }));
        jCBoxCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxCodProductoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAñadir.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Fecha: ");

        lblEntra.setBackground(new java.awt.Color(0, 153, 153));
        lblEntra.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        lblEntra.setForeground(new java.awt.Color(0, 153, 153));
        lblEntra.setText("Entra:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Salida");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Fecha:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Sale:");

        btnEliminar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRound2Layout.createSequentialGroup()
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelRound2Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEntra)
                                        .addComponent(jLabel4)))
                                .addComponent(jLabel2)
                                .addGroup(panelRound2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel3)))
                            .addGap(71, 71, 71)
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCBoxCodProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantEntrada)
                                .addComponent(jDateEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                            .addGap(81, 81, 81)
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(panelRound2Layout.createSequentialGroup()
                                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelRound2Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(57, 57, 57)
                                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCantSalida)
                                        .addComponent(jDateSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                    .addGap(61, 61, 61)
                                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))
                        .addGroup(panelRound2Layout.createSequentialGroup()
                            .addGap(283, 283, 283)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBoxCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jDateEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEntra)))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jDateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAñadir))
                        .addGap(14, 14, 14)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtCantSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBoxCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBoxCodProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String productoBuscar = txtCodProducto.getText().trim();
        Connection cn = Conexion.conectar();
        String sql = "SELECT * FROM public.\"PRODUCTOS\" where \"ID\"= '" + productoBuscar + "';";
        //"SELECT  usuario, password FROM public.\"USUARIO\" where usuario= '" + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {

                jCBoxCodProducto.setSelectedItem(rs.getString("DESCRIPCION_A"));
                // jCBoxProducto.setSelectedItem(rs.getString("ID") + " " + rs.getString("DESCRIPCION_A") + " " + rs.getString("MARCA"));

            } else {
                jCBoxCodProducto.setSelectedItem("Seleccione Producto...");
                JOptionPane.showMessageDialog(null, "ID no encontrado");
            }
            txtCodProducto.setText("");
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar Producto, " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        int productoId = obtenerProductoId(jCBoxCodProducto.getSelectedItem().toString());

        // Obtener la fecha seleccionada del JDateChooser de entrada
        java.util.Date fechaSeleccionadaEntrada = jDateEntrada.getDate();

        // Convertir la fecha seleccionada en un objeto java.sql.Date utilizando el método obtenerFecha()
        java.sql.Date fechaEntrada = obtenerFecha(fechaSeleccionadaEntrada);

        // Obtener la fecha seleccionada del JDateChooser de salida
        java.util.Date fechaSeleccionadaSalida = jDateSalida.getDate();

        // Convertir la fecha seleccionada en un objeto java.sql.Date utilizando el método obtenerFecha()
        java.sql.Date fechaSalida = obtenerFecha(fechaSeleccionadaSalida);

        int entra = 0;
        if (!txtCantEntrada.getText().isEmpty()) {
            entra = Integer.parseInt(txtCantEntrada.getText());
        }

        int sale = 0;
        if (!txtCantSalida.getText().isEmpty()) {
            sale = Integer.parseInt(txtCantSalida.getText());
        }

        registrarKardex(productoId, fechaEntrada, entra, fechaSalida, sale);

        // Luego de agregar, cargar de nuevo los datos en la tabla para mostrar el nuevo registro
        CargarKardex(tblKardex);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tblKardex.getSelectedRow();

        if (filaSeleccionada != -1) { // Verificar si se ha seleccionado una fila
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar los registros asociados a este producto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) tblKardex.getModel();
                int productoId = (int) model.getValueAt(filaSeleccionada, 0); // Obtener el ID del producto de la fila seleccionada

                eliminarRegistros(productoId); // Eliminar los registros asociados al producto

                // Quitar la fila seleccionada de la tabla visual
                model.removeRow(filaSeleccionada);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblKardexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKardexMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tblKardex.getSelectedRow();
        if (filaSeleccionada >= 0) {
            DefaultTableModel model = (DefaultTableModel) tblKardex.getModel();

            // Obteniendo la descripción del producto
            Object valorDescripcion = model.getValueAt(filaSeleccionada, 1);
            String descripcion = (valorDescripcion != null) ? valorDescripcion.toString() : "";

            // Obteniendo el ID del producto
            Object valorId = model.getValueAt(filaSeleccionada, 0);
            int idProducto = (valorId != null) ? (int) valorId : 0;

            // Obteniendo la marca del producto
            Object valorMarca = model.getValueAt(filaSeleccionada, 2);
            String marca = (valorMarca != null) ? valorMarca.toString() : "";

            // Actualizando los campos en el JComboBox
            jCBoxCodProducto.setSelectedItem(idProducto + " - " + descripcion + " - " + marca);
        }
    }//GEN-LAST:event_tblKardexMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKardex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBoxCodProducto;
    private com.toedter.calendar.JDateChooser jDateEntrada;
    private com.toedter.calendar.JDateChooser jDateSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEntra;
    private ucb.programacionii.inventariopro.PanelRound panelRound1;
    private ucb.programacionii.inventariopro.PanelRound panelRound2;
    private javax.swing.JTable tblKardex;
    private javax.swing.JTextField txtCantEntrada;
    private javax.swing.JTextField txtCantSalida;
    private javax.swing.JTextField txtCodProducto;
    // End of variables declaration//GEN-END:variables

    public static void CargarKardex(JTable table) {
        try (Connection connection = Conexion.conectar()) {
            String query = "SELECT * FROM \"KARDEX\"";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear existing data

            while (resultSet.next()) {
                Object[] row = new Object[8];
                row[0] = resultSet.getInt("ID");
                row[1] = resultSet.getString("DESCRIPCION_A");
                row[2] = resultSet.getString("MARCA");
                row[3] = resultSet.getDate("FECHA_ENTRADA");
                row[4] = resultSet.getInt("ENTRA");
                row[5] = resultSet.getDate("FECHA_SALIDA");
                row[6] = resultSet.getInt("SALE");
                row[7] = resultSet.getInt("SALDO");
                
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void registrarKardex(int productoId, java.sql.Date fechaEntrada, int entra, java.sql.Date fechaSalida, int sale) {

        try (Connection connection = Conexion.conectar()) {
            // Obtener los datos del producto
            String getProductoInfo = "SELECT \"DESCRIPCION_A\", \"MARCA\" FROM public.\"PRODUCTOS\" WHERE \"ID\" = ?";
            PreparedStatement productoStmt = connection.prepareStatement(getProductoInfo);
            productoStmt.setInt(1, productoId);
            ResultSet productoResult = productoStmt.executeQuery();

            String descripcionProducto = null;
            String marcaProducto = null;
            if (productoResult.next()) {
                descripcionProducto = productoResult.getString("DESCRIPCION_A");
                marcaProducto = productoResult.getString("MARCA");
            }

            // Insertar en KARDEX
            String insertKardex = "INSERT INTO \"KARDEX\" (\"PRODUCTO_ID\", \"DESCRIPCION_A\", \"MARCA\", \"FECHA_ENTRADA\", \"ENTRA\", \"FECHA_SALIDA\", \"SALE\", \"SALDO\") VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            String getSaldo = "SELECT \"CANTIDAD\" FROM public.\"PRODUCTOS\" WHERE \"ID\" = ?";
            PreparedStatement saldoStmt = connection.prepareStatement(getSaldo);
            saldoStmt.setInt(1, productoId);
            ResultSet saldoResult = saldoStmt.executeQuery();

            int saldo = 0;
            if (saldoResult.next()) {
                saldo = saldoResult.getInt("CANTIDAD");
            }

            saldo = saldo + entra - sale;

            PreparedStatement insertStmt = connection.prepareStatement(insertKardex);
            insertStmt.setInt(1, productoId);
            insertStmt.setString(2, descripcionProducto);
            insertStmt.setString(3, marcaProducto);
            insertStmt.setDate(4, fechaEntrada);
            insertStmt.setInt(5, entra);
            insertStmt.setDate(6, fechaSalida);
            insertStmt.setInt(7, sale);
            insertStmt.setInt(8, saldo);
            insertStmt.executeUpdate();

            // Actualizar saldo en PRODUCTOS
            String updateProductos = "UPDATE \"PRODUCTOS\" SET \"CANTIDAD\" = ? WHERE \"ID\" = ?";
            PreparedStatement updateStmt = connection.prepareStatement(updateProductos);
            updateStmt.setInt(1, saldo);
            updateStmt.setInt(2, productoId);
            updateStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //cargar productos
    private void CargarProductos() {
        Connection con = Conexion.conectar();
        String sql = "SELECT * FROM public.\"PRODUCTOS\"";

        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jCBoxCodProducto.removeAllItems();
            jCBoxCodProducto.addItem("Seleccione: ");
            //
            while (rs.next()) {
                jCBoxCodProducto.addItem(rs.getString("DESCRIPCION_A"));

            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar productos!" + e);
        }

    }

    // Método para obtener el ID del producto seleccionado
    private int obtenerProductoId(String descripcion) {
        int productoId = 0;
        try (Connection connection = Conexion.conectar()) {
            String query = "SELECT \"ID\" FROM \"PRODUCTOS\" WHERE \"DESCRIPCION_A\" = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, descripcion);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                productoId = resultSet.getInt("ID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productoId;
    }

// Método para obtener la fecha en el formato correcto para la base de datos
    private java.sql.Date obtenerFecha(java.util.Date fecha) {
        if (fecha != null) {
            System.out.println("Fecha obtenida: " + fecha.toString());
            return new java.sql.Date(fecha.getTime());
        } else {
            System.out.println("La fecha es nula.");
            return null;
        }
    }

    // Método para eliminar todos los registros asociados a un producto específico
    private void eliminarRegistros(int productoId) {
        try (Connection connection = Conexion.conectar()) {
            String deleteQuery = "DELETE FROM \"KARDEX\" WHERE \"PRODUCTO_ID\" = ?";
            PreparedStatement statement = connection.prepareStatement(deleteQuery);
            statement.setInt(1, productoId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// Método para eliminar todos los registros de la tabla KARDEX
    private void eliminarTodosLosRegistros() {
        try (Connection connection = Conexion.conectar()) {
            String deleteQuery = "DELETE FROM \"KARDEX\"";
            Statement statement = connection.createStatement();
            statement.executeUpdate(deleteQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
