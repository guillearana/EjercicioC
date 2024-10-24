module es.guillearana.ejercicioc {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.guillearana.ejercicioc.controlador to javafx.fxml; // Añadir esta línea
    exports es.guillearana.ejercicioc;
    opens es.guillearana.ejercicioc.model to javafx.fxml, javafx.base;
}
