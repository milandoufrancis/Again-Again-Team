package again.again;

import Model.Game;
import Model.Item;
import Model.Player;
import Model.Enemy;
import Model.Actor;
import Model.Questions;

/**
 * @author My Laptop
 */
public class AgainAgain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        player.setCurrentFile("yes");
        player.setName("bob");
        
      Game game = new Game();
      game.setPlayer(player);
      
      System.out.println(game.toString());
      System.out.println(Item.Sword.toString());
      
      Actor actor = new Actor();
      Enemy enemy = new Enemy();
      Questions questions = new Questions();
      
      System.out.println(actor.toString());
      System.out.println(enemy.toString());
      System.out.println(questions.toString());
      
    }
    
}
