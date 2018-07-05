/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author Levi
 */
public class TrapLocation extends Location{
    private String trapType;
    private int trapScore;
    
    
    
    public String getTrapType() {
        return trapType;
    }

    public void setTrapType(String trapType) {
        this.trapType = trapType;
    }

    public int getTrapScore() {
        return trapScore;
    }

    public void setTrapScore(int trapScore) {
        this.trapScore = trapScore;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.trapType);
        hash = 97 * hash + this.trapScore;
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
        final TrapLocation other = (TrapLocation) obj;
        if (this.trapScore != other.trapScore) {
            return false;
        }
        if (!Objects.equals(this.trapType, other.trapType)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "TrapLocation{" + "trapType=" + trapType + ", trapScore=" + trapScore + '}';
    }
    
    
}
