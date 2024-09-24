package CommandPattern;

public class RemoteController {
	private Command command;
	public void stCommand(Command command) {
		this.command=command;
	}
	
	void pressOnButton() {
		command.excute();
	}
	
	void pressOffButton() {
		command.undo();
	}
}
