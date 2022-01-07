package com.cares.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		// Tv, Computer, Phone 정보 입력
		
		Computer c1 = new Computer();
		c1.company = "삼성";
		c1.brand = "울트라";
		c1.price = 200;
		c1.point = 2;
		c1.cpu = "i7";
		
		Phone p1 = new Phone();
		p1.company = "애플";
		p1.brand = "아이폰";
		p1.price = 100;
		p1.point = 1;
		p1.pixel = 100;
		
		Tv t1 = new Tv();
		t1.company = "LG";
		t1.brand = "OLED";
		t1.price = 300;
		t1.point = 3;
		t1.size = 50;
		
		Client iu = new Client();
		iu.money = 1000;
		iu.point = 0;
		iu.buy(p1);
		
		// p1은 phone, phone은 뭐다? Appliance다 그럼 Appliance타입에 넣어도 다형성에 의해 자동으로 형변환된다.
		
	}

}
