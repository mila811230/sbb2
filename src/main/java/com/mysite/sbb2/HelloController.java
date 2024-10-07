package com.mysite.sbb2;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World!!";
	}

}
