enum Level {
			LOW,
			MEDIUM,
			HIGH
}
public class LoopThroughEnum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Level i: Level.values()) {
			System.out.println(i);
		}
	}

}
