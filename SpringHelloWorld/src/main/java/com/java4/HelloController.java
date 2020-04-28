package com.java4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

		@RequestMapping("/hello")
		public String hello()
		{
			return "Vamsi";
		}
		@RequestMapping("/")
		   public String index() {
		      return "index.html";
		   }
}
