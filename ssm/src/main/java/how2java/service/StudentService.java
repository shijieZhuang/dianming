package how2java.service;


import how2java.util.Page;
import how2java.pojo.Student;

import java.util.List;

public interface StudentService {
    Student get(int id);
    void updateOnline(Student student);

    public List<Student> list(Page page);

    public int total();

    int add(Student student);

    int update(Student student);

    int delete(Student student);

    Student getStudentId(int id);
}
