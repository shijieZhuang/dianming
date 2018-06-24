package how2java.service.impl;

import how2java.mapper.StudentMapper;
import how2java.pojo.Student;
import how2java.util.Page;
import how2java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student get(int id){
        Student student=studentMapper.get(id);
        return student;
    }
    @Override
    public void updateOnline(Student student){
        studentMapper.updateOnline(student);
    }
    @Override
    public List<Student> list(Page page) {
        return studentMapper.list(page);
    }
    @Override
    public  int add(Student student){
        return studentMapper.add(student);
    }
    @Override
    public  int update(Student student){
        return studentMapper.update(student);
    }
    @Override
    public  int delete(Student student){
        return studentMapper.delete(student);
    }
    @Override
    public int total() {
        return studentMapper.total();
    }

    @Override
    public Student getStudentId(int id){
        Student student = studentMapper.getStudentId(id);
        return student;
    }
}
