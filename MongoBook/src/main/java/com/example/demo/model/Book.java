package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	private String name;
	
	private int cost;
	private String authorName;
	private int count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Book(String name, int cost, String authorName, int count) {
		super();
		this.name = name;
		this.cost = cost;
		this.authorName = authorName;
		this.count = count;
	}
	
	public Book()
	{
		
	}
}
