

/*
 * 1. 네이버 가격비교 사이트에서 내가 필요한걸 검색
    1.1 : 콘솔입력 
    1.2 : main (String args[])
 * */

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Scanner; //-- 콘솔입력을 위한 클래스 
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class NaverPriceCrawling {
	
	public static void main(String[] args) throws Exception {
		
		// 1.1 검색어 받기 
		System.out.print("검색하고자 하는 상품을 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		String searchText = sc.nextLine();
		
		// 네이버 가격비교 사이트에 검색어를 전달 
		// 검색 목록을 받아오기 
		
		//https://search.shopping.naver.com
		String naverUrl 
	    = "https://search.shopping.naver.com"
	    + "/search/all?"
	    + "query=" + searchText
	    + "&minPrice=500000"
	    + "&maxPrice=1000000"
	    + "&sort=price_asc";
		
		// a) 서버에 접속을 함. 
		/*
		URL url = new URL(naverUrl); 
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		
		int data = 0;
		Reader is = new InputStreamReader(url.openStream());
		while((data = is.read()) != -1 ) {
			System.out.print((char)data);
		} 
		*/
		
		
		// jsoup 
		// 1. 커넥션 
		Connection conn = Jsoup.connect(naverUrl);
		Document html = conn.get();
		Elements lists 
			= html.select(".list_basis > div > div");
		System.out.println("상품목록 : " + lists.size());
		
		int i = 0;
		for(Element ele : lists) {
			//System.out.println(ele.toString());
			//if(++i > 1) break;
			String goodsName 
			  = ele.select(".basicList_link__1MaTN").text();
			String goodsPrice 
			  = ele.select(".price_num__2WUXn").text();
			String goodsLink 
			  = ele.select(".basicList_link__1MaTN").attr("href");
			
			System.out.println("상품명 :" + goodsName ); 
			System.out.println("가격 :" + goodsPrice ); 
			System.out.println("최저가 링크:" + goodsLink);
			System.out.println("======================"); 
			
		}
		
		
		
		
	}
}
