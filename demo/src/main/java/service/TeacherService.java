package service;


import domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;


/**
 * Created by jhonny on .
 */
@Service
/***
 * conexion a la base de datos
 * @service       notaciones
 */
public class TeacherService {

    public List<Teacher> getAllTeachers(){
        List<Teacher> listTeachers = new ArrayList<>();
        listTeachers.add(new Teacher(1, "jhonny"));
        listTeachers.add(new Teacher(2, "Gabriel"));
        listTeachers.add(new Teacher(3, "Su"));
        return listTeachers;
    }
}

