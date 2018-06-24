package how2java.mapper;

import how2java.pojo.Teachercheckin;

import java.util.List;

public interface TeacherCheckInMapper {


    int add(Teachercheckin teachercheckin);
    public void delete(int id);

    Teachercheckin getByCourseId(int course_id);
    Teachercheckin get(int id);
     
      
    int update(Teachercheckin teachercheckin);
       
      
    public List<Teachercheckin> list();
    
      
    public int count();  
    
    
    
}