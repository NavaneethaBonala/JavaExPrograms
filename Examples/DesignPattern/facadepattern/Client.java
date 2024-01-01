//package facadepattern;
//
////DVD Player
//class DVDPlayer {
// public void on() {
//     System.out.println("DVD Player is ON");
// }
//
// public void play(String movie) {
//     System.out.println("Playing movie: " + movie);
// }
//
// public void off() {
//     System.out.println("DVD Player is OFF");
// }
//}
//
////Amplifier
//class Amplifier {
// public void on() {
//     System.out.println("Amplifier is ON");
// }
//
// public void setSurroundSound() {
//     System.out.println("Surround sound is set");
// }
//
// public void off() {
//     System.out.println("Amplifier is OFF");
// }
//}
//
////Projector
//class Projector {
// public void on() {
//     System.out.println("Projector is ON");
// }
//
// public void setInput(DVDPlayer dvdPlayer) {
//     System.out.println("Setting projector input to DVD Player");
// }
//
// public void off() {
//     System.out.println("Projector is OFF");
// }
//}
//
////Screen
//class Screen {
// public void up() {
//     System.out.println("Screen is UP");
// }
//
// public void down() {
//     System.out.println("Screen is DOWN");
// }
//}
//
////Home Theater Facade
//class HomeTheaterFacade {
// private DVDPlayer dvdPlayer;
// private Amplifier amplifier;
// private Projector projector;
// private Screen screen;
//
// public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector, Screen screen) {
//     this.dvdPlayer = dvdPlayer;
//     this.amplifier = amplifier;
//     this.projector = projector;
//     this.screen = screen;
// }
//
// public void watchMovie(String movie) {
//     System.out.println("Get ready to watch a movie...");
//     screen.down();
//     projector.on();
//     projector.setInput(dvdPlayer);
//     amplifier.on();
//     amplifier.setSurroundSound();
//     dvdPlayer.on();
//     dvdPlayer.play(movie);
// }
//
// public void endMovie() {
//     System.out.println("Shutting down the home theater...");
//     screen.up();
//     projector.off();
//     amplifier.off();
//     dvdPlayer.off();
// }
//}
//
////Client
//public class Client {
// public static void main(String[] args) {
//     // Create components
//     DVDPlayer dvdPlayer = new DVDPlayer();
//     Amplifier amplifier = new Amplifier();
//     Projector projector = new Projector();
//     Screen screen = new Screen();
//
//     // Create facade
//     HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, amplifier, projector, screen);
//
//     // Watch a movie
//     homeTheater.watchMovie("Inception");
//
//     // End the movie
//     homeTheater.endMovie();
// }
//}
