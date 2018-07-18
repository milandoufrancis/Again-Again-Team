/** @author January */
package Model;

import java.util.Arrays;
import java.util.Objects;
import java.awt.Point;

public class Actor {
    private String description;
    private Point coordinates; 
    private int actorHealth;
    private int actorDamage;
    private int actorScore;
    private int defence;
    
    
    public Actor() {
        
    
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Point coordinates) {
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
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.coordinates);
        hash = 59 * hash + this.actorHealth;
        hash = 59 * hash + this.actorDamage;
        hash = 59 * hash + this.actorScore;
        hash = 59 * hash + this.defence;
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
        if (this.defence != other.defence) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", coordinates=" + coordinates + ", actorHealth=" + actorHealth + ", actorDamage=" + actorDamage + ", actorScore=" + actorScore + ", defence=" + defence + '}';
    }

    
}
