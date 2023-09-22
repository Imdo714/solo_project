package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.JECTTemplate;
import rent.Car;

public class CarDao {

public int inputCar(Connection conn, Car r) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO RENTCAR VALUES(SEQ_CAR.NEXTVAL, ?, ?, ?, ?, ?, ?)";
	
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, r.getRentName());
			pstmt.setString(2, r.getRentNo());
			pstmt.setString(3, r.getRentCar());
			pstmt.setInt(4, r.getRentPrice());
			pstmt.setString(5, r.getMaxSped());
			pstmt.setString(6, r.getRentYN());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JECTTemplate.close(pstmt);
		}
		return result;
	}
	
	public ArrayList<Car> PrintCar(Connection conn){
		
		ArrayList<Car> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM RENTCAR ORDER BY RENT_NUM";
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
	
			while (rset.next()) {
				
				Car r = new Car();
				r.setRentNum(rset.getInt("rent_num"));
				r.setRentName(rset.getString("rent_name"));
				r.setRentNo(rset.getString("rent_no"));
				r.setRentCar(rset.getString("rent_car"));
				r.setRentPrice(rset.getInt("rent_price"));
				r.setMaxSped(rset.getString("rent_maxsped"));
				r.setRentYN(rset.getString("RENT_YN"));
				
				list.add(r);
//				System.out.print(r);	
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JECTTemplate.close(rset);
			JECTTemplate.close(pstmt);
			
		}
		
		return list;
	}
	
	public Car SccCar(Connection conn, String rentCar) {
		
		Car r = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM RENTCAR WHERE RENT_CAR = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rentCar);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				r = new Car();
				r.setRentNum(rset.getInt("rent_num"));
				r.setRentName(rset.getString("rent_name"));
				r.setRentNo(rset.getString("rent_no"));
				r.setRentCar(rset.getString("rent_car"));
				r.setRentPrice(rset.getInt("rent_price"));
				r.setMaxSped(rset.getString("rent_maxsped"));
				r.setRentYN(rset.getString("RENT_YN"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JECTTemplate.close(rset);
			JECTTemplate.close(pstmt);
		}
		return r;
		
	}
	
	public int update(Connection conn, Car r) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE RENTCAR SET RENT_PRICE = ?, RENT_MAXSPED = ? WHERE RENT_NUM = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, r.getRentPrice());
			pstmt.setString(2, r.getMaxSped());
			pstmt.setInt(3, r.getRentNum());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JECTTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public int delete(Connection conn, int rentNum) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM RENTCAR WHERE RENT_CAR = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rentNum);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JECTTemplate.close(pstmt);
		}
		return result;
	}
}
