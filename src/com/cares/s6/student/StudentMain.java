package com.cares.s6.student;

public class StudentMain {

	public static void main(String[] args) {

		StudentDTOSecond ss = new StudentDTOSecond();
		ss.kor = 50;
		ss.eng = 50;
		ss.math = 50;
		ss.history = 50;
	
		ss.setTotal();

	}

}
