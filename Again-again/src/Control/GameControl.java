/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exeptions.MapControlException;
import Model.Actor;
import Model.ActorType;
import Model.Game;
import Model.Item;
import Model.Location;
import Model.Player;
import Model.Question;
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
        Actor[] actors = new Actor[ActorType.values().length];
        //Actor for the player's character
        Actor mainplayer = new Actor();
        mainplayer.setDescription("This is you, the main character of this game!");
        mainplayer.setCoordinates(new Point(1, 1));
        mainplayer.setActorHealth(10);
        mainplayer.setActorDamage(3);
        mainplayer.setDefence(5);
        mainplayer.setActorScore(1);
        actors[ActorType.mainplayer.ordinal()] = mainplayer;

        //Actor object for the monster, Werewolf
        Actor werewolf = new Actor();
        werewolf.setDescription("This creature stands before you, teeth bared and claws ready");
        werewolf.setCoordinates(new Point(2, 1));
        werewolf.setActorHealth(25);
        werewolf.setActorDamage(6);
        werewolf.setDefence(8);
        werewolf.setActorScore(25);
        actors[1] = werewolf;
        actors[ActorType.werewolf.ordinal()] = werewolf;
        
        //Actor object for the monster, 
        Actor skeleton = new Actor();
        skeleton.setDescription("Spooky, scary skeleton. Sends shivers down your spine...");
        skeleton.setCoordinates(new Point(1,3));
        skeleton.setActorHealth(10);
        skeleton.setActorDamage(3);
        skeleton.setActorScore(5);
        actors[2] = skeleton;
        actors[ActorType.skeleton.ordinal()] = skeleton;
        
        //Actor object for a spider
        Actor spider = new Actor();
        spider.setDescription("An eight legged freak of nature. Why do these exist?");
        spider.setCoordinates(new Point(1,5));
        spider.setActorHealth(6);
        spider.setActorDamage(2);
        spider.setActorScore(2);
        actors[3] = spider;
        actors[ActorType.spider.ordinal()] = spider;
        
        //Actor Object for a zombie
        Actor zombie = new Actor();
        zombie.setDescription("Use your head. This guy just wants to eat it.");
        zombie.setCoordinates(new Point (2,7));
        zombie.setActorHealth(8);
        zombie.setActorDamage(10);
        zombie.setActorScore(8);
        actors[4] = zombie;
        actors[ActorType.zombie.ordinal()] = zombie;

        //Actor Object for vampire
        Actor vampire = new Actor();
        vampire.setDescription("Kind of like a zombie, except this one likes to drink blood.");
        vampire.setCoordinates(new Point (-3,4));
        vampire.setActorHealth(25);
        vampire.setActorDamage(15);
        vampire.setActorScore(50);
        actors[5] = vampire;
        actors[ActorType.vampire.ordinal()] = vampire;
        
        Actor ghoul = new Actor();
        ghoul.setDescription("Hey!!! watch out! they feed on dead people");
        ghoul.setCoordinates(new Point(4, 1));
        ghoul.setActorHealth(25);
        ghoul.setActorDamage(6);
        ghoul.setDefence(8);
        ghoul.setActorScore(25);
        actors[6] = ghoul;
        actors[ActorType.ghoul.ordinal()] = ghoul;

        //Actor object for the monster, Anaconda
        Actor anaconda = new Actor();
        anaconda.setDescription("The anaconda is watching and ready to attack!");
        anaconda.setCoordinates(new Point(3, 2));
        anaconda.setActorHealth(25);
        anaconda.setActorDamage(6);
        anaconda.setDefence(8);
        anaconda.setActorScore(25);
        actors[7] = anaconda;
        actors[ActorType.anaconda.ordinal()] = anaconda;

        //Actor object for the monster, Ogre
        Actor ogre = new Actor();
        ogre.setDescription("They love to surprise their prey, and these ones don't like onions.");
        ogre.setCoordinates(new Point(4, 3));
        ogre.setActorHealth(25);
        ogre.setActorDamage(6);
        ogre.setDefence(8);
        ogre.setActorScore(25);
        actors[8] = ogre;
        actors[ActorType.ogre.ordinal()] = ogre;

        //Actor object for the monster, Nemesis
        Actor nemesis = new Actor();
        nemesis.setDescription("It's just like you! Only darker and edgier...");
        nemesis.setCoordinates(new Point(3, 4));
        nemesis.setActorHealth(25);
        nemesis.setActorDamage(6);
        nemesis.setDefence(8);
        nemesis.setActorScore(25);
        actors[9] = nemesis;
        actors[ActorType.nemesis.ordinal()] = nemesis;

        //Actor object for the monster, Gollum
        Actor gollum = new Actor();
        gollum.setDescription("This monster rocks. Literally.");
        gollum.setCoordinates(new Point(3, 3));
        gollum.setActorHealth(25);
        gollum.setActorDamage(6);
        gollum.setDefence(8);
        gollum.setActorScore(25);
        actors[10] = gollum;
        actors[ActorType.gollum.ordinal()] = gollum;

        //Actor object for the monster, Lizarus
        Actor lizarus = new Actor();
        lizarus.setDescription("This creature stands before you, teeth bared and claws ready");
        lizarus.setCoordinates(new Point(4, 3));
        lizarus.setActorHealth(25);
        lizarus.setActorDamage(6);
        lizarus.setDefence(8);
        lizarus.setActorScore(25);
        actors[11] = lizarus;
        actors[ActorType.lizarus.ordinal()] = lizarus;

        //Actor object for the monster, Crapus
        Actor crapus = new Actor();
        crapus.setDescription("This creature stands before you, teeth bared and claws ready");
        crapus.setCoordinates(new Point(2, 1));
        crapus.setActorHealth(25);
        crapus.setActorDamage(6);
        crapus.setDefence(8);
        crapus.setActorScore(25);
        actors[12] = crapus;
        actors[ActorType.crapus.ordinal()] = crapus;

        //Actor object for the monster Goblin
        Actor goblin = new Actor();
        goblin.setDescription("It's that annoying cousin that ogres don't talk about.");
        goblin.setCoordinates(new Point(2, 4));
        goblin.setActorHealth(25);
        goblin.setActorDamage(6);
        goblin.setDefence(8);
        goblin.setActorScore(25);
        actors[13] = goblin;
        actors[ActorType.goblin.ordinal()] = goblin;

        //Actor object for the monster, Zorn
        Actor zorn = new Actor();
        zorn.setDescription("Sounds oddly like this weird saxophonist you once listened to...");
        zorn.setCoordinates(new Point(2, 3));
        zorn.setActorHealth(25);
        zorn.setActorDamage(6);
        zorn.setDefence(8);
        zorn.setActorScore(25);
        actors[14] = zorn;
        actors[ActorType.zorn.ordinal()] = zorn;

        
        return actors;
    }

    public static int createNewGame(Player player) throws MapControlException{
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
        MapControl.createMap(game, 5, 5);
        if(game.getMap() == null){
            return -1;
        }
        
// Create the lists of used in the game
        Question[] questions = GameControl.createQuestions();
        //call setter to save items list in the game object
        game.setQuestions(questions);
        
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

    private static Question[] createQuestions() {
        System.out.println("createQuestions has been called");
       //Create an array large enough to hold all of the elements in the list
       Question[] questionList = new Question[10];
       
       //Create the next object to be added to the array
       Question bossRoom  = new Question();
       //Call setter methods to assign values to each attribute in the object
       //Assign the object to the next position in the array
       return questionList;
    }  
     public static Item[] doInsertionSort(Item[] input){
        Item[] items = input.clone();
        Item temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(items[j].getItemType().compareTo(items[j-1].getItemType()) < 0 ){
                    temp = items[j];
                    items[j] = items[j-1];
                    items[j-1] = temp;
                }
            }
        }
        return items;
    }
     
     public static double CalcAverage(Actor[] actors){
    //Find the average of the list
average(list): number;
BEGIN
total = 0
FOR index = 0 TO list.length -1
 total = total + list[index]
ENDFOR
average = total / sizeOfList
RETURN average
END
}
}

