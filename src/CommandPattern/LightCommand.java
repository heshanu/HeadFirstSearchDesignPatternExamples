package CommandPattern;

public class LightCommand implements Command{
	
	Light light;
	
	//dependecy injection
	public LightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void undo() {
		light.turnOff();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		light.turnOn();
	}

}
