package kr.lg.tv;
import kr.thejoeun.tv.TvInterface;

public class LgTv implements TvInterface {

	@Override
	public void turnOnTv() {
		System.out.println("LG TV �ѱ�");
	}

	@Override
	public void turnOffTv() {
		System.out.println("LG TV ����");
	}

	@Override
	public void volumnUp() {
		System.out.println("LG TV ������");
	}

	@Override
	public void volumnDown() {
		System.out.println("LG TV �����ٿ�");
	}

}
