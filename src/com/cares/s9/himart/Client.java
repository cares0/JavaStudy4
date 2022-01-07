package com.cares.s9.himart;

public class Client {

	int money;
	int point;
	
	public void buy(int price, int point) {
		this.money = this.money - price;
		this.point = this.point + point;
		System.out.println("최종금액 : " + this.money);
		System.out.println("최종포인트 : " + this.point);
	}
	
	
	public void buy(Tv p) {
		this.money = this.money - p.price;
		this.point = this.point + p.point;
		System.out.println("최종금액 : " + this.money);
		System.out.println("최종포인트 : " + this.point);
	}
	
	public void buy(Computer p) {
		this.money = this.money - p.price;
		this.point = this.point + p.point;
		System.out.println("최종금액 : " + this.money);
		System.out.println("최종포인트 : " + this.point);
	}
	
	public void buy(Phone p) {
		this.money = this.money - p.price;
		this.point = this.point + p.point;
		System.out.println("최종금액 : " + this.money);
		System.out.println("최종포인트 : " + this.point);
	}

	// 이 메서드가 필요한 정보가 뭐야, 가격이랑 포인트가 필요하잖아 그건 Appliance에 다 있잖아
	public void buy(Appliance p) {
		this.money = this.money - p.price;
		this.point = this.point + p.point;
		System.out.println("최종금액 : " + this.money);
		System.out.println("최종포인트 : " + this.point);
	}
}
