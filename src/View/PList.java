package View;

import java.io.IOException;

import Controller.R;

public class PList extends PView {
	@Override
	public void run() throws IOException {
		System.out.println("전체 데이터 출력");
		R.dao.list();
	}
}
