package org.headstart;

import org.services.service;

public class Logger implements service  {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Logger X";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Logger is ready");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Logger is stopped");
	}

}
