
public class RectangleApp {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(10.5);
		rectangle.setLength(3.5);
		double area = rectangle.getArea();
		System.out.println("Fläche: " + area);
	}
}

