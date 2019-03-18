package guide.serviceImpl;

import java.io.IOException;
import java.util.List;

import io.searchbox.client.JestClient;
import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import guide.bean.File;
import guide.bean.Question;
import guide.bean.Student;
import guide.bean.Teacher;
import guide.bean.Thesis;
import guide.dao.FileMapper;
import guide.dao.QuestionMapper;
import guide.dao.StudentMapper;
import guide.dao.TeacherMapper;
import guide.dao.ThesisMapper;
import guide.service.teacherService;

@Service("teacherService")
@Transactional
public class teacherServiceImpl implements teacherService {


	@Autowired
	JestClient jestClient;

	@Autowired
	private TeacherMapper teacherdao;
	
	@Autowired
	private StudentMapper studentdao;
	
	@Autowired
	private ThesisMapper thesisdao;
	
	@Autowired
	private QuestionMapper questiondao;
	
	@Autowired
	private FileMapper filedao;

	@Override
	public Teacher getTeacher(String teac_id) {
		return teacherdao.selectByPrimaryKey(teac_id);
	}

	@Override
	public int updateTeacher(Teacher teacher) {
		return teacherdao.updateByPrimaryKey(teacher);
	}

	@Override
	public List<Student> getTeaStudent(String teac_id) {
		return studentdao.getAll(teac_id);
	}

	@Override
	public List<Thesis> getThesis(String teac_id) {
		return thesisdao.getThesis(teac_id);
	}

	@Override
	public List<Question> getAll(String teac_id) {
		return questiondao.getAll(teac_id);
	}

	@Override
	public List<Question> getAllNA(String teac_id) {
		return questiondao.getAllNA(teac_id);
	}

	@Override
	public int updateQuestion(Question question) {
		return questiondao.updateByPrimaryKey(question);
	}

	@Override
	public int upFile(File file) {
		Index build = new Index.Builder(file).index("gdpu").type("file").build();
		try {
			DocumentResult documentResult = jestClient.execute(build);
			if (documentResult!=null)
				return 1;
			else
				return 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
