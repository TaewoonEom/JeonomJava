package miniproject;

public class Run {
	public static void main(String[] args) {
		ViewMenu view = new ViewMenu();
		FlavorChoice flavor = new FlavorChoice();
		Result result = new Result();
		Member member;

		end: while (true) {
			int input = view.mainMenu();
			switch(input) {
			case 1 : // 회원가입
				member = view.signUp();
				view.sendMessage("=== *" + member.getMemberName() + "님 가입을 환영합니다* === ");
				break;
			case 2 : // 원두 추천 받기
				member = view.getMember();
				if(member == null) {
					view.sendMessage("===== 회원전용 기능입니다.=====\n=== 회원가입 후 이용해주세요! === ");
					break;
				}else
				if(member != null) {
					int firstChoice = flavor.firstFlavor(); // 첫번째 맛 선택
					int secondChoice = flavor.secondFlavor(); // 두번째 맛 선택
					if (firstChoice == secondChoice) {
						view.sendMessage("=== 중복된 맛을 선택할 수 없습니다! ===");
						continue;
					} else { // 맛 추천
						result.recommendCoffee(firstChoice, secondChoice);
						break;
					}
				}
			case 3 : // 가입 정보 보기
				member = view.getMember();
				if(member == null) {
					view.sendMessage("=== 가입 정보 없음 ===");
				} else {
					view.printMember(member);
				}
				break;
			case 4 : // 회원탈퇴
				member = view.getMember();
				if(member == null) {
					view.sendMessage("=== 가입 정보 없음 ===");
					break;
				}else {
					int choice = view.withdraw();
					switch(choice) {
					case 1 :
						view.deleteMember();
						view.sendMessage("=== ★이용해주셔서 감사합니다★ ===");
						break;
					case 2 :
						break;
					}
				} break;
			case 0 : // 프로그램 종료
				view.sendMessage("===== 프로그램 종료 =====");
				break end;
			default : view.sendMessage("==== 잘못 입력하셨습니다!!! ====");
			}
		}
	}
}
