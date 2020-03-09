package epam.HT7.Hometask7;

//Creational Pattern
import java.util.Scanner;

interface Shape{
	void draw();
}
class Circle implements Shape{
	public void draw() {
		System.out.println("Circle is drawn!");
	}
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("Rectangle is drawn!");
	}
}
class Square implements Shape{
	public void draw() {
		System.out.println("Square is drawn!");
	}
}
class Triangle implements Shape{
	public void draw() {
		System.out.println("Triangle is drawn!");
	}
}
class GetShape{
	void getShape(int choice) {
		switch(choice) {
		case 1 : Circle circle = new Circle();
				 circle.draw();
				 break;
		case 2 : Rectangle rectangle = new Rectangle();
				 rectangle.draw();
				 break;
		case 3 : Square square = new Square();
		 		 square.draw();
		 		 break;
		case 4 : Triangle triangle = new Triangle();
		 		 triangle.draw();
		 		 break;
		default: System.out.println("Enter a valid choice : ");
		}
	}
}
public class FactoryMethodDesign {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Circle.");
		System.out.println("2.Rectangle.");
		System.out.println("3.Square.");
		System.out.println("4.Triangle.");
		System.out.print("Enter your choice : ");
		choice = scanner.nextInt();
		GetShape ob = new GetShape();
		ob.getShape(choice);
	}

}
