package com.cares.s5;

public class MyGod {

	private MyGod() { // 생성자를 호출해야 객체가 만들어지는데 private임;
		// 그러면 같은 클래스 내부에서만 접근이 가능하다는 소리인데
		
	}
	
	public void makeGod() { // 그럼 이렇게 메서드로 만들어서 여기서 객체를 만들게 하면?
		MyGod myGod = new MyGod();
	}
	// 겉보기엔 될거같은데 애초에 이 메서드를 호출하려면 객체부터 만들어야되는데?
	public static void makeGod2() { 
		MyGod myGod = new MyGod();
	}
	// 이렇게 클래스메서드로 만들면 따로 객체를 만들지 않아도 메서드를 사용할 수가 있으니까.
	// 이렇게 하면 객체는 딱 한번 만들어지고 안만들어짐
}
