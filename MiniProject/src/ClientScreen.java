import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class  ClientScreen {

    @FXML
    private Button BackBttn;

    @FXML
    private TextField CargHeight;

    @FXML
    private TextField CargLength;

    @FXML
    private TextField CargWeight;

    @FXML
    private TextField CargWidth;

    @FXML
    private TextField RCityIn;

    @FXML
    private TextField RNameIn;

    @FXML
    private TextField SNameIn;

    @FXML
    private Button SibmitButtn;
    
    Stage stage;
    private String SName;
    private String RName;
    private String CLength;
    private String CWidth;
    private String CHeight;
    private String CWeigth;
    private String RCity;
    private File file = new File("PendingCouriers.csv");

    

    public ClientScreen() {
    }
    
    public ClientScreen(String SName, String RName, String CLength, String CWidth, String CHeight, String CWeigth,
            String RCity) {
        this.SName = SName;
        this.RName = RName;
        this.CLength = CLength;
        this.CWidth = CWidth;
        this.CHeight = CHeight;
        this.CWeigth = CWeigth;
        this.RCity = RCity;
    }

    @FXML
    void BackToWelcome(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("Welcomef.fxml"));
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @FXML
    void SubmtDe(ActionEvent event) {
        SName = SNameIn.getText();
        RName = RNameIn.getText();
        RCity = RCityIn.getText();
        CLength = CargLength.getText();
        CHeight = CargHeight.getText();
        CWidth = CargWidth.getText();
        CWeigth = CargWeight.getText();
        if(SName.isEmpty() || RCity.isEmpty() || RName.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter into the Empty Fields");

        }
        else{
            try{
                FileWriter flwrite = new FileWriter(file,true);
                BufferedWriter bffrdWriter = new BufferedWriter(flwrite);

                bffrdWriter.write(SName);
                //Writing the Dimensions and weight as srting values
                bffrdWriter.write("" + CLength);
                bffrdWriter.write("" + CWidth);
                bffrdWriter.write("" + CHeight);
                bffrdWriter.write("" + CWeigth);
                bffrdWriter.write(RName);
                bffrdWriter.write(RCity);
                bffrdWriter.close(); 
            }
            catch(Exception f){
                JOptionPane.showMessageDialog(null, "Failed to write file");
            }
        }
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getRName() {
        return RName;
    }

    public void setRName(String RName) {
        this.RName = RName;
    }

    public String getCLength() {
        return CLength;
    }

    public void setCLength(String cLength) {
        CLength = cLength;
    }

    public String getCWidth() {
        return CWidth;
    }

    public void setCWidth(String cWidth) {
        CWidth = cWidth;
    }

    public String getCHeight() {
        return CHeight;
    }

    public void setCHeight(String cHeight) {
        CHeight = cHeight;
    }

    public String getCWeigth() {
        return CWeigth;
    }

    public void setCWeigth(String cWeigth) {
        CWeigth = cWeigth;
    }

    public String getRCity() {
        return RCity;
    }

    public void setRCity(String rCity) {
        RCity = rCity;
    }

}