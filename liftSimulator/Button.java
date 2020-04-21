public class Button 
{
  private int liftFloor;
  private int currentFloor;
  /*Constructor for Button*/
  public Button(){  
  }
  /*method for calling the Lift*/
    public int callLift(){
        LiftController lc = new LiftController();
        currentFloor = lc.getCurrentFloor();
        Lift lf1 = new Lift();
        liftFloor = lf1.getLiftFloor();
      if(currentFloor < liftFloor){
         lc.moveUp();
      }
      else if(currentFloor > liftFloor){
         lc.moveDown();       
      }
    System.out.println("Lift has arrived in current floor");
    return liftFloor;
  }
  /*method for the floor buttons*/
  public void floorButton(){
      Floor fl = new Floor();
    if (currentFloor > 0 && currentFloor == 4){
        System.out.println("");
        callLift();
        fl.floorDoorOpen();
        }
        else if (currentFloor == 4){
        System.out.println("");
        callLift();
        fl.floorDoorOpen();
        } 
  }    
  /*method for the buttons on the lift*/
  public int liftButton(int floorDestination){
    if(floorDestination != 0 && floorDestination > 5){
        while (liftFloor != floorDestination){
            System.out.println("Current Floor of lift is: " + liftFloor);
            liftFloor++;
        }
    }
    return floorDestination;
  }
}