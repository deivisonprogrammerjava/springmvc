package com.projetocomspringmvc.logout;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminLogoutController {

	@RequestMapping("/admin/adminlogout")
	public String adminLogout(HttpServletRequest req){
		req.getSession().invalidate();
		return "adminlogin";
	}
}
