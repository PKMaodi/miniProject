
public class Dimension {
	private double Length;
	private double Width;
	private double Height;

	public Dimension() {
		Length = 0.0;
		Width = 0.0;
		Height = 0.0;
	}

	public Dimension(double Length, double Width, double Height) {
		this.Height = Height;
		this.Length = Length;
		this.Width = Width;
	}

	public double getLength() {
		return Length;
	}

	public void setLength(double length) {
		Length = length;
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	@Override
	public String toString() {
		return "Dimension [Length=" + Length + ", Width=" + Width + ", Height=" + Height + "]";
	}

}
