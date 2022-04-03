package com.testapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.testapi.Entity.api;
import com.testapi.Service.apiService;

@RestController
public class restController {
	
	@Autowired
	private apiService service;
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<api> getbyid(@PathVariable("id") long id){
		api getusingid = service.getusingid(id);
		return new ResponseEntity<>(getusingid,HttpStatus.OK);
	}

}
