import java.util.Scanner;

public class Sum {
	
	public void Sumation() {
		try (Scanner scanF = new Scanner(System.in)) {
			System.out.println("First Number: ");
			int number1 = scanF.nextInt();

			System.out.println("Second Number: ");
			int number2 = scanF.nextInt();
			
			int sum = number1 + number2;
			System.out.println("Sum: " + sum);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum myObj = new Sum();
		myObj.Sumation();
	}

}
