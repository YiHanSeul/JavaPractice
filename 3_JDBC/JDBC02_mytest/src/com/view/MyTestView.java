package com.view;

import static common.JDBCTemplate.Close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.Scanner;

import com.model.dao.MyTestDao;
import com.model.dto.MyTest;

public class MyTestView {

	public static void main(String[] args) {
		int no = 0;

		int mno = 0;
		String name = null;
		String nickName = null;

		Connection con = getConnection(); // 디비 연결된것을 18줄에서 dao로 넘겨줌
		MyTestDao dao = new MyTestDao(con); // dao의 생성자가 실행되면서 con에 관련된 내용을 넘겨줌

		Scanner input = new Scanner(System.in);
		do {
			System.out.println("********MENU******");
			System.out.println("1.전체출력");
			System.out.println("2.추가");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.선택출력");
			System.out.println("6.종료");
			System.out.println();
			System.out.print("메뉴선택 : ");
			no = input.nextInt();

			System.out.println();
			switch (no) {
			case 1:
				// 전체출력
				System.out.println("****전체출력****");
				System.out.println(dao.getAll());
				System.out.println();
				break;
			case 2:
				// 추가
				System.out.println("****추가****");
				System.out.println("no: ");
				mno=input.nextInt();
				System.out.println("name: ");
				name=input.next();
				System.out.println("nickName: ");
				nickName=input.next();
				
				MyTest dto=new MyTest(mno,name,nickName); //객체에 한번에 담아서 모아 보내기
				int inRes=dao.insert(dto);
				if(inRes>0) {
					System.out.println("입력 성공");
				}else {
					System.out.println("입력 실패");
				}
				break;
			case 3:
				System.out.println("****수정****");
				System.out.print("수정할 번호: ");
				mno=input.nextInt();
				System.out.println("--수정할 내용--");
				System.out.print("수정할 이름: ");
				name=input.next();
				System.out.print("수정할 별명: ");
				nickName=input.next();
				
				MyTest updateDto=new MyTest(mno,name,nickName);
				int upRes=dao.update(updateDto);
				if(upRes>0) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
				break;
			case 4:
				//삭제
				System.out.println("****삭제****");
				System.out.println("삭젷라 번호: ");
				int del=input.nextInt();
				int delRes=dao.delete(del);
				if(delRes>0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				break;
			case 5:
				//선택 출력
				System.out.println("****선택출력****");
				System.out.println("번호입력 : ");
				int selNo=input.nextInt();
				
				//입력받은 번호(selNo)와 일치하는 데이터 출력
				System.out.println(dao.selectOne(selNo));
				
			case 6:
				System.out.println("종료");
				Close(con);
				input.close();
				break;
			}
		} while (no != 5);
	}

}
