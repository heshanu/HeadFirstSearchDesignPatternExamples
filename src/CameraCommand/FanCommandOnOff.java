package CameraCommand;

public class FanCommandOnOff implements Command,CommandUndo{
	Fan fan;
	
	FanCommandOnOff(Fan fan){
		this.fan=fan;
	}

	@Override
	public void undoExecute() {
		fan.turnOff();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.turnOn();
	}

}
