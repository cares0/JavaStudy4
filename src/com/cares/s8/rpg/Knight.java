package com.cares.s8.rpg;

public class Knight extends Character implements Act{
	// 추상메서드 2개를 받았으니 오버라이딩 해서 완성시켜줘야함
	
	@Override
	public void attack() {
		System.out.println("칼 휘두르기");
		
	}

	@Override
	public void move() {
		System.out.println("걸어다니기");
		
	}
	
}
