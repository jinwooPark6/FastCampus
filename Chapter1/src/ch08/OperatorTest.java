package ch08;

public class OperatorTest {
	public static void main(String[] args) {
		
		int gameScore = 150;
		int lastScore = gameScore++;
		
		int myNum = 100;
		int yourNum = --myNum;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		System.out.println(myNum);
		System.out.println(yourNum);
	}

}
