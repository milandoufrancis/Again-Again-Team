/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author My Laptop
 */
import java.io.Serializable;

 public enum Item implements Serializable{
    Sword("Sword", "This thing is sure sharp. Try whacking something with it,", 1, "weapon"),
    Shield("Shield", "this thing is dull, make sure to let sharp stuff hit it", 2, "defence"),
    Herbs("Herbs", "Hey mann this is for you to feel better after you get hurt", 3, "healing"),
    Fruits("Fruits", "This is for you to get better", 4, "healing"),
    Water("Holy water", "This is the kind of water that scares vampires to their core", 5, "weapon"),
    Silver_Arrow("Arrow", "An arrow poisoned with wolfsbane; perfect against werewolves!", 6, "weapon");
    private String itemName;
    private String itemDescription;
    private int value;
    private String itemType;
    
    Item(String itemName, String itemDescription, int value, String itemType){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.value = value;
        this.itemType = itemType;  
        
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getValue() {
        return value;
    }

    public String getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", itemDescription=" + itemDescription + ", value=" + value + ", itemType=" + itemType + '}';
    }
    
     
    
    
}
