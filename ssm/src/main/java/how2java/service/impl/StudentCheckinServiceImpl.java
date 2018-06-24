package how2java.service.impl;

import how2java.mapper.StudentCheckInMapper;
import how2java.pojo.Studentcheckin;
import how2java.service.StudentcheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCheckinServiceImpl implements StudentcheckinService{
	@Autowired
	StudentCheckInMapper studentCheckInMapper;

	@Override
	public  int add(Studentcheckin studentcheckin){
		return studentCheckInMapper.add(studentcheckin);
	}
	public List<Studentcheckin> list(){
		return studentCheckInMapper.list();
	};
	@Override
	public List<Studentcheckin> getByCheck(int id){
		return studentCheckInMapper.getByCheck(id);
	}


}
