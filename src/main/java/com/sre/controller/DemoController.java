package com.sre.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping(name = "/home",method = RequestMethod.GET)
	public String Home() {
		return "This is Mudit's Home!Welcome";
	}
}
