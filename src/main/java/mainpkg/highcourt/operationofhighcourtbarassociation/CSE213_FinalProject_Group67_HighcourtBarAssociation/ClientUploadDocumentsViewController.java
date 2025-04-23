package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;

public class ClientUploadDocumentsViewController {

    @FXML
    private ComboBox<String> caseSelectionComboBox;

    @FXML
    private Button uploadDocButton;

    @FXML
    private TableView<ClientUploadDocuments> documentInfoTable;

    @FXML
    private TableColumn<ClientUploadDocuments, String> fieldNameColumn;

    @FXML
    private TableColumn<ClientUploadDocuments, String> inputTypeColumn;

    @FXML
    private TableColumn<ClientUploadDocuments, String> exampleColumn;

    @FXML
    private Button submitDetailsButton;

    @FXML
    private Button downloadDocButton;

    @FXML
    private Label confirmationMessageLabel;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;

    // ObservableList to hold document details
    private ObservableList<ClientUploadDocuments> documentList = FXCollections.observableArrayList();

    // File reference for uploaded document
    private File uploadedDocument;

    @FXML
    public void initialize() {
        // Initialize case combo box with sample cases (replace with dynamic data)
        caseSelectionComboBox.setItems(FXCollections.observableArrayList("Case001", "Case002", "Case003"));

        // Bind table columns to ClientUploadDocuments properties
        fieldNameColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getFieldName()));
        inputTypeColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getInputType()));
        exampleColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getExample()));

        // Set the table's items to the ObservableList
        documentInfoTable.setItems(documentList);
    }

    @FXML
    void uploadDocOnAction(ActionEvent event) {
        // Open file chooser to upload a document
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Upload Document");
        File file = fileChooser.showOpenDialog(null);

        if (file != null) {
            uploadedDocument = file;
            confirmationMessageLabel.setText("Document uploaded: " + file.getName());
            System.out.println("Document uploaded: " + file.getName());
        } else {
            confirmationMessageLabel.setText("No document selected.");
        }
    }

    @FXML
    void submitDetailsOnAction(ActionEvent event) {
        // Add new details to the table
        if (uploadedDocument != null) {
            documentList.add(new ClientUploadDocuments("Document Name", "File", uploadedDocument.getName()));
            confirmationMessageLabel.setText("Your case details have been updated successfully.");
            System.out.println("Details submitted: " + uploadedDocument.getName());

            // Clear the uploaded document after submission
            uploadedDocument = null;

            // Add logic to save data into the database
        } else {
            confirmationMessageLabel.setText("No document uploaded. Please upload a document first.");
        }
    }

    @FXML
    void downloadDocOnAction(ActionEvent event) {
        // Placeholder for document download functionality
        System.out.println("Downloading uploaded documents...");
        // Implement logic to download the uploaded document, if required
    }

    @FXML
    void returnHomeOnAction(ActionEvent event) {
        System.out.println("Returning to Home...");
        // Add logic to navigate back to the dashboard/home screen
    }

    @FXML
    void logoutOnAction(ActionEvent event) {
        System.out.println("Logging out...");
        // Add logic for logging out
    }
}