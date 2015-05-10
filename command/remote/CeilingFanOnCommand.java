package command.remote;

public class CeilingFanOnCommand implements Command {
	
	CeilingFan ceilingFan;
	
	CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		ceilingFan.high();
	}
}