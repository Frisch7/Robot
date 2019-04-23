//Robot Class, Contains all comands for the robot
package robotController;

import static java.lang.Math.sqrt;

public class Robot {
private String name = "Robot";
private int xPosition = 0, yPosition = 0;
private String direction = "north";

   // creats a new robot
   public void Robot(){
       name = "Robot";
       xPosition = 0;
       yPosition = 0;
       direction = "north";
       
   }
   
   // creates a new robot at x and y location
   public void Robot(int x, int y){
       name = "Robot";
       xPosition = x;
       yPosition = y;
       direction = "north";
   }
   
   // creates a new robot with the input name at location 0,0
   public void Robot(String robotName){
       name = robotName;
       xPosition = 0;
       yPosition = 0;
       direction = "north";
       
   }
   
   public int getXPosition(){
       return xPosition;
   }
   public int getYPosition(){
       return yPosition;
   } 
   public String getName(){
       return name;
   }
   public String getDirection(){
       return direction;
   }
   public void setXPosition(int x){
       xPosition = x;
   }
   public void setYPosition(int y){
       yPosition = y;
   }
   
   //calculates the distance between 2 robots using the standard difference between
   //two points formula
   public void distanceTo(Robot r){
       String enemyRobotName = r.getName();
       int enemyRobotXPosition = r.getXPosition();
       int enemyRobotYPosition = r.getYPosition();
       
       int a = (enemyRobotYPosition-yPosition)*(enemyRobotYPosition-yPosition);
       int b = (enemyRobotXPosition-xPosition)*(enemyRobotXPosition-xPosition);
       
       double distanceApart = sqrt(a+b);
       System.out.println(name +" is " +distanceApart +" units away from " +enemyRobotName);
       
   }
   
   //sets robot name
   public void setName(String robotName){
       name = robotName;
       System.out.println("My name is "+name);
   }
   
   //sets robot direction
   public void setDirection(String d){
       direction = d;
   }
   
   //moves the robot forward "f" amount of units
   public void forward(int f){
       switch(direction.toLowerCase()){
           case "north": yPosition+=f;
                         break;
           case "east":  xPosition+=f;
                         break;
           case "south": yPosition-=f;
                         break;
           case "west":  xPosition-=f;
                         break;
           default:      System.out.println("facing invalid direction");
                         break;
       }
       
       System.out.println(name + " moved forward " +f);
   }
   
   //makes the robot turn 90 degrees clockwise
   public void turnRight(){
       int d=0, newDirection = 0;
       
       //convert string direction to int value
       switch(direction){
           case "north": d=0;
                         break;
           case "east":  d=1;
                         break;
           case "south": d=2;
                         break;
           case "west":  d=3;
                         break;
           default:      System.out.println("facing invalid direction");
                         break;
       }
       
       //change direction by adding 1 and taking the remainder
       d++;
       newDirection = d%4;
       
       // change number direction back to string value
       switch(newDirection){
           case 0: direction = "north";
                   break;
           case 1: direction = "east";
                   break;
           case 2: direction = "south";
                   break;
           case 3: direction = "west";
                   break;
           default:System.out.println("Error changing direction");
       }
       //print final facing direction
       System.out.println(name +" is now facing " +direction);
       
       
   }

   // sends the report of the name of the robot, xposition, yposition and facing direction
   @Override
   public String toString(){
       
       return (name+ " is at ("+yPosition +", "+xPosition +") facing " +direction);
       
       
   }
}
