package org.Jeonom.day12.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam_ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List 인터페이스 존재
		// List 인터페이스를 구현하여 만든 클래스가 존재
		// ArrayList 클래스라고 하면 이것을 사용한다.
		// List 인터페이스를 ArrayList로 업캐스팅하여 사용
		// 인터페이스는 new 키워드를 써서 객체를 생성할 수 없기 때문
		// List 컬렉션은 순서가 중요하며, 중복을 허용
		List<String> list = new ArrayList<String>();
		list.add("김만규");
		list.add("김지혁");
		list.add("양희준");
		list.add("오정민");
		list.add("김태우");
		list.add("이용재");
		list.add("조홍빈");
		list.add("오준석");
		list.add(2, "조승효");	// 추가
		
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		System.out.println("크기 : " + list.size());
		int listSize = list.size()-1;
		System.out.println("마지막 값 : " + list.get(listSize));
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		list.remove(listSize);
		list.remove(2); // 부분 삭제
		list.clear();	// 전체 삭제
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("isEmpty() : " + list.isEmpty() + ", size() : " + list.size());
	}
	
	public void genericSample() {
		GenericList<String> strList = new GenericList<String>();
		// 형지정을 하여 강제 형변환을 하지 않아도 사용할 수 있게 해주는 것이 제네릭
		strList.add("김정욱");
		strList.add("이현주");
		strList.add("강신욱");

		String a1 = strList.get(0);
		String a2 = strList.get(1);
		String a3 = strList.get(2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		// 제네릭 없이 사용하면 형변환 해야됨
		ObjectList obj = new ObjectList();
		obj.add("개강");
		obj.add("프로젝트");
		obj.add("종강");
		
		String start = (String)obj.get(0);
		String project = (String)obj.get(1);
		String end = (String)obj.get(2);
		System.out.println(start);
		System.out.println(project);
		System.out.println(end);
	}
	
	public void objListSample() {
		ObjectList objList = new ObjectList();
		objList.add(5.7);
		objList.add(1023);
		objList.add("종강");
		
		double start = (double)objList.get(0);
		int end = (int)objList.get(1);
		String msg = (String)objList.get(2);
		System.out.println(start);
		System.out.println(end);
		System.out.println(msg);
	}
	
	public void intListSample() {
		IntList nums = new IntList();
		nums.add(5);
		nums.add(7);
		nums.add(1023);
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println("크기 : " + nums.size());
		nums.clear(); // 모두 삭제
		System.out.println("크기 : " + nums.size());
	}
	
	

}
