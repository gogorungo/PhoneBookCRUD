package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class PDao {
	public Scanner scan = new Scanner(System.in);
	File file = new File("data.txt");
	OutputStreamWriter osw = null;
	BufferedReader br = null;
	StringTokenizer st = null;
	
	public HashMap<String, String> hm = new HashMap<String, String>();
	
	public void insert(String name, String phone) throws IOException {
		if(hm.containsKey(name)) {
			System.out.println("이미 존재하는 데이터 입니다!");
			return;
		}
		hm.put(name, phone);
		System.out.println("입력 되었습니다");

	}
	
	public boolean search(String name) {
		return hm.containsKey(name);
	}
	
	public void list() throws IOException {
		Set<String> s = hm.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String member = it.next();
			String data = hm.get(member);
			System.out.println(member + " : "+data);
		}
	}
	
	public void update(String name) {
		if(search(name)) {
			System.out.print("번호를 입력하세요");
			String phone = scan.next();
			hm.remove(name);
			hm.put(name, phone);
			System.out.println("수정 완료!");
		}else {
			System.out.println("정보를 찾을 수 없습니다!");
		}
	}
	
	public void remove(String name) {
		if(search(name)) {
			hm.remove(name);
			System.out.println("삭제 되었습니다");
		}
		else {
			System.out.println("정보를 찾을 수 없습니다!");
		}
	}
	
	public void save() throws IOException {
		osw = new OutputStreamWriter(new FileOutputStream(file,false),"UTF-8");
		osw.write(hm.toString()+"\n");
		osw.close();
		System.out.println("파일 저장에 성공하였습니다");
	}
	
	public void load() throws IOException {
		if(file == null)return;
		br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
		String buffer = null;
		while((buffer = br.readLine()) != null) {
			st = new StringTokenizer(buffer,"{,=} ");
			while(st.hasMoreTokens()) {
				String token1 = st.nextToken();
				String token2 = st.nextToken();
				hm.put(token1, token2);
			}
		}
		br.close();
	}
	
	public boolean fExist() {
		return file.exists();
	}
	
	public void makeFile() throws IOException {
		osw = new OutputStreamWriter(new FileOutputStream(file,true),"UTF-8");
	}
	
}
