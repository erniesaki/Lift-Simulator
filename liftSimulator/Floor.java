/*imports the java utility Scanner. It is used to get inputs from the user*/
import java.util.Scanner;
public class Floor 
{
  private boolean floorDoor; 
  private int floorDestination;
  /*The constructor for the Floor Class*/
  public Floor(){
      floorDestination = 1;
  }
  /*the method for opening the door of the lift in a floor of a building. It is connected to the openLiftDoor method so both door open at the same time when called*/
  public void floorDoorOpen(){
    floorDoor=true;
    System.out.println("floor door is opened");
  }
  /*the method for closing the door of the lift in a floor of a building. It is connected to the closeLiftDoor method so both door open at the same time when called*/
  public void floorDoorClose(){
    floorDoor = false;
    System.out.println("floor door is closed");
  }
}
