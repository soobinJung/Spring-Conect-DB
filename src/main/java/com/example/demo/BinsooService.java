package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinsooService {
	
	BinsooDao dao;
	
	@Autowired
	public BinsooService( BinsooDao dao ) {
		this.dao = dao;
	}
	
	public List<Binsoo> getlist() {
		return dao.getlist();
	}
}
