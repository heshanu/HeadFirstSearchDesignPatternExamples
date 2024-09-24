package CommandPattern;

public class Customer {
	public static void main(String[] args) {
		// Reciver
		Light light = new Light();

		LightCommand lc = new LightCommand(light);

		RemoteController rc = new RemoteController();
		rc.stCommand(lc);
		rc.pressOnButton();
		rc.pressOffButton();
	}
}
