package org.Jeonom.day08.oop.objectarray.student;

import java.util.Scanner;

public class StudentApp {
	
	public static void main(String[] args) {
		ManageStudent mng = new ManageStudent();
		ViewStudent view = new ViewStudent();
		end :
		while (true) {
			int choice = view.printMenu();
			Student students[] = null;
			switch(choice) {
			case 1 :
				// mng.inputInfo();
				students = view.displayInput();
				mng.inputInfo(students);
				break;
			case 2 :
				// mng.printInfo();
				students = mng.printInfo();
				view.displayInfo(students);
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

