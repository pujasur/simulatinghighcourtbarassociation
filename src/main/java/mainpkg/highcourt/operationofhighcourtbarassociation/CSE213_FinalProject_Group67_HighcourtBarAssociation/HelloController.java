package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the High Court Bar Association Website..");
    }

}