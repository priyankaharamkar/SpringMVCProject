package org.techhub.SpringMVCCrudeApplicationFirst.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.techhub.SpringMVCCrudeApplicationFirst.model.AdminLogin;
import org.techhub.SpringMVCCrudeApplicationFirst.model.Student;
import org.techhub.SpringMVCCrudeApplicationFirst.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	StudentService studentService;
	List<Student> list;
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public String masterpage(AdminLogin login,Map map)
	{
		if(login.getName().equals("admin")&& login.getPass().equals("admin"))
		{
			return "master";
		}
		else {
			map.put("msg","invalid username and password");
			return "home";
		}
	}
	@RequestMapping(value="/addstudent",method=RequestMethod.GET)
	public String addnewstudent()
	{
		return "addnewrecord";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveRecord(Student model,Map map)
	{
		boolean b=studentService.isAddStudent(model);
		if(b)
		{
			map.put("msg", "Record save sucess....");
		}
		else {
			map.put("msg", "Some Problem is there.......");
		}
		return "addnewrecord";
	}
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewallrecord(Map map)
	{
		 list=studentService.getAllStudents();
		map.put("studrecord",list);
		return "viewallrecord";
	}
	
	@RequestMapping(value="/del",method=RequestMethod.GET)
	public String deleteRecord(@RequestParam("userid")Integer id,Map map)
	{
		studentService.isDeleteById(id);
		list=studentService.getAllStudents();
		map.put("studrecord", list);
		return "viewallrecord";
	}
	@RequestMapping(value="/upda",method=RequestMethod.GET)
	public String update(@RequestParam("userid")Integer id,@RequestParam("name")String n,@RequestParam("email")String e,@RequestParam("contact")String c,Map map)
	{
		map.put("i", id);
		map.put("name", n);
		map.put("email", e);
		map.put("contact", c);
		return "update";
	}
	@RequestMapping(value="/rupdate",method=RequestMethod.POST)
	public String rupdate(Student model,Map map)
	{
		boolean b = studentService.update(model);
		if (b) {
			List<Student> list = studentService.getAllStudents();
			map.put("studrecord", list);
			return "viewallrecord";
		} else {
			return "viewallrecord";
		}
		}
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public String search(HttpServletRequest request,Map map)
	{
		String name=request.getParameter("name");
		List<Student> list=studentService.Search(name);
		if(list!=null)
		{
			map.put("studrecord", list);
			return "viewallrecord";
		}
		else {
			String error="data not found";
			map.put("msg", error);
			return "master";
		}
	}

}
