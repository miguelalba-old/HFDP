package command.simpleremote;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		// Create objects
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();

		// Create commands
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		// Create remote
		SimpleRemoteControl remote = new SimpleRemoteControl();
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}