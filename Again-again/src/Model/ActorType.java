
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Levi
 */
public enum ActorType {
    mainplayer("The Adventurer", "This is you, the main character of this game!", 1, "CPlayer"),
    werewolf("Werewolf", "This creature stands before you, teeth bared and claws ready", 2, "Monster"),
    skeleton("Skeleton", "Spooky, scary skeleton. Sends shivers down your spine...", 3, "Monster"),
    spider("Spider", "An eight legged freak of nature. Why do these exist?", 4, "Monster"),
    zombie("Zombie", "Use your head. This guy just wants to eat it.", 5, "Monster"),
    vampire("Vampire", "Kind of like a zombie, except this one likes to drink blood.", 6, "Monster"),
    ghoul("Ghoul", "Hey!!! watch out! They feed on dead people!", 7, "Monster"),
    anaconda("Anaconda", "The anaconda is watching and ready to attack!", 8, "Monster"),
    ogre("Ogre", "They love to surprise their prey, and these ones don't like onions.", 9, "Monster"),
    nemesis("Nemesis", "This is you, Only darker and edgier...", 10, "Monster"),
    gollum("Gollum", "This monster rocks! Literally.", 11, "Monster"),
    lizarus("Lizarus", "Cold-blooded guardians of the dungeon.", 12, "Monster"),
    crapus("Crapus", "This creature stands before you, teeth bared and claws ready", 13, "Monster"),
    goblin("Goblin", "That annoying cousin that ogres don't talk about.", 14, "Monster"),
    zorn("Zorn", "Sounds oddly like this weird saxophonist no one listened to...", 15, "Monster");
    String ActorName;
    String actorDescription;
    int value;
    String actorType;
    
    ActorType(String ActorName, String actorDescription, int value, String actorType){
        this.ActorName = ActorName;
        this.actorDescription = actorDescription;
        this.value = value;
        this.actorType = actorType;  
        
    }

    public String getActorName() {
        return ActorName;
    }

    public void setActorName(String ActorName) {
        this.ActorName = ActorName;
    }

    public String getActorDescription() {
        return actorDescription;
    }

    public void setActorDescription(String actorDescription) {
        this.actorDescription = actorDescription;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getActorType() {
        return actorType;
    }

    public void setActorType(String actorType) {
        this.actorType = actorType;
    }
    
}

