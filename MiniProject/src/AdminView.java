import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AdminView {

    @FXML
    private TableColumn<Details, Double> CargHeCol;

    @FXML
    private TableColumn<Details, Double> CargLengCol;

    @FXML
    private TableColumn<Details, Double> CargWeiCol;

    @FXML
    private TableColumn<Details, Double> CargWidthCol;

    @FXML
    private TableColumn<Details, String> RCityCol;

    @FXML
    private TableColumn<Details, String> RNameCol;

    @FXML
    private TableColumn<Details, String> SNameCol;

    @FXML
    private TableView<Details> tableviw;

    private Parent root;
    private Scene scene;
    private Stage stage;
    String sname,rname,rcity,info,data[];
    double leng,heig,wid,weight;
    int count = 0;
    Details clientDetails;
    public void ReadFile(){

        File file = new File("PendingCouriers.csv");
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bffReader = new BufferedReader(reader);
            info = bffReader.readLine();
            
            while(info != null) {
                data = info.split(";");
                sname = data[0];
                leng = Double.parseDouble(data[1]);
                wid = Double.parseDouble(data[2]);
                heig = Double.parseDouble(data[3]);
                weight = Double.parseDouble(data[4]);
                rname = data[5];
                rcity = data[6];
                count++;
                Dimension dims = new Dimension(leng, wid, heig);
                Cargo cargo = new Cargo(weight, dims);
                info = bffReader.readLine();
            }
            bffReader.close();

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
    @FXML
    void AssignVehicle(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("VehicleStat.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void initialize(){
        SNameCol.setCellValueFactory(new PropertyValueFactory<Details,String>("SName"));
        RNameCol.setCellValueFactory(new PropertyValueFactory<Details,String>("RecieverName"));
        RCityCol.setCellValueFactory(new PropertyValueFactory<Details,String>("City"));
        CargLengCol.setCellValueFactory(new PropertyValueFactory<Details,Double>("length"));
        CargHeCol.setCellValueFactory(new PropertyValueFactory<Details,Double>("height"));
        CargWeiCol.setCellValueFactory(new PropertyValueFactory<Details,Double>("weight"));
        CargWidthCol.setCellValueFactory(new PropertyValueFactory<Details,Double>("width"));
        tableviw.setItems(getClients());
    }
    public ObservableList<Details> getClients() { 
        ObservableList<Details> clients = FXCollections.observableArrayList();
        clients.add(new Details("Luyanda", 32.5, 12.6, 32.5, 2000, "Andile", "Durban"));
        return clients;
    }

}
