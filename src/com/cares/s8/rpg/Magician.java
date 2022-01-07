package com.cares.s8.rpg;

public class Magician extends Character implements Act {

	int mp;
	
	@Override
	public void attack() {
		this.spell();		
	}

	@Override
	public void move() {
		System.out.println("텔레포트");
		
	}

	private void spell() {
		System.out.println("마법공격");
	}
	
}
