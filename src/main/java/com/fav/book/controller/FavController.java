package com.fav.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class FavController {
	
	@RequestMapping("/getbooks")
	public String getbooks() {
		
		return "noooo";
	}

}
