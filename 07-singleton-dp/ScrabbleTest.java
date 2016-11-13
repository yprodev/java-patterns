import java.util.LinkedList;

public class ScrabbleTest {
	public static void main(String[] args) {
		Singleton newInstance = Singleton.getInstance();

		System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1 tiles: " + playerOneTiles);

		//Printing out changes letter list
		System.out.println(newInstance.getLetterList());

		// Creating new Instance
		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));

		//Printing out changes letter list
		System.out.println(newInstance.getLetterList());

		LinkedList<String> playerTwoTiles = newInstance.getTiles(3);
		System.out.println("Player 2 tiles: " + playerTwoTiles);
	}
}
