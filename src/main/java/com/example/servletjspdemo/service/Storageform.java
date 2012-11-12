package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Formgetset;


public class Storageform {

	private List<Formgetset> db = new ArrayList<Formgetset>();
	
	public void add(Formgetset formgetset){
		Formgetset newgetset = new Formgetset(formgetset.getImie(),formgetset.getNazwisko(),formgetset.getHobby(),formgetset.getJedzenie(),formgetset.getCars());
		db.add(newgetset);
	}
	
	public List<Formgetset> getAllPersons(){
		return db;
	}

}
	

