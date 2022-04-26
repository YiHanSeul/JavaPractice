package com.view;

import java.util.Scanner;

import com.controller.LibraryManager;
import com.model.vo.Book;
import com.model.vo.CookBook;
import com.model.vo.Member;

public class LibraryMenu {
	private LibraryManager lm=new LibraryManager();
	Scanner input=new Scanner(System.in);
	
	public void mainMenu() {
		
		Member member=new Member();
		System.out.print("이름입력:");
		String name=input.nextLine();
		System.out.print("나이입력:");
		int age=input.nextInt();
		System.out.print("성별입력:");
		char gender=input.next().charAt(0);
		
		
		lm.insertMember(new Member(name, age, gender));
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지"); //Library Manager의myinfo()호출 
			System.out.println("2. 도서 전체 조회"); //LibraryMenu의 select All()호출
			System.out.println("3. 도서 검색"); //searchBook
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			
			
			System.out.print("메뉴선택 ");
			int num=input.nextInt();
			input.nextLine();
			switch(num) {
			case 1:
				System.out.println("menu!!"+lm.myInfo());
				
				break;
			case 2:
				selectAll(); 
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				return;
				
			}
		}
		
	}
	//도서 전체조회
	public void selectAll() {
		// LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력  대여할 때 도서번호를 알기 위해
		//ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		Book[] bList=lm.selectAll();
		
		for(int i=0; i<bList.length;i++) {
			System.out.println(i+"번 도서 : "+bList[i].getTitle()+" / "+ bList[i].getAuthor()+ 
					" / "+bList[i].getPublisher()+bList[i].toString());
			
		}
	}
	public void searchBook() {
		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
		// LibraryManager의 searchBook() 에 전달
		// 그 결과 값을 Book[] 자료형에 담기
		// Book[] searchList = lm.searchBook(keyword);
		// for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
		// NullPointerException 발생 시 오류 해결하시오
		System.out.println("검색할 제목 키워드 :");
		String keyword=input.nextLine();
		Book[] searchList=lm.searchBook(keyword);
		if(searchList[0]==null) {
			System.out.println("도서가 없습니다.");
		}else {
			for(Book searchLists :searchList){
				System.out.println(searchLists);
			}
		}
			
		
	}
	public void rentBook() {
		
	}
}
