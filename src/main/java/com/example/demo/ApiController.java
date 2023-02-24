package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("color")
	public String getMyFav() {
		String Ecolor="black";
		return "My favorite color is"+Ecolor;
	}
}
