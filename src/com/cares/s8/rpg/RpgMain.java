package com.cares.s8.rpg;

public class RpgMain {

	public static void main(String[] args) {

		Knight k1 = new Knight(); 		
		Magician m1 = new Magician();
		Character c1 = k1;
		m1 = (Magician) c1; // 코드상 오류는 아님
		
		
		Archer a1 = new Archer();

		
		m1 = (Magician) c1;
		
		m1.attack();
		
		// 세개 다 다른 객체
		// k1은 Knight 타입, m1은 Magician타입, a1은 Archer타입
		// 공통은 부모로 Character를 상속받는다는 점
		// 이 3개의 캐릭터를 하나의 변수로 다룰려고 한다면,
		// 여러개의 데이터를 하나로 다룬다? > 배열
		// 근데 배열은? 같은 데이터타입끼리만 하나로 다룰 수 있음
		// k1, m1, a1은 셋다 다 데이터타입이 다름. 근데 배열에 다 담을 수가 있나?
		// 바로 여기서 다형성의 중요한 점이 나옴
		// Knight, Magician, Archer is Character
		// 결국 캐릭터 타입으로 묶으면 됨
		
		Character[] ch = new Character[3];
		ch[0] = k1;
		ch[1] = m1;
		ch[2] = a1;
		// ch만 옮기면 3개가 다 같이 움직임
		
				
			
		
//		
//마법사타입은 캐릭터타입이다, 변수에 값을 집어넣을 때는 같은 타입을 집어넣는 것이 원칙이었음
//클래스명이 데이터타입이니까.
//Character c1 = 캐릭터 타입을 넣어야 함
//근데, 마법사 타입 = 캐릭터 타입 

		

	}

}
