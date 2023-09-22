package service;

import java.sql.Connection;

import Dao.RentDao;
import conn.JECTTemplate;
import rent.RentIng;

public class RentService {

	
	public int Rent(RentIng c) {
		Connection conn = JECTTemplate.getConnection();
		int result = new RentDao().Rent(conn, c);
		
		if(result > 0) {
			JECTTemplate.commit(conn);
		} else {
			JECTTemplate.rollback(conn);
		}
		return result;
	}
	
	public int RetunCar(RentIng c) {
		Connection conn = JECTTemplate.getConnection();
		int result = new RentDao().RetunCar(conn, c);
		
		if(result > 0) {
			JECTTemplate.commit(conn);
		} else {
			JECTTemplate.rollback(conn);
		}
		return result;
	}
	
	
}
