package lib;

//LLamado de la Librerias
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author JP
 */

//Declaracion Clase Empleado
public class Empleado {
    //Declaracion Variables
    private String Empl_ID, Empl_TipoID, Empl_Nombre, Empl_Apellido, Empl_Cargo, Empl_TipoContrato;
    private int Empl_Sueldo;
    private String Empl_Domicilio, Empl_Ciudad, Empl_Pais, Empl_Nacionalidad, Empl_Telefono;
    private String Empl_FechaInicio, Empl_Email, Empl_FechaNac, Empl_EstadoCivil, Empl_Sexo;
    //Encapsulacion de las Variables
    public Empleado() {

    }

    public String getEmpl_ID() {
        return Empl_ID;
    }

    public void setEmpl_ID(String Empl_ID) {
        this.Empl_ID = Empl_ID;
    }

    public String getEmpl_TipoID() {
        return Empl_TipoID;
    }

    public void setEmpl_TipoID(String Empl_TipoID) {
        this.Empl_TipoID = Empl_TipoID;
    }

    public String getEmpl_Nombre() {
        return Empl_Nombre;
    }

    public void setEmpl_Nombre(String Empl_Nombre) {
        this.Empl_Nombre = Empl_Nombre;
    }

    public String getEmpl_Apellido() {
        return Empl_Apellido;
    }

    public void setEmpl_Apellido(String Empl_Apellido) {
        this.Empl_Apellido = Empl_Apellido;
    }

    public String getEmpl_Cargo() {
        return Empl_Cargo;
    }

    public void setEmpl_Cargo(String Empl_Cargo) {
        this.Empl_Cargo = Empl_Cargo;
    }

    public String getEmpl_TipoContrato() {
        return Empl_TipoContrato;
    }

    public void setEmpl_TipoContrato(String Empl_TipoContrato) {
        this.Empl_TipoContrato = Empl_TipoContrato;
    }

    public int  getEmpl_Sueldo() {
        return Empl_Sueldo;
    }

    public void setEmpl_Sueldo(int Empl_Sueldo) {
        this.Empl_Sueldo = Empl_Sueldo;
    }

    public String getEmpl_Domicilio() {
        return Empl_Domicilio;
    }

    public void setEmpl_Domicilio(String Empl_Domicilio) {
        this.Empl_Domicilio = Empl_Domicilio;
    }
    
    public String getEmpl_Ciudad() {
        return Empl_Ciudad;
    }

    public void setEmpl_Ciudad(String Empl_Ciudad) {
        this.Empl_Ciudad = Empl_Ciudad;
    }

    public String getEmpl_Pais() {
        return Empl_Pais;
    }

    public void setEmpl_Pais(String Empl_Pais) {
        this.Empl_Pais = Empl_Pais;
    }

    public String getEmpl_Nacionalidad() {
        return Empl_Nacionalidad;
    }

    public void setEmpl_Nacionalidad(String Empl_Nacionalidad) {
        this.Empl_Nacionalidad = Empl_Nacionalidad;
    }

    public String getEmpl_Telefono() {
        return Empl_Telefono;
    }

    public void setEmpl_Telefono(String Empl_Telefono) {
        this.Empl_Telefono = Empl_Telefono;
    }

    public String getEmpl_FechaInicio() {
        return Empl_FechaInicio;
    }

    public void setEmpl_FechaInicio(String Empl_FechaInicio) {
        this.Empl_FechaInicio = Empl_FechaInicio;
    }

    public String getEmpl_Email() {
        return Empl_Email;
    }

    public void setEmpl_Email(String Empl_Email) {
        this.Empl_Email = Empl_Email;
    }

    public String getEmpl_FechaNac() {
        return Empl_FechaNac;
    }

    public void setEmpl_FechaNac(String Empl_FechaNac) {
        this.Empl_FechaNac = Empl_FechaNac;
    }

    public String getEmpl_EstadoCivil() {
        return Empl_EstadoCivil;
    }

    public void setEmpl_EstadoCivil(String Empl_EstadoCivil) {
        this.Empl_EstadoCivil = Empl_EstadoCivil;
    }

    public String getEmpl_Sexo() {
        return Empl_Sexo;
    }

    public void setEmpl_Sexo(String Empl_Sexo) {
        this.Empl_Sexo = Empl_Sexo;
    }
    //Metodo Guardar
    public void Guardar() throws Exception {
        try {
            //Conexion a la Base de Datos
            Conexion BaseDatos = new Conexion();
            Connection Con = BaseDatos.conexion();
            //Sentencia SQL
            String SQL = "INSERT INTO empleado VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement Sentencia = Con.prepareStatement(SQL);
            //Captura de las variables
            Sentencia.setString(1, this.getEmpl_ID());
            Sentencia.setString(2, this.getEmpl_TipoID());
            Sentencia.setString(3, this.getEmpl_Nombre());
            Sentencia.setString(4, this.getEmpl_Apellido());
            Sentencia.setString(5, this.getEmpl_Cargo());
            Sentencia.setString(6, this.getEmpl_TipoContrato());
            Sentencia.setInt(7, this.getEmpl_Sueldo());
            Sentencia.setString(8, this.getEmpl_Domicilio());
            Sentencia.setString(9, this.getEmpl_Ciudad());
            Sentencia.setString(10, this.getEmpl_Pais());
            Sentencia.setString(11, this.getEmpl_Nacionalidad());
            Sentencia.setString(12, this.getEmpl_Telefono());
            Sentencia.setString(13, this.getEmpl_FechaInicio());
            Sentencia.setString(14, this.getEmpl_Email());
            Sentencia.setString(15, this.getEmpl_FechaNac());
            Sentencia.setString(16, this.getEmpl_EstadoCivil());
            Sentencia.setString(17, this.getEmpl_Sexo());
            //Condicion de Guardado
            if (Sentencia.executeUpdate()>0) {
                JOptionPane.showMessageDialog(null, "Los Datos se han Guardado Correctamente");
            }
        } catch (HeadlessException | SQLException EX) {
            throw new Exception("ERROR al Guardar el Registro: " + this.getEmpl_Nombre() + this.getEmpl_Apellido() + "\n" + EX.getMessage());
        }
    }
    //Metodo Modificar
    public void Modificar() throws Exception {
        try {
            //Conexion a la Base de Datos
            Conexion BaseDatos = new Conexion();
            Connection Con = BaseDatos.conexion();
            //Sentencia SQL
            String SQL = "UPDATE empleado SET  Empl_Cargo = ?, Empl_TipoContrato = ?, Empl_Sueldo = ?, Empl_Domicilio = ?, Empl_Ciudad = ?, Empl_Pais = ?, Empl_Nacionalidad = ?, Empl_Telefono = ?, Empl_Email = ?, Empl_EstadoCivil = ?, Empl_Sexo = ? WHERE Empl_ID = ?";
            PreparedStatement Sentencia = Con.prepareStatement(SQL);
            //Captura de las Variables
            Sentencia.setString(1, this.getEmpl_Cargo());
            Sentencia.setString(2, this.getEmpl_TipoContrato());
            Sentencia.setInt(3, this.getEmpl_Sueldo());
            Sentencia.setString(4, this.getEmpl_Domicilio());
            Sentencia.setString(5, this.getEmpl_Ciudad());
            Sentencia.setString(6, this.getEmpl_Pais());
            Sentencia.setString(7, this.getEmpl_Nacionalidad());
            Sentencia.setString(8, this.getEmpl_Telefono());
            Sentencia.setString(9, this.getEmpl_Email());
            Sentencia.setString(10, this.getEmpl_EstadoCivil());
            Sentencia.setString(11, this.getEmpl_Sexo());
            Sentencia.setString(12, this.getEmpl_ID());
            //Condicion Guardado de Modificaciones
            if (Sentencia.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Los Datos se han Actualizado Correctamente");
            }
            else {
                JOptionPane.showMessageDialog(null, "Datos Errados");
            }
        } catch (HeadlessException | SQLException EX) {
            throw new Exception("ERROR al Actualizar los Datos de la Persona " + this.getEmpl_ID() + EX.getMessage());
        }
    }
    //Metodo Eliminar
    public void Eliminar() throws Exception {
        try {
            //Conexion a la Base de Datos
            Conexion BaseDatos = new Conexion();
            Connection Con = BaseDatos.conexion();
            //Sentencia SQL
            String SQL = "DELETE FROM empleado WHERE Empl_ID = ?";
            PreparedStatement Sentencia = Con.prepareStatement(SQL);
            //Captura de la Variable
            Sentencia.setString(1, this.getEmpl_ID());
            //Condicion Eliminacion del Empleado
            if (Sentencia.executeUpdate()> 0) {
                JOptionPane.showMessageDialog(null, "Los Datos se Eliminaron Correctamente");
            }
        } catch (HeadlessException | SQLException EX) {
            throw new Exception("ERROR al Eliminar la Persona " + this.getEmpl_Nombre() + this.getEmpl_Apellido() + EX.getMessage());
        }
    }
}
