package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  CKuiken
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        //This method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
        turnRight();
        moveThree();
        putBeeper();
        returnKarrelStartPosition();
    }
     public void returnKarrelStartPosition() {
        turnAround();
        moveThree();
        turnRight();
     
    }
    public void pickAndMoveBeeper() {
        //This method is for carl to pick up the beeper from karel and move it two blocks north
        pickBeeper();
        turnLeft();
        moveTwo();
        putBeeper();
        returnCarlStartPosition();
        
    }
    public void returnCarlStartPosition() {
        turnAround();
        moveTwo();
        turnAround();
     
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();  
    } public void moveThree() {
       move();
       move();
       move();
    } 
    public void moveTwo() {
        move();
        move();
    }
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
}