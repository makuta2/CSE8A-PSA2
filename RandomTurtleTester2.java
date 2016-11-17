/* Filename: RandomTurtleTester.java 
* Created by: Nick Lin, cs8a and Robert Tso, cs8a
* Date: 10/14/16
*
* 1. and 2, Average final single-displacement for a random walker after making different number steps
* |  Number of Steps |                avg final displacement              |
* | 100 random steps |@ probability 0.1: 80| @ prob 0.5: 6| @ prob 0.9: 80|
* | 200 random steps |@ probability 0.1: 80| @ prob 0.5: 5| @ prob 0.9: 80|
* | 300 random steps |@ probability 0.1: 80| @ prob 0.5: 5| @ prob 0.9: 80|
* 
* 3 and 4 average squared displacement for a random walker after making different number steps
* |  Number of Steps |             avg squared displacement                       |
* | 100 random steps |@ probability 0.1: 6500| @ prob 0.5:65-506| @ prob 0.9: 6500| (@ prob 0.5, range was to far apart to give a confortable avg)
* | 200 random steps |@ probability 0.1:25850| @ prob 0.5:   310| @ prob 0.9:25850|
* | 300 random steps |@ probability 0.1:57900| @ prob 0.5:   750| @ prob 0.9:57900|                                 
* Average final single-dosplacement |||
*/ 

public class RandomTurtleTester2 {
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) { 
       World w= new World();
       //alpha with 50% probability gives average final signed displacement of 6
       /*Turtle alpha=new Turtle(w);
       int numTrials=0;
       int totalDisplacement=0;
       while (numTrials <100) {
         totalDisplacement=totalDisplacement+alpha.rwPositionPlain(100);
         numTrials=numTrials+1;
       }
       int averageDisplacementa=totalDisplacement/100;
       System.out.println(averageDisplacementa);*/
       
       
       //bravo with 10% probabilty gives average signed displacement of 80
       /*Turtle bravo=new Turtle(w);
       int numTrials=0;
       int totalDisplacement=0;
       while (numTrials <100) {
         totalDisplacement=totalDisplacement+bravo.rwPositionten(100);
         numTrials=numTrials+1;
       }
       int averageDisplacementa=totalDisplacement/100;
       System.out.println(averageDisplacementa);*/
       
       //charlie with 90% probabilty gives average signed displacement of 80
      /* Turtle charlie=new Turtle(w);
       int numTrials=0;
       int totalDisplacement=0;
       while (numTrials <100) {
         totalDisplacement=totalDisplacement+charlie.rwPositionnine(100);
         numTrials=numTrials+1;
       }
       int averageDisplacementa=totalDisplacement/100;
       System.out.println(averageDisplacementa);*/
       
      
       /*Turtle delta=new Turtle(w);
       int numTrials=0;
       int totalDisplacement=0;
       while (numTrials <100) {
         totalDisplacement=totalDisplacement+delta.rwPositionPlain(300);
         numTrials=numTrials+1;
       }
       int averageDisplacementa=totalDisplacement/300;
       System.out.println(averageDisplacementa);
       */
       
       Turtle alpha=new Turtle(w);
       int numTrials=0;
       int totalDisplacement=0;
       int steps=100;
       while (numTrials <steps) {
         totalDisplacement=totalDisplacement+(alpha.rwPositionnine(steps)*alpha.rwPositionnine(steps));
         numTrials=numTrials+1;
       }
       
       int averageDisplacementa=totalDisplacement/steps;
       System.out.println(averageDisplacementa);
       
       
       
    
}
}

