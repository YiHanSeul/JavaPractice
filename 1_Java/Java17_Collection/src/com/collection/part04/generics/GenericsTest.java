package com.collection.part04.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsTest {
	public void test1() {
		List list = new ArrayList();

		list.add(new String("Orange"));
		list.add(new Book());
		list.add(new Car());
		list.add(new Student());

		System.out.println("저장된 객체 수 : " + list.size());
		System.out.println("list : " + list);

		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);

			if (obj instanceof Book) {// 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 사용
				((Book) obj).printBook();
				// Book b=(Book)obj; 같음 줄여서 쓰면 23줄처럼됨
				// b.printBook();
			}
			if (obj instanceof Student) {
				((Student) obj).socre();
			}
			if (obj instanceof Car) {
				((Car) obj).printCar();
			}
		}
	}

	public ArrayList<Book> test2() {
		ArrayList<Book> list = new ArrayList<Book>();// Book 객체만 담을수 있는 ArrayList;
		ArrayList list2 = new ArrayList();

		list.add(new Book());
		list.add(new Book());
//		list.add("test book"); Book타입만 넣을수있음.

		list2.add(new Book());
		list2.add(new Book());
		// list2.add("test book");

		for (Book b : list) {
			b.printBook();
		}

		for (Object ob : list2) {
			((Book) ob).printBook();
		}

		return list2;
	}

	public void test3() {
		HashMap<String, Book> map = new HashMap<String, Book>(); // HashMap<key값의generics,value값의 generics) map=new
																	// HashMap();

		map.put("one", new Book("java"));
		map.put("two", new Book("html"));
		map.put("three", new Book("Spring"));

		System.out.println(map);

		// entryset(), Iterator
		Set<Map.Entry<String, Book>> entry = map.entrySet(); // 값 뽑아오기
		Iterator<Map.Entry<String, Book>> iter = entry.iterator();// 줄새우기

		while (iter.hasNext()) {
			Map.Entry<String, Book> ent = iter.next();
			String key=ent.getKey();
			Book value=ent.getValue();
			
			System.out.println(key+" : "+value);
		}
	}
}

class Book {
	private String title;

	public Book() {
	}

	public Book(String title) {
		this.title = title;
	}

	public void printBook() {
		System.out.println("printBook() call..");
	}

	@Override
	public String toString() {
		return "Book";
	}
}

class Student {
	public Student() {
	}

	public void socre() {
		System.out.println("score() call");
	}

	@Override
	public String toString() {
		return "Student";
	}

}

class Car {
	public Car() {
	}

	public void printCar() {
		System.out.println("printCar() call...");
	}

	@Override
	public String toString() {
		return "car";
	}
}