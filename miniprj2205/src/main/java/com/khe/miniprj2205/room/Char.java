package com.khe.miniprj2205.room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.khe.miniprj2205.room.Hallway;
import com.khe.miniprj2205.room.Item;
import com.khe.miniprj2205.room.Main;
import com.khe.miniprj2205.room.Room1;

public class Char implements IChar {
	Scanner sc = new Scanner(System.in);
	Item item = new Item();


	public int hp = 100;
	public int hit = 0;
	public int clear1 = 0;
	String move;

	// 유저의 좌표 초기값
	public int ux = 50;
	public int uy = 80;

	public static final int MIN = 0;
	public static final int MAX = 100;

	public Char() { init(); }

	@Override
	public void w() {
		System.out.println("\t\t >>> 앞으로 1칸 이동하였습니다. >>>");
		System.out.println("\t  ================================================");
	}

	@Override
	public void a() {
		System.out.println("\t\t >>> 왼쪽으로 1칸 이동하였습니다. >>>");
		System.out.println("\t  ================================================");
	}

	@Override
	public void s() {
		System.out.println("\t\t >>> 뒤로 1칸 이동하였습니다. >>> ");
		System.out.println("\t  ================================================");

	}

	@Override
	public void d() {
		System.out.println("\t\t >>> 오른쪽으로 1칸 이동하였습니다. >>> ");
		System.out.println("\t  ================================================");
	}

	public void move() {
		
		boolean run = true;
		try {
			while (clear1 == 0) {
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
					System.out.println("\t  ================================================");
					return;
				default:
					System.out.println("\t\t >>> 아무런 행동도 하지 않았습니다. >>> ");
					System.out.println("\t  ================================================");
					break;
				}
			}
		} catch (Exception e) {

			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
		}
		// move 끝

	}

	@Override
	public int hp(int hp) {
		return hp;
	}

	public int hit(int hit) {
		this.hit = hit;
		return this.hit;
	}

	public void hpInfo(int hit) {
		hp = hp - hit;
		if (hp > 0 && hit > 0) {
			System.out.println("\t\t\t      >>> 당신의 체력이 " + hit + "만큼 깎였습니다. ");
			System.out.println("\t  ================================================");
		} else if (hp == 0) {
			System.out.println("\t\t\t >>> 당신은 사망하였습니다.");
			System.out.println("\t  ================================================");
			System.out.println("\t\t\t >>> GAME OVER!");
			System.out.println("\t\t\t >>> 게임을 다시 시작하시겠습니까?");
			new Main();
		}

	}

	public int x(int ux) {
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
		//System.out.println("\t\t\t\t\t 기존 좌표값 【" + ux + ", " + uy + "】");
		//System.out.println("\t  ================================================");

		if (ux == 60 && uy == 60) {
			item.light();
		}
		if (ux == 10 && uy == 30) {
			item.trash();
		}
		ux = x(ux);
		uy = y(uy);
		System.out.println("\t\t\t\t\t   좌표값 【" + ux + ", " + uy + "】");
		if (ux == 50 && uy == 90 && item.myax() == 0) {
			System.out.println("나가는 문을 발견하였습니다.");
			System.out.println("자물쇠로 잠겨져 있습니다.");
			System.out.println("자물쇠를 부슬 무언가를 찾아야할 것 같습니다.");
		}

		if (ux == 50 && uy == 90 && item.myax() == 1 && item.mylight() == 1) {
			System.out.println("나가는 문을 발견하였습니다.");
			System.out.println("자물쇠로 잠겨져 있습니다.");
			System.out.println("획득한 도끼로 자물쇠를 부숩니다.");
			System.out.println("....");
			System.out.println("자물쇠가 부서졌습니다.");
			System.out.println("문을 열었습니다.");
			clear1 = clear1 + 1;
			Hallway hallway = Hallway.getInstance();
			//return;
		}else if(ux == 50 && uy == 90 && item.myax() == 1 && item.mylight() == 0) {
			System.out.println("나가기 전 방을 조금 더 둘러봅니다.");
		}
	}

	public void init() {
		int hp = 100;
		int hit = 0;
		int totalhp;

		int ux = 50;
		int uy = 80;
	}
	
	public void xy00() {
		int ux = 10;
		int uy = 10;
	}
}
