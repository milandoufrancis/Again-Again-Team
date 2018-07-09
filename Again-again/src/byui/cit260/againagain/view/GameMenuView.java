/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Model.Game;
import Model.Location;
import again.again.AgainAgain;

/**
 *
 * @author My Laptop
 */
class GameMenuView extends View {

    @Override
    public String[] getInputs() {
        //System.out.println("get inputs called");
        //String[]  inputs = new String[1];
        //inputs[0] = getInput("TEST");
        String[] inputs = new String[1];
        boolean valid = false;
        inputs[0] = getInput("V - This command helps you to display map.\n"
                + "I - this helps to view the list of items\n"
                + "J - to view a list of actors\n");
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        //System.out.println("doaction called");
        //String menuItem = inputs[0];

        switch (inputs[0]) {
            case "V":// to view location
                this.displayMap();
                break;

            case "I":// list of items
                this.viewItem();
                break;

            case "J":
                this.viewActors();
                break;

            case "Q":
                System.out.println("Quit the game");
                return true;

            default:
                System.out.println("Invalid menu item.");
        }
        return true;

    }

    private void displayMap() {
        //System.out.println("***displaymap stub function called***");
        //game = get the currentGame from the main class
        Game game = AgainAgain.getGame();
//locations = get the 2-D locations array from the map
        Location[][] locations = game.getMap().getLocations();
//Print the title
        System.out.print("\nAgain&Again dark dungeaon\n");
//Print the column numbers for each column
        System.out.print("   1  |  2 | 3 |  4  | 5  \n");
//for every row in map
        for (int row = 0; row < locations.length; row++) {
//Print a row divider
        System.out.print("---------------------------\n");
//Print the row number on a new line
            System.out.print(row + 1);
//for every column in the row
            for (int col = 0; col < locations[row].length; col++)
            {
                //Print a column divider
                System.out.print("|");
                Location location = locations[row][col]; 
                        if (location.isVisited()){
                            System.out.print(location.getDisplaySymbol());
                        }else{
                            System.out.print(" ?? ");
                        }
            }
            System.out.print("|\n");
        
        }
        System.out.print("---------------------------\n");
    }

    private void viewItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewActors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
