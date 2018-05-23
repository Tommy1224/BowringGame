
public class BowringGame {

	int scoreOld = 0;
	int scoreTotal;
	int number = 0;
	boolean flag = false;



	public void shot(int scoreNow) {
		number++;
		scoreTotal = scoreTotal + scoreNow;

		if (flag) {
			scoreTotal = scoreTotal + scoreNow;
			flag = false;
		}

		if (number == 21) {
			scoreTotal = scoreTotal - scoreNow;
		}

		flag = (number%2==0)&&(scoreOld + scoreNow == 10);
//		if (number%2==0) {
//			if (scoreOld + scoreNow == 10) {
//				flag = true;
//			}
//		}



		scoreOld = scoreNow;

	}

	public int getScore() {
		return scoreTotal;
	}

}
