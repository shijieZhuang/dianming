package how2java.service.impl;


import how2java.mapper.NameRecordMapper;
import how2java.pojo.Namerecord;
import how2java.service.NamerecordService;
import how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NamerecordServiceImpl implements NamerecordService {
    @Autowired
    private NameRecordMapper nameRecordMapper;
    @Override
    public List<Namerecord> list(int studentID) {
        return nameRecordMapper.list(studentID);
    }
    @Override
    public  int add(Namerecord namerecord){
        return nameRecordMapper.add(namerecord);
    }
    @Override
    public Namerecord getBycourseId(int courseid){
        Namerecord namerecord=nameRecordMapper.getBycourseId(courseid);
        return namerecord;
    }
    @Override
    public Namerecord getCourseId(int courseid){
        Namerecord namerecord=nameRecordMapper.getBycourseId(courseid);
        return namerecord;
    }
    @Override
    public  int delete(Namerecord namerecord){
        return nameRecordMapper.delete(namerecord);
    }
}
