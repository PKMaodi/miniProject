
public class LoadBox {
    private double length;
    private double width;
    private double height;
    private String Name;
    private double dimensions;
    public LoadBox(String Name, double length,double width,double height) {
        this.length = length;
        this.Name = Name;
        this.width = width;
        this.height = height;
    }
    public LoadBox() {
        Name = "Default v";
        length = 0.0d;
        width = 0.0d;
        height = 0.0d;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setDim(double length,double width,double height){
        this.height  = height;
        this.length = length;
        this.width = width;
        dimensions = length * width * height;
    }
    public double getDim(){
        return dimensions;
    }
    @Override
    public String toString() {
        return "LoadBox [Name=" + Name + ", height=" + height + ", length=" + length + ", width=" + width + "]";
    }
    
    
    
}
