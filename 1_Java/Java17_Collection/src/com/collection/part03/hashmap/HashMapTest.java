package com.collection.part03.hashmap;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	// HashMap
	public void testHashMap() {
		HashMap hmap = new HashMap();

		hmap.put("one", new Date());// key,value
		hmap.put(12, "red");
		hmap.put(34.56, 333);

		System.out.println("hmap: " + hmap);

		hmap.put(12, "yellow"); // key값을 중복으로 넣었을경우 덮어쓰기를 함.
		System.out.println("hmap: " + hmap);

		hmap.put(11, "yellow");
		hmap.put(9, "nine");
		System.out.println("hmap: " + hmap);

		System.out.println("key 9에 대한 value : " + hmap.get(9)); //하나씩 밖에 접근 못함.

		hmap.remove(9);
		System.out.println("hmap: " + hmap);

		System.out.println("저장된 객체 수 : " + hmap.size()); // count

	}
	//한번에 다 접근 하는 방법
	public void testHashMap2() {
		HashMap hmap=new HashMap();
		hmap.put("one", "variable");
		hmap.put("two","Operator");
		hmap.put("three", "if");
		hmap.put("four","switch");
		hmap.put("five", "while");
		System.out.println(hmap);
		
		//1.keySet(): key만 따로 Set으로 만든다.
		Set keys=hmap.keySet();
		Iterator keyIter=keys.iterator();
		
		while(keyIter.hasNext()) {//boolean값임 
			String key=(String)keyIter.next();//키값을 가져오고 다음으로 넘어감.
			String value=(String)hmap.get(key);
			System.out.println(key+":"+value);
	
		}
		System.out.println("============");
		//2.entryset(): entry만 따로 set으로 만든다.
		Set set=hmap.entrySet();
		
		Iterator entryIter=set.iterator();
		
		while(entryIter.hasNext()) {//map자체가 entry단위여서 처리가능 
			Map.Entry entry=(Map.Entry)entryIter.next();//next는 return형은 obj라서 형변호나해야함.
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//3. values(): Collection
		Collection values=hmap.values();
		System.out.println("============3-1==========");
		//3-1. Iterator
		Iterator valueIter=values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		System.out.println("============3-2==========");
		//3-2. toArray()
		Object[] vArr=values.toArray();
		for(int i=0;i< vArr.length;i++) {
			System.out.println(i+":"+vArr[i]);
		}
	}
}
