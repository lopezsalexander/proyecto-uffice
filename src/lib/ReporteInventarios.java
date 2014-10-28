
package lib;

import java.awt.Frame;
import java.sql.Connection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Alexander
 */

public class ReporteInventarios {
    
        public void GenerarReporte() {

        try {
            //Conexion a la Base de Datos    
            Conexion conexion = new Conexion();
            Connection Conexion = conexion.conexion();
            //Llamado del ReporteNomina
            JasperReport Report = JasperCompileManager.compileReport(System.getProperty("user.dir").concat("\\src\\report\\Inventarios.jrxml"));
            JasperPrint print = JasperFillManager.fillReport(Report, null, Conexion);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte Nomina");
            view.setExtendedState(Frame.MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (JRException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error" + ex);
        }
    }
    
}
