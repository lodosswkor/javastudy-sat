
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
		String price = goodPrice.replaceAll(",", "");
		price = price.replace("¿ø", ""); 
		// 500,000¿ø -> 500000 
		return price;
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
