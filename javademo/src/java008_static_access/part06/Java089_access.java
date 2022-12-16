package java008_static_access.part06;

import java008_static_access.part05.Java087_access; //import는 package 뒤에 써야함
//패키지가 같은 파일을 끌어올 때는 class 앞쪽이 default 가능

public class Java089_access extends Java087_access { // 상속할 때는 extends 써줌

	public static void main(String[] args) {
		// Java087_access p= new Java087_access();
		Java089_access p = new Java089_access();
		// System.out.printf("var_private:%d\n", p.var_private);
		// System.out.printf("var_default:%d\n", p.var_default);
		System.out.printf("var_protected:%d\n", p.var_protected);
		System.out.printf("var_public:%d\n", p.var_public);

	}

}
// public > protected > default > private