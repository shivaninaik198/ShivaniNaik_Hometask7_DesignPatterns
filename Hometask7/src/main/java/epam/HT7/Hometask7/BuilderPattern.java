package epam.HT7.Hometask7;

//Creational Pattern
import java.util.Scanner;

interface Food{
	void foodItems();
}
class VegMeal implements Food{
	public void foodItems() {
		System.out.println("\nVeg meal consists of :");
		System.out.println("Veg Burger");
		System.out.println("French Fries");
		System.out.println("Coke");
		System.out.println("Tomato Sauce");
	}
}
class NonVegMeal{
	public void foodItems() {
		System.out.println("\nNon-veg meal consists of :");
		System.out.println("Non-veg Pizza");
		System.out.println("French Fries");
		System.out.println("Coke");
		System.out.println("Chilli Sauce");
	}
}

public class BuilderPattern {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Veg meal");
		System.out.println("2.Non-veg meal");
		System.out.print("Enter your choice : ");
		choice = scanner.nextInt();
		if(choice == 1) {
			VegMeal veg = new VegMeal();
			veg.foodItems();
		}else if(choice == 2) {
			NonVegMeal nonveg = new NonVegMeal();
			nonveg.foodItems();		
		}else {
			System.out.println("Enter a valid choice");
		}

	}

}
