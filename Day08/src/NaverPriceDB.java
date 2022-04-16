import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class NaverPriceDB {

	private static NaverPriceDB naverPriceDb = null;
	private Connection conn = null; 
	
	public static NaverPriceDB getInstance() {
		if( naverPriceDb == null ) {
			naverPriceDb = new NaverPriceDB(); 
		}
		return naverPriceDb; 
	}
	
	//-- 데이터베이스 커넥션 
	public void connectDB() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.conn = DriverManager.getConnection(
				 	"jdbc:mysql://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com:3306/lecturer_db",
				 	"admin",
				 	"dlwhdtjrA123"
				  );
	}
	
	//-- 데이터베이스 close 
	public void closeDB() throws Exception {
		this.conn.close();
	}
	
	
	//-- 데이터 Insert 
	public void insertNaverPrice(List<NaverPriceVO> lists)
	throws Exception 
	{
		String sql = "insert into naver_price \n"
				   + "(goods_name, price, goods_link, regi_date) \n"    
				   + "values \n"
				   + "(?,?,?,now())";
		
		PreparedStatement pstmt 
				   = this.conn.prepareStatement(sql); 
		
		for(NaverPriceVO vo : lists) {
			pstmt.setString(1, vo.getGoodName());
			pstmt.setInt(2, 
						  Integer.parseInt(vo.getGoodPrice())
						);
			pstmt.setString(3, vo.getGoodLink());
			pstmt.executeUpdate(); // 쿼리 실행 
		}
		
		pstmt.close(); 
		
	}
	
	
	
	
}
