package lib;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author GAES 2
 */
public class LimpiarForms {

    /**Limpiar los formularios
     * @param c devuelve a los formularios
     */
    
    public static void limpiaFormulario(Container c) {
        Component componentes[] = c.getComponents();

        for (Component componente : componentes) {
            String clase = componente.getClass().getName();
            if (clase.equals("javax.swing.JTextField")) {
                ((JTextField) componente).setText("");
            }
            if (clase.equals("javax.swing.JPasswordField")) {
                ((JPasswordField) componente).setText("");
            }
            if (clase.equals("javax.swing.JCheckBox")) {
                ((JCheckBox) componente).setSelected(false);
            }
            if (clase.equals("javax.swing.JTextArea")) {
                ((JTextArea) componente).setText("");
            }
        }
    }

}
