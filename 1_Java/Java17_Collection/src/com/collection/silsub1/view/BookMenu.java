package com.collection.silsub1.view;

import java.util.ArrayList;
import java.util.Iterator;
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
				bm.printBookList(bm.sortedBookList());//정렬한다음 출력
				break;
			case 3:
				int result=bm.deleteBook(inputBookNo());
				if(result>0) {
					System.out.println("성공적으로 삭제되었습니다.");
				}else {
					System.out.println("삭제할 글이 존재하지 않습니다.");
				}
				break;
			case 4:
				//책 등록유무 확인
				int index=bm.searchBook(inputBookTitle());
				if(index==-1) {
					System.out.println("조회한 도서가 존재하지 않습니다.");
				}else {
					System.out.println(bm.selectBook(index));
				}
				break;
			case 5:
				ArrayList<Book>list=bm.selectAll();
				if(list.isEmpty()) {
					System.out.println("도서가 없습니다.");
				}else {
					//Iterator로 출력
					Iterator<Book> it=list.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
					//System.out.println(list);
				}
				break;
			case 6:
				System.out.println("종료되었습니다.");
				return;
			}
			
		}
		
	}
	public Book inputBook() {
		System.out.print("도서 제목: ");
		String title=input.nextLine();
		System.out.print("\n도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int category=input.nextInt();
		input.nextLine();
		System.out.print("\n도서 저자: ");
		String author=input.nextLine();
		return new Book(category,title, author);
	}
	public int inputBookNo() {
		System.out.println("도서번호: ");
		int no=input.nextInt();
		input.nextLine();
		
		return no;
	}
	public String inputBookTitle() {
		System.out.print("찾을 도서 제목: ");
		String title=input.nextLine();
		return title;
	}
}
