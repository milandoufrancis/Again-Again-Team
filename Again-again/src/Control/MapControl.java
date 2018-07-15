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
import Model.ItemLocation;
import Model.Location;
import Model.Map;
import Model.TrapLocation;
import again.again.AgainAgain;
import java.awt.Point;

/**
 *
 * @author Levi
 */
public class MapControl {

    private static Location[][] createLocations(int numRows, int numCol)throws MapControlException {
        Location[][] locations = new Location[numRows][numCol];
        locations[0][0] = new Location(0, 0, true, "  X ", 1, "You stand here at the enterance, staring at the void.");
        locations[0][1] = new TrapLocation(0, 1, false, "  T  ", 3, "It's a trap!", "It's an acid trap", 14);
        locations[0][2] = new Location(0, 2, false, " :) ", 1, "You're safe in this place... for now.");
        locations[0][3] = new Location(0, 3, false, " M ", 3, "A coffin is open and a body rises from it. This is going to suck.");
        locations[0][4] = new ItemLocation(0, 4, false, " I ", 2, "It appears the vampire was guarding an arrow, but for who?");
        locations[1][0] = new ItemLocation(1, 0, false, " I ", 2, "You find an iron sword lying on the ground. Your chances just got better!");
        locations[1][1] = new ItemLocation(1, 1, false, " I ", 2, "There's a shield lying on the ground here. Protection at last!");
        locations[1][2] = new Location(1, 2, false, " M ", 3, "A pile of bones animates and forms something you'd see in a science class");
        locations[1][3] = new Location(1, 3, false, " M ", 3, "A lot of webs are covering the place, and eight eyeballs staring right back. Ick!");
        locations[1][4] = new Location(1, 4, false, " M ", 3, "You hear some moaning sounds and labored breathing as something that smells dead comes closer to you.");
        locations[2][0] = new Location(2, 0, false, " M ", 3, "A lot of webs are covering the place, and eight eyeballs staring right back. Ick!");
        locations[2][1] = new ItemLocation(2, 1, false, " I ", 2, "Apparently, some sunlight is peeking through the roof and a green herb has grown here.");
        locations[2][2] = new Location(2, 2, false, " M ", 3, "A lot of webs are covering the place, and eight eyeballs staring right back. Ick!");
        locations[2][3] = new ItemLocation(2, 3, false, " I ", 2, "Apparently, some sunlight is peeking through the roof and a green herb has grown here.");
        locations[2][4] = new Location(2, 4, false, " M ", 3, "A pair of yellow, wolfish eyes are staring at you, with a low growling echoing through the room.");
        locations[3][0] = new Location(3, 0, false, " M ", 3, "You hear some moaning sounds and labored breathing as something that smells dead comes closer to you.");
        locations[3][1] = new ItemLocation(3, 1, false, " I ", 2, "You find a broken wall with some fruit in it, surprisingly still ripe");
        locations[3][2] = new Location(3, 2, false, " M ", 3, "A pair of yellow, wolfish eyes are staring at you, with a low growling echoing through the room.");
        locations[3][3] = new Location(3, 3, false, " M ", 3, "You hear some moaning sounds and labored breathing as something that smells dead comes closer to you.");
        locations[3][4] = new TrapLocation(3, 4, false, " T ", 3, "It's a trap!", "It's the arrow trap", 10);
        locations[4][0] = new TrapLocation(4, 0, false, " T ", 3, "It's a trap!", "It's a bomb trap", 15);
        locations[4][1] = new Location(4, 1, false, " B ", 5, "You have reached a huge monster that resembles a werewolf. This must be their alpha male. Hope you have some silver on you.");
        locations[4][2] = new ItemLocation(4, 2, false, " I ", 2, "There is a pedestal that holds up a glass, angel-shaped flask of shining, white water. Extremely useful against the undead!");
        locations[4][3] = new Location(4, 3, false, " :) ", 1, "You're safe in this place... for now.");
        locations[4][4] = new Location(4, 4, false, " B ", 5, "It's another boss! And this time, it's the Lord Dracula himself! Hope this guy is thirsty for some holy water!");

        return locations;
    }

    public static void createMap(Game game, int noOfRows, int noOfColumns)throws MapControlException {
// check for invalid inputs
        if (game == null || noOfRows < 0 || noOfColumns < 0) {
            return;
        }
// create the map object and assign values to it 
        Map map = new Map();
//call setter to assign value to description in map
        map.setDescription("Again and Again's Map");
//call setter to assign value to noOfRows in the map 
        map.setRowCount(5);
//call setter to assign value to noOfColumns in map
        map.setColumnCount(5);
//call setter to save the map in game object
        game.setMap(map);
// create a two-dimensional array of locations and assign array to the map 
        Location[][] locations = createLocations(map.getRowCount(), map.getColumnCount());
        if (locations == null) {
            return;
        }
//call setter to save a locations array in the map object
        map.setLocations(locations);
        assignActorsToLocations(locations);
        assignItemsToLocations(locations);

        return;
    }
// assign actors and items to locations

    private static int assignActorsToLocations(Location[][] locations) {
// Check for invalid input

        if (locations == null) {
            throw new MapControlException("The input must be valid");
        }

// Assign the actor to starting its location
        //Actor actor = AgainAgain.getGame().getPlayer().getActor();
        //locations[0][0].setActor(actor);
        Actor actors[] = AgainAgain.getGame().getActors();

        locations[0][0].setActor(actors[ActorType.skeleton.ordinal()]);
        locations[0][3].setActor(actors[ActorType.werewolf.ordinal()]);
        locations[1][2].setActor(actors[ActorType.gollum.ordinal()]);
        locations[1][3].setActor(actors[ActorType.spider.ordinal()]);
        locations[1][4].setActor(actors[ActorType.anaconda.ordinal()]);
        locations[2][0].setActor(actors[ActorType.goblin.ordinal()]);
        locations[2][2].setActor(actors[ActorType.vampire.ordinal()]);
        locations[2][4].setActor(actors[ActorType.lizarus.ordinal()]);
        locations[3][0].setActor(actors[ActorType.zombie.ordinal()]);
        locations[3][2].setActor(actors[ActorType.ghoul.ordinal()]);
        locations[3][3].setActor(actors[ActorType.ogre.ordinal()]);
        locations[4][1].setActor(actors[ActorType.crapus.ordinal()]);
        locations[4][4].setActor(actors[ActorType.zorn.ordinal()]);

        return 1;
    }

    private static int assignItemsToLocations(Location[][] locations) {
        // Check for invalid input
        if (locations == null) {
            throw new MapControlException("The input must be valid for items assign to a location");
        }
        // Assign items to each locations
        ItemLocation itemL = (ItemLocation) locations[0][4];
        itemL.setItem(Item.Herbs);
        
        itemL = (ItemLocation) locations[1][1];
        itemL.setItem(Item.Water);
        
        itemL = (ItemLocation) locations[1][0];
        itemL.setItem(Item.Fruits);
        
        itemL = (ItemLocation) locations[2][1];
        itemL.setItem(Item.Shield);
        
        itemL = (ItemLocation) locations[2][3];
        itemL.setItem(Item.Sword);
        
        itemL = (ItemLocation) locations[3][1];
        itemL.setItem(Item.Silver_Arrow);
        
        itemL = (ItemLocation) locations[4][2];
        itemL.setItem(Item.Herbs);

        return 1;
    }

public static Location moveActor(Actor actor, int newRow, int newColumn) {
 if (actor == null ){
 throw new MapControlException("The input must be valid");
 }
 //game = get the currentGame in the main class
 Game game = AgainAgain.getGame();
 //map = get the map in the game object
 Map map = game.getMap();
 //locations = get the locations in the map
 Location [][] locations = map.getLocations();
// if (newRow < 1 || newRow > noOfRows in map OR
 //newColumn < 1 OR newColumn > noOfColumns in map) then
 if (newRow < 1 || newRow > map.getRowCount() || newColumn < 1 || newColumn > map.getColumnCount()){
 throw new MapControlException("The input must be valid");
         }
 //currentRow = get the row from the actor
 int currentRow = actor.getCoordinates().y;
 int currentColumn = actor.getCoordinates().x;
 //oldLocation = get the location from the locations
 Location oldLocation = locations[currentRow][currentColumn];
 //array at the current row and column
 Location location = locations[currentRow][currentColumn];
 //newLocation = get the location at the new row and column
 Location newLocation = locations[newRow][newColumn];
 //set row in actor to newRow
 Point point = new Point( newRow,newColumn);
 actor.setCoordinates(point);
 //set column in actor to newColumn
 return newLocation;
}    
    
}
