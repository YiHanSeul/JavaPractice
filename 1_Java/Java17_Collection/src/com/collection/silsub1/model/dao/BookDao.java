package com.collection.silsub1.model.dao;

import java.util.ArrayList;

import com.collection.silsub1.model.dto.Book;
//Dao : Data access object 
//��Ʈ�ѷ����׼� ���� ����  ��Ʈ�ѷ�-> DAO-> DB
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
	public void addBook() {
		
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
		return null;
	}
	public ArrayList<Book> sortedBookList(){
		return null;
	}
}
