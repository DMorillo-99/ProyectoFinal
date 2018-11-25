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
import proyectofinal.registrarclientes;

/**
 *
 * @author Dmorillo
 */
public class metosregis extends datos {

    Connection conn = null;
    PreparedStatement pstm = null;
    //datos d = new datos();

    public void registrarcliente() {

        try {
            //Se usa esto para que no de error    ------>  ?autoReconnect=true&useSSL=false
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curriebd?autoReconnect=true&useSSL=false", "root", "");
            System.out.println("Conexion exitosa");
            pstm = conn.prepareStatement("INSERT INTO cliente (nombre, apellido, direccion, correo, sexo, usuario, contraseña)VALUES (?, ?, ?, ?, ?, ?, ?)");
            //Insertar en las tablas//
            pstm.setString(1, getNombre());
            pstm.setString(2, getApellid());
            pstm.setString(3, getDireccion());
            pstm.setString(4, getCorreo());
            pstm.setString(5, getSexo());
            pstm.setString(6, getUsuario());
            pstm.setString(7, getContraseña());

            System.out.println("sus datos agregados son"
                    + "\nnombre: " + getNombre()
                    + "\napellido: " + getApellid()
                    + "\ndireccion: " + getDireccion()
                    + "\ncorreo : " + getCorreo()
                    + "\nsexo :" + getSexo()
                    + "\nusuario : " + getUsuario()
                    + "\ncontraseña : " + getContraseña()
                    + "\n");

            pstm.executeUpdate();
            System.out.println("Se agrego exitosamente");

            //JOptionPane.showMessageDialog(mensaje, "El nombre o apellido" + txtnombre.getText + "" +txtnombre.getText + "ocurrio un problema", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Ha ocurrido un error a la hora de insertar los datos a la base de datos pro favor intente de nuevo");
        }

    }

    public void registrarreceptor() {
        try {
            //Se usa esto para que no de error    ------>  ?autoReconnect=true&useSSL=false
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curriebd?autoReconnect=true&useSSL=false", "root", "");
            System.out.println("Conexion exitosa");
            pstm = conn.prepareStatement("INSERT INTO receptor (nombre, apellido, direccion, correo, sexo, usuario, contraseña)VALUES (?, ?, ?, ?, ?, ?, ?)");
            //Insertar en las tablas//
            pstm.setString(1, getNombre());
            pstm.setString(2, getApellid());
            pstm.setString(3, getDireccion());
            pstm.setString(4, getCorreo());
            pstm.setString(5, getSexo());
            pstm.setString(6, getUsuario());
            pstm.setString(7, getContraseña());

            System.out.println("sus datos agregados son"
                    + "\nnombre: " + getNombre()
                    + "\napellido: " + getApellid()
                    + "\ndireccion: " + getDireccion()
                    + "\ncorreo : " + getCorreo()
                    + "\nsexo :" + getSexo()
                    + "\nusuario : " + getUsuario()
                    + "\ncontraseña : " + getContraseña()
                    + "\n");

            pstm.executeUpdate();
            System.out.println("Se agrego exitosamente");

            //JOptionPane.showMessageDialog(mensaje, "El nombre o apellido" + txtnombre.getText + "" +txtnombre.getText + "ocurrio un problema", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Ha ocurrido un error a la hora de insertar los datos a la base de datos pro favor intente de nuevo");
        }

    }

    public void registraradmin() {
        try {
            //Se usa esto para que no de error    ------>  ?autoReconnect=true&useSSL=false
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curriebd?autoReconnect=true&useSSL=false", "root", "");
            System.out.println("Conexion exitosa");
            pstm = conn.prepareStatement("INSERT INTO admin (nombre, apellido, direccion, correo, sexo, usuario, contraseña)VALUES (?, ?, ?, ?, ?, ?, ?)");
            //Insertar en las tablas//
            pstm.setString(1, getNombre());
            pstm.setString(2, getApellid());
            pstm.setString(3, getDireccion());
            pstm.setString(4, getCorreo());
            pstm.setString(5, getSexo());
            pstm.setString(6, getUsuario());
            pstm.setString(7, getContraseña());

            System.out.println("sus datos agregados son"
                    + "\nnombre: " + getNombre()
                    + "\napellido: " + getApellid()
                    + "\ndireccion: " + getDireccion()
                    + "\ncorreo : " + getCorreo()
                    + "\nsexo :" + getSexo()
                    + "\nusuario : " + getUsuario()
                    + "\ncontraseña : " + getContraseña()
                    + "\n");

            pstm.executeUpdate();
            System.out.println("Se agrego exitosamente");

            //JOptionPane.showMessageDialog(mensaje, "El nombre o apellido" + txtnombre.getText + "" +txtnombre.getText + "ocurrio un problema", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Ha ocurrido un error a la hora de insertar los datos a la base de datos pro favor intente de nuevo");
        }

    }

}
