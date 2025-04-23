package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;
import mainpkg.highcourt.operationofhighcourtbarassociation.Register.Case;

import java.io.IOException;
import java.util.ArrayList;

public class Allocatebudget
{
    @javafx.fxml.FXML
    private TableColumn<Budget,Float> amountcloumn;
    @javafx.fxml.FXML
    private TextField idtextfield;
    @javafx.fxml.FXML
    private TextField amountextfield;
    @javafx.fxml.FXML
    private TableColumn<Budget,Float> balancecloumn;
    @javafx.fxml.FXML
    private TableColumn <Case,String>categorycloumn;
    @javafx.fxml.FXML
    private TextField balancetextfield;
    @javafx.fxml.FXML
    private TextField categorytextfield;
    @javafx.fxml.FXML
    private TableColumn<Case,Integer> idcloumn;
    ArrayList<Budget>budgetList=new ArrayList<>();
    @javafx.fxml.FXML
    private TableView<Budget> tableviewtextfield;

    @javafx.fxml.FXML
    public void initialize() {
        amountcloumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        balancecloumn.setCellValueFactory(new PropertyValueFactory<>("balance"));
        categorycloumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        idcloumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        Budget budget1 = new Budget(101, "Infrastructure", 50000.0f, 20000.0f);
        Budget budget2 = new Budget(102, "Events", 30000.0f, 15000.0f);
        Budget budget3 = new Budget(103, "Salaries", 100000.0f, 30000.0f);
        Budget budget4 = new Budget(104, "Maintenance", 20000.0f, 5000.0f);
        Budget budget5 = new Budget(105, "Miscellaneous", 10000.0f, 2500.0f);

        budgetList.add(budget1);
        budgetList.add(budget2);
        budgetList.add(budget3);
        budgetList.add(budget4);
        budgetList.add(budget5);

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(budgetList) ;
    }

    @javafx.fxml.FXML
    public void allocateonaction(ActionEvent actionEvent) {
        idtextfield.getText();
        amountextfield.getText();
        balancetextfield.getText();
        categorytextfield.getText();
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