package com.cares.s3.member;

public class Member {

	private String name;
	private String adress;
	private double weight;
	private double height;
	private int age;

	public void setAge(int age) { // 멤버변수에 대입할 값을 매개변수로 받음
		this.age = 20; // 기본값으로 20을 설정하고 틀리면 20을 넣겠다.
		if(0 < age && age < 200) {
			this.age = age;
		}
	}
	
	public int getAge() { // main에서 age에 접근 불가이기 때문에 메서드를 통해 age값을 반환해주는 것
		return this.age;
	}

	
	public void setHeight(double height) {
		this.height = 160;
		if (0 < height && height < 250) {
			this.height = height;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return this.height;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getAdress() {
		return this.adress;
	}
}

