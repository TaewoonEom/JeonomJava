package org.Jeonom.day06.array.sort.exercise;

import java.util.Random;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 시작합니다.");
		int choiceNum = 0;
		int randChoice = 0;
		
		do {
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String userChoice = sc.next();
			System.out.println("당신은 " + userChoice + "를 냈습니다.");
			randChoice = (int)(Math.random()*3)+1;
			choiceNum = 0;
			
			// 입력받은 문자열을 숫자로 바꾸는 과정
			switch (userChoice) {
				case "가위" : choiceNum = 1; break;
				case "바위" : choiceNum = 2; break;
				case "보" 	: choiceNum = 3; break;
			}
			
			if (randChoice == 1) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
			} else if (randChoice == 2) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
			} else {
				System.out.println("컴퓨터는 보를 냈습니다.");
			}
			if (choiceNum == randChoice) {
				System.out.println("비겼습니다. 다시 시작합니다.");
			}else if ((choiceNum == 1 && randChoice == 3) || (choiceNum == 2 && randChoice == 1)
					|| (choiceNum == 3 && randChoice == 2)) {
				System.out.println("당신이 이겼습니다!");
				break;
			}else if ((choiceNum == 1 && randChoice == 2) || (choiceNum == 2 && randChoice == 3)
					|| (choiceNum == 3 && randChoice == 1)) {
				System.out.println("당신이 졌습니다!");
				break;
			}
			
			System.out.println();
		} while(choiceNum == randChoice);
		
//		 Scanner sc = new Scanner(System.in);
//         
//       System.out.println("가위 바위 보 게임을 시작합니다.");
//         
//         do {
//                 System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
//                 
//                 String input = sc.nextLine();
//                 
//                 System.out.println("당신은 " + input + "를 냈습니다.");
//                 
//                 int random = (int)(Math.random()*3);
//                 String computer = "";
//                 
//                 switch(random) {
//                         case 0 : computer = "가위"; break;
//                         case 1 : computer = "바위"; break;
//                         case 2 : computer = "보"; break;                        
//                 }
//         
//                 System.out.println("컴퓨터는 " + computer + "를 냈습니다.");
//                 
//                 if(computer == input) {
//                         System.out.println("비겼습니다. 다시 시작합니다.");
//                 }else {
//                         boolean win = false;
//                         
//                         if(computer.equals("가위")) {
//                                 if(input.equals("바위")) {
//                                         win = true;
//                                 }
//                         }else if(computer.equals("바위")) {
//                                 if(input.equals("보")) {
//                                         win = true;
//                                 }
//                         }else {
//                                 if(input.equals("가위") {
//                                         win = true;
//                                 }
//                         }
//                 }
//                 if(win) {
//                         System.out.println("당신이 이겼습니다.");
//                         break;
//                 }else{
//                         System.out.println("당신이 졌습니다.");
//                         break;
//                 }
//         }while(true);        
	}	
}
