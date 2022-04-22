package com.collection.silsub1.view;

import java.util.Scanner;

import com.collection.silsub1.controller.BookManager;
import com.collection.silsub1.model.dto.Book;
//view역할 메뉴는 매니저한테만 시킴
public class BookMenu {
	private Scanner input= new Scanner(System.in);
	private BookManager bm=new BookManager();
	
	public BookMenu() {}
	public void mainMenu() {
		while(true) {//6,1,5,4,3,2
			System.out.println("***도서 관리 프로그램");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체출력");
			System.out.println("6. 끝내기");
			
			System.out.print("메뉴선택 : ");
			int num=input.nextInt();
			input.nextLine();
			switch(num) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				bm.sortedBookList();
				break;
			case 3:
				bm.deleteBook(inputBookNo());
				break;
			case 4:
				bm.searchBook(inputBookTitle());
				break;
			case 5:
				bm.selectAll();
				break;
			case 6:
				System.out.println("종료되었습니다.");
				break;
			}
			if(num==6) break;
			
		}
		
	}
	public Book inputBook() {
		Book book=new Book();
		System.out.print("도서 제목: ");
		book.setTitle(input.nextLine());
		input.nextLine();
		System.out.print("\n도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		book.setCategory(input.nextInt());
		input.nextLine();
		System.out.print("\n도서 저자: ");
		book.setAuthor(input.nextLine());
		return book;
	}
	public int inputBookNo() {
		return 0;
	}
	public String inputBookTitle() {
		return null;
	}
}
