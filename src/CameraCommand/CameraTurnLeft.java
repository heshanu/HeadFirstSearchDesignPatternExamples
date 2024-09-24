package CameraCommand;

public class CameraTurnLeft implements Command {
	Camera camera;
	
	public CameraTurnLeft(Camera camera) {
		this.camera=camera;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() {
		camera.turnLeft();
	}

}
