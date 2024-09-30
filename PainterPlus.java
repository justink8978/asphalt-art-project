import org.code.neighborhood.*;

public class PainterPlus extends Painter {
/*
Turns the PainterPlus object to the right
*/
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
/*
Takes all the paint
*/
  public void takeAllPaint() {
   while(isOnBucket()) 
     takePaint();
  }
/*
Paints a straight line
*/
 public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }
/*
Makes the painter do a 180
*/
   public void turnAround() {
    turnLeft();
    turnLeft();
  }
}