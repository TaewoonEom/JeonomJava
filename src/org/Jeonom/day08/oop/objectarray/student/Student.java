package org.Jeonom.day08.oop.objectarray.student;

import java.util.Scanner;

public class Student {
	public String name;
	public int firstSc;
	public int secondSc;
	
	public Student() {}
	
	public Student(String name, int firstSc, int secondSc) {
		this.name = name;
		this.firstSc = firstSc;
		this.secondSc = secondSc;
	}
	
	public String toString() {
		return this.name + " 학생의 첫번째 점수는 " + this.firstSc + 
				"점, 두번째 점수는 " + this.secondSc + "점입니다.";
	}
	
}
