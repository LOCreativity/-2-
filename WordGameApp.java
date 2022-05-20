package project;

import java.util.Scanner;

public class WordGameApp {
	Scanner st = new Scanner(System.in);
	// ������, main(), ������ ��ü������ �����ϴ� run()�޼ҵ� ������ ����
	private String fst;
	private int pnum;
	private Player[] player;
	public WordGameApp(String fst) {
		this.fst = fst;
	}
	public void run() {
		for(int i = 0; i < pnum; i++) {
			
			System.out.print("�������� �̸��� �Է��ϼ���>> ");
			String name = st.next();
			player[i] = new Player(name); 
		}
		System.out.println("�����ϴ� �ܾ�� " + fst + "�Դϴ�");
		int count = 0;
		while(true) {
			System.out.print(player[count].getName() + ">> ");
			player[count].setStr();

			String nextStr = player[count].getStr();
			int lastIndex = fst.length() - 1;
			char lastChar = fst.charAt(lastIndex);
			char firstChar = nextStr.charAt(0);

			if(!(lastChar == firstChar)) {
				System.out.println(player[count].getName() + "�� �����ϴ�.");
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
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		pnum = st.nextInt();
		player = new Player[pnum];
	}

	public static void main(String[] args) {
		WordGameApp ob = new WordGameApp("��������");
		ob.createPlayers();
		ob.run();
	}
}