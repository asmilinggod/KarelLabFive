package KarelLabFive;


import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends DangerousBot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
            while (numBeepers < 5){
        CountBeepers();
        executeClue();
      }
      turnOff();
    }
        public void CountBeepers(){
        
        while(nextToABeeper()){
            pickBeeper();
            numBeepers++;
        }
        
    }
    public void executeClue(){
        if (numBeepers==1){
            faceNorth();
        }
        if (numBeepers == 2){
            faceEast();
        }
        if (numBeepers == 3){
            faceSouth();
        }
        if (numBeepers == 4){
            faceWest();
        }
        moveToNextClue();
    }
    public void faceNorth(){
        while (!facingNorth()){
            turnLeft();
        }
    }
    public void faceEast(){    
        while (!facingEast()){
            turnLeft();
        }
    }
    public void faceSouth(){
        while (!facingSouth()){
            turnLeft();
        }
    }
    public void faceWest(){
        while (!facingWest()){
            turnLeft();
        }
    }
    public void moveToNextClue(){
        move();
        while (!nextToABeeper()){
            move();
    }
    }
}


