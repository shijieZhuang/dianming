package how2java.service.impl;


import how2java.mapper.CourseMapper;
import how2java.pojo.Course;
import how2java.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> list(int teacherID) {
        return courseMapper.list(teacherID);
    }
    @Override
    public Course get(int id){
        Course  course=courseMapper.get(id);
        return course;
    }
    @Override
    public List<Course> getCourse(int student_ID) {
        return courseMapper.getCourse(student_ID);
    }

    @Override
    public List<Course> getStudentClickCourse(int student_ID) {
        return courseMapper.getStudentClickCourse(student_ID);
    }
    @Override
    public  int update(Course course){
        return courseMapper.update(course);
    }
    @Override
    public  int delete(Course course){
        return courseMapper.delete(course);
    }
    @Override
    public  int add(Course course){
        return courseMapper.add(course);
    }
}
