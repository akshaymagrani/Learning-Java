import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanF = new Scanner(System.in)) {
			System.out.print("Enter Sentence");
			String sentence = scanF.nextLine();
			String reverseSentence = "";
			
			for (int i = 0; i < sentence.length(); i++) {
				reverseSentence = sentence.charAt(i) + reverseSentence;
			}
			
			System.out.print("Reverse Sentence" + reverseSentence);
		}
	}

}
