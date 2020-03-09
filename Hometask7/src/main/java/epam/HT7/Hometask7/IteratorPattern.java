package epam.HT7.Hometask7;

//Behavioral Pattern
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorPattern {

	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Maths");
        list.add("History");
        list.add("Geography");
        list.add("Computers");
        list.add("Hindi");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}
}
