package com.jwt.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.main.dao.INewsDao;

@RestController
public class HomeController {
	
	@Autowired
	private INewsDao newDao;
	
	@RequestMapping(value="/news",method = RequestMethod.GET)
	public ResponseEntity<?> ds(){
		
		return new ResponseEntity<>(newDao.ds(),HttpStatus.OK);
	}
}
