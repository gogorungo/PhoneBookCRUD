package Controller;

import java.io.IOException;

public class PControl {
	public PControl() throws IOException {
		if(!R.dao.fExist()){
			R.dao.makeFile();
		}
		else{
			R.dao.load(); // 자동 로드
			System.out.println("데이터를 불러왔습니다");
		}
		pcontrol();
	}
	
	public void pcontrol() throws IOException {

		R.pr.prm(R.pm);
		
		switch(R.num) {
		case 1: R.pr.prm(R.pi); break; //삽입
		case 2: R.pr.prm(R.pl); break; //출력
		case 3: R.pr.prm(R.pu); break; //수정
		case 4: R.pr.prm(R.prm); break; //삭제
		case 5: R.dao.save(); break; // 저장
		case 6: 
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		default:
			System.out.println("잘못 입력하셨습니다");
		}
		pcontrol();
	}
}
