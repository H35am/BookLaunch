package dotComGame;

import java.util.*;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class DotComBust {

    /**
     * declare and initialize the variables well need.
     */
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {

        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com , eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of gusses!");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }//end of setupgame

    private void startPlaying() {
        
        while (!dotComsList.isEmpty()) {
            
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
            
        }//close while

        finishGame();
    }//close startPlaying method
    
    private void checkUserGuess(String userGuess){
        numOfGuesses ++;
        String result = "miss";
        
        for(int x = 0; x < dotComsList.size(); x++){
            
            result = dotComsList.get(x).checkYourself(userGuess);
            
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComsList.remove(x);
                break;
                
            }
        }
        System.out.println(result);
    }
    
    private void finishGame(){
        System.out.println("All dotcoms are dead! your stock is now worthless.");
        if(numOfGuesses <= 18){
            System.out.println("It only took you" + numOfGuesses + "guesses to sink the dotcom");
            System.out.println("you got out there!");
            }
        else{
            
            System.out.println("you lost with" + numOfGuesses + "guesses to NOT sink the dotcom");
            System.out.println("Fish and chips bla bla bla.....");
        }
    }
    
      public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
    
    
}
