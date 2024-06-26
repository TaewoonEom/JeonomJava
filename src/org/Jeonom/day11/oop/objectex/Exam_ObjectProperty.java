package org.Jeonom.day11.oop.objectex;

class Member {
	String name;
	int age;
	String email;
	String phone;
	String address;
	
	public Member() {} // 기본생성자는 필수로 쓰고 필요할 때 생성자 추가해서 사용하기
	
	public Member(String name, int age, String email, String phone, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 이메일 : " + email + ", 전화번호 : " + phone + ", 주소 : " + address;
	}
}


public class Exam_ObjectProperty {
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드값 : " + obj.hashCode());
		// 의미있는 데이터로 만들어 출력하고 싶다면 오버라이딩 필수!
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
//		System.out.println("객체 출력 : " + obj); // toString() 생략 가능함.
												  // 객체를 출력하면 toString()의 결과로 출력됨
	}
	public static void main(String [] args) {
		print(new Member("일용자", 11, "khuser01@naver.com", "01092920303", "서울시 중구"));
		print(new Member());
		
		String javaStr = "Java";
		String javaStr2 = new String("Java");
		String javaStr3 = "Java";
		// 문제
		// if(javaStr == javaStr3) { true	주소가 똑같다.(상수풀)
		// if(javaStr3 == javaStr2) { false	new String을 해서 새로운 객체 생성 -> 다른 주소값을 가짐
		// if(javaStr3 == "Java") { true 
		// if(javaStr == "JavA") { false
		System.out.println("javaStr : " + javaStr + ", javaStr2 : " + javaStr2);
//		if(javaStr == "Java") {		주소값을 비교할 때
//		if(javaStr2.equals("Java")) {	 안에 내용을 비교할 때
		if("Java".equals(javaStr2)) { // 문자열 비교는 equals
									  // equals는 Object 클래스의 메소드
			System.out.println("똑같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}
}
