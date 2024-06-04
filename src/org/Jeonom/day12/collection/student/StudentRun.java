package org.Jeonom.day12.collection.student;

import java.util.List;
import java.util.Map;

public class StudentRun {

	public static void main(String[] args) {
		ManageStudent mng = new ManageStudent();
		ViewStudent view = new ViewStudent();
		
		끝 :
		while(true) {
			int input = view.printMenu();
			switch(input) {
			case 1 :
				Student std = view.inputStudent();
				mng.registerStudent(std);
				break;
			case 2 :
				String name = view.inputName("검색");
				List<Student> sList = mng.searchOneByName(name);
				view.displayStudents(sList);
				break;
			case 3 :
				List<Student> stdList = mng.selectAllStudents();
				if(stdList != null) { // 위 메소드에 null값을 반환해주는 식 추가 
				// null 값을 반환해주지 않았을 경우 stdList에는 ArrayList가
				// 있기 때문에 이미 null이 아니다.
//				if(stdList.isEmpty()) { // isEmpty메소드 사용
//				if(stdList.size() > 0) { // size메소드 사용
					view.displayStudents(stdList);
				}else {
					view.displayMsg("회원정보가 없습니다.");
				}
				break;
			case 4 :
				name = view.inputName("수정");
				
//				Student student = mng.searchModifyStudent(name);
//				student = view.modifyStudent(student);
				
//				int index = mng.searchIndexByName(name);
//				Student student = mng.searchModifyStudent(name);
				// 인덱스와 학생 값을 한번에 받는 Map 인터페이스 사용
				Map<String, Object> result = mng.searchModifyStudent(name);
				Student student = view.modifyStudent((Student)result.get("student"));
				mng.modifyStudent((int)result.get("index"), student);
				break;
			case 5 :
				name = view.inputName("삭제");
				int index = mng.searchIndexByName(name);
				mng.deleteStudent(index);
				break;
			case 6 :
				
				break;
			case 0 :
				view.displayMsg("프로그램을 종료합니다.");
				break 끝;
			default :
				view.displayMsg("메뉴를 다시 선택해주세요");
			}
		}
		
	}

}
