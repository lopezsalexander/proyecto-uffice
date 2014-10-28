package lib;

//Llamado de las Librerias
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author JP
 */

//Declaracion Clase Reserva
public class Reserva {
    //Declaracion de las Variables
    private int Rese_ID, FK_Nomi_Comprobante, Rese_EPS, Rese_AFP, Rese_ARL;
    private int Rese_Cesantias, Rese_IntCesantias, Rese_PrimaServicios;
    private int Rese_Vacaciones, Rese_CCompensacion, Rese_ICBF, Rese_SENA;
    private int Rese_Sueldo, Rese_Subtotal;
    //Encapsulacion de las Variables
    public Reserva() {

    }

    public int getRese_ID() {
        return Rese_ID;
    }

    public void setRese_ID(int Rese_ID) {
        this.Rese_ID = Rese_ID;
    }

    public int getFK_Nomi_Comprobante() {
        return FK_Nomi_Comprobante;
    }

    public void setFK_Nomi_Comprobante(int FK_Nomi_Combrobante) {
        this.FK_Nomi_Comprobante = FK_Nomi_Combrobante;
    }

    public int getRese_EPS() {
        return Rese_EPS;
    }

    public void setRese_EPS(int Rese_EPS) {
        this.Rese_EPS = Rese_EPS;
    }

    public int getRese_AFP() {
        return Rese_AFP;
    }

    public void setRese_AFP(int Rese_AFP) {
        this.Rese_AFP = Rese_AFP;
    }

    public int getRese_ARL() {
        return Rese_ARL;
    }

    public void setRese_ARL(int Rese_ARL) {
        this.Rese_ARL = Rese_ARL;
    }

    public int getRese_Cesantias() {
        return Rese_Cesantias;
    }

    public void setRese_Cesantias(int Rese_Cesantias) {
        this.Rese_Cesantias = Rese_Cesantias;
    }

    public int getRese_IntCesantias() {
        return Rese_IntCesantias;
    }

    public void setRese_IntCesantias(int Rese_IntCesantias) {
        this.Rese_IntCesantias = Rese_IntCesantias;
    }

    public int getRese_PrimaServicios() {
        return Rese_PrimaServicios;
    }

    public void setRese_PrimaServicios(int Rese_PrimaServicios) {
        this.Rese_PrimaServicios = Rese_PrimaServicios;
    }

    public int getRese_Vacaciones() {
        return Rese_Vacaciones;
    }

    public void setRese_Vacaciones(int Rese_Vacaciones) {
        this.Rese_Vacaciones = Rese_Vacaciones;
    }

    public int getRese_CCompensacion() {
        return Rese_CCompensacion;
    }

    public void setRese_CCompensacion(int Rese_CCompensacion) {
        this.Rese_CCompensacion = Rese_CCompensacion;
    }

    public int getRese_ICBF() {
        return Rese_ICBF;
    }

    public void setRese_ICBF(int Rese_ICBF) {
        this.Rese_ICBF = Rese_ICBF;
    }

    public int getRese_SENA() {
        return Rese_SENA;
    }

    public void setRese_SENA(int Rese_SENA) {
        this.Rese_SENA = Rese_SENA;
    }

    public int getRese_Sueldo() {
        return Rese_Sueldo;
    }

    public void setRese_Sueldo(int Rese_Sueldo) {
        this.Rese_Sueldo = Rese_Sueldo;
    }

    public int getRese_Subtotal() {
        return Rese_Subtotal;
    }

    public void setRese_Subtotal(int Rese_Subtotal) {
        this.Rese_Subtotal = Rese_Subtotal;
    }
    //Metodo Guardar
    public void Guardar() throws Exception {

        try {
            //Conexion a la Base de Datos
            Conexion BaseDatos = new Conexion();
            Connection Con = BaseDatos.conexion();
            //Sentencia SQL
            String SQL = "INSERT INTO reserva VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement Sentencia = Con.prepareStatement(SQL);
            //Captura de las Variables
            Sentencia.setInt(1, this.getRese_ID());
            Sentencia.setInt(2, this.getFK_Nomi_Comprobante());
            Sentencia.setInt(3, this.getRese_EPS());
            Sentencia.setInt(4, this.getRese_AFP());
            Sentencia.setInt(5, this.getRese_ARL());
            Sentencia.setInt(6,this.getRese_Cesantias());
            Sentencia.setInt(7, this.getRese_IntCesantias());
            Sentencia.setInt(8, this.getRese_PrimaServicios());
            Sentencia.setInt(9, this.getRese_Vacaciones());
            Sentencia.setInt(10, this.getRese_CCompensacion());
            Sentencia.setInt(11, this.getRese_ICBF());
            Sentencia.setInt(12, this.getRese_SENA());
            Sentencia.setInt(13, this.getRese_Subtotal());
            //Condicion de Guardado
            if (Sentencia.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Los Datos se Han Guardado Correctamente");
            }
        } catch (HeadlessException | SQLException EX) {
            throw new Exception("ERROR al Guardar el Registro " + this.getFK_Nomi_Comprobante() + EX.getMessage());
        }
    }
}
