package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ScheduleMeetingsOrHearings {
    private String caseId;
    private LocalDate date;
    private LocalTime time;
    private ArrayList<String> participants;

    // Constructor
    public ScheduleMeetingsOrHearings(String caseId, LocalDate date, LocalTime time) {
        this.caseId = caseId;
        this.date = date;
        this.time = time;
        this.participants = new ArrayList<>();
    }

    // Getters and Setters
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public ArrayList<String> getParticipants() {
        return participants;
    }

    public void addParticipant(String participant) {
        participants.add(participant);
    }
}