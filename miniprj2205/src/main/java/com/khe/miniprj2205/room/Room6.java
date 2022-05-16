package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Room6 {
	Scanner sc = new Scanner(System.in);
	
	public Room6() {
		title6();
		txt5();
		ending();

	}

	public void title6() {
				System.out.println();
				System.out.println("\t\t====================================");
				System.out.println("\t\t ## ROOM6. ??? ##");
				System.out.println("\t\t====================================");
				System.out.println();
	}
	public void txt5() {
		System.out.println();
		System.out.println("지하실에서 챙긴 열쇠를 가지고 현관문 쪽으로 걸어갔다.");
		System.out.println("현관문의 문고리에 열쇠를 넣고 돌려보았다.");
		System.out.println("...");
		System.out.println("하지만 열쇠가 맞지 않았다.");
		System.out.println();
		System.out.println("...");
		System.out.println("......");
		System.out.println("다른 열쇠들도 모두 시도해보았지만 실패했다.");
		System.out.println();
		System.out.println("모두 다 둘러보았지만...");
		System.out.println("열쇠는 찾지 못 했었다.");
		System.out.println();
		System.out.println("...");
		System.out.println("..... 이내 당신은 문을 부술 수 있는 모든 것들을 가지고 와 현관문을 부수려 해보지만...");
		System.out.println("......");
		System.out.println("약간의 흠집만 날 뿐 부서질 기미가 보이지 않았다.");
		System.out.println("마치 문이 아니라 단단한 벽처럼 느껴졌다.");
		System.out.println();
		System.out.println("...");
		System.out.println("......");
		System.out.println("희망이 사라졌다.");
		System.out.println("머릿속이 백짓장이 된 듯 하다.");
		System.out.println("망연자실의 상태로 바닥에 주저앉았다.");
		System.out.println("모든 힘이 풀려 손에 쥐고 있던 랜턴이 바닥으로 굴러떨여졌다.");
		System.out.println();
		System.out.println("드르륵 소리를 내며 짧게 구르던 랜턴이 멈춰 어느 한 벽면에 빛을 비추었다.");
		System.out.println("랜턴의 움직임을 따라 멍하니 움직이던 눈동자 또한 벽면에 시선을 멈추었다.");
		System.out.println("멍하니 벽면에 시선을 두던 차에...");
		System.out.println("약간의 이질감을 느꼈다.");
		System.out.println();
		System.out.println("나무판자로 막혀있는 창문이었는데...");
		System.out.println("처음에 보았을때는 단순히 창문이라고 생각했었지만...");
		System.out.println("창문위치나 크기가 이상했다.");
		System.out.println("마치 한 사람이 드나들 수 있을 정도의 사이즈였다.");
		System.out.println();
	}
	public void ending() {
		boolean run = true;
		while(run) {
		System.out.println();
		System.out.println("\t\t >>> 창문을 조사해보시겠습니까?");
		System.out.println(
				  "\t\t ===============================\n"
				+ "\t\t     1. 예     |    2. 아니오    \n"
				+ "\t\t ===============================\n");
		System.out.println("\t\tHP | " + Char.hp);
			System.out.println(">>>");
			
			try {
			int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					if(Char.hp-50 <= 0) {
						System.out.println();
						System.out.println("창문을 조사해보기로 마음먹고...");
						System.out.println("당신은 몸을 일으켜 보려고 했으나...");
						System.out.println("누적된 피로와 지속적으로 발생했던 출혈로 인해 빈혈을 느낀다. ");
						System.out.println();
						System.out.println("결국 몸을 가누지 못 해 결국 쓰러진다.");
						System.out.println("다친 머리가 고르지 못한 바닥에 처박혀 결국...");
						System.out.println("...");
						System.out.println();
						
						Char.getInstance().hpInfo(Char.getInstance().hit(50));
						}else if(Char.hp-50 > 0)	{
							System.out.println();
							System.out.println("창문을 조사해보고자 당신은 몸을 일으키려 했다.");
							System.out.println("하지만 누적된 피로와 깨질듯한 두통으로 몸을 일으키기가 쉽지 않았다.");
							Char.getInstance().hpInfo(Char.getInstance().hit(50));
							System.out.println();
							System.out.println("...");
							System.out.println("잠시 휴식을 취한 후 조심스럽게 몸을 일으켜 세웠다.");
							System.out.println();
							System.out.println("벽면의 창문을 자세히 조사해보니...");
							System.out.println("창문으로 위장된 문이 맞았다.");
							System.out.println();
							System.out.println("생각보다 문은 쉽게 열렸으며...");
							System.out.println("알 수 없는 이곳을 무사히 빠져나올 수 있게 되었다.");
							System.out.println();
							System.out.println("인적이 드문 숲속의 어느 곳이었지만");
							System.out.println("조금씩 동이 트는 덕분에 숲 속의 어떤 표식을 발견할 수 있었다.");
							System.out.println("표식이 있는 나무를 따라 걸으니 무사히 조그마한 마을을 발견할 수 있게 되었으며");
							System.out.println("드디어 그 끔찍한 지옥에서 탈출을 했다고 안심 할 수 있게 되었다.");
							System.out.println();
							System.out.println();
							new Main("ending");
						}
					
					break;
				case 2:
					System.out.println();
					System.out.println("하지만... 이내 그 생각은 더이상 멈추었다.");
					System.out.println("당신은 더이상 움직일 체력도 정신도 남아있지 않다");
					System.out.println("누군가 자신을 구해주길 바라는 마음으로...");
					System.out.println("일단 이곳에 남아 사람들을 기다려보기로 한다.");
					System.out.println();
					System.out.println();
					System.out.println("...");
					System.out.println("......");
					System.out.println("당신은 저 체온증으로 사망하셨습니다.");
					System.out.println();
					new Main(100);
					break;
//				default:
//				    System.out.println("지하 공간을 더 둘러보았으나 특별한 점은 없습니다.");
//				    break;
				}}catch (Exception e) {
					System.out.println(">>>아무 행동도 하지 않았습니다.");

				}//try~catch
			}
		
	}
}
