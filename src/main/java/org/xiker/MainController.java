package org.xiker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Controlador para la interfaz de usuario definida en view.fxml.
 * Maneja las interacciones del usuario y actualiza la vista.
 *
 * @author Xiker
 */
public class MainController {

    @FXML
    private TextField nameField;

    @FXML
    private TextArea descArea;

    @FXML
    private Label statusLabel;

    /**
     * Initializa el controlador. Este método se llama automáticamente después de
     * cargar el archivo FXML.
     */
    @FXML
    public void initialize() {
        // Inicialización personalizada si es necesaria
        statusLabel.setText("Estado: Listo");
    }

    /**
     * Maneja la acción del botón OK.
     */
    @FXML
    private void handleOkAction() {
        String name = nameField.getText();
        statusLabel.setText("Estado: Procesando " + name);
        descArea.appendText("Nombre procesado: " + name + "\n");
    }

    /**
     * Maneja la acción del botón Cancelar.
     */
    @FXML
    private void handleCancelAction() {
        nameField.clear();
        descArea.clear();
        statusLabel.setText("Estado: Cancelado");
    }
}
