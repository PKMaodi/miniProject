
public class Cargo {
	private double Weight;
	private Dimension dimensions;
	private double volume;
	public Cargo(double Weight, Dimension dimensions) {
		this.dimensions = dimensions;
		this.Weight = Weight;
		
	}

	public Cargo() {
		dimensions = new Dimension();
		Weight = 0.0;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double Weight) {
		this.Weight = Weight;
	}

	public Dimension getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;

	}
	public double getVolume(){
		return volume;
	}
	public void setVolume(double volume){
		this.volume = volume;
		volume = dimensions.getLength() * dimensions.getWidth() * dimensions.getHeight();
	}


	@Override
	public String toString() {
		return "Cargo [Weight=" + Weight + ", dimensions=" + dimensions + "]";
	}

}
