package com.projetocomspringmvc.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projetocomspringmvc.model.Admin;

@Controller
public class AdminLoginController {
	public AdminLoginController() {
		admin = new Admin();
		admin.setNome("Deivison");
		admin.setUser("deivisomreis");
		admin.setSenha("deivisomreis123");
	}	
	private static Admin admin;
	
	@RequestMapping("/adminlogin")
	public String login(Model model, HttpServletRequest req, String user, String password){
		if(user != null && password != null && !user.isEmpty() && !password.isEmpty() && admin.getUser().equals(user) 
				&& admin.getSenha().equals(password)){
			req.getSession().setAttribute("admin", admin);
			
			return "admin/home";
		}
		
		model.addAttribute("erro", "favor verificar dados de acesso!");
		return "adminlogin";
	}
	
	@RequestMapping("/admin/home")
	public String home(Model model, HttpServletRequest req){
			model.addAttribute("admin", (Admin) req.getSession().getAttribute("admin"));	
			return "admin/home";
	}
}
