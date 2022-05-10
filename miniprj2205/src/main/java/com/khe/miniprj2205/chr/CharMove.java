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
			user.w();
			user.uy = user.uy + 10;
			user.status();
			break;
		case "a":
			user.a();
			user.ux = user.ux -10;
			user.status();
			break;
		case "s":
			user.s();
			user.uy = user.uy - 10;
			user.status();
			break;
		case "d":
			user.d();
			user.ux = user.ux + 10;
			user.status();
			break;
		case "0":
			System.out.println("\t\t >>> 더이상 이동하지 않습니다 >>> ");
			System.out.println("\t  ================================================");
			return;
		default:
			System.out.println("\t\t >>> 아무런 행동도 하지 않았습니다. >>> ");
			System.out.println("\t  ================================================");
			break;
		}
	}
	} // move 끝
	
	
	
	

}

