package org.Jeonom.day08.oop.student.practice;

public class StudentApp {
	
	public static void main(String[] args) {
		ManageStudent student = new ManageStudent();
		ViewStudent view = new ViewStudent();
		end :
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1 :
				student.inputScore();
				break;
			case 2 :
				student.printScore();
				break;
			case 3 :
				view.displayMsg("프로그램을 종료합니다.");
				break end;
			default :
				view.displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
		
	}
}
