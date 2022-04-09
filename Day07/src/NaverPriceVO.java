
// naver price 테이블 
public class NaverPriceVO {
	
	private String goods_name; // 상품명  
	private int price; // 가격  
	private String goods_link; // 최저가 링크
	private String regi_date; // 등록일자
	
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGoods_link() {
		return goods_link;
	}
	public void setGoods_link(String goods_link) {
		this.goods_link = goods_link;
	}
	public String getRegi_date() {
		return regi_date;
	}
	public void setRegi_date(String regi_date) {
		this.regi_date = regi_date;
	}
	
	
}
