package how2java.service;

import how2java.pojo.Studentcheckin;

import java.util.List;

public interface StudentcheckinService {

	List<Studentcheckin> list();
	int add(Studentcheckin studentcheckin);
	List<Studentcheckin> getByCheck(int id);
}
