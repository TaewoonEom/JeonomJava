package miniproject;

import java.util.Scanner;

public class ViewMenu {
	
	private Member member;
	
	// 메인메뉴
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 원하는 메뉴를 선택해주세요 ===");
		System.out.println("1. 회원가입");
		System.out.println("2. 원두 추천 받기");
		System.out.println("3. 가입 정보 보기");
		System.out.println("4. 회원탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}
	
	// 회원가입창
	public Member signUp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원가입 ======");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		Member name = new Member(memberName);
		member = new Member(memberId, memberPw, memberName, memberPhone);
		return member;
	}
	
	// 탈퇴창
	public int withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 정말로 탈퇴하시겠습니까? ===");
		System.out.println("1. 예 ");
		System.out.println("2. 아니오 ");
		System.out.print("선택 : ");
		return sc.nextInt();
	}
	
	// 메시지 출력
	public void sendMessage(String msg) {
		System.out.println(msg);
	}

	public void printMember(Member member) {
		System.out.println("====== 가입자 정보 ======");
		if(member != null) {
			System.out.println(member.toString());
		}
	}
	
	// 멤버 정보 가져오기
	public Member getMember() {
		return member;
	}
	
	// 멤버 정보 삭제하기
	public void deleteMember() {
		member = null;
	}
	
	





	


}
