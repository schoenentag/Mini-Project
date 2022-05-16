package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Room2 {
	Scanner sc = new Scanner(System.in);
	public static int starttxtcount2 = 0;
	public static int room2clear = 0;
	
	public Room2() {
		title2();
		starttxt2();
		Hallway.getInstance().hallreturn();// 싱글톤 클래스 메소드 호출방법
	}
	
	
	public void title2() {
		System.out.println();
		System.out.println("\t\t====================================");
		System.out.println("\t\t ## ROOM2. 와인 창고로 추정되는 방 ##");
		System.out.println("\t\t====================================");
		System.out.println();
	
	}

	public void starttxt2() {
		if (starttxtcount2 == 0) {
		System.out.println();
		System.out.println("여전히 어둡고 서늘하다.");
		System.out.println("다 무너져내려서 정확하게는 알 수 없지만 와인창고로 쓰여졌던 방인 것 같다");
		System.out.println();
		System.out.println("...");
		System.out.println("이 방에서는 현관문을 여는데 도움이 될만한 뭔가가 보이지 않는다.");
		System.out.println("다시 복도로 나왔다.");
		System.out.println();
		room2clear = 1;
		starttxtcount2 = 1;
		}else {
			System.out.println("다 둘러보았습니다.");
			Hallway.getInstance().hallreturn();
		}
}
	
}
