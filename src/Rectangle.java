//Klasse = Codestruktur, welche etwas aus der realen Welt abbildet
public class Rectangle {
	
	//Eigenschaften = Instanzvariablen = Attribute
	private double width;
	private double length;
	
	//Verhalten = Methoden
	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		double area = this.width * this.length;
		return area;
	}
}