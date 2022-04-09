import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 Host :
javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com
id : 여러분이 준거
password : 여러분이 준거
Port : 3306
Db Name : 아이디_db

 * */

import java.sql.Connection;

public class ConnectMysql {
	
	public static void main(String[] args) {
			
		Connection conn = null; 
		
		try {
			//Class.forName("org.mariadb.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("드라이버 로딩 성공");
			
			//javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com
			conn = DriverManager.getConnection(
				   "jdbc:mysql://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com:3306/lecturer_db", // URL (HOST) 
				   "admin", // ID 
				   "dlwhdtjrA123" // PASSWORD
			);	
			System.out.println("데이터베이스 연결성공");
			
			// 네이버 프라이스 select 호출 
			printNaverPrices(conn);
						
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(conn != null) { 
				try { conn.close(); } 
				catch(Exception e) {} 
			}
		}
		
		
	}
	
	
	//-----------------------------------------
	//-- 전체 데이터를 들고오는 메서드 
	//-----------------------------------------
	public static void printNaverPrices(Connection conn) 
	throws Exception {
		
		String sql = "select * from naver_price"; 
		
		//-- 1. statement (SQL 구문을 날린 준비를 한다) 
	    Statement stmt = conn.createStatement(); 
	    ResultSet rs = stmt.executeQuery(sql);
	    
	    while(rs.next()) {
	    	System.out.println(rs.getString("goods_name"));
	    }
		
	}
	
}
