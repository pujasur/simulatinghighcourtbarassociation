package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;

import java.io.IOException;
import java.util.ArrayList;

public class Registeradvocate
{
    @javafx.fxml.FXML
    private TextField idtextfield;
    @javafx.fxml.FXML
    private AnchorPane dateofbirthdatepicker;
    @javafx.fxml.FXML
    private TextField addresstextfield;
    @javafx.fxml.FXML
    private TextField emailtextf;
    @javafx.fxml.FXML
    private TextField nametextfield;
    @javafx.fxml.FXML
    private DatePicker dbtextfield;
    @javafx.fxml.FXML
    private PasswordField passwordtextfield;
    ArrayList<Advocate>advocateList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void createonaction(ActionEvent actionEvent) {
        idtextfield.getText();
        addresstextfield.getText();
        emailtextf.getText();
        passwordtextfield.getText();

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