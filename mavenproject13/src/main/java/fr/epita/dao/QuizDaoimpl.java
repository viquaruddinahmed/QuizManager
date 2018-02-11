package fr.epita.dao;

import fr.epita.quizmanager.bean.AddQuestion;
import fr.epita.quizmanager.bean.quiz;
import fr.epita.quizmanager.bean.quizlist;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author viquar
 */
@Repository
@Transactional
public class QuizDaoimpl implements QuizDao {

    @Autowired
    SessionFactory factory;

    public boolean StoreQuestions(AddQuestion qstions) {
        Session session = factory.openSession();

        session.save(qstions);

        return true;
    }

    public boolean createQuiz() {

        Session session = factory.openSession();
        Criteria cr = session.createCriteria(AddQuestion.class);
        ArrayList<AddQuestion> mlist = (ArrayList<AddQuestion>) cr.list();
        Random rand = new Random();
        try {
            // Generate random integers in range 0 to 999
            int rand_int1 = rand.nextInt(1000);
            quizlist list = new quizlist();
            list.setQuizid(rand_int1);
            list.setQuizname("quiz" + rand_int1);
            session.save(list);
            for (AddQuestion qs : mlist) {

                quiz q = new quiz();
                q.setQuizid(rand_int1);
                q.setQuestion_id(qs.getId() + "");
                q.setQuizname("quiz" + rand_int1);
                session.save(q);
            }

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public ArrayList<quizlist> getQuizLidts() {

        Session session = factory.openSession();
        Criteria cr = session.createCriteria(quizlist.class);
        ArrayList<quizlist> mlist = (ArrayList<quizlist>) cr.list();

        return mlist;
    }

    public ArrayList<AddQuestion> getQuestions(String qzid) {
ArrayList<AddQuestion> alist=new ArrayList<AddQuestion>();
        Session session = factory.openSession();
        Criteria cr = session.createCriteria(quiz.class);
        cr.add(Restrictions.eq("quizid", Integer.parseInt(qzid)));
        ArrayList<quiz> quizlist = (ArrayList<quiz>) cr.list();
        for(quiz qz:quizlist){
          AddQuestion qstion=(AddQuestion)session.get(AddQuestion.class, Integer.parseInt(qz.getQuestion_id()));
            alist.add(qstion);
     
           
        }
        

return alist;
    }

}
