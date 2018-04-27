package web;


import domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.TeacherService;

import java.util.List;

/**
 * Created by jhonny on 5/18/17.
 */

/***
 * @RestController --
 * @Autowired   --inyeccion de dependencia    para no hacer esto   =new Teacher()
 */
@RestController
@RequestMapping("/teachers")
public class TeacherController {
//dependency injection
    @Autowired
    TeacherService teacherService;
    //es un metodo
    @RequestMapping(path="hello",method = RequestMethod.GET)

    public List<Teacher> getTeacher(){
        return teacherService.getAllTeachers();
    }
}

