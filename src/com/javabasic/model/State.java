package com.javabasic.model;

public class State {
	
	private String name;

	public State() {
		
	}
	
	public State(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "State [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
