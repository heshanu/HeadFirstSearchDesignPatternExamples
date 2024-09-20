package facadePattern;

public class FacadeClient {

	public static void main(String[] args) {
		  DVDPlayer dvdPlayer = new DVDPlayer();
	        Amplifier amplifier = new Amplifier();
	        Projector projector = new Projector();
	        Screen screen = new Screen();

	        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, amplifier, projector, screen);
	        homeTheater.watchMovie("Interstellar");
	        homeTheater.endMovie();

	}

}
