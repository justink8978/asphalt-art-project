import org.code.neighborhood.*;
/*
Paints the background
  */
public class BackgroundPainter extends PainterPlus{
 public void paintBackround(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  paintBackgroundPattern();
   
  }  
   public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
   public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }
  public void paintBackgroundPattern() {
       turnRight();
    turnRight();
    while (canMove()){
      move();
    }
      turnLeft();
     while (canMove()){
      move();
    }
    turnRight();
    turnRight();

    setPaint(256);

    
  }
   




    
  }




  
