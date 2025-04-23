package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class ViewAssignedCasesViewController {

    @FXML
    private Button myCasesButton;

    @FXML
    private TableView<ViewAssignedCases> casesTable;

    @FXML
    private TableColumn<ViewAssignedCases, String> caseIdColumn;

    @FXML
    private TableColumn<ViewAssignedCases, String> clientNameColumn;

    @FXML
    private TableColumn<ViewAssignedCases, String> caseTypeColumn;

    @FXML
    private TableColumn<ViewAssignedCases, String> statusColumn;

    @FXML
    private Button viewDetailsButton;

    @FXML
    private TextArea caseDetailsArea;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;

    private final ArrayList<ViewAssignedCases> casesList = new ArrayList<>();


    private ObservableList<ViewAssignedCases> casesObservableList;

    @FXML
    public void initialize() {

        caseIdColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCaseId()));
        clientNameColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getClientName()));
        caseTypeColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCaseType()));
        statusColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCaseStatus()));


        casesObservableList = FXCollections.observableArrayList(casesList);
        casesTable.setItems(casesObservableList);
    }

    @FXML
    void myCasesOnAction(ActionEvent event) {

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add New Case");
        dialog.setHeaderText("Enter Case Details");
        dialog.setContentText("Case ID, Client Name, Case Type, Status (comma-separated):");

        String input = dialog.showAndWait().orElse("");
        String[] details = input.split(",");

        if (details.length == 4) {
            ViewAssignedCases newCase = new ViewAssignedCases(details[0].trim(), details[1].trim(), details[2].trim(), details[3].trim());
            casesList.add(newCase);
            refreshCasesTable();
        }

    }

    private void refreshCasesTable() {

        casesObservableList = FXCollections.observableArrayList(casesList);
        casesTable.setItems(casesObservableList);
    }

    @FXML
    void viewDetailsOnAction(ActionEvent event) {
        ViewAssignedCases selectedCase = casesTable.getSelectionModel().getSelectedItem();
        if (selectedCase != null) {

            caseDetailsArea.setText("Case ID: " + selectedCase.getCaseId() +
                    "\nClient Name: " + selectedCase.getClientName() +
                    "\nCase Type: " + selectedCase.getCaseType() +
                    "\nStatus: " + selectedCase.getCaseStatus() +
                    "\nAdditional details about the case can go here...");
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