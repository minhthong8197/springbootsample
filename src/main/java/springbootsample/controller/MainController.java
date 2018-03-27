package springbootsample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import springbootsample.service.UserService;

@Controller
@SessionAttributes("logged")
public class MainController {

	@Autowired
	private UserService userservice;

	

	@GetMapping("/")
	public String home(HttpServletRequest request) {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/checklogin")
	public String checklogin(HttpServletRequest request) {
		String tendangnhap = request.getParameter("tendangnhap");
		String matkhau = request.getParameter("matkhau");

		if (userservice.compare(tendangnhap, matkhau) == true) {
			HttpSession session = request.getSession();// lay session hien tai
			session.setAttribute("logged", true);// them attribute vao session
			return "redirect:/managepost";
		} else {
			return "redirect:/login";
		}
	}
}
