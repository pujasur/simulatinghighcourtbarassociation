package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class AddNotesorCommentstoCaseViewController {

    @FXML
    private Button myCasesButton;

    @FXML
    private TableView<AddNotesorCommentstoCase> casesTable;

    @FXML
    private TableColumn<AddNotesorCommentstoCase, String> caseIdColumn;

    @FXML
    private TableColumn<AddNotesorCommentstoCase, String> clientNameColumn;

    @FXML
    private TableColumn<AddNotesorCommentstoCase, String> caseTypeColumn;

    @FXML
    private TableColumn<AddNotesorCommentstoCase, String> statusColumn;

    @FXML
    private TextArea noteTextArea;

    @FXML
    private Button saveNoteButton;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;


    private final ArrayList<AddNotesorCommentstoCase> casesList = new ArrayList<>();


    private ObservableList<AddNotesorCommentstoCase> casesObservableList;

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
        System.out.println("Loading 'My Cases' section...");
    }

    private void refreshCasesTable() {
        casesObservableList = FXCollections.observableArrayList(casesList);
        casesTable.setItems(casesObservableList);
    }

    @FXML
    void saveNoteOnAction(ActionEvent event) {
        AddNotesorCommentstoCase selectedCase = casesTable.getSelectionModel().getSelectedItem();
        String note = noteTextArea.getText();

        if (selectedCase != null && !note.trim().isEmpty()) {
            selectedCase.setNote(note); // Save the note to the selected case
            System.out.println("Note saved for Case ID: " + selectedCase.getCaseId());
            refreshCasesTable();


            noteTextArea.clear();


        } else {
            System.out.println("Please select a case and enter a valid note.");
        }
    }

    @FXML
    void returnHomeOnAction(ActionEvent event) {
        System.out.println("Returning to home...");

    }

    @FXML
    void logoutOnAction(ActionEvent event) {
        System.out.println("Logging out...");

    }
}