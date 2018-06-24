package how2java.service;

import how2java.pojo.Course;

import java.util.List;

public interface CourseService {
    Course get(int id);
    public List<Course> list(int teacherID);
    int update(Course course);
    int delete(Course course);
    int add(Course course);
    public List<Course> getCourse(int student_ID);

    public List<Course> getStudentClickCourse(int student_ID);
}

