package Controller;

import Model.PDao;
import View.PInsert;
import View.PList;
import View.PMenu;
import View.PRemove;
import View.PUpdate;
import View.PView;

public class R {
	public static int num;
	
	public static PRemote pr = new PRemote();
	public static PView pm = new PMenu();
	public static PView pi = new PInsert();
	public static PView pl = new PList();
	public static PView prm = new PRemove();
	public static PView pu = new PUpdate();
	
	public static PDao dao = new PDao();
}
