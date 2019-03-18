package guide.service;

import java.util.List;

import guide.bean.File;
import guide.bean.Question;
import guide.bean.Student;
import guide.bean.Teacher;
import guide.bean.Thesis;

public interface teacherService {
	
	/**
	 * 获得自己所有的信息
	 * @param teac_id
	 * @return
	 */
	public Teacher getTeacher(String teac_id);
	
	/**
	 * 更新教师信息
	 * @param teacher
	 * @return
	 */
	public int updateTeacher(Teacher teacher);
	
	/**
	 * 获得教师指导的所有学生的信息
	 * @param teac_id
	 * @return
	 */
	public List<Student> getTeaStudent(String teac_id);
	
	/**
	 * 获得教师指导的学生的论文的所有信息
	 * @param teac_id
	 * @return
	 */
	public List<Thesis> getThesis(String teac_id);
	
	/**
	 * 获得学生询问的所有的问题
	 * @param teac_id
	 * @return
	 */
	public List<Question> getAll(String teac_id);
	
	/**
	 * 获得教师所有没有回答的问题
	 * @param teac_id
	 * @return
	 */
	public List<Question> getAllNA(String teac_id);
	
	/**
	 * 教师回答问题,更新相应的问题信息
	 * @param question
	 * @return
	 */
	public int updateQuestion(Question question);
	
	/**
	 * 教师上传文件
	 * @param file
	 * @return
	 */
	public int upFile(File file);
}
