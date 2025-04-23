package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

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
import java.util.Arrays;

public class Accessdigitalrecords
{
    @javafx.fxml.FXML
    private TableColumn<Records, String> descriptioncloumn;
    @javafx.fxml.FXML
    private TableColumn<Records, Integer> idcloumn;
    @javafx.fxml.FXML
    private TableView<Records> tableviewtextfield;
    @javafx.fxml.FXML
    private TableColumn<Records, LocalDate> dateclomn;
    ArrayList<Records>recordslist=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        descriptioncloumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        idcloumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        dateclomn.setCellValueFactory(new PropertyValueFactory<>("date"));

        Records record1 = new Records(LocalDate.of(2025, 4, 1), 101, "Annual General Meeting held.");
        Records record2 = new Records(LocalDate.of(2025, 3, 15), 102, "Membership fees collected.");
        Records record3 = new Records(LocalDate.of(2025, 2, 10), 103, "New member registration approved.");
        Records record4 = new Records(LocalDate.of(2025, 1, 25), 104, "Disciplinary hearing conducted.");
        Records record5 = new Records(LocalDate.of(2024, 12, 31), 105, "Year-end financial audit completed.");

        recordslist.add(record1);
        recordslist.add(record2);
        recordslist.add(record3);
        recordslist.add(record4);
        recordslist.add(record5);

        tableviewtextfield.getItems().addAll(recordslist) ;
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