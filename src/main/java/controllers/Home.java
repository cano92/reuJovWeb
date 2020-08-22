package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {

	public Home() {
		// TODO Auto-generated constructor stub
	}
	
	//@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home() {
		
		return "home";
	}

}
