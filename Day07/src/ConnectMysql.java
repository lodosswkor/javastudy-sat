import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 Host :
javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com
id : �������� �ذ�
password : �������� �ذ�
Port : 3306
Db Name : ���̵�_db

 * */

import java.sql.Connection;

public class ConnectMysql {
	
	public static void main(String[] args) {
			
		Connection conn = null; 
		
		try {
			//Class.forName("org.mariadb.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("����̹� �ε� ����");
			
			//javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com
			conn = DriverManager.getConnection(
				   "jdbc:mysql://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com:3306/lecturer_db", // URL (HOST) 
				   "admin", // ID 
				   "dlwhdtjrA123" // PASSWORD
			);	
			System.out.println("�����ͺ��̽� ���Ἲ��");
			
			// ���̹� �����̽� select ȣ�� 
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
	//-- ��ü �����͸� ������ �޼��� 
	//-----------------------------------------
	public static void printNaverPrices(Connection conn) 
	throws Exception {
		
		String sql = "select * from naver_price"; 
		
		//-- 1. statement (SQL ������ ���� �غ� �Ѵ�) 
	    Statement stmt = conn.createStatement(); 
	    ResultSet rs = stmt.executeQuery(sql);
	    
	    while(rs.next()) {
	    	System.out.println(rs.getString("goods_name"));
	    }
		
	}
	
}
