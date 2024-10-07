package com.mysite.sbb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nums")
public class NumController {
	@Autowired
	private NumService numService;
	
	@GetMapping("/{id}")
	@ResponseBody
	public Num getNum(@PathVariable("id") Integer id) {
		return numService.getNum(id);
		
	}

}
