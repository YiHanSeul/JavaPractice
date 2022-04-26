package com.test03;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Functional03 {

	public static void main(String[] args) {
		// func01();
		//func02();
		func03();
	}

	public static void func01() {
		// Function 매개변수 O, 반환값 O
		// apply();
		Function<Integer, String> ti = n -> (n < 10) ? "0" + n : "" + n;
		System.out.println(ti.apply(1));
		System.out.println(ti.apply(6));
		System.out.println(ti.apply(16));

	}

	public static void func02() {
		// BiFunction -> Bi가 붙어져있으면 매개변수가 2개 이상
		BiFunction<String, String, Integer> sum = (i, j) -> Integer.parseInt(i) + Integer.parseInt(j);
		System.out.println(sum.apply("10", "20"));
	}

	public static void func03() {
		// Supplier :매개변수 X, 반환 O
		Supplier<Integer> rnu = () -> (int) (Math.random() * 45) + 1;
		System.out.println(rnu.get());
		
		// Consumer : 매개변수 O , 반환 X supplier랑 
		Consumer<String> hello=(name)-> System.out.println("hello, "+name);
		hello.accept("Lambda");

	}
}
