import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) {
        LoadBox Truck = new LoadBox("Truck", 7, 2, 2);
        LoadBox Bakkie = new LoadBox("Bakkie",3,2,1);
        LoadBox Sedan = new LoadBox("Sedan", 1, 1, 1);
        launch(args);
    }

    @Override
    public void start(Stage stage){
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
}
