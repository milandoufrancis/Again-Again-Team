/**  * * @author January */
package Model;

import java.util.Arrays;
import java.util.Objects;


public class Enemy {
    private int enemyHP;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
    private int enemyDamage;
    private int enemyScore;
    private int defence;
    private String description; 
    private int[][] enemyLocation;

    public Enemy() {
    }

    public int getEnemyHP() {
        return enemyHP;
    }
    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }
    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    public int getEnemyScore() {
        return enemyScore;
    }
    public void setEnemyScore(int enemyScore) {
        this.enemyScore = enemyScore;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int[][] getEnemyLocation() {
        return enemyLocation;
    }
    public void setEnemyLocation(int[][] enemyLocation) {
        this.enemyLocation = enemyLocation;
    }

    @Override
    public String toString() {
        return "Enemy{" + "enemyHP=" + enemyHP + ", enemyDamage=" + enemyDamage + ", enemyScore=" + enemyScore + ", defence=" + defence + ", description=" + description + ", enemyLocation=" + enemyLocation + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.enemyHP;
        hash = 31 * hash + this.enemyDamage;
        hash = 31 * hash + this.enemyScore;
        hash = 31 * hash + this.defence;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + Arrays.deepHashCode(this.enemyLocation);
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
        final Enemy other = (Enemy) obj;
        if (this.enemyHP != other.enemyHP) {
            return false;
        }
        if (this.enemyDamage != other.enemyDamage) {
            return false;
        }
        if (this.enemyScore != other.enemyScore) {
            return false;
        }
        if (this.defence != other.defence) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Arrays.deepEquals(this.enemyLocation, other.enemyLocation)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
