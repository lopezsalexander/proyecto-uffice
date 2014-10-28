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

//Declaracion Clase Nomina
public class Nomina {
    //Declaracion Variables
    private int Nomi_Comprobante;
    private String FK_Empl_ID, Nomi_Desde, Nomi_Hasta;
    private int Nomi_Sueldo, Nomi_AuxTransporte, Nomi_Ventas, Nomi_Comisiones;
    private String Nomi_HorasExtra;
    private int Nomi_Cantidad, Nomi_ValorHoras, Nomi_DiasIncapacidad, Nomi_ValorIncapacidad;
    private int Nomi_DiasNoTrabajados, Nomi_ValorDiasNoTrabajados, Nomi_Salud;
    private int Nomi_AFP, Nomi_PagoNeto;
    private String Nomi_Realizado, Nomi_Revisado, Nomi_Aprovado;
    //Encapsulacion de las Variables
    public Nomina() {

    }
    
    public int getNomi_Comprobante() {
        return Nomi_Comprobante;
    }

    public void setNomi_Comprobante(int Nomi_Comprobante) {
        this.Nomi_Comprobante = Nomi_Comprobante;
    }

    public String getFK_Empl_ID() {
        return FK_Empl_ID;
    }

    public void setFK_Empl_ID(String FK_Empl_ID) {
        this.FK_Empl_ID = FK_Empl_ID;
    }

    public String getNomi_Desde() {
        return Nomi_Desde;
    }

    public void setNomi_Desde(String Nomi_Desde) {
        this.Nomi_Desde = Nomi_Desde;
    }

    public String getNomi_Hasta() {
        return Nomi_Hasta;
    }

    public void setNomi_Hasta(String Nomi_Hasta) {
        this.Nomi_Hasta = Nomi_Hasta;
    }

    public int getNomi_Sueldo() {
        return Nomi_Sueldo;
    }

    public void setNomi_Sueldo(int Nomi_Sueldo) {
        this.Nomi_Sueldo = Nomi_Sueldo;
    }

    public int getNomi_AuxTransporte() {
        return Nomi_AuxTransporte;
    }

    public void setNomi_AuxTransporte(int Nomi_AuxTransporte) {
        this.Nomi_AuxTransporte = Nomi_AuxTransporte;
    }

    public int getNomi_Ventas() {
        return Nomi_Ventas;
    }

    public void setNomi_Ventas(int Nomi_Ventas) {
        this.Nomi_Ventas = Nomi_Ventas;
    }

    public int getNomi_Comisiones() {
        return Nomi_Comisiones;
    }

    public void setNomi_Comisiones(int Nomi_Comisiones) {
        this.Nomi_Comisiones = Nomi_Comisiones;
    }

    public String getNomi_HorasExtra() {
        return Nomi_HorasExtra;
    }

    public void setNomi_HorasExtra(String Nomi_HorasExtra) {
        this.Nomi_HorasExtra = Nomi_HorasExtra;
    }

    public int getNomi_Cantidad() {
        return Nomi_Cantidad;
    }

    public void setNomi_Cantidad(int Nomi_Cantidad) {
        this.Nomi_Cantidad = Nomi_Cantidad;
    }

    public int getNomi_ValorHoras() {
        return Nomi_ValorHoras;
    }

    public void setNomi_ValorHoras(int Nomi_ValorHoras) {
        this.Nomi_ValorHoras = Nomi_ValorHoras;
    }

    public int getNomi_DiasIncapacidad() {
        return Nomi_DiasIncapacidad;
    }

    public void setNomi_DiasIncapacidad(int Nomi_DiasIncapacidad) {
        this.Nomi_DiasIncapacidad = Nomi_DiasIncapacidad;
    }

    public int getNomi_ValorIncapacidad() {
        return Nomi_ValorIncapacidad;
    }

    public void setNomi_ValorIncapacidad(int Nomi_ValorIncapacidad) {
        this.Nomi_ValorIncapacidad = Nomi_ValorIncapacidad;
    }

    public int getNomi_DiasNoTrabajados() {
        return Nomi_DiasNoTrabajados;
    }

    public void setNomi_DiasNoTrabajados(int Nomi_DiasNoTrabajados) {
        this.Nomi_DiasNoTrabajados = Nomi_DiasNoTrabajados;
    }

    public int getNomi_ValorDiasNoTrabajados() {
        return Nomi_ValorDiasNoTrabajados;
    }

    public void setNomi_ValorDiasNoTrabajados(int Nomi_ValorDiasNoTrabajados) {
        this.Nomi_ValorDiasNoTrabajados = Nomi_ValorDiasNoTrabajados;
    }

    public int getNomi_Salud() {
        return Nomi_Salud;
    }

    public void setNomi_Salud(int Nomi_Salud) {
        this.Nomi_Salud = Nomi_Salud;
    }

    public int getNomi_AFP() {
        return Nomi_AFP;
    }

    public void setNomi_AFP(int Nomi_AFP) {
        this.Nomi_AFP = Nomi_AFP;
    }

    public int getNomi_PagoNeto() {
        return Nomi_PagoNeto;
    }

    public void setNomi_PagoNeto(int Nomi_PagoNeto) {
        this.Nomi_PagoNeto = Nomi_PagoNeto;
    }

    public String getNomi_Realizado() {
        return Nomi_Realizado;
    }

    public void setNomi_Realizado(String Nomi_Realizado) {
        this.Nomi_Realizado = Nomi_Realizado;
    }

    public String getNomi_Revisado() {
        return Nomi_Revisado;
    }

    public void setNomi_Revisado(String Nomi_Revisado) {
        this.Nomi_Revisado = Nomi_Revisado;
    }

    public String getNomi_Aprovado() {
        return Nomi_Aprovado;
    }

    public void setNomi_Aprovado(String Nomi_Aprovado) {
        this.Nomi_Aprovado = Nomi_Aprovado;
    }
    //Metodo Guardar
    public void Guardar() throws Exception {

        try {
            //Conecion a la Base de Datos
            Conexion BaseDatos = new Conexion();
            Connection Con = BaseDatos.conexion();
            //Sentencia SQL
            String SQL = "INSERT INTO nomina VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement Sentencia = Con.prepareStatement(SQL);
            //Captura de las Variables
            Sentencia.setInt(1, this.getNomi_Comprobante());
            Sentencia.setString(2, this.getFK_Empl_ID());
            Sentencia.setString(3, this.getNomi_Desde());
            Sentencia.setString(4, this.getNomi_Hasta());
            Sentencia.setInt(5, this.getNomi_Sueldo());
            Sentencia.setInt(6, this.getNomi_AuxTransporte());
            Sentencia.setInt(7, this.getNomi_Ventas());
            Sentencia.setInt(8, this.getNomi_Comisiones());
            Sentencia.setString(9, this.getNomi_HorasExtra());
            Sentencia.setInt(10, this.getNomi_Cantidad());
            Sentencia.setInt(11, this.getNomi_ValorHoras());
            Sentencia.setInt(12, this.getNomi_DiasIncapacidad());
            Sentencia.setInt(13, this.getNomi_ValorIncapacidad());
            Sentencia.setInt(14, this.getNomi_DiasNoTrabajados());
            Sentencia.setInt(15, this.getNomi_ValorDiasNoTrabajados());
            Sentencia.setInt(16, this.getNomi_Salud());
            Sentencia.setInt(17, this.getNomi_AFP());
            Sentencia.setInt(18, this.getNomi_PagoNeto());
            Sentencia.setString(19, this.getNomi_Realizado());
            Sentencia.setString(20, this.getNomi_Revisado());
            Sentencia.setString(21, this.getNomi_Aprovado());
            //Condicion de Guardado
            if (Sentencia.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Los Datos se Han Guardado Correctamente");
            }
        } catch (HeadlessException | SQLException EX) {
            throw new Exception("ERROR al Guardar el Registro " + this.getFK_Empl_ID() + EX.getMessage());
        }
    }
}
