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
class MainMenuView extends View {

    public boolean doAction(String[] inputs) {
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
                trap.display();
                break;

            case "Z":
                SubHelpMenu menu = new SubHelpMenu();
                menu.display();
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
        boolean valid = false;

        inputs[0] = getInput("N - Start New Game\n"
                + "L - Load game\n"
                + "H - Help menu\n"
                + "Q - Quit game\n");

        return inputs;
    }

    private void startNewgame() {
        GameControl.createNewGame(AgainAgain.getPlayer());
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
}
