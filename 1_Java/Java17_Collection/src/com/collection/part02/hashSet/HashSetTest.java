package com.collection.part02.hashSet;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public void testHashSet() {
		//HashSet
		//set은 값을 하나씩 들고올수없음 순서가 없어서 
		//뽑아오려면 iterator사용해야함.
		HashSet hset=new HashSet();
		hset.add("Java");
		hset.add(123);
		hset.add(45.67);
		hset.add(new Date());
		
		System.out.println("hset: "+hset);
		
		hset.add("Java");
		hset.add(123);
		System.out.println("hset: "+hset);
		System.out.println("저장된 객체수 : "+hset.size());
		
		//1. toArray();
		Object[] arr=hset.toArray();
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+":"+arr[i]);
		}
		System.out.println("=========");
		//2.Iterator();
		Iterator iter=hset.iterator();//한줄로 줄새움
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//hset.remove("java")//하나씩 지움
		hset.clear();//한번에 싹다 지움
		System.out.println(hset);
		
		hset.add(new Score("이한슬",100,90));
		hset.add(new Score("최여이",100,80));
		hset.add(new Score("최밤비",70,80));
		hset.add(new Score("이스이",80,70));
		System.out.println(hset);
		System.out.println("갯수 : "+hset.size());
		//new로 객체를 새로 만들었기 때문에 중복이지만 다르게 판별하여 추가됨
		//그래서 score클래스에서 hashCode와 equlas를 추가해야함.
		hset.add(new Score("이스이",80,70)); 
		System.out.println(hset);
		System.out.println("추가 후 갯수 : "+hset.size());
	}
}
