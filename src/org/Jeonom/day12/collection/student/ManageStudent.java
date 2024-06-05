package org.Jeonom.day12.collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageStudent implements ManageInterface {
	
	private List<Student> sList;
	
	public ManageStudent() {
		sList = new ArrayList<Student>();
	}
	
	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}

	@Override
	public void modifyStudent(int index, Student student) {
		sList.set(index, student);
		
	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index);
	}

	@Override
	public Student searchOneByName(String name) {
		if(name != null) {
			// 반복문 안에서 초기화를 할 경우 이름이 같은 사람이 있어도
			// 1명만 반환되기 때문에 반복문 밖에서 초기화한다.
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					return std;
				}
			}
		}
		return null;
	}
	
	public List<Student> searchListByName(String name) {
		if(name != null) {
			// 반복문 안에서 초기화를 할 경우 이름이 같은 사람이 있어도
			// 1명만 반환되기 때문에 반복문 밖에서 초기화한다.
			List<Student> searchList = new ArrayList<Student>();
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					searchList.add(std);
				}
			}
			return searchList;
		}
		return null;
	}

	@Override
	public List<Student> selectAllStudents() {
		if(sList.isEmpty()) {
			return null;
		}
		return sList;
	}

	public Map<String, Object> searchModifyStudent(String name) {
		if(name != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for(int i = 0; i < sList.size(); i++) { // 전체에서
				Student student = sList.get(i);
				if(name.equals(student.getName())) { // 이름이 같으면
					result.put("student", student);
					result.put("index", i);
					return result;
				}
			}
		}
		return null;
	}

	public int searchIndexByName(String name) {
		if(name != null) {
			int count = 0;
//			for(int i = 0; i < sList.size(); i++) {
//				if(name.equals(student.getName())) return i;
//			}
			for(Student student : sList) { // sList에서
				if(name.equals(student.getName())) { // 이름 같으면
					return count;
				}
				count++;
			}
		}
		return 0;
	}

}
