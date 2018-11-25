
package code;

/**
 *
 * @author Dmorillo
 */
public class datospaquete {
    
    private String descripcion;
    private String fecha;
    private String ubicacion;
    private String tipo_paquete;
    private String estado;
    private String user;

    

    public datospaquete(String descripcion, String fecha, String ubicacion, String tipo_paquete, String estado, String user) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.tipo_paquete = tipo_paquete;
        this.estado = estado;
        this.user = user;
    }

    public datospaquete() {
        
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo_paquete() {
        return tipo_paquete;
    }

    public void setTipo_paquete(String tipo_paquete) {
        this.tipo_paquete = tipo_paquete;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
    
    
    
}
