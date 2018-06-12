/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.io.Serializable;
/**
 *
 * @author Levi
 */
public class Stats implements Serializable{
    private int locationCount;
    private int PlayerHealth;
    private int PlayerDamage;
    private int PlayerDefense;
    private int itemStorage;
    
    

    public int getLocationCount() {
        return locationCount;
    }

    public void setLocationCount(int locationCount) {
        this.locationCount = locationCount;
    }

    public int getPlayerHealth() {
        return PlayerHealth;
    }

    public void setPlayerHealth(int PlayerHealth) {
        this.PlayerHealth = PlayerHealth;
    }

    public int getPlayerDamage() {
        return PlayerDamage;
    }

    public void setPlayerDamage(int PlayerDamage) {
        this.PlayerDamage = PlayerDamage;
    }

    public int getPlayerDefense() {
        return PlayerDefense;
    }

    public void setPlayerDefense(int PlayerDefense) {
        this.PlayerDefense = PlayerDefense;
    }

    public int getItemStorage() {
        return itemStorage;
    }

    public void setItemStorage(int itemStorage) {
        this.itemStorage = itemStorage;
    }

    public Stats(int locationCount, int PlayerHealth, int PlayerDamage, int PlayerDefense, int itemStorage) {
        this.locationCount = locationCount;
        this.PlayerHealth = PlayerHealth;
        this.PlayerDamage = PlayerDamage;
        this.PlayerDefense = PlayerDefense;
        this.itemStorage = itemStorage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.locationCount;
        hash = 29 * hash + this.PlayerHealth;
        hash = 29 * hash + this.PlayerDamage;
        hash = 29 * hash + this.PlayerDefense;
        hash = 29 * hash + this.itemStorage;
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
        final Stats other = (Stats) obj;
        if (this.locationCount != other.locationCount) {
            return false;
        }
        if (this.PlayerHealth != other.PlayerHealth) {
            return false;
        }
        if (this.PlayerDamage != other.PlayerDamage) {
            return false;
        }
        if (this.PlayerDefense != other.PlayerDefense) {
            return false;
        }
        if (this.itemStorage != other.itemStorage) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return "Stats{" + "location's visited=" + locationCount + ", PlayerHealth=" + PlayerHealth + ", PlayerDamage=" + PlayerDamage + ", PlayerDefense=" + PlayerDefense + ", itemStorage=" + itemStorage + '}';
    }
    
    
}
