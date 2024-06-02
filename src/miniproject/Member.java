package miniproject;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberPhone;
	
	public Member() {}
	
	public Member(String memberName) {
		this.memberName = memberName;
	}
	
	public Member(String memberId, String memberPw, String memberName, String memberPhone) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	@Override
	public String toString() {
		return "가입자 정보 [ID = " + memberId + ", PW = " + memberPw + ", 이름 = " + memberName
				+ ", 전화번호 = " + memberPhone + "]";
	}

	
	
	
	
	
	
	
}
