/** @author January */
package Model;

import java.util.Arrays;
import java.util.Objects;


public class Actor {
    private String description;
    private int[][] coordinates; 
    private int actorHealth;
    private int actorDamage;
    private int actorScore;
    
    public Actor() {
    
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int[][] getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(int[][] coordinates) {
        this.coordinates = coordinates;
    }

    public int getActorHealth() {
        return actorHealth;
    }
    public void setActorHealth(int actorHealth) {
        this.actorHealth = actorHealth;
    }

    public int getActorDamage() {
        return actorDamage;
    }
    public void setActorDamage(int actorDamage) {
        this.actorDamage = actorDamage;
    }

    public int getActorScore() {
        return actorScore;
    }
    public void setActorScore(int actorScore) {
        this.actorScore = actorScore;
    }

    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", coordinates=" + coordinates + ", actorHealth=" + actorHealth + ", actorDamage=" + actorDamage + ", actorScore=" + actorScore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Arrays.deepHashCode(this.coordinates);
        hash = 89 * hash + this.actorHealth;
        hash = 89 * hash + this.actorDamage;
        hash = 89 * hash + this.actorScore;
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
        final Actor other = (Actor) obj;
        if (this.actorHealth != other.actorHealth) {
            return false;
        }
        if (this.actorDamage != other.actorDamage) {
            return false;
        }
        if (this.actorScore != other.actorScore) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Arrays.deepEquals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }
    
}