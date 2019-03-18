package guide;

import guide.bean.Question;
import guide.bean.Student;
import guide.bean.Teacher;
import guide.bean.Thesis;
import guide.service.teacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuideApplicationTests {

	@Autowired
	teacherService  teacherService;

	@Test
	public void contextLoads() {
		Teacher teacher = teacherService.getTeacher("1");
		System.out.println(teacher.toString());
		teacher.setTeacName("刘军233");
		int i = teacherService.updateTeacher(teacher);
		System.out.println(i);
	}

	@Test
	public void getStudent(){
		List<Student> student = teacherService.getTeaStudent("1");
		System.out.println(student.size());
	}


	@Test
	public void getThesis(){
		List<Thesis> thesis = teacherService.getThesis("1");
		System.out.println(thesis.toString());
	}

	@Test
	public void getAll(){
		List<Question> all = teacherService.getAllNA("1");

		Question question = all.get(0);
		question.setAnwser("aaaaaa");

		int updateQuestion = teacherService.updateQuestion(question);
		System.out.println(updateQuestion);
	}

	@Test
	public void updateQ(){

	}



}
