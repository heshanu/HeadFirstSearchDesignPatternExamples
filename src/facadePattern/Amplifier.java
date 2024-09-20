package facadePattern;

public class Amplifier {
	void on() {
        System.out.println("Amplifier is on");
    }

    void setDVD(DVDPlayer dvd) {
        System.out.println("Amplifier is set to DVD Player");
    }

    void setVolume(int volume) {
        System.out.println("Amplifier volume set to " + volume);
    }

    void off() {
        System.out.println("Amplifier is off");
    }
}
