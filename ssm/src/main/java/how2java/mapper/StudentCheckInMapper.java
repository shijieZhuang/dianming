package how2java.mapper;

import how2java.pojo.Studentcheckin;

import java.util.List;

public interface StudentCheckInMapper {
 
      
    int add(Studentcheckin studentcheckin);
       
      
    public void delete(int id);  
       
      
    public Studentcheckin get(int id);

    List<Studentcheckin> getByCheck(int id);
      
    public int update(Studentcheckin studentcheckin);
       
      
    public List<Studentcheckin> list();
    
      
    public int count();  
    
    
    
}