package guessGame;


public class Runner {

  
    public static void main(String[] args) {
        String intel = "intel";
        int art = 12;
        
        
        System.out.println(String.format("Het type is %s en artikelnummer is %n new line here", intel, art ));

        System.out.println("guess");
        GuessGame game = new GuessGame();
        
        GuessGame game2; // declaratie van variabele
        game2 = new GuessGame();
        
        
        int leeftijd; // declaratie
        leeftijd = 20;
     
        game.startGame();
        
    }
    
}
