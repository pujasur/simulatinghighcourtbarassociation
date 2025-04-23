package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mainpkg.highcourt.operationofhighcourtbarassociation.HelloApplication;

import java.io.IOException;
import java.util.ArrayList;

public class Managemembers
{
    @javafx.fxml.FXML
    private TextField phonenumbertextfield;
    @javafx.fxml.FXML
    private TableColumn<Members,Integer> namecloum;
    @javafx.fxml.FXML
    private TableColumn<Members,Integer> idcolum;
    @javafx.fxml.FXML
    private TextField emailtextfield;
    @javafx.fxml.FXML
    private TableColumn <Members,String>statuscloum;
    @javafx.fxml.FXML
    private TableColumn<Members,String> contactcloum;
    @javafx.fxml.FXML
    private ComboBox<Members> memberidcombobox;
    @javafx.fxml.FXML
    private TableView<Members> tableviewtextfield;
    ArrayList<Members>membersList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        namecloum.setCellValueFactory(new PropertyValueFactory<>("name"));
        idcolum.setCellValueFactory(new PropertyValueFactory<>("memberid"));
        statuscloum.setCellValueFactory(new PropertyValueFactory<>("membershipstatus"));
        contactcloum.setCellValueFactory(new PropertyValueFactory<>("contactinfo"));

        Members member1 = new Members(201, "Ayesha Khan", "ayesha.khan@example.com", "Active");
        Members member2 = new Members(202, "Rahul Mehra", "rahul.mehra@example.com", "Inactive");
        Members member3 = new Members(203, "Sneha Roy", "sneha.roy@example.com", "Active");
        Members member4 = new Members(204, "Arjun Desai", "arjun.desai@example.com", "Pending");
        Members member5 = new Members(205, "Meera Patel", "meera.patel@example.com", "Active");

        membersList.add(member1);
        membersList.add(member2);
        membersList.add(member3);
        membersList.add(member4);
        membersList.add(member5);

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(membersList) ;
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

    @javafx.fxml.FXML
    public void updateonaction(ActionEvent actionEvent) {
        phonenumbertextfield.getText();
        emailtextfield.getText();
        memberidcombobox.getValue();

    }
}