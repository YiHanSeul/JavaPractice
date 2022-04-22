package com.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.silsub1.model.dao.BookDao;
import com.collection.silsub1.model.dto.Book;

public class BookManager {
	private BookDao bd=new BookDao();
	private Scanner input=new Scanner(System.in);
	
	public BookManager() {}
	
	public void addBook(Book book) {
		System.out.println(book);
		System.out.println("제목: "+book.getTitle());
		System.out.println("카테고리: "+book.getCategory());
		System.out.println("저자: "+book.getAuthor());
		bd.addBook(book);
	}
	public int deleteBook(int no) {
		return 0;
	}
	public int searchBook(String title) {
		return 0;
	}
	public Book selectBook(int index) {
		return null;
	}
	public  ArrayList<Book> selectAll(){ //arraylist에서 book 클래스 객체만 쓸수있음.
		bd.selectAll();
		return null;
	}
	public Book[] sortedBookList() {//return 타입 book클래스의 배열타입
		return null;
	}
	public void printBookList(Book[] br) {
		
	}
	
}
