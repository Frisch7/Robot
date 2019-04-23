
package robotController;

import java.util.Scanner;

public class RobotController {
    
    public static void main(String[] args) {
        //initilize variables and create a new robot
        boolean programRunning = true;
        Robot r = new Robot();
        Scanner input = new Scanner(System.in);
        String command, name;
        int distance;
        System.out.println("Input:");
        
        //loop of robot controller, it will stop when the user issues command "e"
        while(programRunning == true){
        
        //get command from user
        command = input.next();
        
        //match the issued command with the instructions for what needs to be done
        switch(command){
            case "f":  //Moves the robot forward how ever many units the user inputs
                       distance = input.nextInt();
                       r.forward(distance);
                       break;
            case "n":  //changes the robots name to the users input
                       name = input.next();
                       r.setName(name);
                       break;
            case "t":  //Turns the robot right 90 degrees
                       r.turnRight();
                       break;
            case "r":  //Gets the current report for the robot(name, location, direction)
                       System.out.println(r.toString());
                       break;
            case "e":  //Ends the program
                       System.out.println("Program Ended Sucessfully");
                       programRunning = false;
                       break;    
            default:   //occures when command issued is not reconized
                       System.out.println("the command was not reconized");
                       break;
        }
        }
        
    }
}
