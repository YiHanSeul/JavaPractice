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
		
		try {
			book.setbNo(bd.getLastBookNo()+1);
		} catch (IndexOutOfBoundsException e) {
			book.setbNo(1); //값이 없을 경우 제일 처음에 1을 setBno에 넣음
		}
		bd.addBook(book);
	}
	public int deleteBook(int no) {
		return bd.deleteBook(no);
	}
	public int searchBook(String title) {
		
		return bd.searchBook(title);
	}
	public Book selectBook(int index) {
		return bd.selectBook(index);
	}
	public  ArrayList<Book> selectAll(){ //arraylist에서 book 클래스 객체만 쓸수있음.
		
		return bd.selectAll();
	}
	public Book[] sortedBookList() {//return 타입 book클래스의 배열타입
		ArrayList<Book>list =bd.sortedBookList();
		
		Book[] bk=new Book[list.size()];
		for( int i=0; i<bk.length;i++) {
			bk[i]=list.get(i);
		}
		
		return bk;
	}
	public void printBookList(Book[] br) {
		for(Book tmp:br) {
			System.out.println(tmp);
		}
	}
	
}
