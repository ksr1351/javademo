package java008_static_access.part07;

public class Java090_singleton {
	
	public static void main(String[] args) {
		//MemberDAO mm = new MemberDAO();
		
		MemberDAO mb = MemberDAO.getInstance();
		mb.display();
		
		MemberDAO mc = MemberDAO.getInstance();
		mc.display();
		
		System.out.println(mb==mc);
	}//end main()

}//end class
