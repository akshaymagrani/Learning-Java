import java.util.ArrayList;
import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Ford");
		cars.add("Fiat");
		System.out.println(cars);
		cars.sort(null);
		System.out.println(cars);
		
		// w3School implementation of the task:
		String[] car = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
	    Arrays.sort(car);
	    for (String i : car) {
	      System.out.println(i);
	    }
		
	}

}
