import java.util.Scanner;

public class AreaOfRect {

	public static void main(String[] args) {
		try (Scanner scanF = new Scanner(System.in)) 
		{
			System.out.print("Length: ");
			int length = scanF.nextInt();
			System.out.print("Breadth: ");
			int breadth = scanF.nextInt();
			int area = length * breadth;
			System.out.println("Area: " + area);
		}
	}

}
