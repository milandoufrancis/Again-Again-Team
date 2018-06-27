/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Actor;
import Model.Game;
import Model.Item;
import Model.Player;
import again.again.AgainAgain;
import java.awt.Point;

/**
 *
 * @author Levi
 */
public class GameControl {

    public static Player savePlayer(String playerName) {
       if(playerName == null || playerName.length() < 1){
           return null;
           
       }
       
       Player player = new Player();
       player.setName(playerName);
       AgainAgain.setPlayer(player);
        return player;
    }
    
    public static Actor createActors[] {
    Actor[] actors= new Actor[5];
    //Actor for the player's character
    Actor mainplayer = new Actor();
    mainplayer.setDescription("This is you, the main character of this game!");
    mainplayer.setCoordinates(new Point(1,1));
    mainplayer.setActorHealth(10);
    mainplayer.setActorDamage(3);
    mainplayer.setDefence(5);
    mainplayer.setActorScore(1);
    actors[0] = mainplayer;
    
    //Actor object for the monster, Werewolf
    Actor werewolf = new Actor();
    werewolf.setDescription("This creature stands before you, teeth bared and claws ready");
    werewolf.setCoordinates(new Point(2,1));
    werewolf.setActorHealth(25);
    werewolf.setActorDamage(6);
    werewolf.setDefence(8);
    werewolf.setActorScore(25);
    actors[1] = werewolf;
}
    
    public static int createNewGame(Player player){
        // Check for invalid inputs
if (player == null){
return -1;
// indicates invalid input
}


Game game = new Game();
//call setter to save Player object in the game object
game.setPlayer(player);
//call setter to save the game in the main class of program
AgainAgain.setGame(game);
//call setter to assign an actor to the player
Player.setActor(actor);
// Create the lists of used in the game
Item items = createItems();
call setter to save items list in the game object
// Create all other list (e.g., questions, weapons, spells) and save in the game
…
map = createMap(game, noOfRows, noOfColumns)
if (map == null){
    return -2;
}
call setter to save the map in the game object
RETURN 1
    }
    
}
