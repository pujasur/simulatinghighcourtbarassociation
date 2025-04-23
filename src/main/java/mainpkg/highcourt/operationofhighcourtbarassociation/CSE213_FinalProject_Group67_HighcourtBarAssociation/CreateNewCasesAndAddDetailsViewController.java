package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.stage.FileChooser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.File;
import java.util.ArrayList;

public class CreateNewCasesAndAddDetailsViewController {

    @FXML
    private Button createCaseButton;

    @FXML
    private TextField clientNameField;

    @FXML
    private TextField caseTypeField;

    @FXML
    private TextArea caseDescriptionArea;

    @FXML
    private Button uploadButton;

    @FXML
    private Button submitCaseButton;

    @FXML
    private Button downloadDocsButton;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;

    private final ArrayList<CreateNewCasesAndAddDetails> casesList = new ArrayList<>();
    private File uploadedFile;

    @FXML
    void initialize() {

        uploadedFile = null;
    }

    @FXML
    void createCaseOnAction(ActionEvent event) {
        // Clear fields for creating a new case
        clientNameField.clear();
        caseTypeField.clear();
        caseDescriptionArea.clear();
        uploadedFile = null;
        System.out.println("Ready to create a new case.");
    }

    @FXML
    void uploadOnAction(ActionEvent event) {
        // Open file chooser to upload a document
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Upload Document");
        File file = fileChooser.showOpenDialog(null); // Show file chooser dialog

        if (file != null) {
            uploadedFile = file;
            System.out.println("Document uploaded: " + file.getName());
        } else {
            System.out.println("No document selected.");
        }
    }

    @FXML
    void submitCaseOnAction(ActionEvent event) {
        // Validate fields and create a new case
        String clientName = clientNameField.getText().trim();
        String caseType = caseTypeField.getText().trim();
        String caseDescription = caseDescriptionArea.getText().trim();

        if (!clientName.isEmpty() && !caseType.isEmpty() && !caseDescription.isEmpty() && uploadedFile != null) {
            CreateNewCasesAndAddDetails newCase = new CreateNewCasesAndAddDetails(clientName, caseType, caseDescription);
            newCase.setDocument(uploadedFile);
            casesList.add(newCase);

            System.out.println("Case submitted successfully for Client: " + clientName);


            clientNameField.clear();
            caseTypeField.clear();
            caseDescriptionArea.clear();
            uploadedFile = null;


        } else {
            System.out.println("Please fill all fields and upload a document before submitting.");
        }
    }

    @FXML
    void downloadDocsOnAction(ActionEvent event) {
        System.out.println("Downloading uploaded documents...");

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