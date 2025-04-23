package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reconcllebank
{
    @javafx.fxml.FXML
    private TableColumn dateclomn;
    @javafx.fxml.FXML
    private TableColumn balanceclomn;
    @javafx.fxml.FXML
    private TableColumn statementidclomn;
    @javafx.fxml.FXML
    private TableColumn banknameclomn;
    @javafx.fxml.FXML
    private TableView tableviewtextfield;
    ArrayList<Bankstatement>bankstatementList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        dateclomn.setCellValueFactory(new PropertyValueFactory<>("date"));
        balanceclomn.setCellValueFactory(new PropertyValueFactory<>("balance"));
        statementidclomn.setCellValueFactory(new PropertyValueFactory<>("satementid"));
        banknameclomn.setCellValueFactory(new PropertyValueFactory<>("bankname"));

        bankstatementList.add(new Bankstatement(1, "State Bank", 100000.0f, LocalDate.of(2025, 1, 15)));
        bankstatementList.add(new Bankstatement(2, "Punjab National", 85000.5f, LocalDate.of(2025, 2, 5)));
        bankstatementList.add(new Bankstatement(3, "ICIC Bank", 122000.75f, LocalDate.of(2025, 3, 10)));
        bankstatementList.add(new Bankstatement(4, "HDFC Bank", 90000.25f, LocalDate.of(2025, 4, 1)));
        bankstatementList.add(new Bankstatement(5, "Axis Bank", 67000.0f, LocalDate.of(2025, 4, 20))) ;

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(bankstatementList);
    }

    @javafx.fxml.FXML
    public void exitonaction(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Treasurer/Treasurerdashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Treasurer");
        stage.show();
    }
}