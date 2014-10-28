package lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Querys {
    
    /**Atributos*/
    private static String bck;
    private static String login;
    private static String newpass;

    /**
     * Método para obtener la consulta de generación de backup
     * @return Consulta a la base de datos
     */
    public static String getBck() {
        return bck;
    }

    /**
     * @param aBck the bck to set
     */
    public static void setBck(String aBck) {
        bck = aBck;
    }

    /**
     * @return the login
     */
    public static String getLogin() {
        return login;
    }

    /**
     * @param aLogin the login to set
     */
    public static void setLogin(String aLogin) {
        login = aLogin;
    }

    /**
     * @return the newpass
     */
    public static String getNewpass() {
        return newpass;
    }

    /**
     * @param aNewpass the newpass to set
     */
    public static void setNewpass(String aNewpass) {
        newpass = aNewpass;
    }


    public void consultaLogin(String user, String pass) {
        setLogin("SELECT * FROM Usuario WHERE usuario = '" + user + "' AND contrasena = '" + pass + "';");
    }

    public String backup() {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy-HHmmss");
        String date = sdf.format(new Date());
        setBck("BACKUP DATABASE UFFICE TO DISK = 'C:\\Backup\\Backup" + date + ".bak'");
        return getBck();
    }

    public void cambioPass(String user, String pass) {
        setNewpass("UPDATE Usuario SET contrasena = '" + pass + "' WHERE usuario = '" + user + "';");
    }
    
    //public void parametros(float iva, float rtfte, )
}
