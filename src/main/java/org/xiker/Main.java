package org.xiker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Clase principal para la aplicación sencilla con GridPane.
 * Esta clase extiende la clase Application de JavaFX y configura el escenario
 * principal
 * con un diseño GridPane que contiene varios controles.
 *
 * @author Xiker
 */
public class Main extends Application {

    /**
     * El punto de entrada principal para todas las aplicaciones JavaFX.
     * El método start se llama después de que el método init haya regresado,
     * y después de que el sistema esté listo para que la aplicación comience a
     * ejecutarse.
     *
     * @param primaryStage el escenario principal para esta aplicación, en el cual
     *                     se puede establecer la escena de la aplicación.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Aplicación Sencilla con GridPane (FXML)");

        // Cargar la vista desde el archivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
        // Establecer el controlador antes de cargar si no está definido en el FXML
        // loader.setController(new MainController());

        // Pero como ya lo definimos en el FXML
        // (fx:controller="org.xiker.MainController"),
        // simplemente cargamos el archivo.
        GridPane grid = loader.load();

        // Configurar escena
        Scene scene = new Scene(grid, 500, 350); // Tamaño inicial coincidiendo con la maqueta
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * El método main es ignorado en una aplicación JavaFX correctamente desplegada.
     * main() sirve solo como respaldo en caso de que la aplicación no pueda ser
     * lanzada a través de artefactos de despliegue, por ejemplo, en IDEs con
     * soporte FX limitado.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        launch(args);
    }
}