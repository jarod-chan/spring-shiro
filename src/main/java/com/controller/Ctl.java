package com.controller;
 
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class Ctl {
 
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String  login(Map<String,Object> map) {
		map.put("message", "login page");
		return "login";
	}
	

	@RequestMapping(value="sucess",method = RequestMethod.GET)
	public String  sucess(Map<String,Object> map) {
		map.put("message", "sucess page");
		return "templ";
	}
	
	@RequestMapping(value="unauthorized",method = RequestMethod.GET)
	public String  unauthorized(Map<String,Object> map) {
		map.put("message", "unauthorized page");
		return "templ";
	}
	
	@RequestMapping(value="home",method = RequestMethod.GET)
	public String  home(Map<String,Object> map) {
		map.put("message", "home page");
		return "home";
	}
	
	
	@RequestMapping(value="page/add",method = RequestMethod.GET)
	public String  pageAdd(Map<String,Object> map) {
		map.put("message", "page add");
		return "templ";
	}
	
	@RequestMapping(value="page/edit",method = RequestMethod.GET)
	public String  pageEdit(Map<String,Object> map) {
		map.put("message", "page edit");
		return "templ";
	}
	
	@RequestMapping(value="page/delete",method = RequestMethod.GET)
	public String  pageDelete(Map<String,Object> map) {
		map.put("message", "page delete");
		return "templ";
	}
}