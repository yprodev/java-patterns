import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
	public static void main(String[] args) {
		ElectronicDevice newDevice = TVRemote.getDevice();

		TurnTVOn onCommand = new TurnTVOn(newDevice);
		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();

		/**
		 * --------------------------------------------
		 */

		TurnTVOff offCommand = new TurnTVOff(newDevice);
		DeviceButton offPressed = new DeviceButton(offCommand);
		offPressed.press();

		/**
		 * --------------------------------------------
		 */

		TurnTVUp volUpCommand = new TurnTVUp(newDevice);

		onPressed = new DeviceButton(volUpCommand);

		upPressed.press();
		upPressed.press();
		upPressed.press();

	}


}
