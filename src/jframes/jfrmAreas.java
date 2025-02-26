/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframes;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import jFrames.Conexion;
import javax.swing.table.DefaultTableModel;
import modelos.modInventario.modArea;

/**
 *
 * @author lumac
 */
public class jfrmAreas extends javax.swing.JFrame {

    /**
     * Creates new form jfrmAreas
     */
    public jfrmAreas() {
        
        initComponents();
        cargarAreas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnInsertArea = new javax.swing.JButton();
        btnUpdateArea = new javax.swing.JButton();
        btnDeleteArea = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAreas = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtUbicación = new javax.swing.JTextField();
        btnInventario = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Areas");

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

        jLabel2.setText("Area");

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
                    .addComponent(jLabel2))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertArea)
                    .addComponent(btnUpdateArea)
                    .addComponent(btnDeleteArea))
                .addGap(24, 24, 24))
        );

        jLabel3.setText("Nombre:");

        jLabel4.setText("Ubicación:");

        tblAreas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAreas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAreasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAreas);

        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInventario))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(167, 167, 167)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(txtUbicación, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbicación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAreaActionPerformed
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        if (cx == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }
        try{
            String nombre = txtNombre.getText();
            String ubicacion = txtUbicación.getText();        

            modArea nuevaArea = new modArea(nombre, ubicacion);

            String sql = "INSERT INTO Areas (nombre, ubicacion) VALUES (?, ?)";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, nuevaArea.getNombre());
            ps.setString(2, nuevaArea.getUbicacion());

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

        cargarAreas();
    }//GEN-LAST:event_btnInsertAreaActionPerformed

    private void btnUpdateAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAreaActionPerformed
        int filaSeleccionada = tblAreas.getSelectedRow();
        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un área de la tabla para actualizar.");
            return;
        }

        int idArea = (int) tblAreas.getValueAt(filaSeleccionada, 0);
        String nombre = txtNombre.getText();
        String ubicacion = txtUbicación.getText();

        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        if (cx == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }

        try {
            String sql = "UPDATE Areas SET nombre = ?, ubicacion = ? WHERE id = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, ubicacion);
            ps.setInt(3, idArea);

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Área actualizada correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo actualizar el área.");
            }

            ps.close();
            cx.close();
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error SQL: " + e.getMessage());
        }

        cargarAreas(); // Recargar la tabla para reflejar los cambios
    }//GEN-LAST:event_btnUpdateAreaActionPerformed

    private void btnDeleteAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAreaActionPerformed
        int filaSeleccionada = tblAreas.getSelectedRow();

        if (filaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecciona un inventario para eliminar.");
            return;
        }
        int idArea = (int) tblAreas.getValueAt(filaSeleccionada, 0);  // ID está en la primera columna

        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        if (cx == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }

        try {
            String sql = "DELETE FROM Areas WHERE id = ?";
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setInt(1, idArea);

            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Inventario eliminado correctamente.");
                cargarAreas();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo eliminar el inventario.");
            }
            ps.close();
            cx.close();
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error SQL: " + e.getMessage());
        }
        cargarAreas();
    }//GEN-LAST:event_btnDeleteAreaActionPerformed

    private void tblAreasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAreasMouseClicked
        int filaSeleccionada = tblAreas.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String nombre = tblAreas.getValueAt(filaSeleccionada, 1).toString();
            String ubicacion = tblAreas.getValueAt(filaSeleccionada, 2).toString();

            txtNombre.setText(nombre);
            txtUbicación.setText(ubicacion);    
        }
    }//GEN-LAST:event_tblAreasMouseClicked

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
    jfrmInventarioInsert inventarioFrame = new jfrmInventarioInsert(); 
    inventarioFrame.setVisible(true); 
    this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void cargarAreas() {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        if (cx == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
            return;
        }

        try {
            String sql = "SELECT * FROM Areas";
            PreparedStatement ps = cx.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Ubicacion");

            while (rs.next()) {
                Object[] fila = new Object[9];
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("ubicacion");
                modelo.addRow(fila);
            }
            tblAreas.setModel(modelo);

            rs.close();
            ps.close();
            cx.close();
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error SQL: " + e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(jfrmAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmAreas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteArea;
    private javax.swing.JButton btnInsertArea;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnUpdateArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblAreas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicación;
    // End of variables declaration//GEN-END:variables
}
