

/*
 * 1. 네이버 가격비교 사이트에서 내가 필요한걸 검색
    1.1 : 콘솔입력 
    1.2 : main (String args[])
 * */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import java.util.Scanner; //-- 콘솔입력을 위한 클래스 
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class NaverPriceCrawling {
	
	public static void main(String[] args) throws Exception {
		
		// 1.1 검색어 받기 
		// 사용자 입력을 기다린다. 
//		System.out.print("검색하고자 하는 상품을 입력하세요 :");
//		Scanner sc = new Scanner(System.in);
//		String searchText = sc.nextLine();
//		
//		String minPrice, maxPrice; 
//		System.out.print("최저가를 입력해 주세요 : ");
//		minPrice = sc.nextLine();
//		
//		System.out.println("최고가를 입력해 주세요 : ");
//		maxPrice = sc.nextLine(); 
		
		// java NaverPriceCrawling 맥북 500000 30000000 
		// String args[] 매개변수(인자) 활용 
		
		
		if(args.length < 3) {
			System.out.println
			("사용법 : java NaverPriceCrawling 상품명 최소가격 최대가격" ); 
			return;
		}

		String searchText = args[0];
		String minPrice = args[1];
		String maxPrice = args[2]; 
		
		// 네이버 가격비교 사이트에 검색어를 전달 
		// 검색 목록을 받아오기 
		
		//https://search.shopping.naver.com
		String naverUrl 
	    = "https://search.shopping.naver.com"
	    + "/search/all?"
	    + "query=%s"
	    + "&minPrice=%s" 
	    + "&maxPrice=%s" 
	    + "&sort=price_asc";
		
		naverUrl = String.format(naverUrl, 
								 searchText,
								 minPrice,
								 maxPrice); 
		
		// jsoup 
		// 1. 커넥션 
		/*
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
		*/
		
		// 1. 연결 
		HtmlParser.connectionUrl(naverUrl);//싱글턴(연습용) 
		HtmlParser htmlParser = new HtmlParser(); 
		List<NaverPriceVO> lists = 
				htmlParser.getGoodsList();
		/*
		for(NaverPriceVO vo : lists) {
			System.out.println("상품명 :" + vo.getGoodName() ); 
			System.out.println("가격 :" + vo.getGoodPrice() ); 
			System.out.println(vo.getGoodLink());
			System.out.println("======================"); 
		}
		*/
		writeExcelFile(lists, "D:\\naverprice.csv");
		writeDB(lists);
		
	}
	
	// -- 엑셀로 쓰기 메소드 
	public static void writeExcelFile
	(List<NaverPriceVO> lists, String fileName) {
		
		File file = new File(fileName);
		BufferedWriter writer = null; 
		String title = "순위,상품명,가격,링크\r\n";
		String lineFormat = "%d,%s,%s,%s\r\n";
		String result = title; 
		
		int i = 1; 
		for(NaverPriceVO vo : lists) {
		   result += String.format(lineFormat, 
							   i++,
							   vo.getGoodName(),
							   vo.getGoodPrice(),
							   vo.getGoodLink() 
					 );
		}
		
		//-- 파일로 문자열을 써준다. 
		try {
			writer = new BufferedWriter(new FileWriter(file)); 
			writer.write(result);
		} catch(Exception ex) {
			
		} finally {
			if(writer != null) { 
				try { writer.close(); } 
			    catch (Exception e) {};
			}
		}
	}
	
	
	//-- 데이터 베이스에 쌓기 
	public static void writeDB(List<NaverPriceVO> lists) 
	throws Exception 
	{
		//-- 0.객체생성 
		NaverPriceDB nPriceDb = NaverPriceDB.getInstance();
		//-- 1.디비연결하기 
		nPriceDb.connectDB();
		//-- 2.디비에 넣기
		nPriceDb.insertNaverPrice(lists);
		//-- 3.디비닫기
		nPriceDb.closeDB();
	}
	
}
