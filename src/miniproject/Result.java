package miniproject;

public class Result {
	
	public void recommendCoffee(int firstChoice, int secondChoice) {
		
		switch(firstChoice) {
		case 1 :
			firstSour(secondChoice);
			break;
		case 2 :
			secondNutty(secondChoice);
			break;
		case 3 : 
			thirdBitter(secondChoice);
			break;
		case 4 : 
			fourthSweet(secondChoice);
			break;
		}
		
	}
	
	public void firstSour(int secondChoice) {
		switch(secondChoice) {
		case 2 :
			System.out.println("============================");
			System.out.println("'신맛'을 1순위, '고소한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'과테말라 안티구아'를 추천합니다~!");
			System.out.println("'과테말라 안티구아'는 시트러스와 사과 같은 과일 산미,\n"
					+ "초콜릿, 캐러맬, 향신료와 같은 깊고 복합적인 고소한맛이 특징인 원두입니다.\n"
					+ "과테말라 안티구아는...");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("'신맛'을 1순위, '쌉쌀한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'에티오피아 예가체프'를 추천합니다~!");
			System.out.println("에티오피아 예가체프는 레몬, 라임 같은 시트러스 계열의\n"
					+ "과일 산미를 바탕으로 중배전 로스팅을 통한 쌉쌀한 맛이 일품인 원두입니다.\n"
					+ "에티오피아 예가체프는...");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("'신맛'을 1순위, '단맛'을 2순위로 선택하셨습니다.");
			System.out.println("'케냐AA'를 추천합니다~!");
			System.out.println("케냐AA는 강렬한 베리류의 산미와 함께 무화과 열매에서 느껴지는\n"
					+ "단맛이 조화를 이루는 원두입니다. 케냐AA는...");
			break;
		}
	}
	public void secondNutty(int secondChoice) {
		switch(secondChoice) {
		case 1 :
			System.out.println("============================");
			System.out.println("'고소한맛'을 1순위, '신맛'을 2순위로 선택하셨습니다.");
			System.out.println("'콜롬비아 수프리모'를 추천합니다~!");
			System.out.println("콜롬비아 수프리모는 부드러운 초콜릿과 견과류의 고소한맛과\n"
					+ "시트러스와 사과 같은 과일 산미가 균형 잡힌 원두입니다. 콜롬비아 수프리모는...");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("'고소한맛'을 1순위, '쌉쌀한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'레트로 브라비'를 추천합니다~!");
			System.out.println("레트로 브라비는 누룽지의 고소한맛과 혀끝에 남는 스모키함이\n"
					+ "풍미를 더해주는 진한 구수함이 느껴지는 원두니다. 레트로는...");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("'고소한맛'을 1순위, '단맛'을 2순위로 선택하셨습니다.");
			System.out.println("'레트로'를 추천합니다~!");
			System.out.println("레트로는 땅콩과 누룽지의 은근하게 고소한맛과 적당한 스모키함이\n"
					+ "커피 본연의 맛을 더욱 풍부하게 만들어주는 원두입니다. 레트로는...");
			break;
		}
	}
	public void thirdBitter(int secondChoice) {
		switch(secondChoice) {
		case 1 :
			System.out.println("============================");
			System.out.println("'쌉쌀한맛'을 1순위, '신맛'을 2순위로 선택하셨습니다.");
			System.out.println("'테라'를 추천합니다~!");
			System.out.println("테라는 흙, 대지를 뜻하는 이름처럼 깊고 진한 맛을 내는 원두입니다.\n"
					+ "사이사이 신맛이 은은하게 나서 부담스럽지 않게 즐길 수 있습니다. 테라는...");
			break;
		case 2 : 
			System.out.println("============================");
			System.out.println("'쌉쌀한맛'을 1순위, '고소한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'오닉스'를 추천합니다~!");
			System.out.println("오닉스는 다크 로스팅의 묵직한 맛이 살아있는 원두입니다.\n"
					+ "카카오의 쓴맛과 입안에서 도는 고소한맛이 긴 여운을 남겨요. 오닉스는...");
			break;
		case 4 : 
			System.out.println("============================");
			System.out.println("'쌉쌀한맛'을 1순위, '단맛'을 2순위로 선택하셨습니다.");
			System.out.println("'시티 브라운'을 추천합니다~!");
			System.out.println("시티 브라운은 다크 초콜릿의 쌉쌀한 맛과 브라운 슈가의 단맛이"
					+ "균형잡힌 원두입니다. 거기에 가벼운 산미까지 다채로운 맛을 지녔습니다. 시티 브라운은...");
			break;
		}
	}
	public void fourthSweet(int secondChoice) {
		switch(secondChoice) {
		case 1 :
			System.out.println("============================");
			System.out.println("'단맛'을 1순위, '신맛'을 2순위로 선택하셨습니다.");
			System.out.println("'테라 돌체'를 추천합니다~!");
			System.out.println("테라 돌체는 땅콩버터와 황설탕의 고소한 단맛, 블렉체리의 가벼운 신맛을\n"
					+ "느껴볼 수 있는 조화로운 맛의 원두입니다. 테라 돌체는...");
			break;
		case 2 : 
			System.out.println("============================");
			System.out.println("'단맛'을 1순위, '고소한맛'을 2순위로 선택하셨습니다.");
			System.out.println("'그랑 다비드'를 추천합니다~!");
			System.out.println("그랑 다비드는 아몬드 초콜릿 같은 고소한 단맛과 더불어\n"
					+ "홍차의 부드러운 신맛까지 고루 느낄 수 있는 원두입니다. 그랑 다비드는...");
			break;
		case 3 : 
			System.out.println("============================");
			System.out.println("'단맛'을 1순위, '쌉쌀한 맛'을 2순위로 선택하셨습니다.");
			System.out.println("'에버스윗'을 추천합니다~!");
			System.out.println("에버스윗은 이룸처럼 꿀물을 마시는 듯한 은은한 단맛을 지닌 원두입니다.\n"
					+ "에버스윗은...");
			break;
		}
	}

}
