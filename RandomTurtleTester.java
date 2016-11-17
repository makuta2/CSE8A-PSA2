/* Filename: RandomTurtleTester.java 
* Created by: Nick Lin, cs8a and Robert Tso, cs8a2
* Date: 10/14/16
*/ 
public class RandomTurtleTester {
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) { 
      
     //creates a world with size 500x500
       World w= new World(500,500);
     //creates a turtle called james at the bottom middle of the world
       Turtle james=new Turtle(250,500,w); 
     //tells james to count the number of time it moves randomly until it hits a given border
       james.countStep(10);
       }
     
}

