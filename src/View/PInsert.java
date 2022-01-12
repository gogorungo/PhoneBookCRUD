package View;

import java.io.IOException;

import Controller.R;

public class PInsert extends PView {

	@Override
	public void run() throws IOException {
		System.out.print("이름과 전화번호를 입력하세요 >> ");
		String name = scan.next();
		String phone = scan.next();
		R.dao.insert(name, phone);
	}

}
