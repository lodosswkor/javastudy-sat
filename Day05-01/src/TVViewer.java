import kr.thejoeun.tv.TvInterface;
import kr.thejoeun.tv.Nintendo;
import kr.samsung.tv.SamsungTv;
import kr.lg.tv.LgTv;

public class TVViewer {

	public static void main(String args[]) {

		TvInterface tv = new SamsungTv(); 
		//TvInterface tv = new LgTv(); 
		
		//-- 나는 이 4가지 규칙(메소드)만 사용하겠어
		tv.turnOnTv();
		tv.volumnUp();
		tv.volumnDown();
		tv.turnOffTv();
		
		((Nintendo)tv).attachNintendo();
		((Nintendo)tv).dettachNintendo();
		
		TvInterface arrTv[] = new TvInterface[2];
		arrTv[0] = new SamsungTv();
		arrTv[1] = new LgTv();
		
		
	}
	
}
