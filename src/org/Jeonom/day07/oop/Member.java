package org.Jeonom.day07.oop;

public class Member {
	// 멤버변수(필드) 5 ~ 15
	// public을 붙이면 다른 클래스에서 import 할 수 있음
	public String name;
	char gender;
	public int age;
	String education;
	long salary;
	public String job;
	String property;	// 집 1채, 자동차 2대 / 500000000
	String phone;	// 01012345678
	String address;
	boolean divorceYN;	// Yes or No
	String children;	// 1남 1여, 아들1, 딸1
	
	public Member() {}	// 생성자 18
	
	// 멤버메소드(메소드) 23 ~ 25
//	public void registerMember() {}
	// 메소드는 옆에 ()를 붙여줘야 작동함
	public void doHeart() {}
	public void sendMessage() {}
	public void doPromise() {}
}
