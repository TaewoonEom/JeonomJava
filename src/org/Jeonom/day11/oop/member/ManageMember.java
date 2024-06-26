package org.Jeonom.day11.oop.member;

public class ManageMember {
	
	Member [] members;
	int index;
	
	// 필드 초기화를 생성자에서
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}
	
	// 회원정보 저장
	public void insertMember(Member member) {
		if(index < members.length) {
			members[index] = member;
			index++;
		}
	}

	public void updateMember(Member member) {
		int i = 0;
		for(Member mOrigin : members) {
			if(mOrigin != null) {
				String memberEmail = mOrigin.getMemberEmail();
				if(memberEmail.equals(member.getMemberEmail())) {
//					mOrigin.setMemberAddress(member.getMemberAddress());
//					mOrigin.setMemberName(member.getMemberName());
//					mOrigin.setMemberPhone(member.getMemberPhone());
					members[i] = member;
				
				}
			}
			i++;
		}
		
	}

	public void deleteAllMembers() {
			// 다 지우는건 비우는 것, 배열을 비운다
			// 어떻게 비울까?
			// 초기상태로 만들기
			members = new Member[5];
			index = 0;
	//		for(Member member : members) {
	//			member = null;
	//		}
		}

	public Member searchOneByEmail(String email) {
		for(Member member : members) {
			if(member != null && email.equals(member.getMemberEmail())) {
				return member;
			}
		}
		return null;
	}

	public Member [] getAllMembers() {
		return members;
	}

}
