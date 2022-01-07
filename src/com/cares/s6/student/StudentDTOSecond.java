package com.cares.s6.student;

public class StudentDTOSecond extends StudentDTO{
	
	int history; 

	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.history;
		return this.total;
	}
}
