package com.test1.run;

import java.util.ArrayList;
import java.util.Date;

import com.test1.board.Board;

public class Run {
	public static void main(String[] args) {
		
		Date d=new Date();
		ArrayList<Board> al=new ArrayList<Board>();
		al.add(new Board(1,"안녕하세요","홍길동",d,"처음 작성 하는 글입니다.",1));
		al.add(new Board(2,"반가워요","김유신",d,"글은 처음으로 적어보네요.",3));
		al.add(new Board(3,"가입했습니다.","이순신",d,"만나서 반갑습니다 등업부탁해요.",22));
		al.add(new Board(4,"무슨일이죠?","유관순",d,"접속이 잘 안되네요ㅠ",14));
		al.add(new Board(5,"물어볼게 있습니다.","신사임당",d,"탈퇴는 어떻게 하는건가요?",9));
		for(Board i:al) {
			System.out.println(i.toString());
		}
	}
}
