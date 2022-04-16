
public class NaverPriceVO {
	
	private String goodName; 
	private String goodPrice; 
	private String goodLink;
	
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getGoodPrice() {
		return goodPrice.replaceAll(",", "");
	}
	public void setGoodPrice(String goodPrice) {
		this.goodPrice = goodPrice;
	}
	public String getGoodLink() {
		return goodLink;
	}
	public void setGoodLink(String goodLink) {
		this.goodLink = goodLink;
	} 
	
	
}
