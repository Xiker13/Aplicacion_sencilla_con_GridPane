package org.xiker;

/**
 * Clase lanzadora para la aplicación.
 * Esta clase sirve como punto de entrada alternativo para evitar errores de
 * módulos
 * de JavaFX al ejecutar la aplicación desde un IDE.
 *
 * @author Xiker
 */
public class Launcher {

    /**
     * Método principal que invoca al método main de la aplicación JavaFX.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Main.main(args);
    }
}
