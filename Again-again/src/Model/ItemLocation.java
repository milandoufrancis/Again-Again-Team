/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author My Laptop
 */
public class ItemLocation extends Location{
    private Item item;
    
    
    public ItemLocation() {
    }

    public ItemLocation(int row, int column, boolean visited, String displaySymbol, int locationValue, String description) {
        super(row, column, visited, displaySymbol, locationValue, description);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.item);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemLocation other = (ItemLocation) obj;
        if (this.item != other.item) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemLocation{" + "item=" + item + '}';
    }
    
    
    
    

    
    
}
