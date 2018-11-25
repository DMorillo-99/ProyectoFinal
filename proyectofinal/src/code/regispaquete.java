/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dmorillo
 */
public class regispaquete extends datospaquete {

    Connection conn = null;
    PreparedStatement pstm = null;

    public void registrar() {
        try {
            //Se usa esto para que no de error    ------>  ?autoReconnect=true&useSSL=false
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curriebd?autoReconnect=true&useSSL=false", "root", "");
            System.out.println("Conexion exitosa");
            pstm = conn.prepareStatement("INSERT INTO recogida (descripcion, fecha, ubicacion, tipo_de_paquete, estado, usuario_cliente)VALUES (?, ?, ?, ?, ?, ?)");
            //Insertar en las tablas//
            pstm.setString(1, getDescripcion());
            pstm.setString(2, getFecha());
            pstm.setString(3, getUbicacion());
            pstm.setString(4, getTipo_paquete());
            pstm.setString(5, getEstado());
            pstm.setString(6, getUser());

            System.out.println("sus datos agregados son"
                    + "\nnombre: " + getDescripcion()
                    + "\napellido: " + getFecha()
                    + "\ndireccion: " + getUbicacion()
                    + "\ncorreo : " + getTipo_paquete()
                    + "\nsexo :" + getEstado()
                    + "\nusuario : " + getUser()
                    + "\n");

            pstm.executeUpdate();
            System.out.println("Se agrego exitosamente");
            JOptionPane.showMessageDialog(null, "Se agrego exitosamente");
            setDescripcion("");
            setFecha("");
            setUbicacion("");
            setTipo_paquete("");
            setUser("");
            setEstado("");

            //JOptionPane.showMessageDialog(mensaje, "El nombre o apellido" + txtnombre.getText + "" +txtnombre.getText + "ocurrio un problema", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error a la hora de insertar los datos a la base de datos pro favor intente de nuevo");
            setDescripcion("");
            setFecha("");
            setUbicacion("");
            setTipo_paquete("");
            setEstado("");
                    
        }
    }

}
