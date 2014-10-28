package lib;

public class Login {

    /**
     * Variables de inicio de sesión
     */
    private static String usuario;
    private static String password;
    private static int permiso;

    /**
     * Constructor
     */
    public Login() {

    }

    /**
     * @return the usuario
     */
    public static String getUsuario() {
        return usuario;
    }

    /**
     * @param aUsuario the usuario to set
     */
    public static void setUsuario(String aUsuario) {
        usuario = aUsuario;
    }

    /**
     * @return the password
     */
    public static String getPassword() {
        return password;
    }

    /**
     * @param aPassword the password to set
     */
    public static void setPassword(String aPassword) {
        password = aPassword;
    }

    /**
     * @return the permiso
     */
    public static int getPermiso() {
        return permiso;
    }

    /**
     * @param aPermiso the permiso to set
     */
    public static void setPermiso(int aPermiso) {
        permiso = aPermiso;
    }
}
