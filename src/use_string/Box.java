package use_string;

public class Box {
	double width;
	double height;
	double depth;
	
	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		return "Размеры: " +
				width + " на " +
				depth + " на " +
				height + ".";
	}
	
}
