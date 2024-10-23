package es.guillearana.ejercicioc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image; // Asegúrate de importar esta clase.

import java.io.IOException;

/**
 * Clase principal para la gestión de personas en la aplicación.
 * Hereda de {@link javafx.application.Application} para ejecutar una aplicación de JavaFX.
 */
public class GestionPersonas extends Application {

    /**
     * Método de entrada para iniciar la interfaz gráfica de la aplicación.
     *
     * @param stage La ventana principal (o "escenario") de la aplicación.
     * @throws IOException Si ocurre algún error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Cargar el archivo FXML que define la interfaz de usuario.
        FXMLLoader fxmlLoader = new FXMLLoader(GestionPersonas.class.getResource("EjercicioC.fxml"));

        // Crear una nueva escena a partir del contenido cargado del FXML.
        Scene scene = new Scene(fxmlLoader.load(), 967, 591);

        // Establecer el título de la ventana.
        stage.setTitle("Personas");

        // En tu método start o constructor, añade:
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/imagenes/agenda.png"))); // Cambia el nombre del archivo por el de tu icono.

        // Establecer dimensiones mínimas de la ventana.
        stage.setMinWidth(550);
        stage.setMinHeight(550);

        // Establecer la escena en la ventana principal.
        stage.setScene(scene);

        // Mostrar la ventana.
        stage.show();
    }

    /**
     * Método main que lanza la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos (si los hay).
     */
    public static void main(String[] args) {
        launch(args);  // Inicia la aplicación JavaFX.
    }
}