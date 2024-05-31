package miniproject;

public class Run {
	public static void main(String[] args) {
		Viewmenu view = new Viewmenu();
		Flavorchoice flavor = new Flavorchoice();
		Result result = new Result();
		CoffeeInformation info = new CoffeeInformation();
		
		end :
		while(true) {
			int firstChoice = flavor.firstFlavor(); // 첫번째 맛 선택
			if(firstChoice == 0) {
				view.sendMessage("===== 프로그램 종료 =====");
				break end;
			}
			if(firstChoice < 0 || firstChoice > 4) view.sendMessage("※ 정확한 숫자를 입력해주세요!!! ※");
			int secondChoice = flavor.secondFlavor(); // 두번째 맛 선택
			if(firstChoice == secondChoice) {
				view.sendMessage("※ 중복된 맛을 선택할 수 없습니다!!! ※");
				continue;
			}else { // 맛 추천
				int lookInfoOrAgain = result.recommendCoffee(firstChoice, secondChoice);
				if(lookInfoOrAgain == 2) {
					continue;
				}else { // 원두 정보 보기
					int buyOrAgain = info.showInformation(firstChoice, secondChoice);
					if(buyOrAgain == 1) continue;
				}
			}
			
			
			
		}
	}
}
				
//				switch(firstChoice) {
//				case 1 :
//					int secondChoice1 = flavor.secondFlavor1();
//					switch(secondChoice1) {
//					case 1 :
//						int result1 = result.result1_1();
//						switch(result1) {
//						case 1 : info.guatemala();
//						case 2 : continue;
//						}
//					case 2 :
//						int result2 = result.result1_2();
//						switch(result2) {
//						case 1 : info.ethiopia();
//						case 2 : continue;
//						}
//					case 3 :
//						int result3 = result.result1_3();
//						switch(result3) {
//						case 1 : info.kenyaAA();
//						case 2 : continue;
//						}
//					}
//				case 2 : 
//					int secondChoice2 = flavor.secondFlavor2();
//					switch(secondChoice2) {
//					case 1 :
//						int result1 = result.result2_1();
//						switch(result1) {
//						case 1 : info.colombia();
//						case 2 : continue;
//						}
//					case 2 :
//						int result2 = result.result2_2();
//						switch(result2) {
//						case 1 : info.retro();
//						case 2 : continue;
//						}
//					case 3 :
//						int result3 = result.result2_3();
//						switch(result3) {
//						case 1 : info.retroBravi();
//						case 2 : continue;
//						}
//					}
//				case 3 :
//					int secondChoice3 = flavor.secondFlavor3();
//					switch(secondChoice3) {
//					case 1 :
//						int result1 = result.result3_1();
//						switch(result1) {
//						case 1 : info.terra();
//						case 2 : continue;
//						}
//					case 2 :
//						int result2 = result.result3_2();
//						switch(result2) {
//						case 1 : info.onyx();
//						case 2 : continue;
//						}
//					case 3 :
//						int result3 = result.result3_3();
//						switch(result3) {
//						case 1 : info.cityBrown();
//						case 2 : continue;
//						}
//					}
//				case 4 :
//					int secondChoice4 = flavor.secondFlavor4();
//					switch(secondChoice4) {
//					case 1 :
//						int result1 = result.result4_1();
//						switch(result1) {
//						case 1 : info.terraDolce();
//						case 2 : continue;
//						}
//					case 2 :
//						int result2 = result.result4_2();
//						switch(result2) {
//						case 1 : info.grandDavid();
//						case 2 : continue;
//						}
//					case 3 :
//						int result3 = result.result4_3();
//						switch(result3) {
//						case 1 : info.everSweet();
//						case 2 : continue;
//						}
//					}
//				case 5 : break end;
//				default : view.sendMessage("정확한 숫자를 입력해주세요!");
//				}

