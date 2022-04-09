import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public static void main(String[] args){
			
		Connection conn = null; 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			conn = DriverManager.getConnection(
				   "jdbc:mysql://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com:3306/lecturer_db", // URL (HOST) 
				   "admin", // ID 
				   "dlwhdtjrA123" // PASSWORD
			);
			System.out.println("데이터베이스 연결성공");
			printNaverPrices(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("개 에러");
		}
		
	}
	
	
	//-----------------------------------------
	//-- 전체 데이터를 들고오는 메서드 
	//-----------------------------------------
	
	public static void printNaverPrices(Connection conn) 
	throws Exception
	{
		
		String sql = "select * from naver_price"; 
		
		//-- 1. statement (SQL 구문을 날린 준비를 한다) 
	    Statement stmt = conn.createStatement(); 
	    ResultSet rs = stmt.executeQuery(sql);
	    
	    List<NaverPriceVO> list 
	    		= new ArrayList<NaverPriceVO>(); 
	    
	    while(rs.next()) {
	    	NaverPriceVO vo = new NaverPriceVO();
	    	vo.setGoods_name(rs.getString("goods_name"));
	    	vo.setGoods_link(rs.getString("goods_link"));
	    	vo.setRegi_date(rs.getString("regi_date"));
	    	vo.setPrice(rs.getInt("price"));
	    	list.add(vo);
	    }
		
	}
	
}
