package controller;

import rent.RentIng;
import service.RentService;
import view.RentMenu;

public class RentController {

	
	public void Rent(int rentNum) {
		
		RentIng c = new RentIng(rentNum);
		
		int result = new RentService().Rent(c);
		
		if(result > 0) {
			new RentMenu().displaySuccess("성공적으로 차량을 대여하였습니다.");
		} else {
			new RentMenu().displayFail("차량 대여에 실패하였습니다.");
		}
	}
	
	
	public void RetunCar(int rentNum) {
		RentIng c = new RentIng(rentNum);
		
		int result = new RentService().RetunCar(c);
		
		if(result > 0) {
			new RentMenu().displaySuccess("성공적으로 차량을 반납하였습니다.");
		} else {
			new RentMenu().displayFail("차량 반납에 실패하였습니다.");
		}
	}
	
	
}
