package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Room5 {
	
	
//	Item item = new Item();
//	item.mybed();

	public static int starttxtcount5 = 0;
	public static int room5clear = 0;
	public static int hint = 0; // 침실에서 정보를 얻어야 1로 해금됨

	public Room5() {
		title5();
		starttxt5();
		tip5();
	}

	public void title5() {
		System.out.println(
				"\t\t ===============================\n"
			  + "\t\t ## ROOM5. 침실 ##\n"
			  + "\t\t ===============================\n");
		System.out.println();
		System.out.println("mybed 값 확인 : "+Item.mybed());
	}
	
	public void starttxt5() {
		if(starttxtcount5 == 0) {
		System.out.println("낡은 서랍장과 침대 정도가 있는 것으로 봐서 침실로 추정된다.");
		System.out.println("다른 방들과 달리 오래전에 생활했던 흔적들이 군데군데 보인다.");
		System.out.println("자세히 살펴보기로 한다.");
		System.out.println();
		starttxtcount5 = 1;
		}else {
			System.out.println("침실을 좀 더 살펴본다.");
		}
		
	}
	public void tip5() {
		int ux = 50;
		int uy = 90;
		
		System.out.println("\t\t[Tip] 방향키로 움직일 수 있습니다!!");
		System.out.println("\t ★===============================================★");
		System.out.println("\t ≡    w : ▲ | a : ◀ | s : ▼ | d : ▶ | 0 : 종료    ≡");
		System.out.println("\t ★===============================================★");
		System.out.println();
		
		//Char user = new Char();
		//System.out.println("현재 체력 : " + Char.hp);
		System.out.println("현재 체력 : " + user.hp);
		System.out.println("현재 체력 : " + Char.hp);
		Char.move();
		}
	
	//지하방 클래스
	public class Extra{
		Scanner sc = new Scanner(System.in);
		int extrastarttxt = 0;
		void extrastarttxt() {
			if(Item.mykey == 1 && extrastarttxt == 0) {
				System.out.println();
				System.out.println("침대 밑에 숨겨진 문을 화장실에서 습득한 열쇠로 열어보았다.");
				System.out.println("약간의 시행착오가 있었으나...");
				System.out.println("자물쇠가 풀렸다.");
				System.out.println();
				System.out.println("침대를 완전히 밀어 치워두고 문을 완전히 열었다.");
				System.out.println();
		}
		}
		void txt() {
			System.out.println();
			System.out.println("어둠에 뒤덮인 경사진 계단을 조심스레 밟으며 아래로 내려갔다.");
			System.out.println();
			System.out.println("...");
			System.out.println("......");
			System.out.println("긴장을 늦추지 않은 채 계속 지하로 걸음을 옮겼다.");
			System.out.println("이윽고 넓은 공간이 하나 나타났다.");
			System.out.println();
			System.out.println("랜턴으로 공간을 비추어보며 심상치 않은 기운을 느꼈다.");
			System.out.println("지하 벙커라기엔 용도를 알 수 없는 녹이 슨 스텐 재질의 테이블과 벽면에 진열장 같은 것들이 나열되어 있다.");
			System.out.println("사용감은 있어 보이지만 무언가가 놓여있거나 하지 않다.");
			System.out.println("이 곳이 일반적인 용도로 사용되지는 않았을 것 같다는 생각이 들었다.");
			System.out.println();
			System.out.println("...");
			System.out.println("적당히 살펴보다보니 안쪽 깊숙한 곳에서 문이 발견했다.");
			System.out.println("철문으로 되어있는 문이었는데, 잠겨져 있었지만");
			System.out.println("돌파구는 쉽게 알아냈다.");
			System.out.println();
			System.out.println("문 옆 쪽 벽에 박힌 못에 열쇠들이 걸려 있었다.");
			System.out.println();
			System.out.println("심장이 거세게 뛰며 밖으로 나갈 수 있다는 희망이 생겼다.");
			System.out.println("녹이 슨 열쇠들을 하나 씩 꽂아 넣어보며 맞는 열쇠를 찾아본다.");
			Item.mykey = 2;
		}
		void keys() {
			System.out.println();
			System.out.println("딸깍!");
			System.out.println();
			System.out.println("마침내 문이 열렸다.");
			System.out.println("랜턴으로 문 밖을 비추어보자 불 빛 한 점 없는 기나긴 복도로 인해 밖을 통하는 복도인지는 알 수가 없었다.");
			System.out.println("이곳이 출입구는 맞는걸까?");
			System.out.println("잠깐 의문이 스쳐 지나갔다.");
			System.out.println();
			
			boolean run = true;
			while(run) {
			System.out.println("\t\t >>> 복도를 통해 밖으로 나가시겠습니까?");
			System.out.println(
					  "\t\t ===============================\n"
					+ "\t\t ≡    1. 예     |    2. 아니오    ≡\n"
					+ "\t\t ===============================\n");
				System.out.println(">>>");
				try {
				int choice = Integer.parseInt(sc.nextLine());
					switch (choice) {
					case 1:
						System.out.println();
						System.out.println("복도를 따라 계속 걸었다.");
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
						System.out.println();
						System.out.println();
						//hpInfo
						
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
					

					}}
			
		}
	}
	}
