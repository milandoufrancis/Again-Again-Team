/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Levi Sargeant- created May 17,2018
 */
public class Map implements Serializable{
    private String description;
    private int rowCount;
    private int columnCount;
    private int row;
    private int column;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", row=" + row + ", column=" + column + '}';
    }

    
    


    
    
}
