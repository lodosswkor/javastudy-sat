import java.util.ArrayList;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//-- Jsoup �� ����/�׸��� HTML �м� 

public class HtmlParser {

	private static Connection conn = null; 
	
	
	// �̱������� HtmlParser.connectionUrl("http://aver.com");
	public static Connection connectionUrl(String url) {
		if(conn == null ) {
			conn = Jsoup.connect(url); 
		}
		return conn; 
	}
	
	// ��ǰ��� NaverPriceVO 
	public List<NaverPriceVO> getGoodsList() 
	throws Exception {
		
		Document html = HtmlParser.conn.get(); // <--�̺κи� �ٸ�
		Elements lists 
			= html.select(".list_basis > div > div");

		System.out.println("��ǰ��� : " + lists.size());
		
		List<NaverPriceVO> naverPriceList = 
				new ArrayList<NaverPriceVO>(); 
		
		for(Element ele : lists) {
			String goodsName 
			  = ele.select(".basicList_link__1MaTN").text();
			String goodsPrice 
			  = ele.select(".price_num__2WUXn").text();
			String goodsLink 
			  = ele.select(".basicList_link__1MaTN").attr("href");
		
			NaverPriceVO param = new NaverPriceVO(); 
			param.setGoodName(goodsName);
			param.setGoodPrice(goodsPrice);
			param.setGoodLink(goodsLink);
			naverPriceList.add(param); // ����Ʈ �÷��ǿ� ����
		}
		
		return naverPriceList; 
	}
	
}
