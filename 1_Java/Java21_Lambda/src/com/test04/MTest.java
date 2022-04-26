package com.test04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MTest {
	//스트림
	public static void main(String[] args) {
//		createStream();
//		createStream2();
		pipeline();
	}
	//배열 List를 이용하여 처리
	public static void createStream2() {
		
		//String으로 저장된 배열을 stream으로 바꿔서 forEach로 출력
		String[] arr=new String[] {"1","2","3","4","5","6"};
		Stream<String> stream01=Arrays.stream(arr);
		stream01.forEach(System.out::println);

		List<String> list01=Arrays.asList(arr);
		list01.forEach(System.out::println);
		
	}
	public static void pipeline() {
		//stream은 한갬나 실행하는 것이 아닌, 여러개를 파이프라인으로 함수들을 붙여 실행가능
		//1.리스트만듬
		//2.스트림으로 변경
		//3. 필터로 내가 원하는것만 남기고 거른다.
		//4.정렬
		//5.리스트로변환
		List<String> class504=Arrays.asList("이한슬","최밤비","이스이","최빼비");
		List<String> s=class504.stream().filter(name->name.contains("이")).sorted().collect(Collectors.toList());
		System.out.println(s);
		//collection-> stream으로 변경후 필터로 거르기
		class504.stream().filter(name->name.contains("비")).sorted()
		.map(w->w.replace(w.substring(1, w.length()),"*".repeat(w.length()-1)))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println(class504.stream().filter(name->name.contains("비")).sorted().collect(Collectors.toList()));
	}
	public static void createStream() {
		//builder :스트림에 직접적으로 원하는 값 넣을 수 있다.
		//build()메소드를 호출하여 스트림을 리턴함.
		Stream<String> stream01=Stream.<String>builder().add("이한슬").add("이스이").add("이밤비").build(); //스트림을 만들면서 바로 넣을수잇는건 builder때문임
		stream01.forEach(System.out::println);//add로 추가한데이터를 하나씩 println으로 system.out해서 프린트함
		
		//empty :비어있는 스트림 생성
		Stream<String> stream02=Stream.empty();
		System.out.println(stream02.toArray().length);
		
		//generate :람다 사용가능(Supplier),
		Stream<Integer> stream03=Stream.generate(()->100).limit(5);
		stream03.forEach(System.out::println);
		
		//iterator: 초기값과 해당 값을 다루는 람다를 이용해서 스트림에 들어갈 요소를 만든다.
		Stream<Integer> stream04=Stream.iterate(1, (i)->++i).limit(5);//후위연산자를 사용하면 리턴한다음  나중에 증가하기때문에 전위연산자를 사용해야함
		stream04.forEach(System.out::println);
		
		//range 
		IntStream range01=IntStream.rangeClosed(1, 5);//range는 1-4까지 rangeClosed는 1-5까지 
		range01.forEachOrdered((i)->System.out.print(i+" "));
	}
}
