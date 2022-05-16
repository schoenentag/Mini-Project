package com.khe.miniprj2205.room;

public class Room5 {

	public static int starttxtcount5 = 0;
	public static int room5clear = 0;
	public static int hint = 0; // 침실에서 정보를 얻어야 1로 해금됨

	public Room5() {
		title5();
		starttxt5();
		tip5();
	}

	public void title5() {
				System.out.println();
				System.out.println("\t\t====================================");
				System.out.println("\t\t ## ROOM5. 침실 ##");
				System.out.println("\t\t====================================");
				System.out.println();
			
		//System.out.println("현재 체력 : "+ Char.hp);
	}
	
	public void starttxt5() {
		if(starttxtcount5 == 0) {
		System.out.println();
		System.out.println("낡은 서랍장과 침대 정도가 있는 것으로 봐서 침실로 추정된다.");
		System.out.println("다른 방들과 달리 오래전에 생활했던 흔적들이 군데군데 보인다.");
		System.out.println("자세히 살펴보기로 한다.");
		System.out.println();
		starttxtcount5 = 1;
		}else {
			System.out.println();
			System.out.println("침실을 좀 더 살펴본다.");
			System.out.println();
		}
		
	}
	public void tip5() {
		Char.ux = 50;
		Char.uy = 90;
		
		System.out.println("\t\t[Tip] 방향키로 움직일 수 있습니다!!");
		System.out.println("\t ====================================================");
		System.out.println("\t     w : ▲ | a : ◀ | s : ▼ | d : ▶ | 0 : 종료    ");
		System.out.println("\t ====================================================");
		System.out.println();
		//System.out.println("현재 체력 : " + Char.hp);
		Char.getInstance().move();
		}
	
	
	}
