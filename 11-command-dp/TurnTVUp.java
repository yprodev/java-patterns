public class TurnTVUp implements Command {

	// TurnTVOn works on all ElectronicDevices
	ElectronicDevice theDevice;	

	public TurnTVUp(ElectronicDevice newDevice) {
		theDevice = newDevice;
	}

	public void execute() {
		theDevice.volumeUp();
	}
}
