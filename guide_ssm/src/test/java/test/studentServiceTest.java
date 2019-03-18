package test;


import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import guide.bean.File;
import guide.bean.Message;
import guide.bean.Question;
import guide.bean.Student;
import guide.bean.Thesis;
import guide.dao.FileMapper;
import guide.dao.MessageMapper;
import guide.dao.QuestionMapper;
import guide.dao.StudentMapper;
import guide.dao.ThesisMapper;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class studentServiceTest {

	@Resource
	private StudentMapper studentdao;
	
	@Resource
	private ThesisMapper thesisdao;
	
	@Resource
	private QuestionMapper questiondao;
	
	@Resource
	private MessageMapper messagedao;
	
	@Resource
	private FileMapper filedao;
	
	
	@Test
	public void testselect() {
		Student student = studentdao.selectByPrimaryKey("1");
		System.out.println(student.toString());
	}
	
	@Test
	public void testInsertTheis() {
		Thesis thesis = new Thesis();
		thesis.setStuId("1");
		thesis.setTesId("2");
		thesis.setTesTitle("aaaa");
		int insert = thesisdao.insert(thesis);
		System.out.println(insert);
	}
	
	@Test
	public void testUpdateTheis() {
		Thesis thesis = new Thesis();
		thesis.setStuId("1");
		thesis.setTesId("2");
		thesis.setTesTitle("bbb");
		int insert = thesisdao.updateByPrimaryKey(thesis);
		System.out.println(insert);
	}
	
	@Test
	public void testaskQuestion() {
		Question question = new Question();
		question.setStuId("1");
		question.setTeacId("1");
		question.setTitle("ssssssss");
		int insert = questiondao.insert(question);
		System.out.println(insert);
	}
	
	@Test
	public void testfindQuestionNA() {
		List<Question> list = questiondao.findQuesiotnNA("1");
		System.out.println(list.toString());
	}
	
	@Test
	public void testfindQuestionA() {
		List<Question> list = questiondao.findQuesiotnA("1");
		System.out.println(list.toString());
	}
	
	@Test
	public void testsendMessage() {
		Message message = new Message();
		message.setMessageId("1");
		message.setMessageTitle("kkkkk");
		int insert = messagedao.insert(message);
		System.out.println(insert);
	}
	
	@Test
	public void testgetMessage() {
		System.out.println(messagedao.getAllMessage("1").get(0).toString());
	}
	
	@Test
	public void testInsert() {
		File file = new File();
		file.setFileId("1");
		file.setFileName("sssss");
		file.setTeacId("1");
		int insert = filedao.insert(file);
		System.out.println(insert);
	}
	
	@Test
	public void testDFile() {
		File file = filedao.selectByPrimaryKey("1");
		System.out.println(file.toString());
	}
	
}
