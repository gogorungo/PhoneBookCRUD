package View;

import java.io.IOException;

import Controller.R;

public class PRemove extends PView {
	@Override
	public void run() throws IOException {
		System.out.print("삭제할 이름을 입력하세요 >> ");
		String name = scan.next();
		R.dao.remove(name);
	}
}
