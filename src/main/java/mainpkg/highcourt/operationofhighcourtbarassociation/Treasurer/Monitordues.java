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

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Monitordues
{
    @javafx.fxml.FXML
    private TableColumn<Duenotice,String> statusclomn;
    @javafx.fxml.FXML
    private TextField statustextfield;
    @javafx.fxml.FXML
    private TableColumn<Duenotice, LocalDate> duedateclomn;
    @javafx.fxml.FXML
    private TableColumn<Duenotice,Integer> memberidcloumn;
    @javafx.fxml.FXML
    private TableColumn<Duenotice,Float> dueamountclomn;
    @javafx.fxml.FXML
    private DatePicker duedatetextfield;
    @javafx.fxml.FXML
    private ComboBox<Integer> memberidtextfield;
    @javafx.fxml.FXML
    private TextField dueamountextfield;
    @javafx.fxml.FXML
    private TableColumn noticeidclomn;
    @javafx.fxml.FXML
    private TextField noticeidtextfield;
    @javafx.fxml.FXML
    private TableView<Duenotice> tableviewtextfield;
    ArrayList<Duenotice>duenoticeList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        statusclomn.setCellValueFactory(new PropertyValueFactory<>("status"));
        dueamountclomn.setCellValueFactory(new PropertyValueFactory<>("dueamount"));
        noticeidclomn.setCellValueFactory(new PropertyValueFactory<>("noticeid"));
        duedateclomn.setCellValueFactory(new PropertyValueFactory<>("date"));
        memberidcloumn.setCellValueFactory(new PropertyValueFactory<>("memberid"));

        memberidtextfield.getItems().add(1);
        memberidtextfield.getItems().add(2);
        memberidtextfield.getItems().add(3);
        memberidtextfield.getItems().add(4);
        memberidtextfield.getItems().add(5);

        duenoticeList.add(new Duenotice(101, 1500.00f, 1, "Pending", LocalDate.of(2025, 1, 15)));
        duenoticeList.add(new Duenotice(102, 2300.50f, 2, "Overdue", LocalDate.of(2025, 2, 20)));
        duenoticeList.add(new Duenotice(103, 1250.75f, 3, "Paid", LocalDate.of(2025, 3, 10)));
        duenoticeList.add(new Duenotice(104, 3000.00f, 4, "Pending", LocalDate.of(2025, 4, 5)));
        duenoticeList.add(new Duenotice(105, 1800.25f, 5, "Overdue", LocalDate.of(2025, 4, 18)));
        System.out.println(readDue());
        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(duenoticeList);
    }

    @javafx.fxml.FXML
    public void exitonaction(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Treasurer/Treasurerdashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Treasurer  Dashboard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void monitoronaction(ActionEvent actionEvent) {
        String status = statustextfield.getText();
        int memberid =memberidtextfield.getValue();
        int noticeid =Integer.parseInt(noticeidtextfield.getText());
        float amount = Float.parseFloat(dueamountextfield.getText());
        LocalDate date =duedatetextfield.getValue();
        Duenotice duenotice=new Duenotice(noticeid,amount,memberid,status,date);
        duenoticeList.add(duenotice);
        writeDue(duenotice);
        System.out.println(readDue());
        tableviewtextfield.getItems().addAll(readDue());
    }

    public void writeDue(Duenotice duenotice) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("DuenoticeData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(duenotice);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
    public ArrayList<Duenotice> readDue() {
        ArrayList<Duenotice> duenoticeArrayList = new ArrayList<>() ;
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("DuenoticeData.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Duenotice duenotice;
            try{
                while(true){
                    duenotice = (Duenotice) ois.readObject();
                    duenoticeArrayList.add(duenotice) ;
                }
            }
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("External Error: " + ex.getMessage());
        }
        finally {
            try {

                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        return duenoticeArrayList ;
    }
}