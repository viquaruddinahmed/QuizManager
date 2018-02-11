
package fr.epita.controllers;

import fr.epita.dao.QuizDao;
import fr.epita.quizmanager.bean.AddQuestion;
import fr.epita.quizmanager.bean.quiz;
import fr.epita.quizmanager.bean.quizlist;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author viquar
 */
@Controller
public class QuizHandler {
    @Autowired
    QuizDao dao;
    @RequestMapping("addquestion.qz")
    public ModelAndView hello(@RequestParam("question") String question,@RequestParam("option1") String option_one,@RequestParam("option2") String option_two,@RequestParam("option3") String option_three,@RequestParam("option4") String option_four,@RequestParam("answer")String correct_option){
        AddQuestion qstion=new AddQuestion();
        qstion.setQuestion(question);
        qstion.setOption1(option_one);
        qstion.setOption2(option_two);
        qstion.setOption3(option_three);
        qstion.setOption4(option_four);
        
       
        
        qstion.setAnswer(correct_option);
         ModelAndView mv=new ModelAndView("showmessage");
        if(dao.StoreQuestions(qstion)){
           
            mv.addObject("message", "sucessfully inserted");
        }else{
            mv.addObject("message", "Failed to insert");  
        }
        
        return mv;
    }
    
    
    @RequestMapping(value = "CreateQuiz.qz")
    public ModelAndView createqz(){
        
        if(dao.createQuiz()){
             return new ModelAndView("CreateQuiz");
        }else{
           ModelAndView mv= new ModelAndView("showmessage");
        mv.addObject("message", "Failed to insert");  
        return mv;
        }
        
      
    }
    @RequestMapping(value = "StudentQuiz.qz")
    public ModelAndView showquizlist(){
       ModelAndView m= new ModelAndView("Quizlist");
        ArrayList<quizlist>quizlist= dao.getQuizLidts();
        m.addObject("quizlist", quizlist);
      return m;
    }
    
    @RequestMapping(value = "takeqz")
    public ModelAndView showquiz(@RequestParam("qzid")String qzid,@RequestParam("qzname")String qzname){
        ModelAndView mdl=new ModelAndView("quiz");
        mdl.addObject("qzid", qzid);
         mdl.addObject("qzname", qzname);
         
       ArrayList<AddQuestion> aList=  dao.getQuestions(qzid);
       mdl.addObject("questionsList", aList);
       
        return  mdl;
    }
    
    
    // @RequestMapping(value = "submittakenquiz", method = RequestMethod.GET)
     
     
     @RequestMapping(value = "submittakenquiz",method = RequestMethod.GET)
    public String submittaketQz(Model model, HttpServletRequest request, HttpSession session, @RequestParam("sid") String sid, @RequestParam("qid") String qzid, @RequestParam("quizname") String quizname) {

        try {
            String[] question_ids = request.getParameterValues("questions");
            int total_qs=question_ids.length;
            int correct_ans=0;
for(String qid:question_ids){
    String ansid=request.getParameter("ans_"+qid);
    String answered=request.getParameter(qid);
    if(ansid.equalsIgnoreCase(answered)){
        correct_ans++;
    }
}           


            model.addAttribute("correct_answers", correct_ans);
            model.addAttribute("message", "You have scored :" + correct_ans + "/" + total_qs);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "unable to submit ");
        }
        return "msg";
    }
    
}
