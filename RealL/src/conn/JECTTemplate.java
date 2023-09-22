package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JECTTemplate {

	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jcet", "jcet");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
		return conn;
	}
	
	// 2. commit 처리해주는 메소드(Connection 전달받아서)
	public static void commit(Connection conn) {
		
		try {
		if(conn != null && !conn.isClosed())
			conn.commit();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	
	
	// 3. rollback 처리해주는 메소드 (connection 전달받아서)
	public static void rollback(Connection conn) {
		
		try {
		if(conn != null && !conn.isClosed())
			conn.rollback();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	
	
	// 4. Statement 관련 객체 전달받아서 반납시켜주는 메소드
	public static void close(Statement stmt) {
		try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	// 5. Connection 객체 전달받아서 반납시켜주는 메소드
	public static void close(Connection conn) {
		try {
				if(conn != null && !conn.isClosed())
					conn.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
	}
	
	// 6. ResultSet 객체 전달받아서 반납시켜주는 메소드
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed())
				rset.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
}
