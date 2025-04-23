package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ClientDownloadCaseReportsViewController {

    @FXML
    private Button downloadsButton;

    @FXML
    private TableView<?> documentsTable;

    @FXML
    private TableColumn<?, ?> fileNameColumn;

    @FXML
    private TableColumn<?, ?> fileTypeColumn;

    @FXML
    private TableColumn<?, ?> fileDateColumn;

    @FXML
    private TableColumn<?, ?> downloadActionColumn;

    @FXML
    private Label downloadConfirmationLabel;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;

    @FXML
    void downloadsOnAction(ActionEvent event) {

    }

    @FXML
    void logoutOnAction(ActionEvent event) {

    }

    @FXML
    void returnHomeOnAction(ActionEvent event) {

    }

}
