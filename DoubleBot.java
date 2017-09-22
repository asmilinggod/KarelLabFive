package KarelLabFive;




import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int numBeepers;
    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        move();
        
        countBeepers();
        putBeepersBack();
        move();
        putTwiceNumBeepers();
        move();
    }
    public void countBeepers(){
            while(nextToABeeper()){
            pickBeeper();
            numBeepers++;
        }
    }
    public void putBeepersBack(){
        int temp = numBeepers;
        while (0 < temp){
            putBeeper();
            temp--;
        }
        
    }
    public void putTwiceNumBeepers(){
        for(int i = 0 ; i < 2*numBeepers ; i++) {
            putBeeper();
        }
    }
}   