package com.example.demo;

public class Book { 
	private String name;
	private String writer;
	private int length;
	private int publicationDate;
	private String language;
	
	Book(String name,String writer,int length,int publicationDate,String language){
		
	}
	
	Book(){
		
	}
	
	public void setName() {
		this.name= name;
	}
	
	public void setWriter() {
		this.writer=writer;
	}
	
	public void setLength() {
		this.length=length;
	}
	
	public void setPublicationDate() {
		this.publicationDate=publicationDate;
	}
	
	public void setLanguage() {
		this.language=language;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public String getWriter(String writer) {
		return writer;
	}
	
	public int getLength(int length) {
		return length;
	}
	
	public int getPublicationDate(int publicationDate) {
		return publicationDate;
	}
	
	public String getLanguage(String language) {
		return language;
	}
	
}
