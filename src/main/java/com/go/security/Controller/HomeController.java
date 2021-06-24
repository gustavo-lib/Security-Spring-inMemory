package com.go.security.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping({ "/home", "/" })
	public String getHomePage() {
		return "homePage";
	}

	@GetMapping("/welcome")
	public ModelAndView getWelcomePage(Authentication authentication) {
		String userName = authentication.getName();
		System.out.println("*-**-*-* " + userName);
		ModelAndView model = new ModelAndView("welcomePage");
		model.addObject("rol", userName);
		return model;
	}

	@GetMapping("/admin")
	public String getAdminPage() {
		return "adminPage";
	}

	@GetMapping("/emp")
	public String getEmployeePage() {
		return "empPage";
	}

	@GetMapping("/mgr")
	public String getManagerPage() {
		return "mgrPage";
	}

	@GetMapping("/common")
	public String getCommonPage() {
		return "commonPage";
	}

	@GetMapping("/accessDenied")
	public String getAccessDeniedPage() {
		return "accessDeniedPage";
	}
}