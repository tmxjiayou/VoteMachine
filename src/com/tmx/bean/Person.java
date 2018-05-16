package com.tmx.bean;

public class Person {

	private String name;
	private int number;
	private int voteNum;
	
	public Person() {
		
	}
	
	public Person(String name,int number,int voteNum) {
		this.name = name;
		this.number = number;
		this.voteNum = voteNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getVoteNum() {
		return voteNum;
	}
	public void setVoteNum(int voteNum) {
		this.voteNum = voteNum;
	}
	
	
}
