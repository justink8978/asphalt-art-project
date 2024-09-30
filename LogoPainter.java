import org.code.neighborhood.*;
public class LogoPainter extends PainterPlus {
/*
The following code paints the Pokemon logo
*/
  public void paintLogo() {
if (canMove()) {
    turnRight();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
}
    if (canMove()) {
      paintLine("red", 5);
      turnRight();
      move();
      turnRight();
      paintLine("red", 7);
      turnLeft();
      move();
    turnLeft();
      move();
      paintLine("red", 7);
      turnRight();
      move();
      turnRight();
      move();
      paintLine("red", 7);
      turnLeft();
      move();
    turnLeft();
      move();
      paintLine("black", 7);
      turnRight();
      move();
      turnRight();
      move();
      paintLine("white", 7);
       turnLeft();
      move();
    turnLeft();
      move();
      paintLine("white", 7);
      turnRight();
      move();
      turnRight();
      move();
      move();
      paintLine("white", 5);
    }

  
   }
 
  }

















  
