package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleMeetingsOrHearingsViewController {

    @FXML
    private Button scheduleButton;

    @FXML
    private ComboBox<String> caseSelector;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField timeField;

    @FXML
    private ComboBox<String> participantSelector;

    @FXML
    private Button sendNotificationButton;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;


    private ObservableList<String> casesList = FXCollections.observableArrayList();
    private ObservableList<String> participantsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Populate caseSelector and participantSelector with dummy data
        // Replace this with actual dynamic data from the database
        casesList.addAll("Case001", "Case002", "Case003");
        participantsList.addAll("Client1", "Judge1", "Other Party");

        caseSelector.setItems(casesList);
        participantSelector.setItems(participantsList);
    }

    @FXML
    void scheduleOnAction(ActionEvent event) {

        caseSelector.getSelectionModel().clearSelection();
        datePicker.setValue(null);
        timeField.clear();
        participantSelector.getSelectionModel().clearSelection();
        System.out.println("Ready to schedule a new meeting or hearing.");
    }

    @FXML
    void sendNotificationOnAction(ActionEvent event) {
        String selectedCase = caseSelector.getValue();
        LocalDate selectedDate = datePicker.getValue();
        String selectedTime = timeField.getText();
        String selectedParticipant = participantSelector.getValue();

        if (selectedCase != null && selectedDate != null && !selectedTime.trim().isEmpty() && selectedParticipant != null) {
            try {
                LocalTime time = LocalTime.parse(selectedTime);
                ScheduleMeetingsOrHearings newSchedule = new ScheduleMeetingsOrHearings(selectedCase, selectedDate, time);
                newSchedule.addParticipant(selectedParticipant);

                System.out.println("Meeting scheduled successfully for Case: " + selectedCase);
                System.out.println("Date: " + selectedDate + ", Time: " + time);
                System.out.println("Participants: " + newSchedule.getParticipants());

                // Add logic to save the schedule in the database and send notifications
            } catch (Exception e) {
                System.out.println("Invalid time format. Please use HH:mm format (e.g., 10:00).");
            }
        } else {
            System.out.println("Please fill all fields before sending notifications.");
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