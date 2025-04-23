package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDateTime;

public class CaseUpdateNotificationsViewController {

    @FXML
    private ListView<CaseUpdateNotifications> notificationsListView;

    @FXML
    private TextArea notificationDetailsArea;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button logoutButton;


    private ObservableList<CaseUpdateNotifications> notificationsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        notificationsList.add(new CaseUpdateNotifications("Your case hearing is scheduled for April 28, 2025.", LocalDateTime.now().minusDays(1), false));
        notificationsList.add(new CaseUpdateNotifications("Your Advocate added new notes to your case.", LocalDateTime.now().minusHours(5), false));
        notificationsList.add(new CaseUpdateNotifications("Your case status has changed from Active to Completed.", LocalDateTime.now().minusDays(3), true));


        notificationsListView.setItems(notificationsList);
    }

    @FXML
    void notificationClicked(Event event) {

        CaseUpdateNotifications selectedNotification = notificationsListView.getSelectionModel().getSelectedItem();

        if (selectedNotification != null) {

            notificationDetailsArea.setText("Details: " + selectedNotification.getNotificationMessage() +
                    "\nDate: " + selectedNotification.getNotificationDate());

            // Mark the notification as read
            if (!selectedNotification.isRead()) {
                selectedNotification.setRead(true);
                System.out.println("Notification marked as read: " + selectedNotification.getNotificationMessage());
            }
        } else {
            notificationDetailsArea.setText("No notification selected.");
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