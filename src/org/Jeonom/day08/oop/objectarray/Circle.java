package org.Jeonom.day08.oop.objectarray;

public class Circle {
	public int radius;
	
	public Circle() {} // 생성자 : 클래스 이름과 똑같은 이름의 메소드
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14*this.radius*this.radius;
		return area;
	}
	
}
