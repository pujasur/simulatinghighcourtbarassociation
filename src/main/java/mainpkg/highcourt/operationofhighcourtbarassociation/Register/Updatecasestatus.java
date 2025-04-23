package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Updatecasestatus
{
    @javafx.fxml.FXML
    private TableColumn<Case,Integer> caseidcloum;
    @javafx.fxml.FXML
    private TableColumn<Case,String> titlecolum;
    @javafx.fxml.FXML
    private TableColumn <Case,String>statuscloum;
    @javafx.fxml.FXML
    private TableColumn<Case,String> typecloum;
    @javafx.fxml.FXML
    private TableColumn<Case, LocalDate> datedb;
    @javafx.fxml.FXML
    private TableView<Case> tableviewtextfield;
    ArrayList<Case>caseList=new ArrayList<>();
    @javafx.fxml.FXML
    private ComboBox<Integer> caseidcombobox;


    @javafx.fxml.FXML
    public void initialize() {
        caseidcloum.setCellValueFactory(new PropertyValueFactory<>("caseid"));
        titlecolum.setCellValueFactory(new PropertyValueFactory<>("title"));
        statuscloum.setCellValueFactory(new PropertyValueFactory<>("status"));
        typecloum.setCellValueFactory(new PropertyValueFactory<>("type"));
        datedb.setCellValueFactory(new PropertyValueFactory<>("date"));

        Case case1 = new Case(401, "Land Dispute", "Civil", "Pending", LocalDate.of(2025, 3, 20));
        Case case2 = new Case(402, "Contract Breach", "Civil", "Closed", LocalDate.of(2025, 2, 15));
        Case case3 = new Case(403, "Criminal Assault", "Criminal", "In Progress", LocalDate.of(2025, 1, 10));
        Case case4 = new Case(404, "Property Rights", "Civil", "Pending", LocalDate.of(2024, 12, 5));
        Case case5 = new Case(405, "Tax Evasion", "Criminal", "Closed", LocalDate.of(2024, 11, 25));

        caseList.add(case1);
        caseList.add(case2);
        caseList.add(case3);
        caseList.add(case4);
        caseList.add(case5);

        caseidcombobox.getItems().add(401);
        caseidcombobox.getItems().add(402);
        caseidcombobox.getItems().add(403);
        caseidcombobox.getItems().add(404);
        caseidcombobox.getItems().add(405);

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(caseList) ;
    }

    @javafx.fxml.FXML
    public void looseonaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void winonaction(ActionEvent actionEvent) {
        caseidcombobox.getValue();
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