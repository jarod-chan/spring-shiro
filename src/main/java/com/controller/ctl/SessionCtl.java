package com.controller.ctl;

import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.controller.session.SessionUtil;

@Controller
public class SessionCtl {
	
	@Autowired
	SessionUtil sessionUtil;
	
	@RequestMapping(value="session",method = RequestMethod.GET)
	public String  sucess(Map<String,Object> map) {
		map.put("jettysv", sessionUtil.getValue("sv"));
		map.put("shirosv",SecurityUtils.getSubject().getSession().getAttribute("sv"));
		return "session";
	}

}
