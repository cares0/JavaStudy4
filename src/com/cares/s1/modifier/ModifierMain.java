package com.cares.s1.modifier;

import com.cares.s2.Test2;

public class ModifierMain {

	public static void main(String[] args) {
		Test test = new Test();
		
		int n = 10;
		// test.num = 10; // 안됨
		test.info(n); // 이건 됨
		
		
		//Test2 test2 = new Test2();
		
		
		// test2.num2 = 5; // 사용불가
		
	}

}
