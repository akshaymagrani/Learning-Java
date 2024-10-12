import java.util.HashMap;

public class LoopThroughHaspMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> cars = new HashMap<String, Integer>();
		cars.put("Toyota", 1978);
		cars.put("Mercedes", 1958);
		cars.put("Volvo", 1975);
		
		for (String i: cars.keySet()) {
			System.out.println("keys: " + i + "| Values: " + cars.get(i));
		}
	}

}
