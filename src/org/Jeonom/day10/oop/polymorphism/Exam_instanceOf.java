package org.Jeonom.day10.oop.polymorphism;

class Car {}
class Sonata extends Car {}
class Genesis extends Car {}
class GV80 extends Genesis {}


public class Exam_instanceOf {
	// instanceof는 오버라이딩과는 관련이 없고 업캐스팅에서
	// 참조변수를 호출하면 어떤 객체를 가리키는지 구분하기 위해 사용
	static void print(Car car) {
		if(car instanceof Sonata) {
			System.out.println("소나타 점프 방방!");
		}
		if(car instanceof Genesis) {
			System.out.println("제네시스 스웩 부릉~");
		}
		if(car instanceof GV80) {
			System.out.println("GV80 고고씽~");
		}
		// GV80은 Car와 Genesis 두개를 상속받았기 때문에
		// Car와 Genesis의 출력문을 모두 출력한다.
	}
	
	public static void main(String[] args) {
		print(new Car());
		print(new Sonata());
		print(new Genesis());
		print(new GV80());
	}
}
