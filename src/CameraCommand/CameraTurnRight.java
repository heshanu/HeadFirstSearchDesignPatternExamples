package CameraCommand;

public class CameraTurnRight implements Command{
	Camera camera;
	
	public CameraTurnRight(Camera camera) {
		this.camera=camera;
	}

	@Override
	public void execute() {
		camera.turnRight();
		
		
	}

}
