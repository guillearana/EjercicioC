package es.guillearana.ejercicioc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EjercicioCcontroller {

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnModificar;

    @FXML
    private TableColumn<?, ?> colApellidos;

    @FXML
    private TableColumn<?, ?> colEdad;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableView<?> tableInfo;

    @FXML
    private TextField tfApellidos;

    @FXML
    private TextField tfEdad;

    @FXML
    private TextField tfNombre;

    @FXML
    void accionAceptar(ActionEvent event) {

    }

    @FXML
    void accionEliminar(ActionEvent event) {

    }

    @FXML
    void accionModificar(ActionEvent event) {

    }

}
