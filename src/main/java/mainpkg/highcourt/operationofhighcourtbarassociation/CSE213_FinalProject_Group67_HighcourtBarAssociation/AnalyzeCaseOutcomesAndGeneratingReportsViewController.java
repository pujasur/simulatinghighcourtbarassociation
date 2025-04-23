package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class AnalyzeCaseOutcomesAndGeneratingReportsViewController {

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private DatePicker fromDatePicker;

    @FXML
    private DatePicker toDatePicker;

    @FXML
    private TextField caseTypeField;

    @FXML
    private TextArea reportResultsTextArea;

    @FXML
    void generateReportOnAction(ActionEvent event) {
        // Fetch user inputs
        String reportType = reportTypeComboBox.getValue();
        LocalDate fromDate = fromDatePicker.getValue();
        LocalDate toDate = toDatePicker.getValue();
        String caseType = caseTypeField.getText();

        // Validate inputs
        if (reportType == null || fromDate == null || toDate == null) {
            reportResultsTextArea.setText("Error: Please select a report type and valid dates.");
            return;
        }

        // Create an analytics instance and generate the report
        AnalyzeCaseOutcomesAndGeneratingReportsViewController analytics = new AnalyzeCaseOutcomesAndGeneratingReportsViewController(reportType, fromDate, toDate, caseType);
        String results = analytics.AnalyzeCaseOutcomesAndGeneratingReportsViewController();

        // Display results
        reportResultsTextArea.setText(results);
    }

    private String AnalyzeCaseOutcomesAndGeneratingReportsViewController() {
    }

    @FXML
    void returnHomeOnAction(ActionEvent event) {
        System.out.println("Returning to Home Dashboard...");
    }

    @FXML
    void logoutOnAction(ActionEvent event) {
        System.out.println("Logging out...");
    }

    @FXML
    void downloadReportOnAction(ActionEvent event) {
        reportResultsTextArea.setText("The report has been downloaded successfully!");
    }
}