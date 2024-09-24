package CameraCommand;

public class CameraUndo implements CommandUndo {
	Camera camera;
	CameraUndo(Camera camera){
		this.camera=camera;
	}
	
	@Override
	public void undoExecute() {
		// TODO Auto-generated method stub
		camera.turnUndo();
	}

}
