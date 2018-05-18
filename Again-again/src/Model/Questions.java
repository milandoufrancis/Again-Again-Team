/** @author January  */
package Model;

import java.util.Objects;


public class Questions {
    private String questionTpye;

    public Questions() {
    }

    public String getQuestionTpye() {
        return questionTpye;
    }

    public void setQuestionTpye(String questionTpye) {
        this.questionTpye = questionTpye;
    }

    @Override
    public String toString() {
        return "Questions{" + "questionTpye=" + questionTpye + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.questionTpye);
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
        final Questions other = (Questions) obj;
        if (!Objects.equals(this.questionTpye, other.questionTpye)) {
            return false;
        }
        return true;
    }
    
    
    
}
