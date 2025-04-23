package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;

import java.io.IOException;
import java.util.ArrayList;

public class Generatefincialreports
{
    @javafx.fxml.FXML
    private TextField typetextfield;
    @javafx.fxml.FXML
    private TextField idtextfield;
    @javafx.fxml.FXML
    private TableColumn<Fincialreport,String> typeclomn;
    @javafx.fxml.FXML
    private DatePicker dbtextfield;
    @javafx.fxml.FXML
    private TextField periodtextfield;
    @javafx.fxml.FXML
    private TableColumn<Fincialreport,Integer> idcolumn;
    @javafx.fxml.FXML
    private TableColumn<Fincialreport,String> periodclomn;
    @javafx.fxml.FXML
    private TableColumn<Fincialreport,Integer> datecloum;
    ArrayList<Fincialreport>fincialreportList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        typeclomn.setCellValueFactory(new PropertyValueFactory<>("type"));
        idcolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        periodclomn.setCellValueFactory(new PropertyValueFactory<>("period"));
        datecloum.setCellValueFactory(new PropertyValueFactory<>("date"));

    }

    @javafx.fxml.FXML
    public void generateonaction(ActionEvent actionEvent) {
        typetextfield.getText();
        idtextfield.getText();
        periodtextfield.getText();
        dbtextfield.getValue();
    }

    @javafx.fxml.FXML
    public void exitonaction(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Treasurer/Treasurerdashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Treasurer Dashboard");
        stage.show();
    }
}