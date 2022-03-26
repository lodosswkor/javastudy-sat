package kr.samsung.tv;
import kr.thejoeun.tv.TvInterface;
import kr.thejoeun.tv.Nintendo;

public class SamsungTv implements TvInterface,Nintendo {

	@Override
	public void turnOnTv() {
		System.out.println("»ï¼ºTVÄÑ±â");
	}

	@Override
	public void turnOffTv() {
		System.out.println("»ï¼ºTV²ô±â");
	}

	@Override
	public void volumnUp() {
		System.out.println("»ï¼ºTV º¼·ý¿Ã¸®±â");
	}

	@Override
	public void volumnDown() {
		System.out.println("»ï¼ºTV º¼·ý´Ù¿î");
	}

	
	@Override
	public void attachNintendo() {
		System.out.println("´ÑÅÙµµ ºÙÀÌ±â");
	}

	@Override
	public void dettachNintendo() {
		System.out.println("´ÑÅÙµµ ²ô±â");
	}

}
