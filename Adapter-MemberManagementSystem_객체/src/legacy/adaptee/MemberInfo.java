package legacy.adaptee;

import legacy.adaptee.vo.Member;

/**
 * ���� �Ұ����� Ŭ����
 * @author mcjan
 *
 */
public class MemberInfo {

	public Member getMemberInfo() {
		Member member = new Member();
		member.setName("�ƹ���");
		member.setIdentityNumber("800101-1234567");
		member.setAddress("����");
		member.setPhoneNumber("010-1234-5678");
		
		return member;
	}
	
}
