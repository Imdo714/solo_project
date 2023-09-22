package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conn.JECTTemplate;
import rent.RentIng;

public class RentDao {

	public int Rent(Connection conn, RentIng c) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO RENT VALUES(SEQ_RENT.NEXTVAL, '230920', 'Y', ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getRentNum());
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JECTTemplate.close(pstmt);
		}
		return result;
	}
	
	
	public int RetunCar(Connection conn, RentIng c) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO RENT VALUES(SEQ_RENT.NEXTVAL, '230920', 'N', ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getRentNum());
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JECTTemplate.close(pstmt);
		}
		return result;
	}
}
