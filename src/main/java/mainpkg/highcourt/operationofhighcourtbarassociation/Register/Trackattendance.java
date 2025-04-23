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

public class Trackattendance
{
    @javafx.fxml.FXML
    private TableColumn<Attendancereport,String> recordsclom;
    @javafx.fxml.FXML
    private TableView <Attendancereport>tableviewtextfield;
    @javafx.fxml.FXML
    private TableColumn<Attendancereport,Integer> reportidclom;
    @javafx.fxml.FXML
    private TableColumn<Attendancereport, LocalDate> datecloum;
    ArrayList<Attendancereport>attendancereportList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        recordsclom.setCellValueFactory(new PropertyValueFactory<>("records"));
        reportidclom.setCellValueFactory(new PropertyValueFactory<>("reportid"));
        datecloum.setCellValueFactory(new PropertyValueFactory<>("date"));

        Attendancereport report1 = new Attendancereport(301, "Present: Ayesha, Rahul | Absent: Sneha", LocalDate.of(2025, 4, 1));
        Attendancereport report2 = new Attendancereport(302, "Present: Sneha, Meera | Absent: Arjun", LocalDate.of(2025, 4, 2));
        Attendancereport report3 = new Attendancereport(303, "Present: All members", LocalDate.of(2025, 4, 3));
        Attendancereport report4 = new Attendancereport(304, "Present: Arjun, Ayesha | Absent: Rahul", LocalDate.of(2025, 4, 4));
        Attendancereport report5 = new Attendancereport(305, "Present: Meera, Rahul | Absent: None", LocalDate.of(2025, 4, 5));

        attendancereportList.add(report1);
        attendancereportList.add(report2);
        attendancereportList.add(report3);
        attendancereportList.add(report4);
        attendancereportList.add(report5);

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(attendancereportList) ;
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