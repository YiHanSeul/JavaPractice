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
		System.out.println("����: "+book.getTitle());
		System.out.println("ī�װ�: "+book.getCategory());
		System.out.println("����: "+book.getAuthor());
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
	public  ArrayList<Book> selectAll(){ //arraylist���� book Ŭ���� ��ü�� ��������.
		bd.selectAll();
		return null;
	}
	public Book[] sortedBookList() {//return Ÿ�� bookŬ������ �迭Ÿ��
		return null;
	}
	public void printBookList(Book[] br) {
		
	}
	
}
