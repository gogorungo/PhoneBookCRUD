package Controller;

import java.io.IOException;

import View.PView;

public class PRemote {
	
	public void prm(PView view) throws IOException {
		
		view.run();	//오버라이드 적용
	}
}
