package com.poly.part01.test05;

public class TvMain {

	public static void main(String[] args) {
		Tv lg = new Lg_tv();
		System.out.println(lg.volUp());
		System.out.println(lg.volUp());
		System.out.println(lg.volDown());

		lg.volUp();
		lg.volUp();
		lg.volDown();
		((Lg_tv) lg).tvClosed();
	}

}
