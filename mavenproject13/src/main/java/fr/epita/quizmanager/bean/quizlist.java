
package fr.epita.quizmanager.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author viquar
 */
@Entity
@Table(name = "quizlist")
public class quizlist {
    @Id
    @Column(name = "quizid")
    int quizid;

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
     @Column(name = "quizname")
    String quizname;
}
