package org.Jeonom.day09.oop.inheritance;

import org.Jeonom.day09.oop.inheritance.point.Point;

class Super {
	public int pub;
	int def;
	protected int pro;
	private int pri;
}

class Sub extends Super {
	void set() {
		Super sup = new Super();
		sup.pro = 507; // 같은 패키지인 Super에서는 super을 쓰지 않아도 접근 가능
		super.pub = 24;
		super.def = 5;
		super.pro = 7;
//		super.pri = 1023; // is not visible
	}
}

class ShapePoint extends Point {
	void set() {
		Point p = new Point();
		p.pub = 24;
//		p.def = 57; // default는 같은 패키지에서만 가능
//		p.pro = 10; // protected는 같은 패키지 또는 상속일 때 가능
					// 다른 패키지에서는 super를 붙여야 protected 접근 가능
//		p.pri = 23; // private 당연히 안됨
		
		super.pub = 2024;
//		super.def = 507;
		super.pro = 23;
//		super.pri = 1023;
	}
}

public class Exam_Protected {

}
