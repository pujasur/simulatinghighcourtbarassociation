package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;

import java.io.IOException;
import java.util.ArrayList;

public class Reviewlicences
{
    @javafx.fxml.FXML
    private AnchorPane reviewlicensecobobox;
    @javafx.fxml.FXML
    private TextArea licencestextarea;
    ArrayList<Licence>licencesList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
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