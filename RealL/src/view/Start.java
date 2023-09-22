package view;

import java.util.Scanner;

public class Start {

	private Scanner sc = new Scanner(System.in);
	
	private RentMenu re = new RentMenu();
	private CarMenu ca = new CarMenu();
	
	
	public void STR() {
		while(true) {
			System.out.println("=============메인 메뉴=================");
			System.out.println("1. 차량 메뉴");
			System.out.println("2. 대여 반납 메뉴");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("원하시는 번호를 선택하시오 :");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
				case 1:		// 차량 메뉴
					ca.MainMenu();
					break;
				case 2:		// 대여 반납 메뉴
					re.SubMenu();
					break;

				case 0:		// 프로그램 종료
					System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다.");
					return;
				default:
					System.out.println("메뉴를 잘못 입력하셨습니다. 다시입력해주세요.");
				}
			}
	}
}
