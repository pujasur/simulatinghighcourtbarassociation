package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class UpdateCaseStatusViewController {

    @FXML
    private Button myCasesButton;

    @FXML
    private TableView<UpdateCaseStatus> casesTable;

    @FXML
    private TableColumn<UpdateCaseStatus, String> caseIdColumn;

    @FXML
    private TableColumn<UpdateCaseStatus, String> clientNameColumn;

    @FXML
    private TableColumn<UpdateCaseStatus, String> caseTypeColumn;

    @FXML
    private TableColumn<UpdateCaseStatus, String> statusColumn;

    @FXML
    private TextArea caseDetailsArea;

    @FXML
    private ComboBox<String> statusDropdown;

    @FXML
    private Button saveChangesButton;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;


    private final ArrayList<UpdateCaseStatus> casesList = new ArrayList<>();

    private ObservableList<UpdateCaseStatus> casesObservableList;

    @FXML
    public void initialize() {
        // Bind columns to properties of the UpdateCaseStatus class
        caseIdColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCaseId()));
        clientNameColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getClientName()));
        caseTypeColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCaseType()));
        statusColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCaseStatus()));

        // Initialize ObservableList
        casesObservableList = FXCollections.observableArrayList(casesList);
        casesTable.setItems(casesObservableList);

        // Populate the dropdown menu for status updates
        statusDropdown.setItems(FXCollections.observableArrayList("Pending", "Active", "Dismissed", "Closed"));
    }

    @FXML
    void myCasesOnAction(ActionEvent event) {

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add New Case");
        dialog.setHeaderText("Enter Case Details:");
        dialog.setContentText("Case ID, Client Name, Case Type, Current Status (comma-separated):");

        String input = dialog.showAndWait().orElse("");
        String[] details = input.split(",");
        if (details.length == 4) {
            UpdateCaseStatus newCase = new UpdateCaseStatus(details[0].trim(), details[1].trim(), details[2].trim(), details[3].trim());
            casesList.add(newCase);
            refreshCasesTable();
        }

    }

    private void refreshCasesTable() {
        casesObservableList = FXCollections.observableArrayList(casesList);
        casesTable.setItems(casesObservableList);
    }

    @FXML
    void saveChangesOnAction(ActionEvent event) {
        UpdateCaseStatus selectedCase = casesTable.getSelectionModel().getSelectedItem();
        String newStatus = statusDropdown.getValue();

        if (selectedCase != null && newStatus != null) {
            selectedCase.setCaseStatus(newStatus);
            caseDetailsArea.setText("Case ID: " + selectedCase.getCaseId() +
                    "\nClient Name: " + selectedCase.getClientName() +
                    "\nCase Type: " + selectedCase.getCaseType() +
                    "\nUpdated Status: " + selectedCase.getCaseStatus());
            refreshCasesTable();

            System.out.println("Case status updated successfully!");

        } else {
            System.out.println("Please select a case and a new status to proceed.");
        }
    }

    @FXML
    void viewDetailsOnAction(ActionEvent event) {
        UpdateCaseStatus selectedCase = casesTable.getSelectionModel().getSelectedItem();
        if (selectedCase != null) {
            caseDetailsArea.setText("Case ID: " + selectedCase.getCaseId() +
                    "\nClient Name: " + selectedCase.getClientName() +
                    "\nCase Type: " + selectedCase.getCaseType() +
                    "\nCurrent Status: " + selectedCase.getCaseStatus());
        } else {
            caseDetailsArea.setText("No case selected.");
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