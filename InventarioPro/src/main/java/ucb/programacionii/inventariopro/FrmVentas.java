/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucb.programacionii.inventariopro;

import java.sql.SQLException;
import conexion.Conexion;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import controlador.Ctrl_Producto;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleVentas;

/**
 *
 * @author OMEN
 */
public class FrmVentas extends javax.swing.JFrame {

    /**
     * Creates new form Ventas
     */
    //Modelo de datos
    private DefaultTableModel modelodatosprod;

    //lista
    ArrayList<DetalleVentas> listaProducto = new ArrayList<>();
    private DetalleVentas producto;

    private int idProducto = 0;
    private String Modelo = "";
    private int cantidadProductoBBDD; //cantidad que hay en el inventario
    private double precioUnitario = 0.0;
    private int porceniva = 0;
    private int porcenit = 0;

    private int cantidad = 0; //productos a comprar
    private double subtotal = 0.0;  //cantidad*precio
    private double descuento = 0.0;
    private double iva = 0.0;
    private double it = 0.0;
    private double total = 0.0;

    //variable para calculos globales
    private double subtotalgral = 0.0;
    private double descuentogral = 0.0;
    private double ivagral = 0.0;
    private double totalgral = 0.0;
    //fin de variables de calculos globales

    private int auxIdDetalle = 1; //id detventa

    private Ctrl_Producto ctrlProducto;
    // ProductoDAO pdao= new ProductoDAO();

    public FrmVentas() {

        // Inicialización de componentes y configuración de la interfaz
        ctrlProducto = new Ctrl_Producto();

        initComponents();

        //Cargar Productos:
        this.CargarProductos();

        this.inicializartblproductos();

        txtSubtotal.setText("0.0");
        txtIva.setText("0.0");
        txtDescuento.setText("0.0");
        txtTotal.setText("0.0");
    }

    //metodo para inicializar la tabla de productos
    private void inicializartblproductos() {
        modelodatosprod = new DefaultTableModel();

        modelodatosprod.addColumn("Nro");
        modelodatosprod.addColumn("Producto");
        modelodatosprod.addColumn("Cantidad");
        modelodatosprod.addColumn("Precio Unitario");
        modelodatosprod.addColumn("SubTotal");
        modelodatosprod.addColumn("Descuento");
        modelodatosprod.addColumn("IVA");
        modelodatosprod.addColumn("IT");
        modelodatosprod.addColumn("Total");
 

        //agregar datos del modelo a la tabla
        this.TblVentas.setModel(modelodatosprod);
    }

    //metodo para presentar informacion de la tabla detalleventa
    private void listaTablaProducto() {

        // Limpiar todas las filas del modelo de datos
        modelodatosprod.setRowCount(0);

        // Iterar sobre la lista de productos y añadir cada producto a la tabla
        for (int i = 0; i < listaProducto.size(); i++) {
            DetalleVentas producto = listaProducto.get(i);
            modelodatosprod.addRow(new Object[]{
                i + 1, // Número de fila
                producto.getDescripcionA(),
                producto.getCantidad(),
                producto.getPreVenta(),
                producto.getSubtotal(),
                producto.getDescuento(),
                producto.getIva(),
                producto.getIt(),
                producto.getTotal(),
            });
        }

        // Asignar el modelo de datos actualizado a la tabla
        TblVentas.setModel(modelodatosprod);

        // Opcional: Imprimir la actualización en la consola para depuración
        System.out.println("Tabla actualizada con " + listaProducto.size() + " productos.");

        /**
         * this.modelodatosprod.setRowCount(listaProducto.size()); for (int i =
         * 0; i < listaProducto.size(); i++) {
         * this.modelodatosprod.setValueAt(i+1,i,0);
         * this.modelodatosprod.setValueAt(listaProducto.get(i).getDescripcionA(),i,1);
         * this.modelodatosprod.setValueAt(listaProducto.get(i).getCantidad(),i,2);
         * this.modelodatosprod.setValueAt(listaProducto.get(i).getPreVenta(),i,3);
         * this.modelodatosprod.setValueAt(listaProducto.get(i).getSubtotal(),i,4);
         * this.modelodatosprod.setValueAt(listaProducto.get(i).getDescuento(),i,5);
         * this.modelodatosprod.setValueAt(listaProducto.get(i).getIva(),i,6);
         * this.modelodatosprod.setValueAt(listaProducto.get(i).getTotal(),i,7);
         * this.modelodatosprod.setValueAt("Eliminar",i,8); // poner un boton de
         * eliminar
         *
         * }
         * //añadimos la tabla TblVentas.setModel(modelodatosprod);
         *
         */
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
        TblVentas = new javax.swing.JTable();
        jLblCantidad = new javax.swing.JLabel();
        jLblProducto = new javax.swing.JLabel();
        jLblSubTotal = new javax.swing.JLabel();
        jLblTotal = new javax.swing.JLabel();
        jLblIva = new javax.swing.JLabel();
        jLblDescuento = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jCBoxProducto = new javax.swing.JComboBox<>();
        txtProducto = new javax.swing.JTextField();
        btnAñadirProd = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtDescuento = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(0, 153, 153));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(60);
        panelRound2.setRoundBottomRight(60);
        panelRound2.setRoundTopLeft(60);
        panelRound2.setRoundTopRight(60);

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("VENTAS");

        TblVentas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        TblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro", "Producto", "Cantidad", "Precio Unitario", "SubTotal", "Descuento", "IVA", "IT", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblVentas);

        jLblCantidad.setBackground(new java.awt.Color(0, 153, 153));
        jLblCantidad.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLblCantidad.setForeground(new java.awt.Color(0, 153, 153));
        jLblCantidad.setText("Cantidad");

        jLblProducto.setBackground(new java.awt.Color(0, 153, 153));
        jLblProducto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLblProducto.setForeground(new java.awt.Color(0, 153, 153));
        jLblProducto.setText("Cod. Producto");

        jLblSubTotal.setBackground(new java.awt.Color(0, 153, 153));
        jLblSubTotal.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLblSubTotal.setForeground(new java.awt.Color(0, 153, 153));
        jLblSubTotal.setText("SubTotal");

        jLblTotal.setBackground(new java.awt.Color(0, 153, 153));
        jLblTotal.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLblTotal.setForeground(new java.awt.Color(0, 153, 153));
        jLblTotal.setText("Total");

        jLblIva.setBackground(new java.awt.Color(0, 153, 153));
        jLblIva.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLblIva.setForeground(new java.awt.Color(0, 153, 153));
        jLblIva.setText("Iva");

        jLblDescuento.setBackground(new java.awt.Color(0, 153, 153));
        jLblDescuento.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLblDescuento.setForeground(new java.awt.Color(0, 153, 153));
        jLblDescuento.setText("Descuento");

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 204));
        btnRegistrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jCBoxProducto.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jCBoxProducto.setForeground(new java.awt.Color(234, 231, 231));
        jCBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto...", "Item 2", "Item 3", "Item 4" }));
        jCBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxProductoActionPerformed(evt);
            }
        });

        txtProducto.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        btnAñadirProd.setText("Añadir Producto");
        btnAñadirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProdActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtDescuento.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtDescuento.setEnabled(false);

        txtSubtotal.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtSubtotal.setEnabled(false);
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });

        txtIva.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        txtTotal.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txtTotal.setEnabled(false);

        btnVolver.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel2.setText("Venta de Calzados");

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                                        .addComponent(btnBorrar)
                                        .addGap(62, 62, 62)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLblSubTotal)
                                            .addComponent(jLblDescuento)
                                            .addComponent(jLblTotal)
                                            .addComponent(jLblIva))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDescuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblCantidad)
                                    .addComponent(jLblProducto))
                                .addGap(30, 30, 30)
                                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound2Layout.createSequentialGroup()
                                        .addComponent(jCBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAñadirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addGap(394, 394, 394)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblProducto)
                    .addComponent(jCBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadirProd))
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblSubTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblDescuento)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblIva)
                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblTotal)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnBorrar))
                        .addGap(105, 105, 105))))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void jCBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBoxProductoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        Principal pmenu = new Principal();
        pmenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String productoBuscar = txtProducto.getText().trim();
        Connection cn = Conexion.conectar();
        String sql = "SELECT * FROM public.\"PRODUCTOS\" where \"ID\"= '" + productoBuscar + "';";
        //"SELECT  usuario, password FROM public.\"USUARIO\" where usuario= '" + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "';";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {

                jCBoxProducto.setSelectedItem(rs.getString("DESCRIPCION_A"));
                // jCBoxProducto.setSelectedItem(rs.getString("ID") + " " + rs.getString("DESCRIPCION_A") + " " + rs.getString("MARCA"));

            } else {
                jCBoxProducto.setSelectedItem("Seleccione Producto...");
                JOptionPane.showMessageDialog(null, "ID no encontrado");
            }
            txtProducto.setText("");
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar Producto, " + e);
        }
        // buscarProducto();

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAñadirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProdActionPerformed
        // TODO add your handling code here:

        String prod = (String) jCBoxProducto.getSelectedItem();
        // validar la selección de un producto
        if (prod.equalsIgnoreCase("Seleccione Producto..")) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
            // validación del ingreso de cantidad
            if (!txtCantidad.getText().isEmpty()) {
                // validación que el usuario ingrese números
                boolean validacion = validar(txtCantidad.getText());

                if (validacion == true) {
                    // validación que cantidad > 0
                    if (Integer.parseInt(txtCantidad.getText()) > 0) {
                        cantidad = Integer.parseInt(txtCantidad.getText());
                        // ejecutar método para obtener los datos del producto
                        this.DatosdeProducto();

                        // Verificar que la cantidad no exceda el stock disponible
                        if (cantidad <= cantidadProductoBBDD) {

                            subtotal = precioUnitario * cantidad;
                            total = subtotal + iva + descuento + it;

                            // Redondeando decimales
                            subtotal = (double) Math.round(subtotal * 100) / 100;
                            iva = (double) Math.round(iva * 100) / 100;
                            descuento = (double) Math.round(descuento * 100) / 100;
                            total = (double) Math.round(total * 100) / 100;

                            // Crear un nuevo producto
                            producto = new DetalleVentas(auxIdDetalle,
                                    1, // idUsuario
                                    idProducto,
                                    Modelo,
                                    Integer.parseInt(txtCantidad.getText()),
                                    precioUnitario,
                                    subtotal,
                                    descuento,
                                    iva,
                                    total,
                                    1 // Estado
                            );

                            // Añadir a la lista de productos
                            listaProducto.add(producto);
                            JOptionPane.showMessageDialog(null, "Producto Agregado");
                            auxIdDetalle++;
                            txtCantidad.setText(""); // Limpiar el campo

                            // Volver a cargar combo productos
                            this.CargarProductos();
                            this.CalcularTotal();

                        } else {
                            JOptionPane.showMessageDialog(null, "La cantidad supera el Stock");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0, no negativa");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese la cantidad solo en números, por favor");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad de productos");
            }
        }

        // Llamando al método
        listaTablaProducto();

    }//GEN-LAST:event_btnAñadirProdActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        // Iterar sobre la lista de productos y actualizar el stock en la base de datos
        for (DetalleVentas producto : listaProducto) {
            // Calcular la nueva cantidad
            int nuevaCantidad = cantidadProductoBBDD - producto.getCantidad();

            // Actualizar el stock del producto en la base de datos
            actualizarStockProducto(producto.getId(), nuevaCantidad);
        }

        // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(null, "Productos registrados y stock actualizado correctamente");

        // Limpiar la lista de productos después de registrar
        listaProducto.clear();

        // Volver a cargar los productos en el ComboBox
        this.CargarProductos();

        // Actualizar la tabla de productos
        listaTablaProducto();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        // Obtener el índice de la fila seleccionada
        int selectedRow = TblVentas.getSelectedRow();

        // Si hay una fila seleccionada, eliminarla
        if (selectedRow != -1) {
            // Eliminar el producto de la lista
            listaProducto.remove(selectedRow);

            // Eliminar la fila del modelo de la tabla
            modelodatosprod.removeRow(selectedRow);

            JOptionPane.showMessageDialog(null, "Producto eliminado de la lista");
        } else {
            // Si no hay una fila seleccionada, eliminar todo el contenido de la tabla
            int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar todos los productos?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Limpiar la lista de productos
                listaProducto.clear();

                // Limpiar el modelo de la tabla
                modelodatosprod.setRowCount(0);

                JOptionPane.showMessageDialog(null, "Todos los productos han sido eliminados");
            }
        }

        // Actualizar la tabla después de eliminar
        listaTablaProducto();
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TblVentas;
    private javax.swing.JButton btnAñadirProd;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jCBoxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblCantidad;
    private javax.swing.JLabel jLblDescuento;
    private javax.swing.JLabel jLblIva;
    private javax.swing.JLabel jLblProducto;
    private javax.swing.JLabel jLblSubTotal;
    private javax.swing.JLabel jLblTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private ucb.programacionii.inventariopro.PanelRound panelRound1;
    private ucb.programacionii.inventariopro.PanelRound panelRound2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

//cargar productos
    private void CargarProductos() {
        Connection con = Conexion.conectar();
        String sql = "SELECT * FROM public.\"PRODUCTOS\"";

        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jCBoxProducto.removeAllItems();
            jCBoxProducto.addItem("Seleccione Producto..");
            //
            while (rs.next()) {
                jCBoxProducto.addItem(rs.getString("DESCRIPCION_A"));
                //jCBoxProducto.addItem(rs.getString("ID") + " " + rs.getString("DESCRIPCION_A") + " " + rs.getString("MARCA"));
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar productos!" + e);
        }

    }

    //Validar que sea cantidad con solo numeros   
    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //muestra datos del prod 
    private void DatosdeProducto() {

        try {
            String sql = "SELECT * FROM public.\"PRODUCTOS\" WHERE \"DESCRIPCION_A\" = ?";
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, this.jCBoxProducto.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                idProducto = rs.getInt("ID");
                Modelo = rs.getString("DESCRIPCION_A");
                cantidadProductoBBDD = rs.getInt("CANTIDAD");
                precioUnitario = rs.getDouble("PRECIO_DE_VENTA");
                //porceniva = rs.getInt("PRECIO_DE_VENTA");
                porceniva = 13;
                porcenit = 3;

                this.CalcularIva(precioUnitario, porceniva);
                this.CalcularIt(precioUnitario, porcenit);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del producto, " + e);
        }

    }

    //calculamos venta
    private double CalcularIva(double precio, int porcentajeIva) {

        iva = (precio * cantidad) * 0.13;

        return iva;

    }

    private double CalcularIt(double precio, int porcentajeIt) {

        it = (precio * cantidad) * 0.03;

        return it;

    }

    //Calacular total a pagar
    private void CalcularTotal() {
        subtotalgral = 0;
        descuentogral = 0;
        ivagral = 0;
        totalgral = 0;

        for (DetalleVentas elemento : listaProducto) {
            subtotalgral += elemento.getSubtotal();
            descuentogral += elemento.getDescuento();
            ivagral += elemento.getIva();
            totalgral += elemento.getTotal();

        }

        //redondeando decimales
        subtotalgral = (double) Math.round(subtotalgral * 100) / 100;
        ivagral = (double) Math.round(ivagral * 100) / 100;
        descuentogral = (double) Math.round(descuentogral * 100) / 100;
        totalgral = (double) Math.round(totalgral * 100) / 100;

        //enviar datos a la vista
        txtSubtotal.setText(String.valueOf(subtotalgral));
        txtDescuento.setText(String.valueOf(descuentogral));
        txtIva.setText(String.valueOf(ivagral));
        txtTotal.setText(String.valueOf(totalgral));

    }

    private void actualizarStockProducto(int idProducto, int nuevaCantidad) {
        Connection con = Conexion.conectar();
        String sql = "UPDATE public.\"PRODUCTOS\" SET \"CANTIDAD\" = ? WHERE \"ID\" = ?";

        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, nuevaCantidad);
            pst.setInt(2, idProducto);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar el stock del producto!" + e);
        }
    }

}
