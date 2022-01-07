package com.cares.s6.student;

public abstract class StudentDTO {

	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	// 부모에다 선언을 하면 나머지는 자동 상속이기에 total이 들어옴
	
	//public void setTotal() {
	//	this.total = kor + eng + math;
	//}
	// 자식들은 못씀, 학년마다 과목이 추가되기 때문에
	
	public abstract int setTotal(); // 추상메서드를 만들어줌
	
	
	// 여기까지 공통과목
	
	// int history; // 2학년
	// int physics; // 3힉년
}
