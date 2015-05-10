package command.remote;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		// Create receivers
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Front");
		Stereo stereo = new Stereo("Living Room");

		// Create light commands
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		// Create ceiling fan commands
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		// Create garage door commands
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		// Create stereo commands
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		// bind commands
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
		
		System.out.println(remoteControl);
		for (int i = 0; i < 5; i++) {
			remoteControl.onButtonWasPushed(i);
			remoteControl.offButtonWasPushed(i);
		}
	}
}