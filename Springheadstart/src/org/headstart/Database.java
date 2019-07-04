package org.headstart;

import org.services.service;

public class Database implements service {
	
	
	
	
	
	

	@Override
	public String name() {
		// TODO Auto-generated method stub
		 return "Database MySQL";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Database is running");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("database is stopped");
	}

}
