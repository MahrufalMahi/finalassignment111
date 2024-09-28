package Assignment9;

public class Vehicle2010 extends Vehicle {
   public Vehicle2010(){

    super();
   }

   public void moveLowerLeft(){

    this.x--;
    this.y--;
   }
   public void moveUpperRight(){
    this.x++;
    this.y++;
   }
   public void moveLowerRight(){
    this.x++;
    this.y--;
   }
}
