package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;

public class RequestLegalAssistanceViewController {

    @FXML
    private TextField fullNameField;

    @FXML
    private TextField contactInformationField;

    @FXML
    private ComboBox<String> caseTypeDropdown;

    @FXML
    private TextArea caseDescriptionArea;

    @FXML
    private Button uploadDocumentsButton;

    @FXML
    private Button submitRequestButton;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Label confirmationLabel;

    private ArrayList<String> uploadedDocuments = new ArrayList<>();

    // Event handler for uploading supporting documents
    @FXML
    void uploadDocumentsOnAction(ActionEvent event) {
        System.out.println("Upload functionality not implemented.");
        uploadedDocuments.add("ExampleDocument.pdf");
    }

    // Event handler for submitting request
    @FXML
    void submitRequestOnAction(ActionEvent event) {
        String fullName = fullNameField.getText();
        String contactInfo = contactInformationField.getText();
        String caseType = caseTypeDropdown.getValue();
        String caseDescription = caseDescriptionArea.getText();

        RequestLegalAssistance request = new RequestLegalAssistance(fullName, contactInfo, caseType, caseDescription, uploadedDocuments);

        if (request.validateInput()) {
            String response = request.assignAdvocate();
            confirmationLabel.setText("Request Submitted Successfully! " + response);
            System.out.println("Confirmation Popup: Your request has been submitted.");
        } else {
            confirmationLabel.setText("Error: Please fill out all mandatory fields.");
        }
    }

    // Event handler for returning home
    @FXML
    void returnHomeOnAction(ActionEvent event) {
        System.out.println("Navigating to Home...");
    }

    // Event handler for logging out
    @FXML
    void logoutOnAction(ActionEvent event) {
        System.out.println("Logging out...");
    }
}