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
public class QuestionLocation  extends Location{
    private String requiredCorrect;
    private String noCorrect;
    

    public QuestionLocation() {
    }
    
    

    public String getRequiredCorrect() {
        return requiredCorrect;
    }

    public void setRequiredCorrect(String requiredCorrect) {
        this.requiredCorrect = requiredCorrect;
    }

    public String getNoCorrect() {
        return noCorrect;
    }

    public void setNoCorrect(String noCorrect) {
        this.noCorrect = noCorrect;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.requiredCorrect);
        hash = 37 * hash + Objects.hashCode(this.noCorrect);
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
        final QuestionLocation other = (QuestionLocation) obj;
        if (!Objects.equals(this.requiredCorrect, other.requiredCorrect)) {
            return false;
        }
        if (!Objects.equals(this.noCorrect, other.noCorrect)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuestionLocation{" + "requiredCorrect=" + requiredCorrect + ", noCorrect=" + noCorrect + '}';
    }
    
    
    
}
