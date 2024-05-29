package org.Jeonom.day09.oop.encapsulation;

import java.util.Scanner;

public class Student {
	private String name;
	private int firstSc;
	private int secondSc;
	
	public Student() {}
	
	public Student(String name, int firstSc, int secondSc) {
		this.name = name;
		this.firstSc = firstSc;
		this.secondSc = secondSc;
	}
	// setter() 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstSc(int firstSc) {
		this.firstSc = firstSc;
	}
	public void setSecondSc(int secondSc) {
		this.secondSc = secondSc;
	}
	// getter() 메소드
	// getter에는 this 안붙여주도 됨
	public String getName() {
		return name;
	}
	public int getFirstSc() {
		return this.firstSc;
	}
	public int getSecondSc() {
		return secondSc;
	}
	
	public String toString() {
		return this.name + " 학생의 첫번째 점수는 " + this.firstSc + 
				"점, 두번째 점수는 " + this.secondSc + "점입니다.";
	}
		
}
