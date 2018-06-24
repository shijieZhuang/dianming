package how2java.pojo;

public class Teachercheckin {
	private int id;
	private String longitude;

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public int getTeacher_ID() {
		return teacher_ID;
	}

	public void setTeacher_ID(int teacher_ID) {
		this.teacher_ID = teacher_ID;
	}

	public int getCourse_ID() {
		return course_ID;
	}

	public void setCourse_ID(int course_ID) {
		this.course_ID = course_ID;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLast_time() {
		return Last_time;

	}

	public void setLast_time(String Last_time) {
		this.Last_time = Last_time;
	}

	private String latitude;
	private int teacher_ID;
	private int course_ID;
	private int state;
	private String Last_time;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
