package how2java.controller;


import how2java.pojo.*;
import how2java.service.*;
import how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

// 告诉spring mvc这是一个控制器类
@CrossOrigin
@Controller
@RequestMapping("/pages")
public class teacherController {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private TeachercheckinService teachercheckinService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentcheckinService studentcheckinService;
	@RequestMapping("/TeacherManage")
	public String list(Model model, Page page) {
		List<Teacher> st = teacherService.list(page);
		int total = teacherService.total();
		page.setTotal(total);
		model.addAttribute("st", st);
		model.addAttribute("page", page);
		return "/pages/TeacherManage";
	}
	@RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
	@ResponseBody
	public Object addTeacher(@RequestBody Map<String,String> map){
		Teacher teacher=new Teacher();
		System.out.println(map);
		teacher.setTeacher_Id(map.get("new_teacher_ID"));
		teacher.setName(map.get("new_name"));
		teacher.setSchool(map.get("new_school"));
		teacher.setCollege(map.get("new_college"));
		teacher.setTel(map.get("new_tel"));

		teacher.setOnline(0);
		teacherService.add(teacher);
		return map;
	}
	@RequestMapping(value = "/changeTeacher",method = RequestMethod.POST)
	@ResponseBody
	public Object changeTeacher(@RequestBody Map<String,String> map){
		Teacher teacher = teacherService.get(parseInt(map.get("new_id")));

		System.out.println(map);
		teacher.setTeacher_Id(map.get("new_teacher_ID"));
		teacher.setName(map.get("new_name"));
		teacher.setSchool(map.get("new_school"));
		teacher.setCollege(map.get("new_college"));

		teacher.setTel(map.get("new_tel"));
		teacher.setOnline(0);
		teacherService.update(teacher);
		return map;
	}
	@RequestMapping(value = "/editTeacherCourse",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Object changeTeacherCourse(@RequestBody Map<String,String> map){
		Course course = courseService.get(parseInt(map.get("id")));

		System.out.println(map);
		course.setClass_location(map.get("class_location"));
		course.setClass_time(map.get("class_time"));
		course.setCourse_name(map.get("course_name"));
		course.setCourse_number(map.get("course_number"));
		courseService.update(course);
		Map<String, Object> result = new HashMap<>();
		result.put("check",true);
		return result;
	}
	@RequestMapping(value = "/addTeacherCourse",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Object addTeacherCourse(@RequestBody Map<String,String> map){
		Teacher teacher = teacherService.get(parseInt(map.get("id")));
		Course course = new Course();
		System.out.println(map);
		course.setTeacherID(parseInt(teacher.getTeacher_Id()));
		course.setClass_location(map.get("class_location"));
		course.setClass_time(map.get("class_time"));
		course.setCourse_name(map.get("course_name"));
		course.setCourse_number(map.get("course_number"));
		courseService.add(course);
		Map<String, Object> result = new HashMap<>();
		result.put("check",true);
		return result;
	}
	@RequestMapping(value = "/deleteTeacher",method = RequestMethod.POST)
	@ResponseBody
	public Object deleteTeacher(@RequestBody Map<String,String> map){
		Teacher teacher = teacherService.get(parseInt(map.get("new_id")));

		System.out.println(map);

		teacherService.delete(teacher);
		return map;
	}
	@RequestMapping(value = "/deleteCourse",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Object deleteTeacherCourse(@RequestBody Map<String,String> map){
		Course course = courseService.get(parseInt(map.get("id")));

		System.out.println(map);

		courseService.delete(course);
		Map<String, Object> result = new HashMap<>();
		result.put("result",true);
		return result;
	}
	@RequestMapping(value = "/registerTeacher",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public  Object registerTeacher(@RequestBody Map<String,String> map){
		Teacher teacher =new Teacher();
		System.out.println(map);
		teacher.setSchool(map.get("school"));
		teacher.setCollege(map.get("college"));
		teacher.setTeacher_Id(map.get("teacher_ID"));
		teacher.setName(map.get("name"));
		teacher.setTel(map.get("tel"));
		teacher.setOnline(0);
		teacherService.add(teacher);
		Account account=new Account();
		account.setAccount_number(map.get("accountName"));
		account.setLogin_credent(map.get("password"));
		account.setLanding_type(0);
		account.setRole_id(1);
		account.setS_T_id(teacher.getId());
		accountService.add(account);
		Map<String, Object> result = new HashMap<>();
		result.put("result",true);
		return result;
	}

	@RequestMapping(value = "/addclick",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Object addclick(@RequestBody Map<String,String> map){
		Teacher teacher = teacherService.get(parseInt(map.get("id")));
		Teachercheckin teachercheckin = new Teachercheckin();
		System.out.println(map);
		teachercheckin.setTeacher_ID(parseInt(teacher.getTeacher_Id()));
		teachercheckin.setCourse_ID(parseInt(map.get("course_ID")));
		teachercheckin.setTime(map.get("time"));
		teachercheckin.setLatitude(map.get("Latitude"));
		teachercheckin.setLongitude(map.get("Longitude"));
		teachercheckin.setState(1);
		teachercheckinService.add(teachercheckin);
		Map<String, Object> result = new HashMap<>();
		result.put("id",teachercheckin.getId());
		result.put("check",true);
		result.put("state",1);
		return result;
	}
	@RequestMapping(value = "/endclick",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Object endclick(@RequestBody Map<String,String> map){
		Teacher teacher = teacherService.get(parseInt(map.get("id")));
		Teachercheckin teachercheckin = teachercheckinService.get(parseInt(map.get("click_id")));
		System.out.println(map);
		System.out.println(map.get("time"));
		teachercheckin.setLast_time(map.get("time"));
		teachercheckin.setState(0);
		teachercheckinService.update(teachercheckin);
		List<Studentcheckin> studentcheckin = studentcheckinService.getByCheck(parseInt(map.get("click_id")));
		Map<String, Object> result = new HashMap<>();
		result.put("data",studentcheckin);
		result.put("check",true);
		return result;
	}
	@RequestMapping(value = "/queryTeacherCourse",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public  Object queryTeacherCourse(@RequestBody Map<String,String> map){
		System.out.println("-------------queryTeacherCourse-------------");
		System.out.println(map.get("id"));
		Map<String, Object> result = new HashMap<>();
		Teacher teacher = teacherService.getTeacherId(parseInt(map.get("id")));
		if (teacher.getTeacher_Id()!=null) {
			List<Course> course = courseService.list(parseInt(teacher.getTeacher_Id()));

/*			result.put("ID",course.getCourse_number());
			result.put("classTime",course.getClass_time());
			result.put("classLocation",course.getClass_location());
			result.put("courseName",course.getCourse_name());
			result.put("teacherName",teacher.getName());
			result.put("check",true);
			System.out.println(result);*/
			System.out.println(course);
			result.put("data",course);
			result.put("check",true);
			System.out.println(result);
			return  result;

		}
		result.put("check",false);
		return result;
	}
	@RequestMapping(value = "/studentclick",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Object studentclick(@RequestBody Map<String,String> map){
		Student student = studentService.get(parseInt(map.get("id")));
		Course course = courseService.get(parseInt(map.get("course_id")));
		System.out.println(parseInt(map.get("course_id")));
		Teachercheckin teachercheckin = teachercheckinService.getByCourseId(parseInt(map.get("course_id")));
		Teacher teacher = teacherService.get(parseInt(map.get("id")));

		Studentcheckin studentcheckin = new Studentcheckin();
		Map<String, Object> result = new HashMap<>();
		System.out.println(teachercheckin);
		if (teachercheckin!=null){
			studentcheckin.setClick_ID(teachercheckin.getId());
			studentcheckin.setCourse_ID(teachercheckin.getCourse_ID());
			studentcheckin.setLast_time(map.get("time"));
			studentcheckin.setMark(1);
			studentcheckin.setName(student.getName());
			studentcheckin.setSchool(student.getSchool());
			studentcheckin.setS_ID(student.getId());
			studentcheckin.setStudent_ID(student.getStudent_ID());
			studentcheckinService.add(studentcheckin);
			result.put("check",true);
			return  result;
		}else {
			result.put("check",false);
			return result;
		}

	}

}
