package kr.samsung.tv;
import kr.thejoeun.tv.TvInterface;
import kr.thejoeun.tv.Nintendo;

public class SamsungTv implements TvInterface,Nintendo {

	@Override
	public void turnOnTv() {
		System.out.println("�ＺTV�ѱ�");
	}

	@Override
	public void turnOffTv() {
		System.out.println("�ＺTV����");
	}

	@Override
	public void volumnUp() {
		System.out.println("�ＺTV �����ø���");
	}

	@Override
	public void volumnDown() {
		System.out.println("�ＺTV �����ٿ�");
	}

	
	@Override
	public void attachNintendo() {
		System.out.println("���ٵ� ���̱�");
	}

	@Override
	public void dettachNintendo() {
		System.out.println("���ٵ� ����");
	}

}
