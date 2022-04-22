package com.collection.silsub1.model.dao;

import java.util.ArrayList;

import com.collection.silsub1.model.comparator.AscCategory;
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
	//마지막 도서번호 리턴
	public int getLastBookNo() {
		return bookList.get(bookList.size()-1).getbNo(); //마지막의 전값의 no를가져옴
	}
	public void addBook(Book book) {
		bookList.add(book);	
	}
	public int deleteBook(int no) {
		
		int res=0;
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getbNo()==no) {
				bookList.remove(i);
				res=1; //삭제 성공시 1을 넣음 
			}
		}
		return res;
	}
	public int searchBook(String title) {
		int index=-1;
		for(int i=0; i<bookList.size();i++) {
			
			if(bookList.get(i).getTitle().contains(title)) {
				index=i;
				break;
			}
		}
		return index;
	}
	public Book selectBook(int index) {
		return bookList.get(index);
	}
	public ArrayList<Book> selectAll(){
		return bookList;
	}
	public ArrayList<Book> sortedBookList(){
		ArrayList<Book> cList=new ArrayList<>();
		for(int i=0; i<bookList.size();i++) {
			cList.add(bookList.get(i));
		}
		cList.sort(new AscCategory());
		return cList;
	}
}
