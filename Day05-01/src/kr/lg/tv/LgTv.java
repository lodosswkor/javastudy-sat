package kr.lg.tv;
import kr.thejoeun.tv.TvInterface;

public class LgTv implements TvInterface {

	@Override
	public void turnOnTv() {
		System.out.println("LG TV ÄÑ±â");
	}

	@Override
	public void turnOffTv() {
		System.out.println("LG TV ²ô±â");
	}

	@Override
	public void volumnUp() {
		System.out.println("LG TV º¼·ý¾÷");
	}

	@Override
	public void volumnDown() {
		System.out.println("LG TV º¼·ý´Ù¿î");
	}

}
