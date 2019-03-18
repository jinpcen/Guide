package guide.service;

import java.util.List;

import guide.bean.File;
import guide.bean.Message;
import guide.bean.Question;
import guide.bean.Student;
import guide.bean.Thesis;
import io.searchbox.core.DocumentResult;

public interface studentService {
	/**
	 * 更新学生信息
	 * @param student
	 * @return
	 */
	public int updateStudent(Student student);
	
	/**
	 * 获取学生信息
	 * @param stu_id
	 * @return
	 */
	public Student getStudent(String stu_id);
	
	/**
	 * 上传论文
	 * @param thesis
	 * @return
	 */
	public int insertThesis(Thesis thesis);
	
	/**
	 * 更新论文
	 * @param thesis
	 * @return
	 */
	public int updateThesis(Thesis thesis);
	
	/**
	 * 获取论文
	 * @param stuId
	 * @return
	 */
	public List<Thesis> getThesis(String stuId);
	
	
	/**
	 * 提出问题
	 * @param question
	 * @return
	 */
	public int askQuestion(Question question);
	
	/**
	 * 查看所有已经被回答了的问题
	 * @param stu_id
	 * @return
	 */
	public List<Question> findQuesiotnA(String stu_id);
	
	/**
	 * 查看所有没有被回答的问题
	 * @param stu_id
	 * @return
	 */
	public List<Question> findQuesiotnNA(String stu_id);
	
	/**
	 * 发送消息
	 * @param message
	 * @return
	 */
	public int sendMessage(Message message);
	
	/**
	 * 获取所有消息
	 * @param stu_id
	 * @return
	 */
	public List<Message> getMessage(String stu_id);
	
	/**
	 * 获取所有的文件
	 * @return
	 */
	public DocumentResult getFile(String name);
	
	/**
	 * 上传文件
	 * @param file_id
	 * @return
	 */
	public File DFile(String file_id);
	
	/**
	 * 下载文件
	 * @param file
	 * @return
	 */
	public int insertFile(File file);
	
}
