# Aplicación Sencilla con GridPane

Esta es una aplicación de escritorio simple construida con JavaFX que demuestra el uso del diseño `GridPane`. La interfaz incluye campos de texto, botones y un área de texto organizada en una cuadrícula flexible.

## Características

- Diseño responsivo utilizando `GridPane`.
- Campos de entrada para "Nombre" y "Descripción".
- Área de texto para contenido extenso.
- Botones de acción (OK, Cancelar).
- Barra de estado.

## Requisitos Previos

- Java Development Kit (JDK) 21 o superior.
- Maven 3.6.0 o superior.

## Cómo Ejecutar

### Opción 1: Usando Maven (Recomendada)
Para compilar y ejecutar la aplicación, utiliza el siguiente comando de Maven en la raíz del proyecto:

```bash
mvn clean javafx:run
```

### Opción 2: Desde IntelliJ IDEA / Eclipse
Si ejecutas la aplicación directamente desde tu IDE y ves el error `Error: JavaFX runtime components are missing`, ejecuta la clase **`Launcher.java`** en lugar de `Main.java`.

Esto se debe a que JavaFX está modularizado y a veces requiere configuraciones especiales si la clase principal extiende directamente de `Application`.

## Estructura del Proyecto

- `src/main/java/org/xiker/Main.java`: Código fuente principal de la aplicación.
- `src/main/java/org/xiker/MainController.java`: Controlador de la interfaz gráfica.
- `src/main/java/org/xiker/Launcher.java`: Clase de ayuda para iniciar la aplicación sin errores de módulos.
- `src/main/resources/org/xiker/view.fxml`: Diseño de la interfaz gráfica.
- `pom.xml`: Archivo de configuración de Maven con las dependencias de JavaFX.

## Autor

- **Xiker**
