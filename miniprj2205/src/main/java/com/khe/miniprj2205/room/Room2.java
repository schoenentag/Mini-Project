package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Room2 {
	Scanner sc = new Scanner(System.in);
	public static int starttxtcount = 0;
	public static int room2clear = 0;
	
	public Room2() {
		title2();
		starttxt();
		hallreturn();
	}
	
	
	public void title2() {
		System.out.println(
				  "\t\t ===============================\n"
				+ "\t\t ## ROOM2. 와인 창고로 추정되는 방 ##\n"
				+ "\t\t ===============================\n");
		System.out.println();
	}

	public void starttxt() {
		if (starttxtcount == 0) {
			System.out.println(starttxtcount);
		System.out.println(
				 "여전히 어둡고 서늘하다.\n"
				+ "다 무너져내려서 정확하게는 알 수 없지만 와인창고로 쓰여졌던 방인 것 같다.\n"
				+ "\r\n"
				+ "...\n"
				+ "이 방에서는 현관문을 여는데 도움이 될만한 뭔가가 보이지 않는다.\r\n"
				+ "다시 복도로 나왔다.\r\n"
				+ "\r\n"
				);
		room2clear = 1;
		starttxtcount = 1;
		}else {
			System.out.println("다 둘러보았습니다.");
		}
}
	
	public void hallreturn() {
		System.out.println("\t\t >>> 복도로 돌아가시겠습니까?");
		System.out.println(
				  "\t\t ===============================\n"
				+ "\t\t ≡    1. 예     |    2. 아니오    ≡\n"
				+ "\t\t ===============================\n");
		System.out.println();
			System.out.println(">>>");
			int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					Hallway hallway = Hallway.getInstance();
					break;
				default:
					System.out.println("\t>>> 아무 행동도 하지 않았습니다.");
					System.out.println();
					break;
				}


		
	}
}
