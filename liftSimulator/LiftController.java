/*imports the java utility Scanner. It is used to get inputs from the user*/
import java.util.Scanner;
public class LiftController 
{
   private int currentFloor;
   private int liftFloor;
   private int floorDestination;
   /* The main method of the program */
   public void main(){
       LiftController newLiftController = new LiftController();
       Lift newLift = new Lift();
       Floor newFloor = new Floor();
       liftFloor = newLift.getLiftFloor();
       Button newButton = new Button();
       Scanner whichFloor = new Scanner (System.in);
       System.out.println("which floor are you in? 1,2,3,4?");
       while(!whichFloor.hasNextInt()) {
        whichFloor.next();
        System.out.println("please input integer");
        }
        currentFloor = whichFloor.nextInt();
        switch(currentFloor){
            case 0: currentFloor = 0;
            System.out.println("invalid floor number");
            break;
            case 1: currentFloor = 1;
            System.out.println("you are in the 1st floor");
            break;
            case 2: currentFloor = 2;
            System.out.println("you are in the 2nd floor");
            break;
            case 3: currentFloor = 3;
            System.out.println("you are in the 3rd floor");
            break;
            case 4: currentFloor = 4;
            System.out.println("you are in the 4th floor");
            break;
            case 5: if (currentFloor > 4){
                    System.out.println("invalid floor number");
                   }
            }
       if(liftFloor == currentFloor){
       liftWaiting();
       } else {
       callLift(); 
       }
       Scanner whichDestination = new Scanner (System.in);
       System.out.println("which floor do you want to go?");
       floorDestination = whichDestination.nextInt();
       if(floorDestination > currentFloor){
       moveUp();
       } else{
       moveDown();
       }
    }
   /* Moves the Lift up the floors */
    public void moveUp(){
     Lift lft1 = new Lift();
     liftFloor = lft1.getLiftFloor();
     Floor flr1 = new Floor();
     lft1.closeLiftDoor();
     while (liftFloor != floorDestination){
       liftFloor++;
       System.out.println("Lift is going up");
       System.out.println("Current Floor of the Lift is: " + liftFloor);
     }
     lft1.openLiftDoor();
   }
   /*Moves the lift down the floor*/
   public void moveDown(){
     Lift lft2 = new Lift();
     liftFloor = lft2.getLiftFloor();
     Floor flr2 = new Floor();
     while (liftFloor != floorDestination || liftFloor < 1){
        liftFloor--; 
        System.out.println("Lift is going down");
        System.out.println("Current Floor of the Lift is: " + liftFloor);
     }
     lft2.openLiftDoor();
   }
   /* Checks if the lift is at the same floor as the user, if so it opens the doors to the lift */
   public void liftWaiting(){
       Lift lft3 = new Lift();
       if (currentFloor == liftFloor){   
           System.out.println("The lift is currently waiting");
           lft3.openLiftDoor();
       }
   }
   /*Calls the lift if the lift isnt in the same floor as the user*/
   public void callLift(){
       if(liftFloor != currentFloor){
           moveUp();
       } else{
       moveDown();
       }
   }
   /*a method that returns currentFloor variable. It is created so it is easier to access if the variable is used in another class*/
   public int getCurrentFloor(){
    return currentFloor;
   }
   /*a method that returns floorDestination variable. It is created so it is easier to access if the variable is used in another class*/
   public int getFloorDestination(){
       return floorDestination;
   }
   /*a method that returns liftFloor variable. It is created so it is easier to access if the variable is used in another class*/
   public int getLiftFloor(){
       return liftFloor;
   }
}
