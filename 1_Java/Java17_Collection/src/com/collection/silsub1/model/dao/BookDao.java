package com.collection.silsub1.model.dao;

import java.util.ArrayList;

import com.collection.silsub1.model.dto.Book;
//Dao : Data access object 
//컨트롤러한테서 일을 받음  컨트롤러-> DAO-> DB
public class BookDao {
	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList=new ArrayList<Book>();
	}

	public BookDao(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}
	public int getLastBookNo() {
		return 0;
	}
	public void addBook(Book book) {
		System.out.println(book);
		bookList.add(new Book());	
		System.out.println("bookList : "+bookList);
	}
	public int deleteBook() {
		return 0;
	}
	public int searchBook(String title) {
		return 0;
	}
	public Book selectBook(int index) {
		return null;
	}
	public ArrayList<Book> selectAll(){
		for(int i=0; i<bookList.size();i++) {
			System.out.println(i+"번째"+bookList.get(i));
		}
		return bookList;
	}
	public ArrayList<Book> sortedBookList(){
		return null;
	}
}
