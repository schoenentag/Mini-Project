package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Item {
	public int myax = 0; // 도끼를 습득하면 1로 바뀜
	public int mylight = 0;
	public int mynote = 0;
	public int mybed= 0; // bed 둘러만 보면 1, 지하방까지보면 2
	
	public  Item() {  init(); }
	

	public void trash() {
		System.out.println();
		System.out.println("부서진 벽 사이로 건축 부자재 폐기물 더미를 발견했습니다.");
		System.out.println();
		ax();
	}
	public int myax() {
		return this.myax;
	}
	public int mylight() {
		return this.mylight;
	}
	// 도끼 습득
	public void ax() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("\t  ================================================");
			System.out.println("\t |          [Tip] 숫자키를 눌러서 행동하십시오.           |");
			System.out.println("\t |     ※ 숫자키 이외의 키는 아무 행동도 하지 않습니다. ※      |");
			System.out.println("\t  ================================================");
			System.out.println(">> ");
			System.out.println();
			int random = (int) (Math.random() * 6) + 3;
			System.out.println("랜덤값 : " + random);
			boolean run = true;

			while (run) {
				System.out.println("==============");
				System.out.println("|>>> 숫자키 입력 |");
				System.out.println("==============");
				int num = (int) sc.nextInt();
				if (num == random) {
					System.out.println("건축 부자재 폐기물 더미 사이에서 도끼를 발견했습니다.");
					System.out.println("도끼를 습득했습니다.");
					myax = 1;
					run = false;
				} else {
					System.out.println("폐기물 더미 일부를 옆으로 치웁니다.");
					System.out.println("폐기물 더미를 파해쳐 봅니다.");
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("\t\t >>> 아무것도 하지 않습니다.");
		}
	}

	public void light() {
		if(mylight == 0) {
		System.out.println("뜯겨져 나간 나무바닥 틈 사이에 랜턴이 있습니다.");
		System.out.println("랜턴을 습득하여 사용합니다.");
		System.out.println("주변이 조금 환해집니다.");
		mylight =1;}
		
	}// light메소드 끝
	
	public void note() {
		System.out.println();
		System.out.println("낡은 3단 서랍장을 발견하였습니다.");
		System.out.println("맨 윗 서랍 외에는 다 부서져 열어볼 수 없습니다.");
		System.out.println("맨 윗 서랍을 열었습니다");
		System.out.println();
		System.out.println("....");
		System.out.println("낡은 수첩과 볼펜이 하나 들어있습니다.");
		System.out.println("수첩 안에는 드문드문 날짜와 간단한 메모가 기재되어있습니다.");
		System.out.println("그리고 앞 장의 메모에는 취소선 혹은 체크 표시가 되어있습니다.");
		System.out.println();
		System.out.println("... 그 이외의 추가로 발견한 내용은 없습니다.");
		mynote = mynote + 1;
	}
	public int mynote() {
		return this.mynote;
	}
	
	public void bed() {
		System.out.println("낡은 침대를 발견하였습니다.");
		System.out.println("침대 주변을 살펴봅니다.");
		
	}
	
	public int mybed() {
		return this.mybed;
	}
	public void init() {
		int myax = 0; 
		int mylight = 0;
		int mynote = 0;
	}

}
