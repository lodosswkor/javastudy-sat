

/*
 * 1. ���̹� ���ݺ� ����Ʈ���� ���� �ʿ��Ѱ� �˻�
    1.1 : �ܼ��Է� 
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
import java.util.Scanner; //-- �ܼ��Է��� ���� Ŭ���� 
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class NaverPriceCrawling {
	
	public static void main(String[] args) throws Exception {
		
		// 1.1 �˻��� �ޱ� 
		System.out.print("�˻��ϰ��� �ϴ� ��ǰ�� �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in);
		String searchText = sc.nextLine();
		
		// ���̹� ���ݺ� ����Ʈ�� �˻�� ���� 
		// �˻� ����� �޾ƿ��� 
		
		//https://search.shopping.naver.com
		String naverUrl 
	    = "https://search.shopping.naver.com"
	    + "/search/all?"
	    + "query=" + searchText
	    + "&minPrice=500000"
	    + "&maxPrice=1000000"
	    + "&sort=price_asc";
		
		// jsoup 
		// 1. Ŀ�ؼ� 
		/*
		Connection conn = Jsoup.connect(naverUrl);
		Document html = conn.get();
		Elements lists 
			= html.select(".list_basis > div > div");
		System.out.println("��ǰ��� : " + lists.size());
		
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
			
			System.out.println("��ǰ�� :" + goodsName ); 
			System.out.println("���� :" + goodsPrice ); 
			System.out.println("������ ��ũ:" + goodsLink);
			System.out.println("======================"); 
		}
		*/
		
		// 1. ���� 
		HtmlParser.connectionUrl(naverUrl);//�̱���(������) 
		HtmlParser htmlParser = new HtmlParser(); 
		List<NaverPriceVO> lists = 
				htmlParser.getGoodsList();
		/*
		for(NaverPriceVO vo : lists) {
			System.out.println("��ǰ�� :" + vo.getGoodName() ); 
			System.out.println("���� :" + vo.getGoodPrice() ); 
			System.out.println(vo.getGoodLink());
			System.out.println("======================"); 
		}
		*/
		writeExcelFile(lists, "D:\\naverprice.csv");
		
		
	}
	
	
	public static void writeExcelFile
	(List<NaverPriceVO> lists, String fileName) {
		
		File file = new File(fileName);
		BufferedWriter writer = null; 
		String title = "����,��ǰ��,����,��ũ\r\n";
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
		
		//-- ���Ϸ� ���ڿ��� ���ش�. 
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
	
	
}
