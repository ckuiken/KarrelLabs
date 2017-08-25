package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  CKuiken
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        findBeepers();
        pickupBeepers();
        reposition();
        putdownBeepers();
        returntofinalPosition();
        
        
    }
    public void moveTwo() {
        move();
        move();
    }
    public void moveThree() {
        move();
        move();
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void flipAround() {
        turnLeft();
        turnLeft();
    }
    public void pickthreeBeeper() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void picktwoBeeper() {
        pickBeeper();
        move();
        pickBeeper();
        
    }public void putdownBeepers() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void findBeepers() {
        moveTwo();
        turnLeft();
    } 
    public void pickupBeepers() {
        pickthreeBeeper();
        flipAround();
        moveThree();
        picktwoBeeper();
    }public void reposition() {
        flipAround();
        moveTwo();
        turnRight();
        moveTwo();
        flipAround();
    } public void returntofinalPosition() {
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
        
    } 
}