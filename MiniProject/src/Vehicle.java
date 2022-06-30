import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Vehicle {
    private String VType;//THe type of vehicle(TRuck,Bakkie or Sedan)
    private Cargo cargo;
    private LoadBox loadbox;
    private double loadCapacity;
    @FXML
    private TextArea VText;
    
    public Vehicle(String vType, Cargo cargo, LoadBox loadbox, double loadCapacity) {
        this.VType = vType;
        this.cargo = cargo;
        this.loadbox = loadbox;
        this.loadCapacity = loadCapacity;
    }
    public Vehicle() {
        VType = "vehicle";
        cargo = new Cargo();
        loadbox = new LoadBox();
        loadCapacity = 0.0;
    }
    public String getVType() {
        return VType;
    }
    public void setVType(String VType) {
        this.VType = VType;
        VType = loadbox.getName();
    }
    public Cargo getCargo() {
        return cargo;
    }
    public double getLoadCapacity() {
        return loadCapacity;
    }
    
    public LoadBox getLoadbox() {
        return loadbox;
    }
    public void setLoadbox(LoadBox loadbox) {
        this.loadbox = loadbox;
    }
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
        if(VType.equalsIgnoreCase("Sedan")){
            loadCapacity = 200;
        }
        if(VType.equalsIgnoreCase("Truck")){
            loadCapacity = 4000;
        }
        if(VType.equalsIgnoreCase("Bakkie")){
            loadCapacity = 1000;
        }
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
        boolean CargoStatus;
        //Turning the dimensions of the cargo(stored as centimeters) into meters before testing them
        if((cargo.getDimensions().getHeight() / 100) < loadbox.getHeight() 
        && (cargo.getDimensions().getLength() / 100) < loadbox.getLength()
        && (cargo.getDimensions().getWidth() / 100) < loadbox.getWidth()
        && cargo.getWeight() <= loadCapacity){
            CargoStatus = true;
            
        }
        else {
            CargoStatus = false;
        }
        String message = AssignVehicle(CargoStatus);
        VText.setText(message);
    }
    public String AssignVehicle(boolean CargoStatus){
        if(CargoStatus = true){
            if(VType.equals(loadbox.getName()) && loadbox.getDim() > (cargo.getVolume() / 100) && cargo.getWeight() <= loadCapacity){
                return "Cargo was successfully loaded in the " + loadbox.getName();
            }
            else{
                return "Sorry the Cargo could not fit in any of the vehicles.";
            }
        }
        return "Run the program again";
    }
    public void OutPut(){
        
    }

    @Override
    public String toString() {
        return "Vehicle [VType=" + VType + ", cargo=" + cargo + ", loadCapacity=" + loadCapacity + ", loadbox="
                + loadbox + "]";
    }
    
    
}
