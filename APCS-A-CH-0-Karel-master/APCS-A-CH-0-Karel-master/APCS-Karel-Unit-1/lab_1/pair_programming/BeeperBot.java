package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  C. Kuiken
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        flip();
        movetwo();
        pickBeeper();
        movethree();
        pickBeeper();
        turnRight();
        movethree();
        pickBeeper();
        turnRight();
        movethree();
        pickBeeper();
        turnRight();
        movethree();
        turnLeft();
        movetwo();
        
        
   
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void movetwo() {
        move();
        move();
    }
    public void movethree() {
        move();
        move();
        move();
    }
    public void flip() {
        turnLeft();
        turnLeft();
    }
}
    
       
