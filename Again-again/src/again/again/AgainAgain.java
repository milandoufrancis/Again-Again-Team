package again.again;

import Model.Game;
import Model.Item;
import Model.Player;
//<<<<<<< HEAD
import Model.Map;
//import Model.TrapLocation;
//=======

import Model.Actor;
import Model.Question;
import byui.cit260.againagain.view.StartProgramView;
import Model.Stats;
//>>>>>>> origin/master

/**
 * @author My Laptop
 */
public class AgainAgain {
    private static Player player;
    private static Game game;
    private static Actor actor;
    
    

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
        try {StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        }catch (Throwable ie){
            System.out.println("Shut down the game");
           
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
////>>>>>>> origin/master
      
    }
    
}
