package guide.service;


import guide.bean.File;
import guide.bean.Manager;
import guide.bean.Student;
import guide.bean.Teacher;
import guide.dao.ManagerMapper;
import io.searchbox.core.DocumentResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class admiServiceTest {

    @Autowired
    studentService studentservice;
    @Autowired
    teacherService teacherservice;

    @Autowired
    admiService admiservice;

    @Autowired
    ManagerMapper managerMapper;

    @Test
    public void updateAdim() throws Exception {
        Manager manager = managerMapper.selectByPrimaryKey("1");
        manager.setMatName("cjp");
        int i = admiservice.updateAdim(manager);
        System.out.println(i);
    }

    @Test
    public void addTeacher() throws Exception {
        Teacher teacher = new Teacher();
        teacher.setTeacId("55");
        teacher.setTeacName("xzj");
        teacher.setPassword("12335467");
        teacher.setTeacSex("男");

        int addTeacher = admiservice.addTeacher(teacher);
        System.out.println(addTeacher);
    }

    @Test
    public void deleteTeacher() throws Exception {
        int teacher = admiservice.deleteTeacher("55");
        System.out.println(teacher);
    }

    @Test
    public void findTeacherById() throws Exception {
        Teacher teacher = admiservice.findTeacherById("1");
        System.out.println(teacher.toString());
    }

    @Test
    public void findAllTeacher() throws Exception {
        List<Teacher> teacher = admiservice.findAllTeacher();
        System.out.println(teacher.size());
    }

    @Test
    public void countTeacher() throws Exception {
        int countTeacher = admiservice.countTeacher();
        System.out.println(countTeacher);
    }

    @Test
    public void addStudent() throws Exception {
        Student student = new Student();
        student.setStuId("122222");
        student.setTeacId("1");
        student.setStuName("andd");
        student.setPasswprd("133121");
        int student1 = admiservice.addStudent(student);
        System.out.println(student);
    }

    @Test
    public void deleteStudent() throws Exception {
    }

    @Test
    public void findStudentById() throws Exception {
        DocumentResult files = studentservice.getFile("葵花宝典");
        System.out.println(files);
    }

    @Test
    public void findAllStudent() throws Exception {
        List<Student> allStudent = admiservice.findAllStudent();
        System.out.println(allStudent.size());
    }

    @Test
    public void countStudent() throws Exception {
        int countStudent = admiservice.countStudent();
        System.out.println(countStudent);
    }

    @Test
    public void upFile() throws Exception {

        File file = new File();
        file.setFileId("1");
        file.setFileName("葵花宝典");
        file.setFileDate(new Date());
        int i = teacherservice.upFile(file);
        System.out.println(i);

    }

    @Test
    public void downFile() throws Exception {

    }

    @Test
    public void countFile() throws Exception {
    }

    @Test
    public void deleteFile() throws Exception {
    }

    @Test
    public void sendMessage() throws Exception {
    }

    @Test
    public void getAllMessage() throws Exception {
    }

    @Test
    public void countQuestion() throws Exception {
    }

    @Test
    public void countQuestion1() throws Exception {
    }


}
