package command.party;

public class LivingroomLightOnCommand {
	Light light;
	
	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}
	
	public void undo() {
		light.off();
	}
}