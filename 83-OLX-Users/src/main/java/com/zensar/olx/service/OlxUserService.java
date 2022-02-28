package com.zensar.olx.service;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olx.bean.OLXUser;
import com.zensar.olx.db.OlxUserDAO;

@Service
public class OlxUserService {

	@Autowired
	OlxUserDAO dao;
	
	public OLXUser addOlxUser(OLXUser olxUser) {
		return this.dao.save(olxUser);
	}
	
	public OLXUser updateOlxUser(OLXUser olxUser) {
		return this.dao.save(olxUser);
	}
	
	public OLXUser findOlxUser(int id) {
		Optional<OLXUser> optionl=this.dao.findById(id);
		if(optionl.isPresent())
			return optionl.get();
		else 
			return null;
	}
	public OLXUser findOlxUserByName(String name) {
		 OLXUser olxUser=this.dao.findByUserName(name);
		 return olxUser;
	}
}
