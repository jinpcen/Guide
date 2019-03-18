package guide.service;

import java.util.List;

import guide.bean.File;
import guide.bean.Manager;
import guide.bean.Message;
import guide.bean.Student;
import guide.bean.Teacher;

public interface admiService {
	
	/**
	 * 更新管理员信息
	 * @param manager
	 * @return
	 */
	public int updateAdim(Manager manager);
	
	/**
	 * 插入一条教师信息
	 * @param teacher
	 * @return
	 */
	public int addTeacher(Teacher teacher);
	
	/**
	 * 删除一条教师信息
	 * @param teacher
	 * @return
	 */
	public int deleteTeacher(String teac_id);
	
	/**
	 * 根据教师id查找教师信息
	 * @param teac_id
	 * @return
	 */
	public Teacher findTeacherById(String teac_id);
	
	/**
	 * 查找所有的教师的信息
	 * @return
	 */
	public List<Teacher> findAllTeacher();
	
	/**
	 * 统计教师的数目
	 * @return
	 */
	public int countTeacher();
	
	/**
	 * 插入一条学生信息
	 * @param student
	 * @return
	 */
	public int addStudent(Student student);
	
	/**
	 * 删除一条学习信息
	 * @param student
	 * @return
	 */
	public int deleteStudent(String stu_id);
	
	/**
	 * 根据学生id查找学生信息
	 * @param stu_id
	 * @return
	 */
	public Student findStudentById(String stu_id);
	
	/**
	 * 查找所有的学生的信息
	 * @return
	 */
	public List<Student> findAllStudent();
	
	/**
	 * 统计所有的学生数目
	 * @return
	 */
	public int countStudent();
	
	/**
	 * 上传文件
	 * @param file
	 * @return
	 */
			
	public int upFile(File file);
	
	/**
	 * 下载文件
	 * @param file
	 * @return
	 */
	public File downFile(String fileId);
	
	/**
	 * 统计所有的文件的数目
	 * @return
	 */
	public int countFile();
	
	/**
	 * 删除一条文件信息
	 * @param file_id
	 * @return
	 */
	public int deleteFile(String file_id);
	
	/**
	 * 发送一条信息
	 * @param message
	 * @return
	 */
	public int sendMessage(Message message);
	
	/**
	 * 获得自己所有的消息
	 * @param id
	 * @return
	 */
	public List<Message> getAllMessage(String id);
	
	/**
	 * 统计某个时期的问题的数目
	 * @param date
	 * @return
	 */
	public int countQuestion(String date);
	
	/**
	 * 统计所有的问题的数目
	 * @return
	 */
	public int countQuestion();
	
	
}
