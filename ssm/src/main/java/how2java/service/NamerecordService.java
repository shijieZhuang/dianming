package how2java.service;

import how2java.pojo.Namerecord;
import how2java.util.Page;

import java.util.List;

public interface NamerecordService {
    public List<Namerecord> list(int studentID);
    Namerecord getBycourseId(int Courseid);
    int delete(Namerecord namerecord);
    int add(Namerecord namerecord);
    Namerecord getCourseId(int Courseid);
}
