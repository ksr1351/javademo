package java020_thread.part06; //DAY19 [2022.12.09.FRI]

import java.util.Scanner;

public class AccountNumber {
	private long depositMoney = 100000; //은행잔고
	private long balance; //찾을 금액
	private Scanner sc = new Scanner(System.in);
	
	//Scanner로 출금금액 입력 받기
	synchronized public void input() {
		System.out.printf("%s 입장\n", Thread.currentThread().getName());
		try {
			System.out.print("출금 금액 입력: ");
			balance = sc.nextLong();
		} catch (NumberFormatException ex) {
			System.out.println(ex.toString());
		}
	}//end input()
	
	//잔액 계산
	synchronized public void withDraw() {
		if(depositMoney >= balance) {
			notifyAll();
			depositMoney -= balance;
			System.out.printf("남은 금액은 : %d원 입니다.\n", depositMoney);
		} else {
			try {
				System.out.println("잔액이 부족합니다.");
				wait(); //blocked 상태
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}//end withDraw()
	
}//end class
