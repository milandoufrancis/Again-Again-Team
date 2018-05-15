/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Levi and Hidnel
 */


public class Player implements Serializable {
    private String currentFile;
    private String name;
    private ArrayList<Game> games = new ArrayList<Game>();

    public Player() {
    }

        
    public String getCurrentFile() {
        return currentFile;
    }

    public String getName() {
        return name;
    }

    public void setCurrentFile(String currentFile) {
        this.currentFile = currentFile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.currentFile);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.games);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.currentFile, other.currentFile)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        return true;
    }
    
    

        
    
    
    
}
