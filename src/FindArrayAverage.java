
public class FindArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {20, 22, 18, 35, 48, 26, 87, 70};
		float sum = 0;
		for (int i: numbers) {
			sum += i;
		}
		int len = numbers.length;
		float average = sum/len;
		
		System.out.println("Average: " + average);
	}

}
