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
import java.util.ArrayList;

public class Manageinvesments
{
    @javafx.fxml.FXML
    private TableColumn<Investments,Float> amountcloumn;
    @javafx.fxml.FXML
    private TextField amounttextfield;
    @javafx.fxml.FXML
    private TableColumn<Investments,Integer> investeridclomn;
    @javafx.fxml.FXML
    private TableColumn<Investments,String> foundnamecloumn;
    @javafx.fxml.FXML
    private TextField returnratetextfield;
    @javafx.fxml.FXML
    private TextField foundnametextfield;
    @javafx.fxml.FXML
    private TableColumn<Investments,String> returnrateclomn;
    @javafx.fxml.FXML
    private TableView<Investments> tableviewtextfield;
    ArrayList<Investments>investmentsList=new ArrayList<>();
    @javafx.fxml.FXML
    private ComboBox <Integer>investmentidtextfield;


    @javafx.fxml.FXML
    public void initialize() {
        amountcloumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        investeridclomn.setCellValueFactory(new PropertyValueFactory<>("investerid"));
        foundnamecloumn.setCellValueFactory(new PropertyValueFactory<>("foundname"));
        returnrateclomn.setCellValueFactory(new PropertyValueFactory<>("returnrate"));

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(readInvestment()) ;


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
    public void investonaction(ActionEvent actionEvent) {
        float amount = Float.parseFloat(amounttextfield.getText());
        String rate = returnratetextfield.getText();
        int id = investmentidtextfield.getValue();
        String fundName = foundnametextfield.getText();

        Investments investments = new Investments(id, fundName, rate, amount) ;

        writeInvestment(investments);

        tableviewtextfield.getItems().clear();
        tableviewtextfield.getItems().addAll(readInvestment()) ;
    }

    public void writeInvestment(Investments investments) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("InvestmentData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(investments);

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
    public ArrayList<Investments> readInvestment() {
        ArrayList<Investments> investmentsArrayList = new ArrayList<>() ;
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("InvestmentData.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Investments investments;
            try{
                while(true){
                    investments = (Investments) ois.readObject();
                    investmentsArrayList.add(investments) ;
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
        return investmentsArrayList ;
    }
}