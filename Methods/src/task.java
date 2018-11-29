
public class task {

	public static void main(String[] args) {
		int highScorePosition=calculateHighScorePosition(1500);
		displayHighScorePosition("mike", highScorePosition);
		displayHighScorePosition("smith", calculateHighScorePosition(900));
		displayHighScorePosition("anna", calculateHighScorePosition(400));
	}
	public static void displayHighScorePosition(String playerName,int highScorePosition) {
		System.out.println(playerName+" managed to get into position "+highScorePosition+" on the high score table");
	}
	public static int calculateHighScorePosition(int playerScroe) {
		if(playerScroe>=1000) {
			return 1;
		}else if(playerScroe>=500 && playerScroe<1000){
			return 2;
		}else if (playerScroe>=100&&playerScroe<500) {
			return 3;
		}else {
			return 4;
		}
		
		}
	}


