import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanF = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = scanF.nextInt();
			if (number % 2 == 0) {
				System.out.print("The number is Even.");
			} else {
				System.out.print("The number is Odd.");
			}
		}
	}

}
