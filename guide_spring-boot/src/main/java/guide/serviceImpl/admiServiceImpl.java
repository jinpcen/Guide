package guide.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import guide.bean.File;
import guide.bean.Manager;
import guide.bean.Message;
import guide.bean.Student;
import guide.bean.Teacher;
import guide.dao.FileMapper;
import guide.dao.ManagerMapper;
import guide.dao.MessageMapper;
import guide.dao.QuestionMapper;
import guide.dao.StudentMapper;
import guide.dao.TeacherMapper;
import guide.service.admiService;

@Service("admiService")
@Transactional
public class admiServiceImpl implements admiService {
	
	@Autowired
	private ManagerMapper managerdao;
	
	@Autowired
	private TeacherMapper teacherdao;
	
	@Autowired
	private StudentMapper studentdao;
	
	@Autowired
	private FileMapper filedao;
	
	@Autowired
	private MessageMapper messagedao;
	
	@Autowired
	private QuestionMapper questiondao;
	
	@Override
	public int updateAdim(Manager manager) {
		return managerdao.updateByPrimaryKey(manager);
	}

	@Override
	public int addTeacher(Teacher teacher) {
		return teacherdao.insert(teacher);
	}

	@Override
	public int deleteTeacher(String teac_id) {
		return teacherdao.deleteByPrimaryKey(teac_id);
	}

	@Override
	public Teacher findTeacherById(String teac_id) {
		return teacherdao.selectByPrimaryKey(teac_id);
	}

	@Override
	public List<Teacher> findAllTeacher() {
		return teacherdao.findAllTeacher();
	}

	@Override
	public int countTeacher() {
		return teacherdao.countTeacher();
	}

	@Override
	public int addStudent(Student student) {
		return studentdao.insert(student);
	}

	@Override
	public int deleteStudent(String stu_id) {
		return studentdao.deleteByPrimaryKey(stu_id);
	}

	@Override
	public Student findStudentById(String stu_id) {
		return studentdao.selectByPrimaryKey(stu_id);
	}

	@Override
	public List<Student> findAllStudent() {
		return studentdao.findAllStudent();
	}

	@Override
	public int countStudent() {
		return studentdao.countStduent();
	}

	@Override
	public int upFile(File file) {
		return filedao.insert(file);
	}

	@Override
	public File downFile(String fileId) {
		return filedao.selectByPrimaryKey(fileId);
	}

	@Override
	public int countFile() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteFile(String file_id) {
		return filedao.deleteByPrimaryKey(file_id);
	}

	@Override
	public int sendMessage(Message message) {
		return messagedao.insert(message);
	}

	@Override
	public List<Message> getAllMessage(String id) {
		return messagedao.getAllMessage(id);
	}

	@Override
	public int countQuestion(String date) {
		return questiondao.countQuestions(date);
	}

	@Override
	public int countQuestion() {
		return questiondao.countQuestion();
	}
}
