public class Details {
    private String SName;
    private double length;
    private double width;
    private double height;
    private double weight;
    private String RecieverName;
    private String City;
    public Details() {
    }
    public Details(String SName, double length, double width, double height, double weight, String RecieverName,
            String City) {
        this.SName = SName;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.RecieverName = RecieverName;
        this.City = City;
    }
    public String getSName() {
        return SName;
    }
    public void setSName(String sName) {
        this.SName = sName;
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
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getRecieverName() {
        return RecieverName;
    }
    public void setRecieverName(String RecieverName) {
        this.RecieverName = RecieverName;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String City) {
        this.City = City;
    }
}
