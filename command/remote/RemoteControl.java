package command.remote;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("\n------ Remote Control ------\n");
		for (int i = 0; i < onCommands.length; i++) {
			buff.append("[slot " + i + "] "
					+ onCommands[i].getClass().getName() + "    "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return buff.toString();
	}

}
