package View;

import java.util.InputMismatchException;
import java.util.Scanner;

import Controller.R;

public class PMenu extends PView {
	
	@Override
	public void run() {
		try {
			System.out.println("기능을 선택하세요");
			System.out.print("1. 추가 2. 리스트 3. 수정 4. 삭제 5. 저장 6. 종료 >> ");
			int choice = scan.nextInt();
			R.num = choice;
		} catch (InputMismatchException e) {
			scan = new Scanner(System.in);
		}
	}
}
