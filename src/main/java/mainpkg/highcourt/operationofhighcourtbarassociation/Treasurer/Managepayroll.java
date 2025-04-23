package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Managepayroll implements Serializable
{
    @javafx.fxml.FXML
    private TableColumn<Payroll,Float> deductioncloumn;
    @javafx.fxml.FXML
    private TextField employeeidtextfield;
    @javafx.fxml.FXML
    private TextField salarytextfield;
    @javafx.fxml.FXML
    private TableColumn<Payroll, LocalDate> paymentdateclomn;
    @javafx.fxml.FXML
    private TextField deductionstextfield;
    @javafx.fxml.FXML
    private TableColumn <Payroll,Float>salaryclomn;
    @javafx.fxml.FXML
    private TableColumn <Payroll,Integer>employeeidclomn;
    @javafx.fxml.FXML
    private TableView<Payroll> tableviewtextfield;
    @javafx.fxml.FXML
    private DatePicker paymentdatetextfield;
    ArrayList<Payroll>payrollList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        deductioncloumn.setCellValueFactory(new PropertyValueFactory<>("deduction"));
        paymentdateclomn.setCellValueFactory(new PropertyValueFactory<>("paymentdate"));
        salaryclomn.setCellValueFactory(new PropertyValueFactory<>("salary"));
        employeeidclomn.setCellValueFactory(new PropertyValueFactory<>("employeeid"));
    }

    @javafx.fxml.FXML
    public void payonaction(ActionEvent actionEvent) {
        employeeidtextfield.getText();
        salarytextfield.getText();
        deductionstextfield.getText();
        paymentdatetextfield.getValue();
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