package facadePattern;

public class HomeTheaterFacade {
	 private DVDPlayer dvdPlayer;
	    private Amplifier amplifier;
	    private Projector projector;
	    private Screen screen;

	    public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector, Screen screen) {
	        this.dvdPlayer = dvdPlayer;
	        this.amplifier = amplifier;
	        this.projector = projector;
	        this.screen = screen;
	    }

	    public void watchMovie(String movie) {
	        System.out.println("Get ready to watch " + movie);
	        dvdPlayer.on();
	        amplifier.on();
	        amplifier.setDVD(dvdPlayer);
	        amplifier.setVolume(5);
	        projector.on();
	        projector.wideScreenMode();
	        screen.down();
	        dvdPlayer.play();
	    }

	    public void endMovie() {
	        System.out.println("Shutting down the home theater...");
	        screen.up();
	        projector.off();
	        amplifier.off();
	        dvdPlayer.off();
	    }
}
