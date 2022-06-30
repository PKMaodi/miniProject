
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WelcomeScree {
    Parent root;
    Scene scene;
    Stage stage;
    public WelcomeScree() {

    }
    @FXML
    void GoToAdmin(ActionEvent event) {
        AdminView d = new AdminView();
        d.ReadFile();
        try {
            root = FXMLLoader.load(getClass().getResource("AdminScreen.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    @FXML
    void GoToClient(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("ClintScreenController.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }


}