/*imports the java utility Scanner. It is used to get inputs from the user*/
import java.util.Scanner;
public class Lift 
{
   private int liftFloor;
   private boolean liftDoor;
   /*The constructor for the Lift Class*/
   public Lift(){ 
       liftFloor = 1;
       liftDoor = false;
   }
   /*the method for opening the door of the lift. It is connected to the floorDoorOpen method so both door open at the same time when called*/
   public boolean openLiftDoor(){
     Floor f1 = new Floor();
     liftDoor = true;
     System.out.println("Lift door is opened");
     f1.floorDoorOpen();
     return true;
   }
   /*the method for closing the door of the lift. It is connected to the floorDoorClosed method so both door open at the same time when called*/
   public boolean closeLiftDoor(){
      Floor f2 = new Floor();
      liftDoor = true;
      System.out.println("Lift door is closed");
      f2.floorDoorClose();
      return true;
   }
   /*a method that returns liftFloor variable. It is created so it is easier to access if the variable is used in another class*/
   public int getLiftFloor(){
       return liftFloor;
   }
   /*a method that returns liftDoor variable. It is created so it is easier to access if the variable is used in another class*/
   public boolean getLiftDoor(){
       return liftDoor;
    }
}
