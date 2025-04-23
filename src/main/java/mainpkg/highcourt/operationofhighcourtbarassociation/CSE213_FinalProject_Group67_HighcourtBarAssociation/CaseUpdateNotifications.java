package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import java.time.LocalDateTime;

public class CaseUpdateNotifications {
    private String notificationMessage;
    private LocalDateTime notificationDate;
    private boolean isRead;

    // Constructor
    public CaseUpdateNotifications(String notificationMessage, LocalDateTime notificationDate, boolean isRead) {
        this.notificationMessage = notificationMessage;
        this.notificationDate = notificationDate;
        this.isRead = isRead;
    }

    // Getters and Setters
    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public LocalDateTime getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(LocalDateTime notificationDate) {
        this.notificationDate = notificationDate;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    @Override
    public String toString() {
        return notificationMessage + " (" + notificationDate + ")";
    }
}