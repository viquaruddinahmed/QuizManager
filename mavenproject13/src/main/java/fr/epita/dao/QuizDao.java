
package fr.epita.dao;

import fr.epita.quizmanager.bean.AddQuestion;
import fr.epita.quizmanager.bean.quiz;
import fr.epita.quizmanager.bean.quizlist;
import java.util.ArrayList;

/**
 *
 * @author viquar
 */
public interface QuizDao {
    public boolean StoreQuestions(AddQuestion qstions);

    public boolean createQuiz();

    public ArrayList<quizlist> getQuizLidts();

    public ArrayList<AddQuestion> getQuestions(String qzid);
}
