import java.util.Arrays;

public class SmallestElementInArray {

	static int Sorter(int[] arry) {
		Arrays.sort(arry);
		return arry[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {20, 22, 18, 35, 48, 26, 87, 70};
		int smallestElement = Sorter(numbers);
		
		System.out.println("Smallest Element: " + smallestElement);
	}

}
