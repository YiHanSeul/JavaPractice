package com.collection.silsub1.view;

import java.util.Scanner;

import com.collection.silsub1.controller.BookManager;
import com.collection.silsub1.model.dto.Book;
//view���� �޴��� �Ŵ������׸� ��Ŵ
public class BookMenu {
	private Scanner input= new Scanner(System.in);
	private BookManager bm=new BookManager();
	
	public BookMenu() {}
	public void mainMenu() {
		while(true) {//6,1,5,4,3,2
			System.out.println("***���� ���� ���α׷�");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻� ���");
			System.out.println("5. ��ü���");
			System.out.println("6. ������");
			
			System.out.print("�޴����� : ");
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
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			if(num==6) break;
			
		}
		
	}
	public Book inputBook() {
		Book book=new Book();
		System.out.print("���� ����: ");
		book.setTitle(input.nextLine());
		input.nextLine();
		System.out.print("\n���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ) : ");
		book.setCategory(input.nextInt());
		input.nextLine();
		System.out.print("\n���� ����: ");
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
