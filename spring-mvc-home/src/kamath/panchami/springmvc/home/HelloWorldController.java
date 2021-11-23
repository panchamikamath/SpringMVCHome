package kamath.panchami.springmvc.home;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//show initials HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to read data 
	//add data to model

	@RequestMapping("/processFormv2")
	public String letsShoutDude(HttpServletRequest request, Model model) { 
		//read request parameter from html form 
	String name = request.getParameter("studentName");
	name = name.toUpperCase(); String result = "Yo! " + name; 
	//add msg to model
	model.addAttribute("message",result);
	model.addAttribute("dotmessage","......."); return "helloworld2"; }
	 
	
	@RequestMapping("/processFormv3")
	public String letsShoutDudev3(@RequestParam("studentName")String name, Model model) {
		name = name.toUpperCase();
		String result = "Hey! " + name;
		//add msg to model
		model.addAttribute("message",result);
		model.addAttribute("dotmessage",".......");
		return "helloworld2";
	}
}
