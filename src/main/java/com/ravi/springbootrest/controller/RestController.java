package com.ravi.springbootrest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value="/id/{id}",method = RequestMethod.GET)
	public String hello(@PathVariable("id") long id,
			 @RequestParam(value="param1", required=true) String param1)
	{
		return "Hello World "+id+" "+param1+param1;
	}

}
