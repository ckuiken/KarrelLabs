package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  CKuiken
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        goAroundFirstBeeper();
        goAroundSecondBeeper();
        goAroundFirstBeeperSecondTime();
    }
     public void goAroundFirstBeeper() {
        turnRight();
        move();
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
    }
    public void goAroundSecondBeeper() {
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
    
    }
    public void goAroundFirstBeeperSecondTime() {
        turnRight();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
        move();
        turnLeft();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveTwo() {
        move();
        move();
        
    } public void moveThree() {
        move();
        move();
        move();
    }
}