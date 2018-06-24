package how2java.service;

import how2java.pojo.Teachercheckin;

import java.util.List;

public interface TeachercheckinService {
	Teachercheckin get(int id);
	int update(Teachercheckin teachercheckin);
	List<Teachercheckin> list();
	int add(Teachercheckin teachercheckin);
	Teachercheckin getByCourseId(int course_id);

}
