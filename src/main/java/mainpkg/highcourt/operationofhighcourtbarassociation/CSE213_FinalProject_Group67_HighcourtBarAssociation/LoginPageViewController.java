package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class LoginPageViewController {

    @FXML
    private Button loginButton;

    @FXML
    private TextField userIdtextfield;

    @FXML
    private TextField passwordtextfield;

    @FXML
    private ComboBox<String> selectcomboBox;

    @FXML
    private Button signuobutton;

    private List<LoginPage> users = new ArrayList<>();

    @FXML
    void loginOnAction(ActionEvent event) {
        String userId = userIdtextfield.getText().trim();
        String password = passwordtextfield.getText().trim();
        String role = selectcomboBox.getValue();

        // Validation for empty fields
        if (userId.isEmpty() || password.isEmpty() || role == null) {
            showAlert("Error", "User ID, Password, or Role cannot be empty.", Alert.AlertType.ERROR);
            return;
        }

        // Check if ID contains alphabet
        if (userId.matches(".*[a-zA-Z].*")) {
            showAlert("Error", "Please enter a valid numeric User ID.", Alert.AlertType.ERROR);
            return;
        }

        // Verification
        for (LoginPage user : users) {
            if (user.getUserId().equals(userId) && user.getPassword().equals(password) && user.getRole().equals(role)) {
                showAlert("Success", "Login successful! Welcome, " + role + ".", Alert.AlertType.INFORMATION);
                // Switch to user-specific dashboard here
                Stage stage = (Stage) loginButton.getScene().getWindow();
                String targetScene = role.equals("Advocate") ? "AdvocateHomePageView.fxml" : "ClientHomePageView.fxml";
                Object SceneSwitcher;
                SceneSwitcher.switchScene(stage, targetScene, user);
                return;
            }
        }

        showAlert("Error", "Invalid credentials. Please try again.", Alert.AlertType.ERROR);
    }

    @FXML
    public void signupOnAction(ActionEvent actionEvent) {
        // Code to switch to the signup scene
        Stage stage = (Stage) signuobutton.getScene().getWindow();
        Object SceneSwitcher;
        SceneSwitcher.switchScene(stage, "SignupPageView.fxml", null);
    }

    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}