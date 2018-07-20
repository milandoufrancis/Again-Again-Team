/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.GameControl;
import Exeptions.GameControlException;
import Model.Game;
import Model.Item;
import again.again.AgainAgain;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My Laptop
 */
public class PrintReportView extends View{

    @Override
    public String[] getInputs() {
         String[] inputs = new String[2];
              
       inputs[0] = getInput("D - print list of items.\n"
               + "A - print list of actors\n");
       inputs[1] = getInput("Where do you want to print?");
       return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[1];
       Game currentGame = AgainAgain.getGame();
       
        switch (inputs[0].toUpperCase()) {
           
            case "D":
        {
            try {
                printListItems(filePath);
                 this.console.println("Printed the list of Items");
            } catch (GameControlException ex) {
               ErrorView.display(this.getClass().getName(),
                       "Error reading input: " + ex.getMessage());
               return false;   
            }
        }
               
                break;
            case "A":
               
                this.console.println("print the list of Actors");
                break;
                
            case "Q":
                this.console.println("Quit the view");
                return true;

            default:
                System.out.println("Invalid menu item.");
        }

        return false;
    }

    private void printListItems(String filePath) throws GameControlException {
        try (PrintWriter print = new PrintWriter(filePath)){
            print.println("List of Items");
            String format = "%-15s %-10s %-50s %n";
            print.printf(format, "Names", "Item type", "Description");
            print.print("------------------------------------------------------------------------------------------");
            print.println();
            Item[] items = Item.values();
            for (Item item: items){
                print.printf(format, item.getItemName(), item.getItemType(), item.getItemDescription());
                
            }
        }catch(IOException ex){
         throw new GameControlException(ex.getMessage());
       }
       return;    
    }
                    }

    

