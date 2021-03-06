package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Char {
	
	 private static Char user; 
	 
	 Char() {

	 } 
	 
	 public static Char getInstance() {
		 if (user == null) { 
	 user = new Char(); 
	 } return user;
	 }

	// Item item = new Item();

	public static int hp = 100;
	public static int hit = 0;
	public static int clear1 = 0;
	public static int clear5 = 0;
	

	// 유저의 좌표 초기값
	public static int ux = 50;
	public static int uy = 80;

	public final int MIN = 0;
	public final int MAX = 100;

	public Char(int hit){
		init();
		}

	public static void w() {
		System.out.println("\t\t >>> 앞으로 1칸 이동하였습니다. >>>");
		System.out.println("\t  =====================================================");
	}

	public static void a() {
		System.out.println("\t\t >>> 왼쪽으로 1칸 이동하였습니다. >>>");
		System.out.println("\t  =====================================================");
	}

	public static void s() {
		System.out.println("\t\t >>> 뒤로 1칸 이동하였습니다. >>> ");
		System.out.println("\t  =====================================================");

	}

	public static void d() {
		System.out.println("\t\t >>> 오른쪽으로 1칸 이동하였습니다. >>> ");
		System.out.println("\t  =====================================================");
	}


	public void move() {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		String move;

		try {
			while (run) {
				System.out.println(">> ");
				move = sc.nextLine();
				switch (move) {
				case "w":
					w();
					uy = uy + 10;
					status();
					break;
				case "a":
					a();
					ux = ux - 10;
					status();
					break;
				case "s":
					s();
					uy = uy - 10;
					status();
					break;
				case "d":
					d();
					ux = ux + 10;
					status();
					break;
				case "0":
					System.out.println("\t\t >>> 더이상 이동하지 않습니다 >>> ");
					System.out.println("\t  =====================================================");
					return;
				default:
					System.out.println("\t\t >>> 아무런 행동도 하지 않았습니다. >>> ");
					System.out.println("\t  =====================================================");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
		} // move 끝

	}

	public int hp(int hp) {
		return hp;
	}

	public int hit(int hit) {
		this.hit = hit;
		return hit;
	}

	public void hpInfo(int hit) {
		hp = hp - hit;
		if (hp > 0 && hit > 0) {
			System.out.println();
			System.out.println("\t\t\t      >>> 당신의 체력이 " + hit + "만큼 깎였습니다. ");
			System.out.println("\t  ==========================================================");
		} else if (hp <= 0) {
			System.out.println();
			System.out.println("\t\t\t >>> 당신은 사망하였습니다.");
			System.out.println();
			System.out.println("\t  ==========================================================");
			System.out.println();
			System.out.println("\t\t\t >>> GAME OVER!");
			System.out.println("\t\t\t >>> 게임을 다시 시작하시겠습니까?");
			System.out.println();
			new Main(hp);
		}

	}
	
	public String hpbar(int hp) {
		String bar = null;
		switch (hp/10) {
		
		case 1:
		case 2:
			bar = "HP | ■□□□□";
			break;
		case 3:
		case 4:
			bar = "HP | ■■□□□";
			break;
		case 5:
		case 6:
			bar = "HP | ■■■□□";
			break;
		case 7:
		case 8:
			bar = "HP | ■■■■□";
			break;
		case 9:
		case 10:
			bar = "HP | ■■■■■";
			break;
		}
		return bar;
		
	}

	public  int x(int ux) {
		if (ux < MIN) {
			System.out.println("벽에 부딪혔습니다.");
			hit = hit + 10;
			hpInfo(hit);
			hit = 0;
			ux = MIN;
		} else if (ux > MAX) {
			System.out.println("벽에 부딪혔습니다.");
			hit = hit + 10;
			hpInfo(hit);
			hit = 0;
			ux = MAX;
		}

		return ux;
	}

	public int y(int uy) {
		if (uy <= MIN) {
			System.out.println("벽에 부딪혔습니다.");
			hit = hit + 10;
			hpInfo(hit);
			hit = 0;
			uy = MIN;
		} else if (uy >= MAX) {
			System.out.println("벽에 부딪혔습니다.");
			
			hit = hit + 10;
			hpInfo(hit);
			hit = 0;
			uy = MAX;
		}
		return uy;
	}

	public void status() {
		//System.out.println("clear1 값은 : " + clear1 + ", clear5 값은 : " + clear5);
		if (clear1 == 0) {

			if (ux == 60 && uy == 60) {
				Item.getInstance().light();
			}
			if (ux == 10 && uy == 30) {
				Item.getInstance().trash();
			}
			ux = x(ux);
			uy = y(uy);
			System.out.println("\t    【 "+hpbar(hp)+" 】   좌표값 【" + ux + ", " + uy + "】");
			if (ux == 50 && uy == 90 && Item.getInstance().myax() == 0) {
				System.out.println();
				System.out.println("나가는 문을 발견하였습니다.");
				System.out.println("자물쇠로 잠겨져 있습니다.");
				System.out.println("자물쇠를 부슬 무언가를 찾아야할 것 같습니다.");
				System.out.println();
			}

			if (ux == 50 && uy == 90 && Item.getInstance().myax() == 1 && Item.getInstance().mylight() == 1) {
				System.out.println();
				System.out.println("나가는 문을 발견하였습니다.");
				System.out.println("자물쇠로 잠겨져 있습니다.");
				System.out.println("획득한 도끼로 자물쇠를 부숩니다.");
				System.out.println("....");
				System.out.println("자물쇠가 부서졌습니다.");
				System.out.println("문을 열었습니다.");
				System.out.println();
				clear1 = clear1 + 1;
				//run = false;
				Hallway.getInstance().hallreturn();
				 return;
			} else if (ux == 50 && uy == 90 && Item.getInstance().myax() == 1 && Item.getInstance().mylight() == 0) {
				System.out.println("나가기 전 방을 조금 더 둘러봅니다.");
				System.out.println();
			}
		} else if (clear5 == 0) { // Room5 status // 다 깨면 clear5 = 1로 바꾸기
			// ============================================================
			ux = x(ux);
			uy = y(uy);
			System.out.println("\t    【 "+hpbar(hp)+" 】   좌표값 【" + ux + ", " + uy + "】");

			if (ux == 50 && uy == 90 && Item.getInstance().mynote() == 0 && Item.mybed() == 0) {
				System.out.println("나가기 전 방을 조금 더 둘러봅니다.");
				System.out.println();
			} else if (ux == 50 && uy == 90 && Item.getInstance().mynote() == 1 && Item.mybed() == 1) {
				System.out.println();
				System.out.println("복도로 나가겠습니까?");
				System.out.println();
				// 복도로 돌아가는 메소드 호출
				Hallway.getInstance().hallreturn();
			} else if (ux == 50 && uy == 90 && Item.getInstance().mynote() == 1 && Item.mybed() == 2) {
				System.out.println();
				System.out.println("복도로 나가겠습니까?");
				System.out.println();
				// 복도로 돌아가는 메소드 호출
				Hallway.getInstance().hallreturn();
			}

			if (ux == 10 && uy == 30 && Item.getInstance().mynote() == 0) {
				Item.getInstance().note();
				// clear = clear5 + 1;
				// run = false;
				// return;
			}
			if (ux == 10 && uy == 10 && Item.getInstance().mynote() == 1 && Item.mybed() == 0) {// 침대 좌표 넣기
				Item.getInstance().bed();
				Hallway.getInstance().hallreturn(); // 메소드 뜨는지 확인
			}
			if (ux == 10 && uy == 10 && Item.mykey == 1) {
				System.out.println();
				Extra extra = new Extra();
				
			}

		}

	} // status() end

	public static void init() { // 초기화 메서드
		hp = 100;
		hit = 0;
		int totalhp;

		 ux = 50;
		 uy = 80;
	}

}
