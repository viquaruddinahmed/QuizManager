
package fr.epita.quizmanager.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author viquar
 */
@Entity
@Table(name = "quizQuestions")
public class quiz {
    @Id
        @Column(name = "qid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int qid;
    
    
   
    
    @Column(name = "quizid")
    private int quizid;
     @Column(name = "quizname")
    private String quizname;
       @Column(name = "question_id")
    private String question_id;

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public int getQuizid() {
        return quizid;
    }

    public void setQuizid(int quizid) {
        this.quizid = quizid;
    }

    public String getQuizname() {
        return quizname;
    }

    public void setQuizname(String quizname) {
        this.quizname = quizname;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }
  
}
