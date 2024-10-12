import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner scanF = new Scanner(System.in)) {
					System.out.print("Enter a number: ");
					int number = scanF.nextInt();
					if (number < 0) {
						System.out.print("The number is Negative.");
					} else {
						System.out.print("The number is Positive.");
					}
				}
			}
	}
