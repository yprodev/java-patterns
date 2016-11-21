public class TestTheRemote {
	public static void main(String[] args) {
		RemoteButton theTV = new TVRemoteMute(new TVDevice(1,200));
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1,200));
		// Create your own classes
		// RemoteButton theDVD = new DVDRemote(new DVDDevice(1,14));

		System.out.println("Test TV with mute");

		theTV.buttonFivePressed();
		theTV.buttonSixPressed();
		theTV.buttonNinePressed();

		System.out.println("\nTest TV with pause");
		theTV2.buttonFivePressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonNinePressed();
		theTV2.deviceFeedback();

	}
}
