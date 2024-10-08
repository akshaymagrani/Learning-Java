import java.util.Scanner;

public class LengthOfSentence {

	public static void main(String[] args) {
		try (Scanner scanF = new Scanner(System.in)) 
		{
			System.out.print("Enter Sentence: ");
			String sentence = scanF.nextLine();
			
			int numberOfWords = sentence.split("\\s").length;
			System.out.print("No of Words in your sentence: " + numberOfWords);
		}
	}

}
