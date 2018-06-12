package again.again;

import Model.Game;
import Model.Item;
import Model.Player;
//<<<<<<< HEAD
import Model.Map;
//import Model.TrapLocation;
//=======
import Model.Enemy;
import Model.Actor;
import Model.Questions;
import byui.cit260.againagain.view.StartProgramView;
//import Model.Stats;
//>>>>>>> origin/master

/**
 * @author My Laptop
 */
public class AgainAgain {
    private static Player player;
    private static Game game;
    
    

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
    
    
    
    
//
//    /**
//     * @param args the command line arguments
//     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        
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
//      Questions questions = new Questions();
//      
//      System.out.println(actor.toString());
//      System.out.println(enemy.toString());
//      System.out.println(questions.toString());
////>>>>>>> origin/master
      
    }
    
}
