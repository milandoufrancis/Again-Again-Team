/** @author January  */
package Model;

import java.util.Objects;


public class Question {
    private String questionType;
    private String questionText;
    private boolean questionAnswer;

    public Question() {
    }

    public String getQuestionTpye() {
        return questionType;
    }

    public void setQuestionType(String questionTpye) {
        this.questionType = questionType;
    }

    public String getQuestionType() {
        return questionType;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public boolean isQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(boolean questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    
    @Override
    public String toString() {
        return "Questions{" + "questionTpye=" + questionType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.questionType);
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
        final Question other = (Question) obj;
        if (!Objects.equals(this.questionType, other.questionType)) {
            return false;
        }
        return true;
    }
    
    
    
}
