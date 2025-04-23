package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;

public class CollaborateWithExternalPartnersViewController {

    @FXML
    private Button collaborateButton;

    @FXML
    private ComboBox<String> caseSelector;

    @FXML
    private ComboBox<String> partnerTypeSelector;

    @FXML
    private TextArea messageArea;

    @FXML
    private Button uploadDocumentButton;

    @FXML
    private Button sendRequestButton;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;


    private ObservableList<String> casesList = FXCollections.observableArrayList();
    private ObservableList<String> partnerTypes = FXCollections.observableArrayList();


    private File uploadedDocument;

    @FXML
    public void initialize() {

        casesList.addAll("Case001", "Case002", "Case003");
        partnerTypes.addAll("Law Firm", "Expert", "Consultant");

        caseSelector.setItems(casesList);
        partnerTypeSelector.setItems(partnerTypes);


        uploadedDocument = null;
    }

    @FXML
    void collaborateOnAction(ActionEvent event) {
        // Clear fields for new collaboration setup
        caseSelector.getSelectionModel().clearSelection();
        partnerTypeSelector.getSelectionModel().clearSelection();
        messageArea.clear();
        uploadedDocument = null;
        System.out.println("Ready to collaborate with an external partner.");
    }

    @FXML
    void uploadDocumentOnAction(ActionEvent event) {
        // FileChooser for selecting and uploading a document
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Upload Document");
        File file = fileChooser.showOpenDialog(null); // Show the file chooser dialog

        if (file != null) {
            uploadedDocument = file;
            System.out.println("Document uploaded: " + file.getName());
        } else {
            System.out.println("No document selected.");
        }
    }

    @FXML
    void sendRequestOnAction(ActionEvent event) {

        String selectedCase = caseSelector.getValue();
        String selectedPartnerType = partnerTypeSelector.getValue();
        String message = messageArea.getText();

        if (selectedCase != null && selectedPartnerType != null && !message.trim().isEmpty() && uploadedDocument != null) {
            CollaborateWithExternalPartners newCollaboration = new CollaborateWithExternalPartners(selectedCase, selectedPartnerType, message);
            newCollaboration.setAttachedDocument(uploadedDocument); // Attach the uploaded document

            System.out.println("Collaboration request sent successfully:");
            System.out.println("Case: " + selectedCase);
            System.out.println("Partner Type: " + selectedPartnerType);
            System.out.println("Message: " + message);
            System.out.println("Attached Document: " + uploadedDocument.getName());

            collaborateOnAction(event);
        } else {
            System.out.println("Please fill all fields and upload a document before sending the request.");
        }
    }

    @FXML
    void returnHomeOnAction(ActionEvent event) {
        System.out.println("Returning to Home...");

    }

    @FXML
    void logoutOnAction(ActionEvent event) {
        System.out.println("Logging out...");

    }
}