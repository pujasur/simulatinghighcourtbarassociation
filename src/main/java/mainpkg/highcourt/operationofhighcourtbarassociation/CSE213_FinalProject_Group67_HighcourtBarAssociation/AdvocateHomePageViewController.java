package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.util.List;

public class AdvocateHomePageViewController implements DataReceiver {

    private String userId; // Store the received User ID
    private String role; // Store the received Role
    private AdvocateConcrete advocate;

    public AdvocateHomePageViewController() {
        advocate = new AdvocateConcrete("John Doe", "Advocate123");
    }

    @Override
    public void receiveData(Object data) {
        if (data instanceof User) {
            User user = (User) data;
            this.userId = user.getUserId();
            this.role = user.getRole();
            System.out.println("Received User Data: ID = " + userId + ", Role = " + role);
        }
    }

    @FXML
    public void CreatenewcasesOnAction(ActionEvent actionEvent) {
        System.out.println("Creating new cases for Advocate " + userId + "...");

        // Example: Adding a new case
        List<Case> cases = CaseFileHandler.loadCases();
        cases.add(new Case("Case003", "Land Dispute", "Pending"));
        CaseFileHandler.saveCases(cases);

        System.out.println("New case created and saved.");
    }

    @FXML
    public void AnalyzecaseoutcomesOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void AddNotesorCommentstoCaseOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void ViewassignedcasesOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void LogoutOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void CollaboratewithexternalpartnersOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void ManagemultipleclientsOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void SchedulemeetingsOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void UpdateCaseStatusOnAction(ActionEvent actionEvent) {
    }
}