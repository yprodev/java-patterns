public class TurnTVOn implements Command {

	// TurnTVOn works on all ElectronicDevices
	ElectronicDevice theDevice;	

	public TurnTVOn(ElectronicDevice newDevice) {
		theDevice = newDevice;
	}

	public void execute() {
		theDevice.on();
	}
}
