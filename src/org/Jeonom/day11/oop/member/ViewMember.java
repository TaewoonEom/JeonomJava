package org.Jeonom.day11.oop.member;

import java.util.Scanner;

public class ViewMember {

	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원관리 프로그램 ======");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 회원 전체정보 조회");
		System.out.println("4. 회원정보수정");
		System.out.println("5. 회원정보삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int input = sc.nextInt();
		return input;
	}

	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원가입 ======");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		String memberAddress = sc.nextLine();
		Member member = new Member(memberName, memberEmail, memberPhone, memberAddress);
		// 생성자를 만들어놨기 때문에 자동완성 가능
//		member.setMemberName(memberName);
//		member.setMemberEmail(memberEmail);
//		member.setMemberPhone(memberPhone);
//		member.setMemberAddress(memberAddress);
		return member;
	}

	// 새로운 객체 만들어서 수정
	public Member modifyMember(String memberEmail) {
		// memberEmail = email;
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원정보수정 ======");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		String memberAddress = sc.nextLine();
		Member member = new Member(memberName, memberEmail, memberPhone, memberAddress);
		return member;
	}
	
	// 객체배열에서 객체을 이용한 수정
	public void modifyMember(Member member) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원정보수정 ======");
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		String memberAddress = sc.nextLine();
		member.setMemberName(memberName);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
	}
		
	

	public String inputEmail(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 이메일 입력 : ");
		String email = sc.next();
		return email;
	}

	// 위의 메소드와 합침
//	public String modifyInput() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수정할 이메일 입력 : ");
//		String email = sc.next();
//		return email;
//	}

	public void printAllMembers(Member[] members) {
		System.out.println("====== 회원 전체정보 출력 ======");
		for(Member member : members) {
			if(member != null) { // null이 아닐경우에만 출력해서 오류 방지!
				System.out.println(member.toString());
			}
		}
		
	}

	public void printOneMember(Member member) {
		System.out.println("====== 회원 검색 결과 ======");
		System.out.println("이름 : " + member.getMemberName());
		System.out.println("전화번호 : " + member.getMemberPhone());
		System.out.println("주소 : " + member.getMemberAddress());
		System.out.println("이메일 : " + member.getMemberEmail());
	}

	public void displayMessage(String msg) {
		System.out.println(msg);
		
	}

}
