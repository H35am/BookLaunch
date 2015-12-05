package dotComGame;

import java.util.*;

/**
 * * Tools | Templates and open the template in the editor
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {

        String result = "Miss!";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch you hit me" + name + " : (");
            } else {
                result = "hit";
            }
        }
        return result;

    }
}
