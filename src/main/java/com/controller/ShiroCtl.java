package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ShiroCtl {
	
	private static final Logger logger=LoggerFactory.getLogger(ShiroCtl.class);
	
	@RequestMapping(value = "login",method=RequestMethod.POST)
	public String dologin(@RequestParam("username") String username, @RequestParam("password") String password,HttpServletRequest request,HttpServletResponse response ,RedirectAttributes redirectAttributes) {
		
		UsernamePasswordToken taken = new UsernamePasswordToken(username, password);
		Subject subject = SecurityUtils.getSubject();
		try{
			subject.login(taken);
		}catch(AuthenticationException e){
			logger.error("login fail",e);
		}
		String fallbackUrl="sucess";
		if(subject.isAuthenticated()){
			try {
				WebUtils.redirectToSavedRequest(request, response, fallbackUrl);
			}catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}else{
			redirectAttributes.addFlashAttribute("msg", "用户名或者密码错误");	
			return "redirect:/login";
		}
		
	}
	
	@RequestMapping(value = "dologout",method=RequestMethod.POST)
	public String logout(RedirectAttributes redirectAttributes ){  
        SecurityUtils.getSubject().logout();  
        redirectAttributes.addFlashAttribute("msg", "你已安全登出");
        return "redirect:/login";  
    }  

}
