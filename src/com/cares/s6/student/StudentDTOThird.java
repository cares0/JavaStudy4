package com.cares.s6.student;

public class StudentDTOThird extends StudentDTO{
	// set total이라는 추상메서드를 상속받았기 때문에 에러, 상속받은 추상메서드를 완성시켜야 함
	
	int physics;

	@Override
	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.physics;
		return 0;
	}
	

}
