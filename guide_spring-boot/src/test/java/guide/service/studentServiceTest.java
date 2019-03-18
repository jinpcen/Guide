package guide.service;


import guide.bean.Message;
import guide.bean.Question;
import guide.bean.Student;
import guide.bean.Thesis;
import guide.dao.ThesisMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class studentServiceTest {

    @Autowired
    ThesisMapper thesisMapper;

    @Autowired
    studentService studentservice;

    @Test
    public void updateStudent() throws Exception {
        Student student = studentservice.getStudent("1");
        student.setStuName("cjp");
        int i = studentservice.updateStudent(student);
        System.out.println(i);
    }

    @Test
    public void getStudent() throws Exception {
        int max = thesisMapper.findMax();
        System.out.println(max);
    }

    @Test
    public void insertThesis() throws Exception {
        int max = thesisMapper.findMax();

        Thesis thesis = new Thesis();
        thesis.setTesId(Integer.toString(max+1));
        thesis.setStuId("1");
        int thesis1 = studentservice.insertThesis(thesis);
        System.out.println(thesis);
    }

    @Test
    public void updateThesis() throws Exception {
        List<Thesis> theses = thesisMapper.getthesis("1");
        Thesis thesis = theses.get(1);
        thesis.setTesTitle("bbkbkbs");
        int update = thesisMapper.updateByPrimaryKey(thesis);
        System.out.println(update);
    }

    @Test
    public void getThesis() throws Exception {
    }

    @Test
    public void askQuestion() throws Exception {
        Question question = new Question();
        question.setStuId("1");
        question.setTeacId("1");
        question.setAskDay(new Date());
        int i = studentservice.askQuestion(question);
        System.out.println(i);
    }

    @Test
    public void findQuesiotnA() throws Exception {
        List<Question> quesiotnA = studentservice.findQuesiotnA("1");
        System.out.println(quesiotnA.size());
    }

    @Test
    public void findQuesiotnNA() throws Exception {
        List<Question> quesiotnA = studentservice.findQuesiotnNA("1");
        System.out.println(quesiotnA.size());
    }

    @Test
    public void sendMessage() throws Exception {

        Message message = new Message();
        message.setMessageId("1");
        int i = studentservice.sendMessage(message);
        System.out.println(i);
    }

    @Test
    public void getMessage() throws Exception {
    }

    @Test
    public void getFile() throws Exception {
    }

    @Test
    public void DFile() throws Exception {
    }

    @Test
    public void insertFile() throws Exception {
    }


}
