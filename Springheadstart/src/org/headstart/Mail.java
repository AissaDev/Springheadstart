package org.headstart;

import org.services.service;

public class Mail implements service {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Mail client";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Mail is running");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Mail is stopped");
	}

}
