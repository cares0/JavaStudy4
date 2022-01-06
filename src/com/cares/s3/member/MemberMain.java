package com.cares.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(40);
		member.setAdress("test@gmail.com");
		
		
		
		System.out.println(member.getAdress());
		System.out.println(member.getAge());
	
	}
}
