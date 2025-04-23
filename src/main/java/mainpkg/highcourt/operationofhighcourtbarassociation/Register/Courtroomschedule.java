package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

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
import java.time.LocalDate;
import java.util.ArrayList;

public class Courtroomschedule
{
    @javafx.fxml.FXML
    private TextField casenametextfield;
    @javafx.fxml.FXML
    private DatePicker datetextfield;
    @javafx.fxml.FXML
    private TableColumn<Courtschedule, LocalDate> dateclomn;
    @javafx.fxml.FXML
    private ComboBox<String> caseidtextfield;
    @javafx.fxml.FXML
    private TableColumn<Courtschedule, String> casenameclomn;
    @javafx.fxml.FXML
    private TextField scheduleidtextfield;
    @javafx.fxml.FXML
    private TableColumn<Courtschedule, String> scheduleidclomn;
    @javafx.fxml.FXML
    private TableColumn<Courtschedule, Integer> caseidclomn;
    @javafx.fxml.FXML
    private TableView<Courtschedule> tableviewtextfield;

    ArrayList<Courtschedule> courtscheduleList=new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        casenameclomn.setCellValueFactory(new PropertyValueFactory<>("casename"));
        scheduleidclomn.setCellValueFactory(new PropertyValueFactory<>("scheduleid"));
        caseidclomn.setCellValueFactory(new PropertyValueFactory<>("caseid"));

    }

    @javafx.fxml.FXML
    public void scheduleonaction(ActionEvent actionEvent) {
        int scheduleId = Integer.parseInt(scheduleidtextfield.getText());
        String name = casenametextfield.getText();
        LocalDate date = datetextfield.getValue();
        String id = caseidtextfield.getValue();
        String schedule = scheduleidtextfield.getText();
        Courtschedule courseSchedule = new Courtschedule(scheduleId, id, name, date);
        courtscheduleList.add(courseSchedule);

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(courtscheduleList) ;
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