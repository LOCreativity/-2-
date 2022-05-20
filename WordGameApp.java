package project;

import java.util.Scanner;

public class WordGameApp {
	Scanner st = new Scanner(System.in);
	// 생성자, main(), 게임을 전체적으로 진행하는 run()메소드 등으로 구성
	private String fst;
	private int pnum;
	private Player[] player;
	public WordGameApp(String fst) {
		this.fst = fst;
	}
	public void run() {
		for(int i = 0; i < pnum; i++) {
			
			System.out.print("참가자의 이름을 입력하세요>> ");
			String name = st.next();
			player[i] = new Player(name); 
		}
		System.out.println("시작하는 단어는 " + fst + "입니다");
		int count = 0;
		while(true) {
			System.out.print(player[count].getName() + ">> ");
			player[count].setStr();

			String nextStr = player[count].getStr();
			int lastIndex = fst.length() - 1;
			char lastChar = fst.charAt(lastIndex);
			char firstChar = nextStr.charAt(0);

			if(!(lastChar == firstChar)) {
				System.out.println(player[count].getName() + "이 졌습니다.");
				break;
			}
			fst = nextStr;
			count++;
			if(count == pnum) {
				count = 0;
			}
		}
	}
	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		pnum = st.nextInt();
		player = new Player[pnum];
	}

	public static void main(String[] args) {
		WordGameApp ob = new WordGameApp("와이파이");
		ob.createPlayers();
		ob.run();
	}
}