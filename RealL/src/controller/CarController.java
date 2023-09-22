package controller;

import java.util.ArrayList;

import rent.Car;
import service.CarService;
import view.CarMenu;

public class CarController {

public void inputCar(String rentName, String rentNo, String rentCar, int rentPrice, String maxSped, String rentYN) {
		
		Car r =new Car(rentName, rentNo, rentCar, rentPrice, maxSped, rentYN);
		
		int result = new CarService().inputCar(r);
		
		if(result > 0) {
			new CarMenu().displaySuccess("성공적으로 차량을 추가하였습니다.");
		} else {
			new CarMenu().displayFail("차량 추가에 실패하였습니다.");
		}
	}
	
	public void PrintCar() {
		ArrayList<Car> list = new CarService().PrintCar();
		
		if(list.isEmpty()) {
			new CarMenu().displayNoData("전체 조회 결과가 없습니다.");
		} else {
			new CarMenu().displayMemberList(list);
		}
	}
	
	public void SccCar(String rentCar) {
		Car r = new CarService().SccCar(rentCar);
		
		if (r == null) {
			new CarMenu().displayNoData(rentCar + "에 해당하는 조회 결과가 없습니다.");
		} else {
			new CarMenu().displayRent(r);
		}
	}
	
	public void update(int rentNum, int rentPrice, String maxSped) {
		
		Car r = new Car();
	
		r.setRentNum(rentNum);
		r.setRentPrice(rentPrice);
		r.setMaxSped(maxSped);
		
		int result = new CarService().update(r);
		
		if(result > 0) {
			new CarMenu().displaySuccess("성공적으로 수정하였음");
		} else {
			new CarMenu().displayFail("차량 정보 수정에 실패하였음");
		}
		
	}
	
	
	public void delete(int rentNum) {
		int result = new CarService().delete(rentNum);
		
		if(result > 0) {
			new CarMenu().displaySuccess(rentNum + " 삭제 성공!!");
		} else {
			new CarMenu().displayFail(rentNum + " 삭제 실패");
		}
	}
}
