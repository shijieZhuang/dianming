package how2java.pojo;

public class Course {

    private int id;
    private int course_ID;
    private String course_number;
    private String course_name;
    private int teacherID;
    private String name;
    private int click_id;
    private int state;

    public int getClick_id() {
        return click_id;
    }

    public void setClick_id(int click_id) {
        this.click_id = click_id;
    }

    public int getCourse_ID() {
        return course_ID;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    private String class_time;
    private String class_location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_number() {
        return course_number;
    }

    public void setCourse_number(String course_number) {
        this.course_number = course_number;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getClass_time() {
        return class_time;
    }

    public void setClass_time(String class_time) {
        this.class_time = class_time;
    }

    public String getClass_location() {
        return class_location;
    }

    public void setClass_location(String class_location) {
        this.class_location = class_location;
    }


}
