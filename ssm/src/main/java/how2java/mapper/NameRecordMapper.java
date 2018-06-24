package how2java.mapper;

import how2java.pojo.Category;
import how2java.pojo.Namerecord;
import how2java.util.Page;

import java.util.List;

public interface NameRecordMapper {



    Namerecord getBycourseId(int courseid);
    public List<Namerecord> list(int studentID);
    int add(Namerecord namerecord);
    int delete(Namerecord namerecord);
}