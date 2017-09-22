package KarelLabFive;


import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
        public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int numBeepers;
    public boolean even;
        public void turnRight(){
            turnLeft();
            turnLeft();
            turnLeft();
    }
        public void choosePile() {
        countBeepers();
        checkEvenOdd();
        moveToSafeRoom();
    }
        public void countBeepers(){
        while(nextToABeeper()){
            pickBeeper();
            numBeepers++;
        }
    }
        public void checkEvenOdd(){
            if (numBeepers % 2 == 0){
                even = true;
        }
            else {
                even = false;
            }
    }
        public void moveToSafeRoom(){
        if (even){
            turnRight();
        }
        else {
            turnLeft();
        }
        move();
        turnOff();
    }
}

