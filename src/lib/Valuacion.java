package lib;

/**
 *
 * @author GAES 2
 */
public class Valuacion {
    
    /**Variables globales de valuación*/
    private static int tipo;
    
    /**Constructor de la clase Valuación*/
    public Valuacion(){
    }

    /**
     * @return Tipo de valuación de inventario
     */
    public static int getTipo() {
        return tipo;
    }

    /**
     * @param aTipo Ingresa el tipo de valuacion a la base de datos
     */
    public static void setTipo(int aTipo) {
        tipo = aTipo;
    } 
}
