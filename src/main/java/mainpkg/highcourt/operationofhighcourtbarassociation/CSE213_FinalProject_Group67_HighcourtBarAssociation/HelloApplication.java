package group67.oop.CSE213_FinalProject_Group67_HighcourtBarAssociation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LogInPageView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("High Cour Bar Association");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
