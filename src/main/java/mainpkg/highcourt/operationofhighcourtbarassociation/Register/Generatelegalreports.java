package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Generatelegalreports
{
    @javafx.fxml.FXML
    private TextField idtextfield;
    @javafx.fxml.FXML
    private DatePicker dbtextfield;
    @javafx.fxml.FXML
    private TextField subjecttextfield;
    @javafx.fxml.FXML
    private TextField descriptiontexdtfield;
    ArrayList<Reports>reportsList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void generateonaction(ActionEvent actionEvent) {
        idtextfield.getText();
        subjecttextfield.getText();
        descriptiontexdtfield.getText();
        dbtextfield.getValue();

    }

    @javafx.fxml.FXML
    public void exitonaction(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Register/registerdashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Register Dashboard ");
        stage.show();
    }
}