package com.view;

import static common.JDBCTemplate.Close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.Scanner;

import com.model.biz.MyTestBiz;
import com.model.dto.MyTest;
public class MyTestView {

	
	
	
	public static void main(String[] args) {
		int no = 0;
		
		int mno=0;
		String name= null;
		String nickName=null;
		
		
		MyTestBiz biz = new MyTestBiz();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("*****MENU*****");
			System.out.println("1.전체출력");
			System.out.println("2.추가");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.선택출력");
			System.out.println("6.종료");
			System.out.println();
			System.out.print("메뉴 선택: ");
			no = sc.nextInt();
			
			System.out.println();
			switch(no) {
			case 1:
				//전체출력
				System.out.println("***전체출력***");
				System.out.println(biz.getAll());
				System.out.println();
				break;
			case 2:
				//추가
				System.out.println("***추가***");
				System.out.print("no: ");
				mno = sc.nextInt();
				System.out.print("name: ");
				name = sc.next();
				System.out.print("nickname: ");
				nickName = sc.next();
				
				MyTest dto = new MyTest(mno, name, nickName);
				int inRes =biz.insert(dto);

				if(inRes>0) {
					System.out.println("입력 성공!!");
				}else {
					System.out.println("입력 실패!!");
				}
				break;
			case 3:
				//쉉
				System.out.println("***수정***");
				System.out.print("수정할 번호: ");
				mno = sc.nextInt();
				System.out.println("--수정할 내용--");
				System.out.print("수정할 이름: ");
				name = sc.next();
				System.out.print("수정할 별명: ");
				nickName=sc.next();
				
				MyTest updateDto = new MyTest(mno,name,nickName);
				
				int upRes = biz.update(updateDto);
				if(upRes>0) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
				break;
			case 4:
				//삭제
				System.out.println("***삭제***");
				System.out.print("삭제할 번호: ");
				int del = sc.nextInt();
				
				int delRes = biz.delete(del);
				
				if(delRes>0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				
				break;
				
			case 5:
				System.out.println("***선택출력***");
				System.out.print("번호입력: ");
				int selNo = sc.nextInt();
				
				// 입력 받은 번호(selNo)와 일치 하는 데이터 출력
				System.out.println(biz.selectOne(selNo));
				break;
			case 6:
				System.out.println("종료");
				sc.close();
				break;
			}
		}while(no != 5);
		
		
		
		
		
		
		
		
	}

}
