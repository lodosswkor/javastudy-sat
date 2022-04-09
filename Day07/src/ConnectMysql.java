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
			
			//-- ����Ʈ 
			printNaverPrices(conn);
			
			//-- �μ�Ʈ 
			NaverPriceVO vo = new NaverPriceVO(); 
			vo.setGoods_name("�����е�");
			vo.setPrice(500);
			vo.setGoods_link("http://naver.com/1");
			vo.setRegi_date("2022-04-03");
			
			insertNaverPrice(conn, vo);
			
			//-- ����Ʈ 
			NaverPriceVO vo2 = new NaverPriceVO(); // ���� 
			vo2.setGoods_name("�����е�"); 
			deleteNaverPrice(conn, vo2);
			
			//-- ������Ʈ 
			NaverPriceVO vo3 = new NaverPriceVO();
			vo3.setGoods_name("������13pro");
			updateNaverPrice(conn, vo3);
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("�� ����");
		}
		
	}
	
	
	//-----------------------------------------
	//-- R: ��ü �����͸� ������ �޼��� 
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
	

	//-----------------------------------------
	//-- C: ������ ���� 
	//-----------------------------------------
	
	public static void insertNaverPrice(
			Connection conn, NaverPriceVO vo) 
	throws Exception {
		
		String sql = "insert into naver_price ("
				   + "goods_name, price, goods_link, regi_date"
				   + ") values ("
				   + "'" + vo.getGoods_name() + "',"
				   + "'" + vo.getPrice() + "',"
				   + "'" + vo.getGoods_link() + "',"
				   + "'" + vo.getRegi_date() + "'"
				   + ")";
		
		System.out.println(sql); 
		//-- SQL �����Ϳ��� 
		Statement stmt = conn.createStatement(); 
		//-- SQL �� ���� 
		stmt.executeUpdate(sql);
		System.out.println("��ϿϷ�");
		
	}

	//-----------------------------------------
	//-- D: ������ ���� 
	//-----------------------------------------
	
	public static void deleteNaverPrice
	(Connection conn, NaverPriceVO vo) throws Exception {
		
		String sql = "delete from naver_price \n"
				   + "where goods_name = '"
				   + vo.getGoods_name() + "'";
		
		System.out.println(sql);
		
		Statement stmt = conn.createStatement(); 
		stmt.executeUpdate(sql);
		System.out.println(vo.getGoods_name() + ":: �����Ϸ�");
	}
	

	//-----------------------------------------
	//-- U: ������ ������Ʈ (�����е尡���� ��������) 
	//-----------------------------------------
	
	public static void updateNaverPrice
	(Connection conn, NaverPriceVO vo) throws Exception {
		
		 String sql = "update naver_price set \n"
		            + "price = price + 10000 " 
				    + "where goods_name = '" 
		            + vo.getGoods_name() + "'";
		 
		 System.out.println(sql);
		 Statement stmt = conn.createStatement();
		 stmt.executeUpdate(sql);
		 System.out.println(vo.getGoods_name() + " :: �����Ϸ�"); 
		
	}
	
}
