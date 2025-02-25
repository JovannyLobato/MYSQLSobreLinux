/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jFrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jovan
 */

public class Conexion {
    String db="inventarioProductos";
    String url="jdbc:mysql://128.85.50.204:3306/" + db + "?useSSL=false&serverTimezone=UTC";
    String user="jovanny";
    String pass="Rammusjovannylupita@44";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion() {
        
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url,user,pass);
            System.out.println("Conexión exitosa a MySQL en Azure.");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return cx;
    }
    
    public Connection desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
}
