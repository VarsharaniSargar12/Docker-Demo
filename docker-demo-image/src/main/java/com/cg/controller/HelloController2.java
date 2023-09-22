package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

		
@Controller
public class HelloController2 {

		@RequestMapping("/hello2")
		@ResponseBody
		public String sayHello() { 
			return "Hello everybody from hello2";
		}

	

}
