package service;

import java.sql.Connection;
import java.util.ArrayList;

import Dao.CarDao;
import conn.JECTTemplate;
import rent.Car;

public class CarService {

public int inputCar(Car r) {
		
		Connection conn = JECTTemplate.getConnection();
		int result = new CarDao().inputCar(conn, r);
		
		if(result > 0) {
			JECTTemplate.commit(conn);
		} else {
			JECTTemplate.rollback(conn);
		}
		JECTTemplate.close(conn);
		
		return result;
	}
	
	public ArrayList<Car> PrintCar() {
		Connection conn = JECTTemplate.getConnection();
		ArrayList<Car> list = new CarDao().PrintCar(conn);
		JECTTemplate.close(conn);
		
		return list;
		
	}
	
	
	public Car SccCar(String rentCar) {
		Connection conn = JECTTemplate.getConnection();
		Car r = new CarDao(). SccCar(conn, rentCar);
		JECTTemplate.close(conn);
		return r;
	}
	
	
	public int update(Car r) {
		Connection conn = JECTTemplate.getConnection();
		int result = new CarDao().update(conn, r);
		
		if(result > 0) {
			JECTTemplate.commit(conn);
		} else {
			JECTTemplate.rollback(conn);
		}
		JECTTemplate.close(conn);
		
		return result;
	}
	
	public int delete(int rentNum) {
		Connection conn = JECTTemplate.getConnection();
		int result = new CarDao().delete(conn, rentNum);
		
		if(result > 0) {
			JECTTemplate.commit(conn);
		} else {
			JECTTemplate.rollback(conn);
		} 
		JECTTemplate.close(conn);
		
		return result;
	}
}
