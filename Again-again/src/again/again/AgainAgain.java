package again.again;

import Model.Actor;
import Model.Game;
import Model.Item;
import Model.Player;
import Model.Map;
import byui.cit260.againagain.view.StartProgramView;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
//
//

/**
 * @author My Laptop
 */
public class AgainAgain {
    private static Player player;
    private static Game game;
    private static Actor actor;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    public static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        AgainAgain.logFile = logFile;
    }
    
    

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        AgainAgain.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        AgainAgain.inFile = inFile;
    }
    
    
    

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        AgainAgain.player = player;
        
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        AgainAgain.game = game;
    }

    public static Actor getActor() {
        return actor;
    }

    public static void setActor(Actor actor) {
        AgainAgain.actor = actor;
    }
    
    
    
    
//
//    /**
//     * @param args the command line arguments
//     */
    public static void main(String[] args) {
        try 
        {
           AgainAgain.inFile = new BufferedReader(new InputStreamReader(System.in)); 
           AgainAgain.outFile = new PrintWriter(System.out, true);
           logFile = new PrintWriter("logFile.txt");
            StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        }catch (Throwable e){
            System.out.println("Exception: " + e.toString() +
                     "\nCause: " + e.getCause() + 
                    "\nMessage: " + e.getMessage());
            e.printStackTrace();;
           
        }
        finally {
            try {
                if (AgainAgain.inFile != null)
                    AgainAgain.inFile.close();
                if (AgainAgain.outFile != null)
                    AgainAgain.outFile.close();
                if (logFile != null){
                    logFile.close();
                }
            } catch (IOException ioe2) {
                System.console().printf("%s%s", "Error closing the input/out");
                return;
            }
            
        }
    }
        
//        Player player = new Player();
//        player.setCurrentFile("yes");
//        player.setName("bob");
//        
//        Map map = new Map();
//        map.setDescription("You are here");
//        //TrapLocation trapType = new TrapLocation();
//        //trapType.setTrapType("It's a trap!");
//        
//        
//        
//      Game game = new Game();
//      game.setPlayer(player);
//      
//      System.out.println(game.toString());
//      System.out.println(Item.Sword.toString());
//      System.out.println(map.toString());
//      
//      
//      Actor actor = new Actor();
//      Enemy enemy = new Enemy();
//      Question questions = new Question();
//      
//      System.out.println(actor.toString());
//      System.out.println(enemy.toString());
//      System.out.println(questions.toString());
      
    }
    

