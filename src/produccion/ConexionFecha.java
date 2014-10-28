/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package produccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;

/**
 *
 * @author WinDoctor
 */
public class ConexionFecha {

    private Connection conn;
    public String bd = "basePrueba";
    public String login = "sa";
    public String password = "1234";
    public String url = "jdbc:jtds:sqlserver://LOCALHOST:1433/" + bd;

    private String porPedido;

    public ConexionFecha() {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver"); //se carga el driver
            conn = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException | SQLException ex) {
        }

    }

    public void runReporte(String porFecha) {
        //this.id_contact="";
        //this.id_contact = id;

        try {
            String master = System.getProperty("user.dir")
                    + "\\src\\produccion\\porfecha.jasper";

            System.out.println("master: " + master);
            if (master == null) {
                System.out.println("No encuentro el archivo del reporte maestro.");
                System.exit(2);
            }

            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObjectFromFile(master);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                System.exit(3);
            }

            //este es el parámetro, se pueden agregar más parámetros
            //basta con poner mas parametro.put
            Map parametro = new HashMap();
            parametro.put("fechaUno", porFecha);
            parametro.put("fechaDos", porFecha);

            //Reporte diseñado y compilado con iReport
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, parametro, conn);

            //Se lanza el Viewer de Jasper, no termina aplicación al salir
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle("Por Fecha");
            jviewer.setVisible(true);
        } catch (JRException j) {
            System.out.println("Mensaje de Error:" + j.getMessage());
        }

    }

    public void cerrar() {
        try {
            conn.close();
        } catch (SQLException ex) {
        }
    }
}
