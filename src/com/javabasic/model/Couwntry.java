package com.javabasic.model;

public class Couwntry {
	
	private String name;

	public Couwntry() {
		
	}
	
	public Couwntry(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Couwntry [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	

}
