/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframes;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.SpinnerDateModel;
import java.util.Date;
import modelos.modInventario.modInventario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import jFrames.Conexion;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jovan
 */
public class jfrmInventarioInsert extends javax.swing.JFrame {

    /**
     * Creates new form jfrmInventarioInsert
     */
    public jfrmInventarioInsert() {
        initComponents();
        this.setLocationRelativeTo(null);
        dateTimeSpinner.setModel(new SpinnerDateModel());
        dateTimeSpinner.setEditor(new javax.swing.JSpinner.DateEditor(dateTimeSpinner, "dd-MM-yyyy"));
        cargarInventarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnInsertArea = new javax.swing.JButton();
        btnUpdateArea = new javax.swing.JButton();
        btnDeleteArea = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtSerie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateTimeSpinner = new javax.swing.JSpinner();
        txtTipoAdquisision = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        btnInsertArea.setText("Insertar");
        btnInsertArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertAreaActionPerformed(evt);
            }
        });

        btnUpdateArea.setText("Actualizar");
        btnUpdateArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAreaActionPerformed(evt);
            }
        });

        btnDeleteArea.setText("Borrar");
        btnDeleteArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAreaActionPerformed(evt);
            }
        });

        jLabel1.setText("Area");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInsertArea)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateArea)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteArea))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertArea)
                    .addComponent(btnUpdateArea)
                    .addComponent(btnDeleteArea))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 340, 90));

        jLabel2.setText("Menu");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel1.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, -1));

        jLabel4.setText("Descripcion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        jPanel1.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 120, -1));

        jLabel5.setText("Serie");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 120, -1));

        jLabel6.setText("Color");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel7.setText("FechaAdquisision");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));
        jPanel1.add(dateTimeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));
        jPanel1.add(txtTipoAdquisision, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 120, -1));

        jLabel8.setText("Tipo de adquisision");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtObservaciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel9.setText("Observaciones");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));
        jPanel1.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 120, 20));

        jLabel10.setText("Id de area");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, 10));

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblInventario);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 580, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarInventarios() {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        if (cx == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }

        try {
            String sql = "SELECT * FROM Inventario";
            PreparedStatement ps = cx.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Serie");
            modelo.addColumn("Color");
            modelo.addColumn("Fecha Adquisicion");
            modelo.addColumn("Tipo Adquisicion");
            modelo.addColumn("Observaciones");
            modelo.addColumn("ID Area");

            while (rs.next()) {
                Object[] fila = new Object[9];
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("nombrecorto");
                fila[2] = rs.getString("descripcion");
                fila[3] = rs.getString("serie");
                fila[4] = rs.getString("color");
                fila[5] = rs.getDate("fechaAdquisision");
                fila[6] = rs.getString("tipoAdquisision");
                fila[7] = rs.getString("observaciones");
                fila[8] = rs.getInt("areas_id");
                modelo.addRow(fila);
            }
            tblInventario.setModel(modelo);

            rs.close();
            ps.close();
            cx.close();
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error SQL: " + e.getMessage());
        }
    }
    
    
    private void btnInsertAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAreaActionPerformed
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        if (cx == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }
        try{
            String nombre = tfNombre.getText();
            String descripcion = txtDescripcion.getText();
            String serie = txtSerie.getText();
            String color = txtColor.getText();
            Date fechaAdquisicion = (Date) dateTimeSpinner.getValue();
            String tipoAdquisicion = txtTipoAdquisision.getText();
            String observaciones = txtObservaciones.getText();
            String areaText = txtArea.getText();
            if (!areaText.matches("\\d+")) {
                javax.swing.JOptionPane.showMessageDialog(this, "El campo 'Id de area' debe contener solo números.");
                return;
            }
            int idArea = Integer.parseInt(areaText); 

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = sdf.format(fechaAdquisicion);

            modInventario nuevoInventario = new modInventario(
                nombre, descripcion, serie, color, fechaAdquisicion, tipoAdquisicion, observaciones, idArea
            );

            String sql = "INSERT INTO Inventario (nombrecorto, descripcion, serie, color, fechaAdquisision, tipoAdquisision, observaciones, areas_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, nuevoInventario.getNombreCorto());
            ps.setString(2, nuevoInventario.getDescripcion());
            ps.setString(3, nuevoInventario.getSerie());
            ps.setString(4, nuevoInventario.getColor());
            ps.setString(5, fechaFormateada);
            ps.setString(6, nuevoInventario.getTipoAdquisision());
            ps.setString(7, nuevoInventario.getObservaciones());
            ps.setInt(8, nuevoInventario.getArea_id());

            int filasInsertadas = ps.executeUpdate();
            if (filasInsertadas > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Registro agregado correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al agregar el registro.");
            }

            ps.close();
            cx.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error SQL: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        
        cargarInventarios(),
    }//GEN-LAST:event_btnInsertAreaActionPerformed

    private void btnDeleteAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAreaActionPerformed
        int filaSeleccionada = tblInventario.getSelectedRow();

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecciona un inventario para eliminar.");
            return;
        }
        int idInventario = (int) tblInventario.getValueAt(filaSeleccionada, 0);  // ID está en la primera columna

        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        if (cx == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }

        try {
            String sql = "DELETE FROM Inventario WHERE id = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, idInventario);

            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Inventario eliminado correctamente.");
                cargarInventarios();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo eliminar el inventario.");
            }
            ps.close();
            cx.close();
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error SQL: " + e.getMessage());
        }
        cargarInventarios();
    }//GEN-LAST:event_btnDeleteAreaActionPerformed

    

    private void btnUpdateAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAreaActionPerformed
        String nombre = tfNombre.getText();
        String descripcion = txtDescripcion.getText();
        String serie = txtSerie.getText();
        String color = txtColor.getText();
        Date fechaAdquisicion = (Date) dateTimeSpinner.getValue();
        String tipoAdquisicion = txtTipoAdquisision.getText();
        String observaciones = txtObservaciones.getText();
        String areaText = txtArea.getText();

        if (!areaText.matches("\\d+")) {
            javax.swing.JOptionPane.showMessageDialog(this, "El campo 'Id de area' debe contener solo números.");
            return;
        }
        int idArea = Integer.parseInt(areaText); 

        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        if (cx == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }

        try {
            int idInventario = (int) tblInventario.getValueAt(tblInventario.getSelectedRow(), 0);

            String sql = "UPDATE Inventario SET nombrecorto = ?, descripcion = ?, serie = ?, color = ?, fechaAdquisision = ?, tipoAdquisision = ?, observaciones = ?, areas_id = ? WHERE id = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = sdf.format(fechaAdquisicion);

            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setString(3, serie);
            ps.setString(4, color);
            ps.setString(5, fechaFormateada);
            ps.setString(6, tipoAdquisicion);
            ps.setString(7, observaciones);
            ps.setInt(8, idArea);
            ps.setInt(9, idInventario);
            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Inventario actualizado correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo actualizar el inventario.");
            }

            ps.close();
            cx.close();
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error SQL: " + e.getMessage());
        }
        cargarInventarios();   
    }//GEN-LAST:event_btnUpdateAreaActionPerformed

    private void tblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventarioMouseClicked
        int filaSeleccionada = tblInventario.getSelectedRow();
  
        if (filaSeleccionada != -1) {
            String nombre = tblInventario.getValueAt(filaSeleccionada, 1).toString();
            String descripcion = tblInventario.getValueAt(filaSeleccionada, 2).toString();
            String serie = tblInventario.getValueAt(filaSeleccionada, 3).toString();
            String color = tblInventario.getValueAt(filaSeleccionada, 4).toString();
            Date fechaAdquisicion = (Date) tblInventario.getValueAt(filaSeleccionada, 5);
            String tipoAdquisicion = tblInventario.getValueAt(filaSeleccionada, 6).toString();
            String observaciones = tblInventario.getValueAt(filaSeleccionada, 7).toString();
            String area = tblInventario.getValueAt(filaSeleccionada, 8).toString();
            
            tfNombre.setText(nombre);
            txtDescripcion.setText(descripcion);
            txtSerie.setText(serie);
            txtColor.setText(color);
            dateTimeSpinner.setValue(fechaAdquisicion);
            txtTipoAdquisision.setText(tipoAdquisicion);
            txtObservaciones.setText(observaciones);
            txtArea.setText(area);
        }
    }//GEN-LAST:event_tblInventarioMouseClicked

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
            java.util.logging.Logger.getLogger(jfrmInventarioInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmInventarioInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmInventarioInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmInventarioInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmInventarioInsert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteArea;
    private javax.swing.JButton btnInsertArea;
    private javax.swing.JButton btnUpdateArea;
    private javax.swing.JSpinner dateTimeSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTipoAdquisision;
    // End of variables declaration//GEN-END:variables
}
