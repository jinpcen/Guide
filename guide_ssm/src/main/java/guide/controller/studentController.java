package guide.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import guide.bean.File;
import guide.bean.Message;
import guide.bean.Question;
import guide.bean.QuestionKey;
import guide.bean.Student;
import guide.bean.Teacher;
import guide.bean.Thesis;
import guide.service.studentService;
import guide.service.teacherService;

@Controller
@RequestMapping("/student")
public class studentController {
	
	@Autowired
	private studentService studentservice;
	
	@Autowired
	private teacherService teacherservice;
	
	@RequestMapping("/login")
	public ModelAndView login(@Param("username") String username,@Param("password") String password) {
		ModelAndView mv = new ModelAndView();
		Student student = studentservice.getStudent(username);
		if(student!=null) {
			if(!student.getPasswprd().equals(password)){
				mv.addObject("error", "密码错误");
				mv.setViewName("login");
			}else {
				mv.addObject("student", student);
				mv.setViewName("studentIndex");
			}
		}else {
			mv.addObject("error", "用户名错误");
			mv.setViewName("login");
		}
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(@RequestBody Student student) {
		ModelAndView view = new ModelAndView();
		int i = studentservice.updateStudent(student);
		if(i<=0) {
			view.addObject("error", "更新失败");
		}else {
			view.addObject("student", student);
		}
		return view;
	}
	
	@RequestMapping("/getTeacher")
	public ModelAndView getTeacher(String stuId) {
		ModelAndView view = new ModelAndView();
		Student student = studentservice.getStudent(stuId);
		Teacher teacher = teacherservice.getTeacher(student.getTeacId());
		view.addObject("teacher", teacher);
		return view;
	}
	
	@RequestMapping("/findQuestionA")
	public ModelAndView findQuestionA(String stuId) {
		ModelAndView view = new ModelAndView();
		List<Question> questions = studentservice.findQuesiotnA(stuId);
		view.addObject("Question", questions);
		return view;
	}
	
	@RequestMapping("/findQuestionNA")
	public ModelAndView findQuestionNA(String stuId) {
		ModelAndView view = new ModelAndView();
		List<Question> questions = studentservice.findQuesiotnNA(stuId);
		view.addObject("Question", questions);
		return view;
	}
	
	@RequestMapping("/askQuestion")
	public  @ResponseBody String askQuestion(@RequestBody Question question,@RequestBody QuestionKey key) {
		int i = studentservice.askQuestion(question);
		if(i<=0) {
			return "插入失败";
		}else {
			return "插入成功";
		}
	}
	
	@RequestMapping("/fileDownLoad")
	public ModelAndView fileDownLoads(String fileId) {
		ModelAndView view = new ModelAndView();
		File file = studentservice.DFile(fileId);
		view.addObject("file", file);
		return view;
	}
	
	@RequestMapping("/fileUp")
	public @ResponseBody String fileUp(@RequestBody File file) {
		int file2 = studentservice.insertFile(file);
		if(file2<=0) {
			return "上传失败";
		}else {
			return "上传成功";
		}
	}
	
	@RequestMapping("/getfile")
	public ModelAndView getfile(String fileId) {
		ModelAndView view = new ModelAndView();
		List<File> file = studentservice.getFile(); 
		view.addObject("file", file);
		return view;
	}
	
	@RequestMapping("/sendMessage")
	public  @ResponseBody String sendMessage(@RequestBody Message message) {
		int i = studentservice.sendMessage(message);
		if(i<=0) {
			return "发送失败";
		}else {
			return "发送成功";
		}
	}
	
	@RequestMapping("/getMessage")
	public ModelAndView getMessage(String stuId) {
		ModelAndView view = new ModelAndView();
		List<Message> messages = studentservice.getMessage(stuId);
		view.addObject("message", messages);
		return view;
	}
	
	@RequestMapping("/thesisUp")
	public  @ResponseBody String thesisUp(@RequestBody Thesis thesis) {
		int i = studentservice.insertThesis(thesis);
		if(i<=0) {
			return "上传失败";
		}else {
			return "上传成功";
		}
	} 
	
	//获得个人论文
	@RequestMapping("/getThesis")
	public ModelAndView getThesis(String stuId) {
		ModelAndView view = new ModelAndView();
		Thesis thesis = studentservice.getThesis(stuId);
		view.addObject("thesis", thesis);
		return view;
	}
	
	@RequestMapping("/updateThesis")
	public  @ResponseBody String updateThesis(@RequestBody Thesis thesis) {
		int i = studentservice.updateThesis(thesis);
		if(i<=0) {
			return "更新失败";
		}else {
			return "更新成功";
		}
	} 
}
