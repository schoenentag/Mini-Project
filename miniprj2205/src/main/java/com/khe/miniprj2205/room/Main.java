package com.khe.miniprj2205.room;

import java.util.Scanner;

//import com.khe.miniprj2205.chr.Char;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public Main() {
		main();
		Room1 room1 = new Room1();
		room1.starttxt1();
		room1.tip1();
		Char user = new Char();
		user.move();
	}

	public void main() {

		System.out.println(
				"=======================================================================================================================");
		System.out.println();
		System.out.println(
				"#######                   #####                                             #######                                   ");
		System.out.println(
				"   #    #    # ######    #     #  ####  ##### #####   ##    ####  ######    #        ####   ####    ##   #####  ######");
		System.out.println(
				"   #    #    # #         #       #    #   #     #    #  #  #    # #         #       #      #    #  #  #  #    # #      ");
		System.out.println(
				"   #    ###### #####     #       #    #   #     #   #    # #      #####     #####    ####  #      #    # #    # #####  ");
		System.out.println(
				"   #    #    # #         #       #    #   #     #   ###### #  ### #         #            # #      ###### #####  #      ");
		System.out.println(
				"   #    #    # #         #     # #    #   #     #   #    # #    # #         #       #    # #    # #    # #      #      ");
		System.out.println(
				"   #    #    # ######     #####   ####    #     #   #    #  ####  ######    #######  ####   ####  #    # #      ###### ");
		System.out.println();
		System.out.println(
				"=======================================================================================================================");
		System.out.println();
		System.out.println("\t ★===============================================★");
		System.out.println("\t ≡       1. START       |        2. EXIT         ≡");
		System.out.println("\t ★===============================================★");
		System.out.println();
		boolean run = true;
		while (run) {
			try {
			System.out.println(">>>");
			int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					System.out.println("\t>>> 게임을 시작합니다.");
					System.out.println();
					run = false;
					break;
				case 2:
					run = false;
					turnOff();
					break;
				default:
					System.out.println("\t>>> 다시 입력하세요.");
					System.out.println();
					break;
				}
			} catch (Exception e) {
				System.out.println("\t>>> 숫자 키를 입력하세요.");
				System.out.println();
			}
		}//while문 끝
	}

	public void restart() {
		System.out.println();
		System.out.println("\t ★===============================================★");
		System.out.println("\t ≡       1. RESTART       |       2. EXIT        ≡");
		System.out.println("\t ★===============================================★");
		System.out.println("");
		
		boolean run = true;
		while (run) {
			try {
			System.out.println(">>>");
			int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					System.out.println("\t>>> 게임을 다시 시작합니다.");
					run = false;
					System.out.println();
					break;
				case 2:
					run = false;
					turnOff();
					break;
				default:
					System.out.println("\t>>> 다시 입력하세요.");
					System.out.println();
					break;
				}
			} catch (Exception e) {
				System.out.println("\t>>> 숫자 키를 입력하세요.");
				System.out.println();

			}
		}

	}//restart 끝
	
	public void turnOff(){
		System.out.println("\t>>>게임을 종료합니다.");
		System.exit(0);
	}
	
	

}
