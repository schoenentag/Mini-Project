package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Item {
	
	private static Item item; // 싱글톤 클래스에 item이라는 변수를 만듦
	
	private Item() {} // Item 호출 시 자동으로 실행되는 메소드
	
	public static Item getInstance() {
		if (item == null) {
			item = new Item();
		}
		return item;
	}
	public static int myax = 0; // 도끼를 습득하면 1로 바뀜
	public static int mylight = 0;
	public static int mynote = 0;
	public static int mybed= 0; // bed 둘러만 보면 1, key 습득하면 1, 지하방 보면 2
	public static int key = 0;
	public static int mykey = 0;
	
	public  Item(int hit){  init(); }
	

	public void trash() {
		System.out.println();
		System.out.println("부서진 벽 사이로 건축 부자재 폐기물 더미를 발견했습니다.");
		System.out.println();
		ax();
	}
	public int myax() {
		return myax;
	}
	public int mylight() {
		return mylight;
	}
	// 도끼 습득
	public void ax() {
		if(myax==0) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("\t  ========================================================");
			System.out.println("\t           [Tip] 숫자키를 눌러서 행동하십시오.           ");
			System.out.println("\t      ※ 숫자키 이외의 키는 아무 행동도 하지 않습니다. ※      ");
			System.out.println("\t  ========================================================");
			System.out.println(">> ");
			System.out.println();
			int random = (int) (Math.random() * 6) + 3;
			//System.out.println("랜덤값 : " + random);
			boolean run = true;

			while (run) {
				System.out.println();
				System.out.println("=================");
				System.out.println(">>> 숫자키 입력 ");
				System.out.println("=================");
				System.out.println();
				int num = (int) sc.nextInt();
				if (num == random) {
					System.out.println();
					System.out.println("건축 부자재 폐기물 더미 사이에서 도끼를 발견했습니다.");
					System.out.println("도끼를 습득했습니다.");
					System.out.println();
					myax = 1;
					run = false;
				} else {
					System.out.println();
					System.out.println("폐기물 더미 일부를 옆으로 치웁니다.");
					System.out.println("폐기물 더미를 파해쳐 봅니다.");
					System.out.println();
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("\t\t >>> 아무것도 하지 않습니다.");
		}
		}else {System.out.println("아이템을 이미 습득하였습니다.");}
	}

	public void light() {
		if(mylight == 0) {
		System.out.println();
		System.out.println("뜯겨져 나간 나무바닥 틈 사이에 랜턴이 있습니다.");
		System.out.println("랜턴을 습득하여 사용합니다.");
		System.out.println("주변이 조금 환해집니다.");
		System.out.println();
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
		System.out.println();
		mynote = mynote + 1;
	}
	public int mynote() {
		return mynote;
	}
	
	public void bed() {
		System.out.println();
		System.out.println("낡은 침대를 발견하였습니다.");
		System.out.println("침대 주변을 살펴봅니다.");
		System.out.println();
		if(mybed == 0) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("\t  =====================================================");
			System.out.println("\t           [Tip] 숫자키를 눌러서 행동하십시오.           ");
			System.out.println("\t      ※ 숫자키 이외의 키는 아무 행동도 하지 않습니다. ※      ");
			System.out.println("\t  =====================================================");
			System.out.println(">> ");
			System.out.println();
			int random = (int) (Math.random() * 4) + 3;
			//System.out.println("랜덤값 : " + random);
			boolean run = true;

			while (run) {
				System.out.println();
				System.out.println("=================");
				System.out.println(">>> 숫자키 입력 ");
				System.out.println("=================");
				System.out.println();
				int num = (int) sc.nextInt();
				if (num == random) {
					System.out.println();
					System.out.println("곰팡이가 가득 핀 매트리스를 들어보았습니다.");
					System.out.println("나무 프레임 창살 사이로 무언가가 보입니다.");
					System.out.println();
					System.out.println("랜턴으로 사이를 자세히 비추어 봅니다.");
					System.out.println();
					System.out.println("...");
					System.out.println("바닥으로 위장된 문을 발견하였습니다!");
					System.out.println("문을 열어보려 시도 해 보았으나...");
					System.out.println("자물쇠로 문이 잠겨있어서 열리지 않습니다.");
					System.out.println();
					System.out.println("...");
					System.out.println("일단 더 이상 시간을 지체하지 않고 나갈 방법을 구상해봅니다.");
					System.out.println();
					mybed = 1;
					run = false;
				} else {
					System.out.println();
					System.out.println("침대 주변을 더 샅샅이 살펴봅니다.");
					System.out.println("...");
					System.out.println();
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("\t\t >>> 아무것도 하지 않습니다.");
		}
		}//if mybed=0 끝
		else if(mybed ==1) {
			System.out.println("주변을 더 둘러봤으나... ");
			System.out.println("아직 문을 열 방법을 찾지 못했습니다.");
			System.out.println();
		}
	
	}
	
	public static int mybed() {
		return mybed;
	}
	public void init() {
		 myax = 0; // 도끼를 습득하면 1로 바뀜
		 mylight = 0;
		 mynote = 0;
		 mybed= 0; // bed 둘러만 보면 1, key 습득하면 1, 지하방 보면 2
		key = 0;
		mykey = 0;
	}

	public void key() { }
	
	public int mykey() {
		return mykey;
	}
}
