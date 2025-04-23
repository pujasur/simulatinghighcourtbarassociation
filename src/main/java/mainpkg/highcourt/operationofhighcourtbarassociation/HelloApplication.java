package mainpkg.highcourt.operationofhighcourtbarassociation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        URL resourse = HelloApplication.class.getResource("Treasurer/treasurerdashboard.fxml") ;
        System.out.println("FXML URL: " + resourse);
        FXMLLoader fxmlLoader = new FXMLLoader(resourse);
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}