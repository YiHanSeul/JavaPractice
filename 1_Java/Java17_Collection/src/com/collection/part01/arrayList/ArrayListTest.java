package com.collection.part01.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	public void testArrayList() {
		//ArrayList
		//collection 하위에 list 하위에 arrayLsit있음
		ArrayList alist=new ArrayList();
		List list=new ArrayList();
		Collection clist=new ArrayList();
		
		
		//list는 객체만 저장 기본타입은 wrapper로 바꿔서들어감 autoboxing되고있음.
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());
		
		System.out.println("alist: "+alist); //toString이 overriding되어있어서 값이 나옴.
		
		for(int i=0; i<alist.size();i++) {//list는 length말고 size사용
			System.out.println(i+ ":"+alist.get(i));//값을 가져올때 get으로 가져오면됨.
		}
		
		alist.add("apple");
		alist.add(1,"banana");
		System.out.println("alist: "+alist);
		alist.remove(2);
		System.out.println("alist: "+alist);
		alist.set(1, true);//값 변경
		System.out.println("alist: "+alist);
		
	}
	public void testArrayList2() {
		ArrayList list=new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		list.add("melon");
		
		System.out.println("List : "+list);
		
		Collections.sort(list);//오름차순 정렬
		System.out.println("list sort: "+list);
	}
}
