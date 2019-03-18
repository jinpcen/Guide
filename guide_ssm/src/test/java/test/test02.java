package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import guide.bean.Question;
import guide.bean.QuestionKey;
import guide.bean.Student;
import guide.bean.Teacher;
import guide.bean.Thesis;
import guide.dao.QuestionMapper;
import guide.dao.StudentMapper;
import guide.dao.TeacherMapper;
import guide.dao.ThesisMapper;


@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
class test02 {
	@Resource
	private TeacherMapper teacherdao;
	
	@Resource
	private StudentMapper studentdao;
	
	@Resource
	private ThesisMapper thesisdao;
	
	@Resource
	private QuestionMapper questiondao;
	
	@Test
	void testGetTeacher() {
		Teacher teacher = teacherdao.selectByPrimaryKey("1");
		System.out.println(teacher.toString());
	}

	@Test
	void testUpdateTeacher() {
		//Teacher [teacId=1, teacName=ljj, teacSex=男, 
		//teacDepar=1, email=888888, phone=8888, password=8888]
		Teacher teacher = teacherdao.selectByPrimaryKey("1");
		teacher.setPhone("123456789");
		teacher.setEmail("8888@88.com");
		int i = teacherdao.updateByPrimaryKey(teacher);
		System.out.println(i);
	}

	@Test
	void testGetTeaStudent() {
		List<Student> list = studentdao.getAll("1");
		System.out.println(list.toString());
	}

	@Test
	void testGetThesis() {
		List<Thesis> thesis = thesisdao.getThesis("1");
		System.out.println(thesis.toString());
	}

	@Test
	void testGetAll() {
		List<Question> list = questiondao.getAll("1");
		System.out.println(list.toString());
	}
	

	@Test
	void testGetAllNA() {
		List<Question> list = questiondao.getAllNA("1");
		System.out.println(list.toString());
	}

	@Test
	void testUpdateQuestion() {
	}

	@Test
	void testUpFile() {
	}

	@Test
	void testObject() {
		fail("Not yet implemented"); // TODO
	}

}
