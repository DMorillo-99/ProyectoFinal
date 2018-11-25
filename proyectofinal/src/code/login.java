
package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinal.*;

/**
 *
 * @author Dmorillo
 */
public class login extends datos {

    private static login instancia;

    //creamos un constructor de tipo privado para evitar que se creen las instancias con new
    private login() {

    }

    //obtendremos la intancia unicamente de este metodo
    public static login getInstancia() {

        if (instancia == null) {
            instancia = new login();
        }
        return instancia;

    }

    //aqui estan las diferentes partes del login como: usuario, admin, y receptor
    public void admin() {
        conectar cc = new conectar();
        //intanciamos la la conexion a la BD
        Connection con = cc.conexion();
        int resultado = 0;
        //Hacemos la consulta para verificar si existe el usuario
        String sql = "Select * From admin Where usuario = '" + getUsuario() + "' and contraseña = '" + getContraseña() + "' ";

        try {
            //ejecutamos la consulta
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //se verifica si existe
            if (rs.next()) {
                resultado = 1;

                if (resultado == 1) {
                    //en caos de que exista se muestra la otra ventana
                    admin an = new admin();
                    an.setVisible(true);

                }
            } else {
                //si no existe aparece un error informando de que no existe y regresando a la pantalla de
                //elegir usuario
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error \n"
                        + "Es posible que su usuario no este registrado");
                elegirusuario eu = new elegirusuario();
                eu.setVisible(true);
            }

        } catch (Exception ex) {
            //error por si falla la conexion
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }
    }

    public void receptor() {
        conectar cc = new conectar();
        Connection con = cc.conexion();
        int resultado = 0;
        String sql = "Select * From receptor Where usuario = '" + getUsuario() + "' and contraseña = '" + getContraseña() + "' ";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = 1;

                if (resultado == 1) {
                    receptor rr = new receptor();
                    rr.setVisible(true);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error \n"
                        + "Es posible que su usuario no este registrado");
                elegirusuario eu = new elegirusuario();
                eu.setVisible(true);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }

    }

    public void cliente() {
        conectar cc = new conectar();
        Connection con = cc.conexion();
        int resultado = 0;
        String sql = "Select * From cliente Where usuario = '" + getUsuario() + "' and contraseña = '" + getContraseña() + "' ";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = 1;

                if (resultado == 1) {
                    cliente ct = new cliente();
                    ct.setVisible(true);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error \n"
                        + "Es posible que su usuario no este registrado");
                elegirusuario eu = new elegirusuario();
                eu.setVisible(true);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }

    }

}
