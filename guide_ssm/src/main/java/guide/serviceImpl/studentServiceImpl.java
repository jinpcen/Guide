package guide.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
import guide.service.studentService;

@Service("studentService")
@Transactional
public class studentServiceImpl implements studentService {

	@Autowired
	private StudentMapper studentdao;
	
	@Autowired
	private ThesisMapper thesisdao;
	
	@Autowired
	private QuestionMapper questiondao;

	@Autowired
	private MessageMapper messagedao;
	
	@Autowired
	private FileMapper filedao;
	@Override
	public int updateStudent(Student student) {
		return studentdao.updateByPrimaryKey(student);
	}

	@Override
	public Student getStudent(String stu_id) {
		return studentdao.selectByPrimaryKey(stu_id);
	}

	@Override
	public int insertThesis(Thesis thesis) {
		return thesisdao.insert(thesis);
	}

	@Override
	public int updateThesis(Thesis thesis) {
		return thesisdao.updateByPrimaryKey(thesis);
	}

	@Override
	public int askQuestion(Question question) {
		return questiondao.insert(question);
	}

	@Override
	public List<Question> findQuesiotnA(String stu_id) {
		return questiondao.findQuesiotnA(stu_id);
	}

	@Override
	public List<Question> findQuesiotnNA(String stu_id) {
		return questiondao.findQuesiotnNA(stu_id);
	}

	@Override
	public int sendMessage(Message message) {
		return messagedao.insert(message);
	}


	@Override
	public List<Message> getMessage(String stu_id) {
		return messagedao.getMessage(stu_id);
	}

	@Override
	public File DFile(String file_id) {
		return filedao.selectByPrimaryKey(file_id);
	}

	@Override
	public int insertFile(File file) {
		return filedao.insert(file);
	}

	@Override
	public Thesis getThesis(String stuId) {
		return thesisdao.getthesis(stuId);
	}

	@Override
	public List<File> getFile() {
		return filedao.getFile();
	}
	
	
}
