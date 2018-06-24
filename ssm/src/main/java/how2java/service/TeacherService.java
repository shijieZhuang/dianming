package how2java.service;


import how2java.pojo.Teacher;
import how2java.util.Page;

import java.util.List;

public interface TeacherService {
    Teacher get(int id);
    void updateOnline(Teacher teacher);
    public List<Teacher> list(Page page);

    public int total();
    Teacher getTeacherId(int id);
    int add(Teacher teacher);

    int update(Teacher teacher);

    int delete(Teacher teacher);
}
