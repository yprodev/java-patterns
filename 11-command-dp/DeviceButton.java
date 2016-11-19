// This is the invoker
public class DeviceButton {
	Command theCommand;

	public DeviceButton(Command newCommand) {
		theCommand = newCommand;
	}

	public void press() {
		// The Invoker DeviceButton knows nothing
		// It does not know what device or command is being used
		theCommand.execute();
	}

	public void pressUndo() {
		theCommand.undo();
	}

}
