package CameraCommand;

public class RemoteController {
	private Command command;
	private CommandUndo undoCommand;
	
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void setUndoCommand(CommandUndo undo) {
		this.undoCommand=undo;
	}
	
	void pressButtonToExecute() {
		command.execute(); //camera will turn to left
	}
	
	void pressButtonToUndo() {
		undoCommand.undoExecute(); //camera will undo position
	}
}
