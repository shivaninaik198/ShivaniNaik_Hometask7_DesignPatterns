package epam.HT7.Hometask7;

//Structural Pattern
import java.util.Scanner;

interface Mobile{
	void type();
}
class Samsung implements Mobile{
	public void type() {
		System.out.println("Samsung mobile cost : 36,000");
	}
}
class Vivo implements Mobile{
	public void type() {
		System.out.println("Vivo mobile cost : 25,000");
	}
}
class Iphone implements Mobile{
	public void type() {
		System.out.println("Iphone mobile cost : 70,000");
	}
}
class Shop{
	void menu(int choice) {
		if(choice == 1) {
			Mobile ob = new Samsung();
			ob.type();
		}else if(choice == 2) {
			Mobile ob = new Vivo();
			ob.type();
		}else if(choice == 3) {
			Mobile ob = new Iphone();
			ob.type();
		}else {
			System.out.println("Enter a valid choice.");
		}
	}
}
public class FacadePattern {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Samsung mobile.");
		System.out.println("2.Vivo mobile.");
		System.out.println("3.Iphone.");
		System.out.print("Enter a choice : ");
		choice = scanner.nextInt();
		Shop shop = new Shop();
		shop.menu(choice);
	}

}
