package com.example.demo.binsoo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinsooService {

	private BinsooDao dao;
	
	@Autowired
	public BinsooService( BinsooDao dao ) {
		this.dao = dao;
	}
	
	public List<BinsooVO> getlist() {
		return dao.getlist();
	}
}
