/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produccion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author succubus
 */
public class MetodoRegistroProduccion {

    //statements
    public int RespuestaRegistroTablaPuente = 0;
    public String RespuestaMetodoConsultaIdEmpleado = "";
    public String resultadoConsultaIdProductoTerminado = "";
    public String ResultadoConsultaCantidaPedido = "";
    public String ResultadoConsultaCount = "";
    public String ResultadoConsultaPeso = "";
    public String ResultadoConsultaPesoProducto = "";

    //se instancia la conexion
    lib.Conexion obj = new lib.Conexion();

    //metodo para insertar datos en la tabla puente, llaves foraneas
    public int RegistroTablaPuente(String[] datos) {
        String sentenciaInsertTablaPuente = "Insert into EmplProdTerm values(" + datos[0] + "," + datos[1] + ")";
        try {
            Connection cn = obj.conexion();
            Statement st = cn.createStatement();
            RespuestaRegistroTablaPuente = st.executeUpdate(sentenciaInsertTablaPuente);
            if (RespuestaRegistroTablaPuente > 0) {
                RespuestaRegistroTablaPuente = 1;
            }

        } catch (SQLException e) {
        }
        /*retorna si fue registrdo o no como se sabe 1 por que es registrado 0 por que no fue registrado*/
        return RespuestaRegistroTablaPuente;
    }

    //metodo que  consulta el id del empleado para luego ser insertado en en la tabla puente
    public String ConsultarIDEmpleado(String Consulta) {
        try {
            Connection cn = obj.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Consulta);
            while (rs.next()) {
                RespuestaMetodoConsultaIdEmpleado = rs.getString(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return RespuestaMetodoConsultaIdEmpleado;
    }

    public String ConsultarIdPrtoductoTerminado(String Consulta) {
        try {
            Connection cn = obj.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Consulta);
            while (rs.next()) {
                resultadoConsultaIdProductoTerminado = rs.getString(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return resultadoConsultaIdProductoTerminado;
    }

    public String ConsultarCantidadPedido(String IDPedido) {

        String Consulta = "select cantidad from PedidoProd where idPEDIDO =" + IDPedido + "";
        try {
            Connection cn = obj.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Consulta);
            while (rs.next()) {
                ResultadoConsultaCantidaPedido = rs.getString(1);
            }
        } catch (SQLException e) {
        }
        return ResultadoConsultaCantidaPedido;
    }

    public String ConsultarCountProducto(String Pedido) {
        String Query = "select count(idPEDIDO) from ProductoTerminado where idPEDIDO =  " + Pedido + "";
        try {
            Connection cn = obj.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while (rs.next()) {
                ResultadoConsultaCount = rs.getString(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ResultadoConsultaCount;
    }

    /*Metodo que retorna un String del resultado de la consulta*/
    public String PesoPedido(String Pedido) {
        String query = "select peso_proyectado from PedidoProd where idPEDIDO = " + Pedido + "";
        try {
            Connection cn = obj.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ResultadoConsultaPeso = rs.getString(1);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ResultadoConsultaPeso;
    }

    public String PesoProducto(String Pedido) {
        String query = "  select sum(pesa) from ProductoTerminado where idPEDIDO = " + Pedido + "";
        try {
            Connection cn = obj.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ResultadoConsultaPesoProducto = rs.getString(1);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ResultadoConsultaPesoProducto;
    }
}
