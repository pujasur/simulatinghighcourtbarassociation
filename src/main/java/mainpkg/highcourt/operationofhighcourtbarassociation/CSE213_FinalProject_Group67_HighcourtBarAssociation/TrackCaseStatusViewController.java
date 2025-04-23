package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class TrackCaseStatusViewController {

    @FXML
    private Button myCasesButton;

    @FXML
    private TableView<TrackCaseStatus> caseStatusTable;

    @FXML
    private TableColumn<TrackCaseStatus, String> caseIdColumn;

    @FXML
    private TableColumn<TrackCaseStatus, String> advocateNameColumn;

    @FXML
    private TableColumn<TrackCaseStatus, String> caseTypeColumn;

    @FXML
    private TableColumn<TrackCaseStatus, String> statusColumn;

    @FXML
    private Label detailedCaseLabel;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;

    private List<TrackCaseStatus> cases = new ArrayList<>();

    // Initialize method to populate sample data
    @FXML
    public void initialize() {
        // Example data
        cases.add(new TrackCaseStatus("C123", "Advocate A", "Civil", "Active",
                List.of("Hearing 1", "Hearing 2"), "Notes from advocate",
                List.of("01/05/2025", "15/05/2025"), List.of("Document 1", "Document 2")));

        cases.add(new TrackCaseStatus("C456", "Advocate B", "Criminal", "Pending",
                List.of(), "Initial notes", List.of("12/05/2025"), List.of("Document 3")));

        // Display case status in table
        caseStatusTable.getItems().setAll(cases);
    }

       // Event ha
    @FXML
    void viewDetailedCase(ActionEvent event) {
        TrackCaseStatus selectedCase = caseStatusTable.getSelectionModel().getSelectedItem();
        if (selectedCase != null) {
            detailedCaseLabel.setText(selectedCase.fetchCaseDetails());
        } else {
            detailedCaseLabel.setText("Please select a case to view details.");
        }
    }

    @FXML
    void returnHomeOnAction(ActionEvent event) {
        System.out.println("Navigating to Home...");
    }

    @FXML
    void logoutOnAction(ActionEvent event) {
        System.out.println("Logging out...");
    }
}