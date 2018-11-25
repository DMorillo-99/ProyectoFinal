/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Dmorillo
 */
public class datos {
    
      String nombre;
      String apellid;
      String direccion;
      String correo;
      String sexo;
      String usuario;
      String contraseña;

    public datos(String nombre, String apellid, String direccion, String correo, String sexo, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellid = apellid;
        this.direccion = direccion;
        this.correo = correo;
        this.sexo = sexo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    datos() {
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellid(String apellid) {
        this.apellid = apellid;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellid() {
        return apellid;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
    
    
    
    
    
}
