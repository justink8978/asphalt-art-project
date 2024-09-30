import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
/*
Instantiates the two painters
*/
    LogoPainter lp = new LogoPainter();
    BackgroundPainter bp = new BackgroundPainter();
/*
Paints the background blue
*/
    bp.paintBackround("blue", 17);
/*
Paints the Pokemon logo
*/
    lp.paintLogo();
  }
}