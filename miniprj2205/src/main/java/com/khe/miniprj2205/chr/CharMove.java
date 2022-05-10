package com.khe.miniprj2205.chr;

import java.util.Scanner;

public class CharMove {
	//int[][] map = new int [101][101];
	Scanner sc = new Scanner(System.in);
	
	Char user = new Char(); // ux, uy 
	
	String move;
	
	public void move() {
		boolean run = true;
		while(run) {
			System.out.println(">> ");
			move = sc.nextLine();
		
		switch (move) {
		case "w":
			System.out.println("||| >>> 앞으로 1칸 이동하였습니다. >>> |||");
			user.ux = user.ux + 10;
			user.status();
			break;
		case "a":
			System.out.println("||| >>> 왼쪽으로 1칸 이동하였습니다. >>> |||");
			user.uy = user.uy -10;
			user.status();
			break;
		case "s":
			System.out.println("||| >>> 뒤로 1칸 이동하였습니다. >>> |||");
			user.ux = user.ux - 10;
			user.status();
			break;
		case "d":
			System.out.println("||| >>> 오른쪽으로 1칸 이동하였습니다. >>> |||");
			user.uy = user.uy + 10;
			user.status();
			break;
		case "0":
			System.out.println("||| >>> 더이상 이동하지 않습니다 >>> |||");
			return;
		default:
			System.out.println("||| >>> 아무런 행동도 하지 않았습니다. >>> |||");
			break;
		}
	}
	} // move 끝
	
	
	
	public void trash() {
		if(user.ux == 0 && user.uy == 3) {
			System.out.println("부서진 벽 사이로 건축 부자재 폐기물 더미를 발견했습니다.");
			ax();
		}
	}
	//도끼 습득 
	public void ax(){
		System.out.println("\t  ================================================");
		System.out.println("\t |          [Tip] 숫자키를 눌러서 행동하십시오.         |");
		System.out.println("\t  ================================================");
		System.out.println(">> ");
		System.out.println();
		int random = (int) (Math.random() * 10) + 3;
		System.out.println("랜덤값 : "+random);
		int num = sc.nextInt();
		if (num == random ) {
			System.out.println("건축 부자재 폐기물 더미 사이에서 도끼를 발견했습니다.");
			System.out.println("도끼를 습득했습니다.");
		}else {
			System.out.println("폐기물 더미 일부를 옆으로 치웁니다.");
			System.out.println("폐기물 더미를 파해쳐 봅니다.");
		}
		
	
	}
}

