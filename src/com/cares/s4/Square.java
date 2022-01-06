package com.cares.s4;

public class Square {

	public static int width;
	int height;
	
	public static void info() {
		System.out.println("클래스 메서드");
		System.out.println(this.height); // 클래스메서드에서는 멤버변수는 호출이 안됨
		System.out.println(Square.width); // 클래스메서드에서 클래스변수 호출 가능
		this.info2(); // 클래스메서드에서는 멤버메서드는 호출이 안됨
		
	}
	
	public void info2() {
		System.out.println("멤버 메서드");
		System.out.println(Square.width); // 멤버메서드에서도 클래스변수 호출 가능
		Square.info(); // 멤버메서드에서도 클래스메서드 호출 가능
	}
}
