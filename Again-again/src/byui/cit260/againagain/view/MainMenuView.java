/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.GameControl;
import Control.MapControl;
import Exeptions.FightControlException;
import Exeptions.MapControlException;
import again.again.AgainAgain;
import java.util.Scanner;

/**
 *
 * @author Levi
 */
class MainMenuView extends View{

    public boolean doAction(String[] inputs){
        String menuItem = inputs[0];

 //Print error passed with the exception
 
        switch (menuItem) {
            case "N":
                try {
                    startNewgame();
                    }catch (MapControlException ie){
            System.out.println("Error reading input: " + ie.getMessage());
            return false;
        }
                
                break;
            case "H":
                getHelp();
                break;
            case "L":
                this.startSavedGame();
                break;
            case "T":
                TrapMenuView trap = new TrapMenuView();
                trap.display();
                break;
            case "P":
                PrintReportView report = new PrintReportView();
                report.display();
                break;
            case "F": 
                AttackHitView view = new AttackHitView();
                view.display();
                break;

            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item.");
        }

        return false;
    }

    public String[] getInputs() {
        String[] inputs = new String[1];

        this.console.println("N - Start New Game\n"
                + "L - Start saved game\n"
                + "H - Help menu\n"
                + "T - Trap menu\n"
                + "P - Print report\n"
                + "Q - Quit game\n");
        
        inputs[0] = getInput("Enter the menu option").trim().toUpperCase();

        return inputs;
    }

    private void startNewgame() throws MapControlException{
        int success = GameControl.createNewGame(AgainAgain.getPlayer());
        GameMenuView menuView = new GameMenuView();
        menuView.display();
    }

    private void getHelp() {
        HelpMenuView menuView = new HelpMenuView();
        menuView.display();

    }

    private void getBattle() {
        BattleMenuView menuView = new BattleMenuView();
        menuView.display();
    }

    private void restartName() {
        StartExistingGameView gameView = new StartExistingGameView();
        StartExistingGameView.dispalyStartExistingGameView(AgainAgain.getPlayer());
    }

    private void startSavedGame() {
        StartSavedGameView startSavedGameView = new StartSavedGameView();
        startSavedGameView.display();
    }
}
