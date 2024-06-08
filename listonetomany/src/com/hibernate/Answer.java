package com.hibernate;

public class Answer {
	private int id;
	private String answername;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	

	public String toString(){
		return answername;
	}
}
