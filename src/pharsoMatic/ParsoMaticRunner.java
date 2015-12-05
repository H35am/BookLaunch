package pharsoMatic;

import java.util.Random;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class ParsoMaticRunner {
  
 
    
    public static void main(String[] args) {
        
  
//        int a = 1;
//        int b = a;
//        a = 2;
//        System.out.println(b);
        

        
        String[] wordListOne = {
            "27/7",
            "Multi-Tier",
            "30.000 foot",
            "B-to-B", "win-win",
            "front end",
            "web-based",
            "Paard"
        };

        String[] wordListTwo = {
            "empowered",
            "sticky",
            "oriented",
            "centric",
            "distrubited",
            "branded",
            "LuL"
        };

        String[] wordListThree = {
            "process",
            "solution",
            "portal",
            "space",
            "vision",
            "mission",
            "hanger"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

       
int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        

        int i = 1;
        while (i < 5) {
            i += 1;
             
        String pharse = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
            System.out.println("Wat we need is a: " + pharse);
        }
        
      
      
      
   }    
    
    
}

    


