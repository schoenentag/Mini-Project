package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Room6 {
	Scanner sc = new Scanner(System.in);
	
	public Room6() {
		title6();

	}

	public void title6() {
		System.out.println(
				"\t\t ===============================\n"
			  + "\t\t ## ROOM6. ??? ##\n"
			  + "\t\t ===============================\n");
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
	}
	public void ending() {
		boolean run = true;
		while(run) {
		System.out.println("\t\t >>> 창문을 조사해보시겠습니까?");
		System.out.println(
				  "\t\t ===============================\n"
				+ "\t\t ≡    1. 예     |    2. 아니오    ≡\n"
				+ "\t\t ===============================\n");
		System.out.println("HP | " + Char.hp);
			System.out.println(">>>");
			if(Char.hp-50 <= 0) {
				Char.getInstance().hpInfo(Char.getInstance().hit(50));
				System.out.println("당신은 몸을 일으켜 보려고 했으나...");
				System.out.println("누적된 피로와 두통으로 ");
			}
			try {
			int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					
					System.out.println();
					System.out.println("");
					System.out.println("처음에는 긴장되어 조심스럽게 움직이던 발걸음이 점점 빨라져 결국 뛰다시피 걸음을 옮겼다.");
					System.out.println();
					System.out.println("...");
					System.out.println("......");
					System.out.println("마침내 또다른 문이 보이고 어깨를 짖누르고 있던 압박감만큼 무거운 철문을 밀어젖혔다.");
					System.out.println();
					System.out.println();
					System.out.println("바람결에 흔들려 부딪히는 나무잎들의 소리와 빽빽하게 우거진 숲이 보였다.");
					System.out.println("인공적인 불빛 한 점 보이지 않았다.");
					System.out.println("도시와 상당히 떨어져 격리가 된 곳임은 분명하다.");
					System.out.println();
					System.out.println("여기가 어디인지, 이곳에는 어쩌다 오게 되었는지");
					System.out.println("... 무엇보다 나는 누구인지 알지 못 한다.");
					System.out.println("앞으로 이곳을 빠져나가 어떻게 해야할지...");
					System.out.println("너무나 막막했다.");
					System.out.println();
					System.out.println("암담함에 아무런 행동없이 무방비한 상태로 있을 때였다.");
					System.out.println();
					System.out.println("갑자기 등 뒤에서 인기척이 느껴졌다.");
					System.out.println("놀라 뒤를 돌아보는 순간...");
					System.out.println("......");
					System.out.println("...");
					System.out.println();
					
					Char.getInstance().hpInfo(Char.getInstance().hit(110));
					
					run = false;
					break;
				case 2:
					System.out.println("계단을 올라가 다시 복도로 돌아갑니다.");
					Hallway.getInstance().roomchoice();
					run = false;
					break;
				default:
				    System.out.println("지하 공간을 더 둘러보았으나 특별한 점은 없습니다.");
				    break;
				}}catch (Exception e) {
					System.out.println(">>>아무 행동도 하지 않았습니다.");
				

				}//try~catch
			}
		
	}
}
