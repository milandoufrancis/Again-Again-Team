/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.GameControl;
import Control.MapControl;
import Model.Game;
import Model.Item;
import Model.Location;
import again.again.AgainAgain;
import Model.Actor;

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
                + "J - to view a list of actors\n"
                + "X - to trick the trap fight\n"
               + "S - moves the actor\n" 
          
                + "Q - Quit game\n");
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        //System.out.println("doaction called");
        //String menuItem = inputs[0];

        switch (inputs[0]) {
            case "V":// to view location
                MapControl.displayMap();
                break;
            case "S": // to move the actor
                MoveActorView actorMove = new MoveActorView();
                actorMove.display();
                break;
            case "X": // trap fight
                AttackHitView trapAct = new AttackHitView();
                trapAct.display();
                break;

            case "I":// list of items
                this.viewItem();
                break;

            case "J":
                this.viewActors();
                break;
            case "Y":
                Item[] items = GameControl.doInsertionSort(Item.values());
                for (Item item : items){
                    System.out.println(item.getItemName() + " " +  item.getItemType());
                }
              
            case "Q":
                System.out.println("Quit the game");
                return true;
                
            case "A":
                GameControl.CalcAverageDamage(AgainAgain.getGame().getActors());
                break;

            default:
                System.out.println("Invalid menu item.");
        }
        return false;

    }

    private void displayMap() {
        //System.out.println("***displaymap stub function called***");
        //game = get the currentGame from the main class
        Game game = AgainAgain.getGame();
//locations = get the 2-D locations array from the map
        Location[][] locations = game.getMap().getLocations();
//Print the title
        System.out.print("\nAgain&Again Dark Dungeon\n");
//Print the column numbers for each column
        System.out.print("  1  |  2 | 3 |  4  | 5  \n");
//for every row in map
        for (int row = 0; row < locations.length; row++) {
//Print a row divider
        System.out.print("  -------------------------\n");
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

    //Print an alphabetical list of actors that are currently programmed into the game.
    private void viewActors() {
        System.out.println("Here are the following actors within this game: \n");
        System.out.print(this);
        
    }
    
}
