package project;

import java.util.Scanner;

class Player{
	Scanner st = new Scanner(System.in);
	private String pname;
	private String pstr;
	public Player(String name) {
		this.pname = name;
	}

	public String getName() {
		return pname;
	}
	public void setStr() {
		pstr = st.next();
	}
	public String getStr() {
		return pstr;
	}
}