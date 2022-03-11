package entities;

public class CalculoPerimetro {
	
	public double width;
	public double height;
	
	public double totalPerimetro() {
		return (2*width)+(2*height);
	}
	public double totalArea() {
		return width*height;
	}
	public double totalDiagonal() {
		return width*height/2;
	}
	/*public String toString() {
		return String.format("%.2f", totalArea()) +
	  String.format("%.2f\n", totalPerimetro()) +
	 String.format("%.2f\n", totalDiagonal());
	}*/
}
