package com.collection.part01.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreManager {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Score("이창진",99));
		list.add(new Score("이스이",88));
		list.add(new Score("최여이",95));
		list.add(new Score("최밤비",70));
		list.add(new Score("호밤비",60));
		list.add(new Score("빼비스이",50));
		
		System.out.println("list : "+list);
		
		Collections.sort(list);
		System.out.println("list : "+list);
		
		Collections.sort(list,new AscScore()); //sort(정렬할list, 무엇을 기준으로 정렬할지정함);
		System.out.println(list);
		
		Collections.sort(list,new DescScore());
		System.out.println(list);
	}

}
