/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.GameControl;
import again.again.AgainAgain;
import java.util.Scanner;

/**
 *
 * @author Levi
 */
class MainMenuView {

    void displayMainMenuView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];

        switch (menuItem) {
            case "N":
                startNewgame();
                break;
            case "H":
                getHelp();
                break;
            case "R":
                restartName();
                break;
            case "T":
                TrapMenuView trap = new TrapMenuView();
                trap.displayTrapMenuView();
                break;
                
            case "Z":
                SubHelpMenu menu = new SubHelpMenu();
                menu.displaySubHelpMenuView();
                break;
                
            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item.");
        }

        return false;
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;

        while (!valid) {
            System.out.println("N - Start New Game\n"
                    + "L - Load game\n" + "H - Help menu\n" + "Q - Quit game\n");
            Scanner inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toUpperCase();

            if (inputs[0].length() < 1) {
                System.out.println("You must enter a value.");
                continue;
            }
            valid = true;

        }
        return inputs;
    }

    private void startNewgame() {
        GameControl.createNewGame(AgainAgain.getPlayer());
        GameMenuView menuView = new GameMenuView();
        menuView.display();
    }

    private void getHelp() {
        HelpMenuView menuView = new HelpMenuView();
        menuView.displayHelpMenuView();

    }
    
    private void getBattle() {
        BattleMenuView menuView = new BattleMenuView();
        menuView.displayBattleMenuView();
    }

    private void restartName() {
        StartExistingGameView gameView = new StartExistingGameView();
        StartExistingGameView.dispalyStartExistingGameView(AgainAgain.getPlayer());
    }
}
