module es.guillearana.ejercicioc {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.guillearana.ejercicioc to javafx.fxml;
    exports es.guillearana.ejercicioc;
}