public class TurnTVOff implements Command {

	// TurnTVOn works on all ElectronicDevices
	ElectronicDevice theDevice;	

	public TurnTVOff(ElectronicDevice newDevice) {
		theDevice = newDevice;
	}

	public void execute() {
		theDevice.off();
	}

	public void undo() {
		theDevice.on();
	}

}
