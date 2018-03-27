package springbootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springbootsample.service.UserService;

@RestController
public class SampleRestController {

	@Autowired
	private UserService user;

	@GetMapping("/hello")
	public String hello() {
		return "Hello world!";
	}

	@GetMapping("/testcompare")
	public String compare(@RequestParam String tendangnhap, @RequestParam String matkhau) {
		if (user.compare(tendangnhap, matkhau) == true)
			return "xong";
		else
			return "fail";
	}

	@GetMapping("/findalluser")
	public String allUser() {
		return user.findall().toString();
	}
}
