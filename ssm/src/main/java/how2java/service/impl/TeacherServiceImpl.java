package how2java.service.impl;


import how2java.mapper.TeacherMapper;
import how2java.pojo.Student;
import how2java.pojo.Teacher;
import how2java.service.TeacherService;
import how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher get(int id){
        Teacher teacher=teacherMapper.get(id);
        return teacher;
    }
    @Override
    public void updateOnline(Teacher teacher){
        teacherMapper.updateOnline(teacher);
    }
    @Override
    public List<Teacher> list(Page page) {
        return teacherMapper.list(page);
    }
    @Override
    public  int add(Teacher teacher){
        return teacherMapper.add(teacher);
    }
    @Override
    public  int update(Teacher teacher){
        return teacherMapper.update(teacher);
    }
    @Override
    public  int delete(Teacher teacher){
        return teacherMapper.delete(teacher);
    }
    @Override
    public int total() {
        return teacherMapper.total();
    }
    @Override
    public Teacher getTeacherId(int id){
     Teacher teacher = teacherMapper.getTeacherId(id);
     return teacher;
    }
}
