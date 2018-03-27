package springbootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springbootsample.model.Post;
import springbootsample.service.PostService;

@RestController
public class RestPost {

	@Autowired
	private PostService postservice;

	@GetMapping("findallpost")
	public String findallpost() {
		return postservice.findall().toString();
	}

	
	public String saveCustomer(@RequestParam String tittle, @RequestParam String content, @RequestParam int cat_id) {
		Post newpost = new Post(tittle.toString(),content.toString(),cat_id);
		postservice.save(newpost);
		return "post saved";
	}

	
	public String deleteCustomer(@RequestParam int id) {
		postservice.delete(id);
		return "post deleted";
	}

}
