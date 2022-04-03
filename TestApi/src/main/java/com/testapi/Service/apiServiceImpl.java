package com.testapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testapi.Entity.api;
import com.testapi.Repository.Repository;

@Service
public class apiServiceImpl implements apiService {
	
	@Autowired
	private Repository repo;

	@Override
	public api getusingid(long id) {
		
		return repo.findById(id).get();
		
	}

}
