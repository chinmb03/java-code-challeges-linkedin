import java.util.*;

public class DoubleOrNothing {
	public static int startingpoint = 10;
	private Scanner sc = new Scanner(System.in);
	private Random r = new Random();
	private int currentPoint = startingpoint;
	boolean isPlaying = true;

	public void playGame() {
		System.out.println("welcome to the dbouble or nothing game with "+startingpoint);
		wantToContinue();
		while (isPlaying) {							
			if (isDboule()) {
				doubleCurrentPoint();
				congrats();
				wantToContinue();
			}else
			{	isPlaying=false;
				
			}
		}goodbye();
	}

	public void goodbye() {
		System.out.println("you lost the game ,thanks for playing dobule or nothing game");
	}

	private boolean isDboule() {
		return this.r.nextInt(2) == 0;
	}

	public void doubleCurrentPoint() {
		currentPoint= 2 * this.currentPoint;
	}

	public void congrats() {
		System.out.println("congrats you won this round ..you currntPoint is "+currentPoint);
	}

	public boolean wantToContinue() {
		System.out.println("you want to continue this game ?");
		isPlaying = sc.nextLine().equalsIgnoreCase("YES");
		return isPlaying;
	}
}