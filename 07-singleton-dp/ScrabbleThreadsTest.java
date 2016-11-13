public class ScrabbleThreadsTest {
	public static void main (String[] args) {
		// Need to review threads tutorial
		Runnable getTiles = new GetTheTiles();

		Runnable getTilesAgain = new GetTheTiles();

		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
	}
}
