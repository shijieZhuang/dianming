package how2java.pojo;

import java.sql.Date;

public class Teacher {


    private int id;
    private String school;
    private String college;
    private String teacher_Id;
    private String name;
    private String tel;
    private String avatar;
    private int sex;
    private Date last_land_time;
    private Date reg_time;
    private int online;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getTeacher_Id() {
        return teacher_Id;
    }

    public void setTeacher_Id(String teacher_Id) {
        this.teacher_Id = teacher_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getLast_land_time() {
        return last_land_time;
    }

    public void setLast_land_time(Date last_land_time) {
        this.last_land_time = last_land_time;
    }

    public Date getReg_time() {
        return reg_time;
    }

    public void setReg_time(Date reg_time) {
        this.reg_time = reg_time;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }


}
