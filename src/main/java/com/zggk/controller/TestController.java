package com.zggk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	    @RequestMapping("/hello")
	    public String index() {     
	    	System.out.println("测试");
	        return "Hello World";
	    }
	 

}
