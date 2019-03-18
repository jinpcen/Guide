package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import guide.bean.Manager;
import guide.bean.Teacher;
import guide.dao.ManagerMapper;
import guide.dao.TeacherMapper;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
class testAmdi {

	@Resource
	private ManagerMapper managerdao;
	
	@Resource
	private TeacherMapper teacherdao;
	@Test
	void testUpdateAdim() {
		Manager manager = managerdao.selectByPrimaryKey("1");
		manager.setMatName("岑锦平");
		int i = managerdao.updateByPrimaryKey(manager);
		System.out.println(i);
	}

	@Test
	void testAddTeacher() {
		Teacher teacher = new Teacher();
		teacher.setTeacId("2");
		teacher.setTeacName("刘军");
		teacher.setPassword("123");
		int insert = teacherdao.insert(teacher);
		System.out.println(insert);
	}

	@Test
	void testDeleteTeacher() {
		int i = teacherdao.deleteByPrimaryKey("2");
		System.out.println(i);
	}

	@Test
	void testFindTeacherById() {
		Teacher teacher = teacherdao.selectByPrimaryKey("1");
		System.out.println(teacher.toString());
	}

	@Test
	void testFindAllTeacher() {
		List<Teacher> list = teacherdao.findAllTeacher();
		System.out.println(list.toString());
	}

	@Test
	void testCountTeacher() {
		System.out.println(teacherdao.countTeacher());
	}

	@Test
	void testAddStudent() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testDeleteStudent() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testFindStudentById() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testFindAllStudent() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testCountStudent() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testUpFile() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testDownFile() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testCountFile() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testDeleteFile() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testSendMessage() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetAllMessage() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testCountQuestionString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testCountQuestion() {
		fail("Not yet implemented"); // TODO
	}

}
