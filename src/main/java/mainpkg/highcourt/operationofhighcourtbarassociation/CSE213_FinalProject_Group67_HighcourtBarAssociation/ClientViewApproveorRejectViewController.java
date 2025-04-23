package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClientViewApproveorRejectViewController {

    @FXML
    private ComboBox<String> caseComboBox;

    @FXML
    private Button viewDocumentsButton;

    @FXML
    private ListView<ClientViewApproveorReject> documentListView;

    @FXML
    private TextArea documentPreviewArea;

    @FXML
    private RadioButton approveRadio;

    @FXML
    private RadioButton rejectRadio;

    @FXML
    private TextArea rejectionReasonArea;

    @FXML
    private Button submitDecisionButton;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;

    // ObservableList to hold documents
    private ObservableList<ClientViewApproveorReject> documentsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Populate case combo box with sample data (replace with dynamic database data)
        caseComboBox.setItems(FXCollections.observableArrayList("Case001", "Case002", "Case003"));

        // Bind the documentListView to the ObservableList
        documentListView.setItems(documentsList);

        // Populate the documentsList with sample documents (replace with database query results)
        documentsList.add(new ClientViewApproveorReject("Petition.docx", "Petition", "April 20, 2025"));
        documentsList.add(new ClientViewApproveorReject("Motion.pdf", "Motion", "April 19, 2025"));
        documentsList.add(new ClientViewApproveorReject("Contract.docx", "Contract", "April 18, 2025"));
    }

    @FXML
    void handleViewDocuments(ActionEvent event) {
        String selectedCase = caseComboBox.getValue();

        if (selectedCase != null) {
            System.out.println("Viewing documents for case: " + selectedCase);
            // Populate documentListView with case-specific documents (logic for database integration goes here)
        } else {
            System.out.println("No case selected. Please select a case to view its documents.");
        }
    }

    @FXML
    void handleSubmitDecision(ActionEvent event) {
        ClientViewApproveorReject selectedDocument = documentListView.getSelectionModel().getSelectedItem();

        if (selectedDocument != null) {
            if (approveRadio.isSelected()) {
                selectedDocument.setApproved(true);
                System.out.println("Document approved: " + selectedDocument.getDocumentName());
            } else if (rejectRadio.isSelected()) {
                String rejectionReason = rejectionReasonArea.getText().trim();

                if (!rejectionReason.isEmpty()) {
                    selectedDocument.setApproved(false);
                    selectedDocument.setRejectionReason(rejectionReason);
                    System.out.println("Document rejected: " + selectedDocument.getDocumentName());
                    System.out.println("Reason: " + rejectionReason);
                } else {
                    System.out.println("Rejection reason is required. Please provide a reason.");
                }
            } else {
                System.out.println("Please select either Approve or Reject.");
            }
        } else {
            System.out.println("No document selected. Please select a document to respond.");
        }
    }

    @FXML
    void handleReturnHome(ActionEvent event) {
        System.out.println("Returning to Home...");
        // Add logic to navigate back to the dashboard/home screen
    }

    @FXML
    void handleLogout(ActionEvent event) {
        System.out.println("Logging out...");
        // Implement log-out functionality
    }
}