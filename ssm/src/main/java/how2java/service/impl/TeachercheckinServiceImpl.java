package how2java.service.impl;

import how2java.mapper.TeacherCheckInMapper;
import how2java.mapper.TeacherMapper;
import how2java.pojo.Teachercheckin;
import how2java.service.TeachercheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachercheckinServiceImpl implements TeachercheckinService{
	@Autowired
	private TeacherCheckInMapper teacherCheckInMapper;
	@Override
	public Teachercheckin get(int id){
		Teachercheckin teachercheckin=teacherCheckInMapper.get(id);
		return teachercheckin;
	}

	@Override
	public Teachercheckin getByCourseId(int course_id){
		Teachercheckin teachercheckin=teacherCheckInMapper.getByCourseId(course_id);
		return teachercheckin;
	}
	@Override
	public  int update(Teachercheckin teachercheckin){
		return teacherCheckInMapper.update(teachercheckin);
	}
	@Override
	public  int add(Teachercheckin teachercheckin){
		return teacherCheckInMapper.add(teachercheckin);
	}
	public List<Teachercheckin> list(){
		return teacherCheckInMapper.list();
	};

}
