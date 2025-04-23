package mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer;

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

import java.io.*;
import java.sql.Ref;
import java.util.ArrayList;

public class Handlerefunds
{
    @javafx.fxml.FXML
    private TableColumn<Refundrequest, Integer> requestidclomn;
    @javafx.fxml.FXML
    private TextField amounttextfield;
    @javafx.fxml.FXML
    private TableColumn<Refundrequest, String> statusclomn;
    @javafx.fxml.FXML
    private TextField statustextfield;
    @javafx.fxml.FXML
    private TableColumn<Refundrequest, Integer> memberidcloumn;
    @javafx.fxml.FXML
    private TableColumn<Refundrequest, String> reasonclomn;
    @javafx.fxml.FXML
    private TableColumn<Refundrequest, Float> amountclomn;
    @javafx.fxml.FXML
    private ComboBox<Integer> memberidtextfield;
    @javafx.fxml.FXML
    private TextField reasontextfield;
    @javafx.fxml.FXML
    private TableView<Refundrequest> tableviewtextfield;
    ArrayList<Refundrequest>refundrequestList=new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        requestidclomn.setCellValueFactory(new PropertyValueFactory<>("requestid"));
        statusclomn.setCellValueFactory(new PropertyValueFactory<>("status"));
        memberidcloumn.setCellValueFactory(new PropertyValueFactory<>("memberid"));
        amountclomn.setCellValueFactory(new PropertyValueFactory<>("amount"));

        refundrequestList.add(new Refundrequest(1, 101, "Pending", 1200.00f));
        refundrequestList.add(new Refundrequest(2, 102, "Approved", 850.50f));
        refundrequestList.add(new Refundrequest(3, 103, "Rejected", 450.75f));
        refundrequestList.add(new Refundrequest(4, 104, "Approved", 1000.00f));
        refundrequestList.add(new Refundrequest(5, 105, "Pending", 620.30f));

        memberidtextfield.getItems().add(1);
        memberidtextfield.getItems().add(2);
        memberidtextfield.getItems().add(3);
        memberidtextfield.getItems().add(4);
        memberidtextfield.getItems().add(5);

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(refundrequestList) ;

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
    public void approverefundonaction(ActionEvent actionEvent) {
        float amount = Float.parseFloat(amounttextfield.getText());
        String status = statustextfield.getText();
        int id = Integer.parseInt(reasontextfield.getText());
        int member = memberidtextfield.getValue();

        Refundrequest refundrequest = new Refundrequest(id, member, status, amount) ;
        refundrequestList.add(refundrequest) ;
        writeRefund(refundrequest);

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(readInvestment()) ;

    }

    public void writeRefund(Refundrequest refundrequest) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("RefundData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(refundrequest);

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
    public ArrayList<Refundrequest> readInvestment() {
        ArrayList<Refundrequest> refundArrayList = new ArrayList<>() ;
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("RefundData.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Refundrequest investments;
            try{
                while(true){
                    investments = (Refundrequest) ois.readObject();
                    refundArrayList.add(investments) ;
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
        return refundArrayList ;
    }
}