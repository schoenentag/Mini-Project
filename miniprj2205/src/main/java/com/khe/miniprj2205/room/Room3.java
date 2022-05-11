package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Room3 {
	Scanner sc = new Scanner(System.in);
	public static int starttxtcount3 = 0;
	public static int room3clear = 0;
	

	public Room3() {
		title3();
	}

	public void title3() {
		System.out.println(
				"\t\t ===============================\n" 
			  + "\t\t ## ROOM3. 거실 ##\n"
			  + "\t\t ===============================\n");
		System.out.println();
	}

	public void starttxt3() {
		if (starttxtcount3 == 0) {
			System.out.println("추측컨대 거실이었던 곳으로 보인다.");
		} else {
			System.out.println("다 둘러보았습니다.");
		}
	} //starttxt3 end
	
	private void roomchoice() {
		System.out.println();
		System.out.println("\t ★============================================================★");
		System.out.println("\t ≡   1. 낡은 소파   |   2. 벽난로   |   3. 헌팅트로피   |   4. 그 외   ≡");
		System.out.println("\t ★============================================================★");
		System.out.println();
		
		boolean run = true;
		while (run) {
			try {
			System.out.println(">>>");
			int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:// 못찾음
					
					break;
				case 2:// 못찾음
					
					break;
				case 3: // 생년월일
					
					break;
				case 4: // 부엌
					Kitchen.kitchen();
					run = false;
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
		
	}//roomchoice 끝
	
	
	public static class Kitchen {
		public static int kitchencount = 0;
		
	static  void kitchen() {
		if (kitchencount == 0) {
			kitchencount++;
		}else {System.out.println("다 둘러보았습니다.");}
		
	}
	}
	
}

