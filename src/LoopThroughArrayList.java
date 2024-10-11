import java.util.ArrayList;

public class LoopThroughArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Mercedes");
		cars.add("Benz");
		cars.add("Volvo");
		cars.add("Toyota");
		
		for (String i: cars) {
			System.out.println(i);
		}
	}
}
