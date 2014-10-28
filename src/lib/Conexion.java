package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author GAES 2
 */
public class Conexion {

    //Servidor
    public String server = "localhost";
    //Puerto
    public String port = "1433";
    //Base de datos
    public String bd = "UFFICE";
    //Usuario
    public String login = "sa";
    //Contraseña
    public String password = "1234";
    //Cadena de conexion
    public String url = "jdbc:jtds:sqlserver://" + server + ":" + port + "/" + bd;
    Connection conn;
    Statement st = null;

    public Connection conexion() {
        try {
            //Driver
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //URL de conexión
            conn = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return conn;
    }

    public Statement conectar() {
        //variables de conexión
        try {
            if (conn != null) {
                //Statement actualizable
                st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return st;
    }

    // Método para cerrar conexión
    public void cerrar(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
            }
        }
    }

    // Método para cerrar Statement
    public void cerrar(java.sql.Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            }
        }
    }
}
