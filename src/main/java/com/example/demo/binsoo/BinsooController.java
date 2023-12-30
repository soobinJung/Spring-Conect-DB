package com.example.demo.binsoo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BinsooController {

	private BinsooService service;
	
	@Autowired
	public BinsooController( BinsooService service ) {
		this.service = service;
	}
	
	@GetMapping(value = "/binsoo/list")
	public List<BinsooVO> getlist()   {
		return service.getlist();
	}
}
