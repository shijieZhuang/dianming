package how2java.mapper;

import how2java.pojo.Category;
import how2java.pojo.Course;

import java.util.List;

public interface CourseMapper {
    Course get(int teacherID);
    public List<Course> list(int teacherID);

    int update(Course course);
    int delete(Course course);
    int add(Course course);
    public List<Course> getCourse(int student_ID);
    public List<Course> getStudentClickCourse(int student_ID);

}