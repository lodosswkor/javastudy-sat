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
id : �������� �ذ�
password : �������� �ذ�
Port : 3306
Db Name : ���̵�_db

 * */

import java.sql.Connection;

public class ConnectMysql {
	
	public static void main(String[] args){
			
		Connection conn = null; 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("����̹� �ε� ����");
			conn = DriverManager.getConnection(
				   "jdbc:mysql://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com:3306/lecturer_db", // URL (HOST) 
				   "admin", // ID 
				   "dlwhdtjrA123" // PASSWORD
			);
			System.out.println("�����ͺ��̽� ���Ἲ��");
			printNaverPrices(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("�� ����");
		}
		
	}
	
	
	//-----------------------------------------
	//-- ��ü �����͸� ������ �޼��� 
	//-----------------------------------------
	
	public static void printNaverPrices(Connection conn) 
	throws Exception
	{
		
		String sql = "select * from naver_price"; 
		
		//-- 1. statement (SQL ������ ���� �غ� �Ѵ�) 
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
