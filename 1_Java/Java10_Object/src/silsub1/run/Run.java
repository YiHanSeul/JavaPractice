package silsub1.run;

import silsub1.model.vo.Member.Member;

public class Run {

	public static void main(String[] args) {
		Member mem=new Member();
		
		mem.setMemberId("ihanseul");
		mem.setMemberPwd("1234");
		mem.setMemberName("½÷ÀÌ");
		mem.setAge(22);
		mem.setGender('W');
		mem.setPhone("010-1234-1234");
		mem.setEmail("ihanseul@AAA");
		System.out.println(mem.informaiton());
	}

}
