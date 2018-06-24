package how2java.pojo;

import java.util.Date;

public class Studentcheckin {
	private int id;
	private String name;
	private String school;
	private String student_ID;
	private String Last_time;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getStudent_ID() {
		return student_ID;
	}

	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}

	public String getLast_time() {
		return Last_time;
	}

	public void setLast_time(String last_time) {
		this.Last_time = last_time;
	}

	public int getClick_ID() {
		return click_ID;
	}

	public void setClick_ID(int click_ID) {
		this.click_ID = click_ID;
	}

	public int getCourse_ID() {
		return course_ID;
	}

	public void setCourse_ID(int course_ID) {
		this.course_ID = course_ID;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getS_ID() {
		return s_ID;
	}

	public void setS_ID(int s_ID) {
		this.s_ID = s_ID;
	}

	private int click_ID;
	private int course_ID;
	private int mark;
	private int s_ID;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
