package kr.thejoeun.tv;
// �������̽��� class�� �ƴ� interface��
// ���� �����Ҷ��� class Ŭ�������� �ƴ�
// interface �������̽��� 

public interface TvInterface {

	void turnOnTv(); 
	void turnOffTv();
	void volumnUp();
	void volumnDown(); 
	default void turn() {
		System.out.println("�Ͼ�");
	}
	
}
