package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Processmembership implements Serializable
{
    @javafx.fxml.FXML
    private TextField paymentidtextfield;
    @javafx.fxml.FXML
    private TextField amounttextfield;
    @javafx.fxml.FXML
    private DatePicker datetextfield;
    @javafx.fxml.FXML
    private TableColumn<Payment,Integer> paymentidcloumn;
    @javafx.fxml.FXML
    private TableColumn<Payment,LocalDate> dateclomn;
    @javafx.fxml.FXML
    private TableColumn <Payment,Float>amountclomn;
    @javafx.fxml.FXML
    private TableColumn<Payment,Integer> memberidclomn;
    @javafx.fxml.FXML
    private ComboBox <Integer>memberidtextfield;
    @javafx.fxml.FXML
    private TextField paymentmethodtextfield;
    @javafx.fxml.FXML
    private TableColumn<Payment,String> paymentmethodclomn;
    @javafx.fxml.FXML
    private TableView<Payment> tableviewtextfild;
    ArrayList<Payment>paymentList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        paymentidcloumn.setCellValueFactory(new PropertyValueFactory<>("paymentid"));
        dateclomn.setCellValueFactory(new PropertyValueFactory<>("date"));
        amountclomn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        memberidclomn.setCellValueFactory(new PropertyValueFactory<>("memberid"));
        paymentidcloumn.setCellValueFactory(new PropertyValueFactory<>("paymentid"));
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

    @javafx.fxml.FXML
    public void paymentonaction(ActionEvent actionEvent) {
        LocalDate date =datetextfield.getValue();
        int memberid =memberidtextfield.getValue();


    }
}