/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dmorillo
 */
public class conectar {
    
    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                                                            //Se usa esto para que no de error    ------>  ?autoReconnect=true&useSSL=false
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/curriebd?autoReconnect=true&useSSL=false", "root", "");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion " +ex.getMessage());
        }
        return conectar;
    }

}

