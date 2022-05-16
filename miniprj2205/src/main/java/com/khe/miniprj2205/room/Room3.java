package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Room3 {
	Scanner sc = new Scanner(System.in);
	public static int starttxtcount3 = 0;
	public static int room3clear = 0;
	public static int note = 0;

	public Room3() {
		title3();
		starttxt3();
		roomchoice();
	}

	public void title3() {
		System.out.println();
		System.out.println("\t\t====================================");
		System.out.println("\t\t ## ROOM3. 거실 ##");
		System.out.println("\t\t====================================");
		System.out.println();
	}

	public void starttxt3() {
		System.out.println();
		System.out.println("추측컨대 거실이었던 곳으로 보인다.");
		System.out.println();
	} //starttxt3 end
	
	private void roomchoice() {
		if (starttxtcount3 == 0 || room3clear ==0 || Kitchen.kitchencount == 0) {
		
		boolean run = true;
		while (run) {
				System.out.println();
				System.out.println("\t ====================================================================");
				System.out.println("\t    1. 낡은 소파   |   2. 벽난로   |   3. 헌팅트로피   |   4. 그 외   ");
				System.out.println("\t ====================================================================");
				System.out.println();
			System.out.println(">>>");
			try {
			int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:// 못찾음
					System.out.println("현관문을 여는데 도움이 될만한 뭔가가 보이지 않는다.");
					System.out.println("다른 것을 조사해 본다.");
					break;
				case 2:// 못찾음
					System.out.println("현관문을 여는데 도움이 될만한 뭔가가 보이지 않는다.");
					System.out.println("다른 것을 조사해 본다.");
					break;
				case 3: // 생년월일
					if (note == 0) {
					System.out.println("무너진 벽쪽에 바닥에 처참히 널부러진 헌팅 트로피가 있다.");
					System.out.println("으스스한 기분을 무시한 채 조사를 진행한다.");
					System.out.println("박제된 사슴 목 뒤편에 무언가가 있다.");
					System.out.println("...");
					System.out.println("자세히 살펴보니 종이에 무언가가 쓰여져 있다.");
					System.out.println("");
					System.out.println("\t--------------------------------------------------------------------------------------------------");
					System.out.println("\t                           .::      .::    .::      .::.::      .::    .::      .::.::      .::");
					System.out.println("\t.::     .: .::     .: .::   .::   .::       .::   .::   .::   .::       .::   .::   .::   .::  ");
					System.out.println("\t .::  .::    .:: .::    .::  .:: .::         .:: .::     .:: .::         .:: .::     .:: .::   ");
					System.out.println("\t .:: .:      .::.:      .::    .::             .::         .::             .::         .::  ");   
					System.out.println("\t .::   .:  .::    .:  .::    .:: .::         .:: .::     .:: .::         .:: .::     .:: .::   ");
					System.out.println("\t .::      .::        .::    .::   .::       .::   .::   .::   .::       .::   .::   .::   .::  ");
					System.out.println("\t.::::   .::        .::     .::      .::.:: .::      .::.::      .::.:: .::      .::.::      .::");
					System.out.println("\t--------------------------------------------------------------------------------------------------");
					System.out.println();
					System.out.println("글자가 희미해서 잘 보이지 않는다.");
					System.out.println("하지만 이것이 뭔지 파악할 필요가 있어보인다.");
					System.out.println(">>> 당신이 떠올린 것은... ");
					System.out.println();
					try {
						boolean run2 = true;
					while(run2) {
					String answer = sc.nextLine();
					if (room3clear == 0 ) {
					if (answer.equalsIgnoreCase("birthday")) {
						System.out.println("...년도와 월, 일이 적혀져 있는 것으로 추정된다.");
						System.out.println("...누구의 생일인지는 알 수 없다.");
						room3clear = 1;
						starttxtcount3 = 1;
						note = 1;
						System.out.println("...");
						System.out.println("다른곳을 조사해본다.");
						run2 = false;
					}else {
						System.out.println("다시 한 번 생각 해 보기로 한다.");
					}//else
					}//else {System.out.println("다 둘러보았습니다.");} 
						}
					}catch (Exception e) {
						System.out.println("영문자로 입력하세요.");
					}
					}else {
						System.out.println("생일이 적힌 것으로 추정되는 종이를 발견했다.");
					}
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
		}else{
			System.out.println("\t>>>거실을 다 둘러보았습니다.");
			System.out.println();
		}
		
	}//roomchoice 끝
	
	
	public static class Kitchen {
		public static int kitchencount = 0;
		
	static  void kitchen() {
		if (kitchencount == 0) {
			System.out.println();
			System.out.println("거실과 연결된 부엌이 보인다.");
			System.out.println("부엌에는 낡은 싱크대와 작동하지 않는 냉장고뿐이다.");
			System.out.println("혹시나 하는 마음으로 수도꼭지를 올려보았으나 역시 물이 나오지 않았다.");
			System.out.println();
			System.out.println("...");
			System.out.println("부엌은 전체적으로 알수없는 얼룩들과 잔해물들로 지저분 했으며 별 다른 특이점은 발견하지 못 했다.");
			System.out.println("다 둘러본 것 같다.");
			System.out.println("복도로 돌아간다.");
			System.out.println();
			kitchencount++;
			Hallway.getInstance().hallreturn();
			
		}else {
			System.out.println("\t 주방을 다 둘러보았습니다.");
			System.out.println();
			Hallway.getInstance().hallreturn();
			}
		
		
	}
	}
	
}

