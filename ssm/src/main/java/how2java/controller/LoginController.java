package how2java.controller;



import how2java.pojo.Account;
import how2java.pojo.Role;
import how2java.pojo.Student;
import how2java.pojo.Teacher;
import how2java.service.AccountService;
import how2java.service.RoleService;
import how2java.service.StudentService;
import how2java.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;


// 告诉spring mvc这是一个控制器类
@CrossOrigin
@Controller
@RequestMapping("/pages")
public class LoginController{
	@Autowired
	private RoleService roleService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public  Object checklogin(@RequestBody Map<String,String> map){
		System.out.println("-------------checkLogin-------------");
		System.out.println(map.get("username") + ' ' + map.get("password") + ' ' + map.get("logintype"));
		Map<String, Object> result = new HashMap<>();
		Account account = accountService.get(map.get("username"), map.get("password"),parseInt(map.get("logintype")));
		if (account!=null) {
			Role role = roleService.get(account.getRole_id());
			if(role.getName().equals("学生")) {
				Student student=studentService.get(account.getS_T_id());
				student.setOnline(1);
				studentService.updateOnline(student);
				result.put("ID",student.getId());
				result.put("username",student.getName());
				result.put("useronline",student.getOnline());
				result.put("rolename",role.getName());
				result.put("check",true);
				return  result;
			}
			else if(role.getName().equals("老师")){
				Teacher teacher=teacherService.get(account.getS_T_id());
				teacher.setOnline(1);
				teacherService.updateOnline(teacher);
				result.put("ID",teacher.getId());
				result.put("username",teacher.getName());
				result.put("useronline",teacher.getOnline());
				result.put("rolename",role.getName());
				result.put("check",true);
				System.out.println(result);
				return  result;
			}
		}
		result.put("check",false);
		return result;
	}
	@RequestMapping("/login")
	public String toLogin(){

		return "pages/login";
	}
	@RequestMapping("/blank")
	public String toBlank(){

		return "pages/blank";
	}
	@RequestMapping("/form")
	public String toForm(){

		return "pages/form_component";
	}


	@RequestMapping("/index")
	public String toIndex(String userId, String userPassword, Model model, HttpSession session){
		System.out.println(userId);
		System.out.println(userPassword);
		if(userId.equals("admin")&&userPassword.equals("123456")){
			Map<String, Object> info = new HashMap<>();
			info.put("username",userId);
			info.put("rolename","管理员");
			session.setAttribute("user", info);
			return "pages/index";
		}
		model.addAttribute("msg", "error");
		return "pages/login";

	}
	@RequestMapping("/morris")
	public String tomorris(){

		return "pages/morris";
	}
	@RequestMapping("/panels")
	public String toPanels(){

		return "pages/panels";
	}
	@RequestMapping("/todo_list")
	public String toTodolist(){

		return "pages/todo_list";
	}
}
