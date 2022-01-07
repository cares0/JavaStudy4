package com.cares.s7.zoo;

public abstract class Animal {

	String name;
	int age;
	
	public void eat() {
		System.out.println("먹는다");
	}
	public abstract void sleep(); // 기린은 서서잔다가 되고 호랑이는 누워서잔다 이렇게 해야하기 때문에
}
