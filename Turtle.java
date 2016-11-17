/* Filename: RandomTurtleTester.java 
* Created by: Nick Lin, cs8a and Robert Tso, cs8a
* Date: 10/14/16
* 
*Methods:
*getRandomStep(double probabilityToLeft): flips a coin and gives 1 or -1 based on result
*countStep(int maxDisplacement): counts number of time a turtle moves randomly until it hits a given border
*takeStep(int direction):makes turtle turn 45 degrees left or right based on the coin flip, moves 10 units forward, and turns it back.
*rwPosition(int nSteps): makes turtle move randomly based on steps given
*rwPositionPlain(int nSteps): tells how far a turtle moves with using number of steps based on a coinflip
*rwPositionten(int nSteps): tells how far a turtle moves with using number of steps based on a rigged coinflip
*rwPositionnine(int nSteps):tells how far a turtle moves with using number of steps based on a rigged coinflip
*/ 
import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 * <p>
 * Copyright Georgia Institute of Technology 2004
 *
 * @author Barb Ericson ericson@cc.gatech.edu
 *         <p>
 *         <p>
 *         Filename: Turtle.java
 *         Created by: Shuaiqi Xia, cs8a1 and Tony Xia, cs8a2
 *         Date:
 */

public class Turtle extends SimpleTurtle {
    ////////////////// constructors ///////////////////////

    /**
     * Constructor that takes the x and y and a picture to
     * draw on
     *
     * @param x       the starting x position
     * @param y       the starting y position
     * @param picture the picture to draw on
     */
    public Turtle(int x, int y, Picture picture) {
        // let the parent constructor handle it
        super(x, y, picture);
    }

    /**
     * Constructor that takes the x and y and a model
     * display to draw it on
     *
     * @param x              the starting x position
     * @param y              the starting y position
     * @param modelDisplayer the thing that displays the model
     */
    public Turtle(int x, int y,
                  ModelDisplay modelDisplayer) {
        // let the parent constructor handle it
        super(x, y, modelDisplayer);
    }

    /**
     * Constructor that takes the model display
     *
     * @param modelDisplay the thing that displays the model
     */
    public Turtle(ModelDisplay modelDisplay) {
        // let the parent constructor handle it
        super(modelDisplay);
    }

    /**
     * Constructor that takes a picture to draw on
     *
     * @param p the picture to draw on
     */
    public Turtle(Picture p) {
        // let the parent constructor handle it
        super(p);
    }

    /////////////////// methods ///////////////////////


    /**
     * Return whether or not the turtle should take a step to the left (-1)
     * or the right (+1)
     * Input: probabilityToLeft, the probability the tutle moving left. Should between 0-1.
     * Returns: -1 to represent a step to the left, 1 to represent a
     * step to the right.
     */
   
    public int getRandomStep(double probabilityToLeft) {
        Random numGenerator = new Random();
        // Choose either 0 or 1 (note that next int is NON inclusive 
        // of its argument).
        double choice = numGenerator.nextDouble();
        //System.out.println(choice);
        if (choice < probabilityToLeft) {
          return -1;
        } else {
          return 1;
        }
     
    }

    public static void main(String[] args) {
        World earth = new World();
        Turtle t1 = new Turtle(earth);
    }
    

 public void takeStep(int direction) {
        //System.out.println(getRandomStep(0.5));
        int x=direction*45;
        turn(x);
        forward(10);
        turn(-x);
    }
 

 public int rwPosition(int nSteps) {
   int x=0;
   //x is the displacement of the length wise distance from the origin to the final value
   for (int i=0; i<=nSteps;i++) {
      int y=getRandomStep(0.5);
      takeStep(y);
      x=x+y;     
      }
    System.out.println(x);
    return x;
 }
 

 public int rwPositionPlain(int nSteps) {
   int x=0;
   for (int i=0; i<=nSteps;i++) {
      int y=getRandomStep(0.5);
      x=x+y;     
      }
    return Math.abs(x);
 }
 

 public int rwPositionten(int nSteps){
   int x=0;
   for (int i=0; i<=nSteps;i++) {
      int y=getRandomStep(0.1);
      x=x+y;     
      }
    return Math.abs(x);
 }
 

  public int rwPositionnine(int nSteps){
   int x=0;
   for (int i=0; i<=nSteps;i++) {
      int y=getRandomStep(0.9);
      x=x+y;     
      }
    return Math.abs(x);
 }
 

 public int countStep(int maxDisplacement) {
   int i=0;
   //i is displacement
   int count=0;
   //z is step counts
   while(Math.abs(i)<maxDisplacement) {
      int y=getRandomStep(0.5);
      takeStep(y);
      i=i+y;
      count++;
      }
   System.out.println(count);
   return count;
   }
} // this } is the end of class Turtle, put all new methods before this
   
