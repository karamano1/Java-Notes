

public class calculateScore {



	public static void main(String[] args) {
		int newScore = calculateScore("mike",500);
		System.out.println("New Score is "+newScore);
		calculateScore(75);
		calculateScore();
		

	}
	public static int calculateScore(String playerName,int score) {
		System.out.println("Player "+ playerName+" scored "+ score+ " points");
		return score*100;
	}
	public static int calculateScore(int score) {
		System.out.println("unnamed Player Scored "+ score + " points");
		return score * 100;
	}
	public static void calculateScore() {
		System.out.println("No Player Name, No player Score");
	}
	

}
