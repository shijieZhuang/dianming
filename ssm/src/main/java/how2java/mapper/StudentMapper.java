package how2java.mapper;



import how2java.pojo.Student;
import how2java.util.Page;

import java.util.List;

public interface StudentMapper {


    Student get(int id);
    void updateOnline(Student student);

    public List<Student> list(Page page);

    public int total();

    Student getStudentId(int id);
    int add(Student student);

    int update(Student student);
    int delete(Student student);
}