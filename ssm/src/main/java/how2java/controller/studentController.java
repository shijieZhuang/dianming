package how2java.controller;


import how2java.pojo.Account;
import how2java.pojo.Course;
import how2java.pojo.Namerecord;
import how2java.pojo.Student;
import how2java.service.*;
import how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

// 告诉spring mvc这是一个控制器类
@CrossOrigin
@Controller
@RequestMapping("/pages")
public class studentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private NamerecordService namerecordService;
	@Autowired
	private CourseService courseService;
	@RequestMapping("/studentManage")
	public String list(Model model, Page page) {
		List<Student> st = studentService.list(page);
		int total = studentService.total();
		page.setTotal(total);
		model.addAttribute("st", st);
		model.addAttribute("page", page);
		return "/pages/studentManage";
	}
	@RequestMapping(value = "/addStudent",method = RequestMethod.POST)
	@ResponseBody
	public Object addStudent(@RequestBody Map<String,String> map){
		Student student=new Student();
		System.out.println(map);
		student.setStudent_ID(map.get("new_student_ID"));
		student.setName(map.get("new_name"));
		student.setSchool(map.get("new_school"));
		student.setCollege(map.get("new_college"));
		student.setProfession(map.get("new_profession"));
		student.setGrade(map.get("new_grade"));
		student.setS_class(map.get("new_class"));
		student.setTel(map.get("new_tel"));
		student.setOnline(0);
		studentService.add(student);
		return map;
	}
	@RequestMapping(value = "/changeStudent",method = RequestMethod.POST)
	@ResponseBody
	public Object changeStudent(@RequestBody Map<String,String> map){
		Student student = studentService.get(parseInt(map.get("new_id")));

		System.out.println(map);
		student.setStudent_ID(map.get("new_student_ID"));
		student.setName(map.get("new_name"));
		student.setSchool(map.get("new_school"));
		student.setCollege(map.get("new_college"));
		student.setProfession(map.get("new_profession"));
		student.setGrade(map.get("new_grade"));
		student.setS_class(map.get("new_class"));
		student.setTel(map.get("new_tel"));
		student.setOnline(0);
		studentService.update(student);
		return map;
	}
	@RequestMapping(value = "/deleteStudent",method = RequestMethod.POST)
	@ResponseBody
	public Object delectStudent(@RequestBody Map<String,String> map){
		Student student = studentService.get(parseInt(map.get("new_id")));

		System.out.println(map);

		studentService.delete(student);
		return map;
	}
	@RequestMapping(value = "/registerStudent",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public  Object registerStudent(@RequestBody Map<String,String> map){
		Student student=new Student();
		System.out.println(map);
		student.setSchool(map.get("school"));
		student.setCollege(map.get("college"));
		student.setProfession(map.get("profession"));
		student.setGrade(map.get("grade"));
		student.setStudent_ID(map.get("student_ID"));
		student.setName(map.get("name"));
		student.setTel(map.get("tel"));
		student.setOnline(0);
		studentService.add(student);
		Account account=new Account();
		account.setAccount_number(map.get("accountName"));
		account.setLogin_credent(map.get("password"));
		account.setLanding_type(0);
		account.setRole_id(1);
		account.setS_T_id(student.getId());
		accountService.add(account);
		Map<String, Object> result = new HashMap<>();
		result.put("result",true);
		return result;
	}
	@RequestMapping(value = "/deleteStudentCourse",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Object deleteStoudentCourse(@RequestBody Map<String,String> map){
		Namerecord namerecord = namerecordService.getBycourseId(parseInt(map.get("id")));

		System.out.println(map);

		namerecordService.delete(namerecord);
		Map<String, Object> result = new HashMap<>();
		result.put("result",true);
		return result;
	}
	@RequestMapping(value = "/AddStudentCourse",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public  Object AddStudentCourse(@RequestBody Map<String,String> map){
		System.out.println("-------------addStudentCourse-------------");
		System.out.println(map.get("id"));
		Map<String, Object> result = new HashMap<>();
		Student student = studentService.getStudentId(parseInt(map.get("user")));
		if (student.getStudent_ID()!=null) {
			Namerecord namerecord = new Namerecord();
			namerecord.setStudent_ID(parseInt(student.getStudent_ID()));
			namerecord.setCourse_ID(parseInt(map.get("id")));
			namerecord.setAbsence(2);
/*			result.put("ID",course.getCourse_number());
			result.put("classTime",course.getClass_time());
			result.put("classLocation",course.getClass_location());
			result.put("courseName",course.getCourse_name());
			result.put("teacherName",teacher.getName());
			result.put("check",true);
			System.out.println(result);*/
			namerecordService.add(namerecord);
			result.put("check",true);
			System.out.println(result);
			return  result;

		}
		result.put("check",false);
		return result;
	}
	@RequestMapping(value = "/queryToAddStudentCourse",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public  Object queryToAddStudentCourse(@RequestBody Map<String,String> map){
		System.out.println("-------------addStudentCourse-------------");
		System.out.println(map.get("id"));
		Map<String, Object> result = new HashMap<>();
		Student student = studentService.getStudentId(parseInt(map.get("id")));
		if (student.getStudent_ID()!=null) {
			List<Namerecord> namerecords = namerecordService.list(parseInt(student.getStudent_ID()));
			List<Course> courses = courseService.getCourse(parseInt(student.getStudent_ID()));
/*			result.put("ID",course.getCourse_number());
			result.put("classTime",course.getClass_time());
			result.put("classLocation",course.getClass_location());
			result.put("courseName",course.getCourse_name());
			result.put("teacherName",teacher.getName());
			result.put("check",true);
			System.out.println(result);*/
			System.out.println(courses);
			result.put("data",courses);
			result.put("check",true);
			System.out.println(result);
			return  result;

		}
		result.put("check",false);
		return result;
	}
	@RequestMapping(value = "/queryStudentCourse",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public  Object queryTeacherCourse(@RequestBody Map<String,String> map){
		System.out.println("-------------queryStudentCourse-------------");
		System.out.println(map.get("id"));
		Map<String, Object> result = new HashMap<>();
		Student student = studentService.getStudentId(parseInt(map.get("id")));
		if (student.getStudent_ID()!=null) {
			List<Namerecord> namerecords = namerecordService.list(parseInt(student.getStudent_ID()));

/*			result.put("ID",course.getCourse_number());
			result.put("classTime",course.getClass_time());
			result.put("classLocation",course.getClass_location());
			result.put("courseName",course.getCourse_name());
			result.put("teacherName",teacher.getName());
			result.put("check",true);
			System.out.println(result);*/
			System.out.println(namerecords);
			result.put("data",namerecords);
			result.put("check",true);
			System.out.println(result);
			return  result;

		}
		result.put("check",false);
		return result;
	}
	@RequestMapping(value = "/queryClickCourse",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public  Object queryClickCourse(@RequestBody Map<String,String> map){
		System.out.println("-------------queryStudentClickCourse-------------");
		System.out.println(map.get("id"));
		Map<String, Object> result = new HashMap<>();
		Student student = studentService.getStudentId(parseInt(map.get("id")));
		if (student.getStudent_ID()!=null) {
			List<Namerecord> namerecords = namerecordService.list(parseInt(student.getStudent_ID()));
			List<Course> courses = courseService.getStudentClickCourse(parseInt(student.getStudent_ID()));
/*			result.put("ID",course.getCourse_number());
			result.put("classTime",course.getClass_time());
			result.put("classLocation",course.getClass_location());
			result.put("courseName",course.getCourse_name());
			result.put("teacherName",teacher.getName());
			result.put("check",true);
			System.out.println(result);*/
			System.out.println(courses);
			result.put("data",courses);
			result.put("check",true);
			System.out.println(result);
			return  result;

		}
		result.put("check",false);
		return result;
	}

}
