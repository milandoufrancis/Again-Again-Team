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
        if (playerName == null || playerName.length() < 1) {
            return null;

        }

        Player player = new Player();
        player.setName(playerName);
        AgainAgain.setPlayer(player);
        return player;
    }

    public static Actor[] createActors() {
        Actor[] actors = new Actor[5];
        //Actor for the player's character
        Actor mainplayer = new Actor();
        mainplayer.setDescription("This is you, the main character of this game!");
        mainplayer.setCoordinates(new Point(1, 1));
        mainplayer.setActorHealth(10);
        mainplayer.setActorDamage(3);
        mainplayer.setDefence(5);
        mainplayer.setActorScore(1);
        actors[0] = mainplayer;

        //Actor object for the monster, Werewolf
        Actor werewolf = new Actor();
        werewolf.setDescription("This creature stands before you, teeth bared and claws ready");
        werewolf.setCoordinates(new Point(2, 1));
        werewolf.setActorHealth(25);
        werewolf.setActorDamage(6);
        werewolf.setDefence(8);
        werewolf.setActorScore(25);
        actors[1] = werewolf;
        
        //Actor object for the monster, 
        Actor skeleton = new Actor();
        skeleton.setDescription("Spooky, scary skeleton. Sends shivers down my spine...");
        skeleton.setCoordinates(new Point(1,3));
        skeleton.setActorHealth(10);
        skeleton.setActorDamage(3);
        skeleton.setActorScore(5);
        actors[2] = skeleton;
        
        //Actor object for a spider
        Actor spider = new Actor();
        spider.setDescription("An eight legged freak of nature. Why do these exist?");
        spider.setCoordinates(new Point(1,5));
        spider.setActorHealth(6);
        spider.setActorDamage(2);
        spider.setActorScore(2);
        actors[3] = spider;
        
        //Actor Object for a zombie
        Actor zombie = new Actor();
        zombie.setDescription("Use your head. This guy just wants to eat it.");
        zombie.setCoordinates(new Point (2,7));
        zombie.setActorHealth(8);
        zombie.setActorDamage(10);
        zombie.setActorScore(8);
        actors[4] = zombie;

        //Actor Object for vampire
        Actor vampire = new Actor();
        vampire.setDescription("Kind of like a zombie, except this one likes to drink blood.");
        vampire.setCoordinates(new Point (-3,4));
        vampire.setActorHealth(25);
        vampire.setActorDamage(15);
        vampire.setActorScore(50);
        actors[5] = vampire;
        
        return actors;
    }

    public static int createNewGame(Player player) {
        // Check for invalid inputs
        if (player == null) {
            return -1;
// indicates invalid input
        }

        Game game = new Game();
//call setter to save Player object in the game object
        game.setPlayer(player);
//call setter to save the game in the main class of program
        AgainAgain.setGame(game);
//call setter to assign an actor to the player
        Actor[] actorList = GameControl.createActors();
        //Assign an actor to the player
        player.setActor(actorList[0]);
        // call setter to save list of players in the game
        game.setActors(actorList);
        
// Create the lists of used in the game
        Item[] items = GameControl.createItems();
        //call setter to save items list in the game object
        game.setItems(items);
        
        // Create all other list (e.g., questions, weapons, spells) and save in the game
        
       
//map = MapControl.createMap(game, noOfRows, noOfColumns)
//        if (map == null) {
//            return -2;
//        }
        //call setter to save the map in the game object
        return 1;
    }

      public static Item[] createItems() {
       System.out.println("createItems has been called");
       Item[] itemList = new Item[10];
       
       return itemList;
    }  
}
