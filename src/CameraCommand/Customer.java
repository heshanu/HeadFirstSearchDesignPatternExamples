package CameraCommand;
import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter something (type 'no' to stop):");
    	System.out.println("Enter your choice");
		System.out.println("======Press 1 to turn left");
		System.out.println("======Press 2 to turn right");
		System.out.println("======Press 3 to undo action");
		System.out.println("Enter something else (type 'no' to stop):");
        
		while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("no")) {
                break;
            }
           
			//create a camera object
			Camera camera=new Camera();
			
			//create camera command to it
			Command cameraToLeft=new CameraTurnLeft(camera);
			Command cameraToRight=new CameraTurnRight(camera);
			
			CommandUndo cameraUndo=new CameraUndo(camera);
			
			//create a remote controller
			RemoteController remoteLeftController=new RemoteController();
			RemoteController remoteRightController=new RemoteController();
			
			//set 
			remoteLeftController.setCommand(cameraToLeft);
			//press button to turn camera to left
					
			//set
			remoteLeftController.setUndoCommand(cameraUndo);
			//press button to undo turn left action
			remoteRightController.setCommand(cameraToRight);
			remoteRightController.setUndoCommand(cameraUndo);
			
		
			if (input.equals("1"))  remoteLeftController.pressButtonToExecute();
			else if (input.equals("2")) remoteRightController.pressButtonToExecute();
			else if (input.equals("3")) {remoteLeftController.pressButtonToUndo();remoteRightController.pressButtonToUndo();} 
			else System.out.println("===end of Camera process");
			 
			//customer can see only two option
			//1.pressButtonToExecute and pressButtonToUndo
			//we can use this invoker to any objects and program above method to any action
			// to perform
			
			/*======================================================================================*/
			
			//apply this command design pattern to fan object
			Fan fan=new Fan();
			Command fanCommand=new FanCommandOnOff(fan);
			remoteLeftController.setCommand(fanCommand);
			//remote.setUndoCommand(fanCommand);
			
			//remote.pressButtonToExecute();
			//remote.pressButtonToUndo();

           // System.out.println("You entered: " + input);
            //System.out.println("Enter something else (type 'no' to stop):");
        }

        System.out.println("Camera stopped.");
        scanner.close();
		
		}		
	}


