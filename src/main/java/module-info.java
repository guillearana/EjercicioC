module es.guillearana.ejercicioc {
    requires javafx.controls;  // Requiere el módulo javafx.controls para usar controles de JavaFX.
    requires javafx.fxml;      // Requiere el módulo javafx.fxml para trabajar con archivos FXML.

    opens es.guillearana.ejercicioc.controlador to javafx.fxml; // Permite que javafx.fxml acceda a las clases del paquete controlador.
    exports es.guillearana.ejercicioc;  // Exporta el paquete principal para ser utilizado por otros módulos.
    opens es.guillearana.ejercicioc.model to javafx.fxml, javafx.base; // Permite acceso a clases del paquete model desde javafx.fxml y javafx.base.
}
