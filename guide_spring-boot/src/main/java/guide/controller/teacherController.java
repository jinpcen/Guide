package guide.controller;

import guide.bean.Teacher;
import guide.service.teacherService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/teacher")
public class teacherController {

    teacherService teacherService;

    @RequestMapping("/getTeacher")
    public @ResponseBody
    String getTeacher(@Param("name") String name){
        Teacher teacher = teacherService.getTeacher(name);
        if (teacher!=null)
            return teacher.toString();
        else
            return "查找失败";

    }

}
