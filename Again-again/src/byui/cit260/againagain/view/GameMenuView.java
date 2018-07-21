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
                + "X - to trick the actor fight\n"
               + "M - moves the actor\n"
               + "D - Calculates the average damage of the actors in this game.\n"
               + "S - Save the game\n"
          
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
            case "M": // to move the actor
                MoveActorView actorMove = new MoveActorView();
                actorMove.display();
                break;
            case "X": // Actor fight
                AttackHitView actorFight = new AttackHitView();
                actorFight.display();
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
                    this.console.println(item.getItemName() + " " +  item.getItemType());
                    break;
                }
              
            case "Q":
                this.console.println("Quit the game");
                return true;
                
            case "D":
                GameControl.CalcAverageDamage(AgainAgain.getGame().getActors());
                break;
            case "S":
                this.saveGame();
                break;

            default:
                this.console.println("Invalid menu item.");
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
        this.console.print("\nAgain&Again Dark Dungeon\n");
//Print the column numbers for each column
        this.console.print("  1  |  2 | 3 |  4  | 5  \n");
//for every row in map
        for (int row = 0; row < locations.length; row++) {
//Print a row divider
        this.console.print("  -------------------------\n");
//Print the row number on a new line
            this.console.print(row + 1);
//for every column in the row
            for (int col = 0; col < locations[row].length; col++)
            {
                //Print a column divider
                this.console.print("|");
                Location location = locations[row][col]; 
                        if (location.isVisited()){
                            System.out.print(location.getDisplaySymbol());
                        }else{
                            System.out.print(" ?? ");
                        }
            }
            this.console.print("|\n");
        
        }
        this.console.print("---------------------------\n");
    }

    private void viewItem() {
     
    }

    //Print an alphabetical list of actors that are currently programmed into the game.
    private void viewActors() {
        this.console.println("Here are the following actors within this game: \n");
        this.console.print(this);
        
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }
    
}
