package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*상대 경로와 절대경로*/

@Controller
public class PathController {

	//http://localhost:8282/path/images/404/404.png
	@GetMapping("/path")
	public String path(Model model) {
		return "path/path";
	}
		
	//http://localhost:8282/images/404/404.png
	@GetMapping("/path/img")
	public String pathImg(Model model) {
		return "path/path";
	}

}
