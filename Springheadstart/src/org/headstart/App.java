package org.headstart;

public class App {
	private int id;
	private String name;
	public App() {
		
	}
	public App(int id) {
		this.id = id;
	}
	public App(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
