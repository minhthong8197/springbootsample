package springbootsample.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import springbootsample.model.Post;
import springbootsample.service.PostService;

@Controller
@SessionAttributes("logged")
public class PostController {

	@Autowired
	private PostService postservice;

	@GetMapping("/savepost")
	public String savepost(HttpServletRequest request, @RequestParam String tittle, @RequestParam String content,
			@RequestParam int cat_id) {
		HttpSession session = request.getSession();// lay session hien tai
		boolean logged;
		try {
			logged = (boolean) session.getAttribute("logged");
			if (logged == true) {
				Post newpost = new Post(tittle.toString(), content.toString(), cat_id);
				postservice.save(newpost);
				return "redirect:/managepost";
			} else
				return "login";
		} catch (Exception e) {
			System.out.println("in savepost");
			return "redirect:/login";
		}
	}

	@GetMapping("/managepost")
	public String managepost(HttpServletRequest request) {
		HttpSession session = request.getSession();// lay session hien tai
		boolean logged;
		try {
			logged = (boolean) session.getAttribute("logged");
			if (logged == true) {
				List<Post> posts = new ArrayList<Post>();
				for (Post p : postservice.findall()) {
					posts.add(p);
				}
				request.setAttribute("posts", posts);
				return "managepost";
			}
		} catch (Exception e) {
			System.out.println("in managepost");
			return "redirect:/login";
		}
		return "redirect:/login";
	}

	@GetMapping("/newpost")
	public String newpost(HttpServletRequest request) {
		HttpSession session = request.getSession();// lay session hien tai
		boolean logged;
		try {
			logged = (boolean) session.getAttribute("logged");
			if (logged == true)
				return "newpost";
		} catch (Exception e) {
			System.out.println("in newpost");
			return "redirect:/login";
		}
		return "redirect:/login";
	}
	
	@GetMapping("/loadpost")
	public String loadpost(HttpServletRequest request)
	{
		try {
			int postid = Integer.valueOf(request.getParameter("id"));
			Post chosedpost = postservice.findbyId(postid);
			request.setAttribute("chosedpost", chosedpost);
			return "loadpost";
		} catch (Exception e) {
			System.out.println("bắt lỗi khi không truyền id mà đòi vào trang chủ");
			return "redirect:/";
		}
	}
}
