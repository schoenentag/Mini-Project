package com.khe.miniprj2205.chr;

import java.util.ArrayList;
import java.util.List;

import com.khe.miniprj2205.item.Item;

public class Char implements IChar {
	Item item = new Item();
	
	public int hp = 100;
	public int hit = 0;
	public int totalhp;
	
	//유저의 좌표 초기값
	public int ux = 50;
	public int uy = 80;
	
	public final int MIN = 0;
	public final int MAX = 100;

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

	@Override
	public int hp(int hp) {
		return hp;
	}
	public int hit(int hit) {
		this.hit = hit;
		return this.hit;
	}

	public void hpInfo(int hp) {
		totalhp = hp - hit;
		if (totalhp < 0 && hit < 0) {
			System.out.println("\t\t\t >>> 당신의 체력이 "+hit+"만큼 깎였습니다. ");
			System.out.println("\t  ================================================");
		}
		else {
			System.out.println("당신은 사망하였습니다.");
			// 사망 메소드 삽입예정
		}

	}
	
	@Override
	public void look() {
		System.out.println("조사합니다.");
	}

	@Override
	public void touch() {
		System.out.println("");

	}

	@Override
	public int choice() {
//		if (choice == "yes") {
//			System.out.println();
//		} else if (chice == "no") {
//			System.out.println();
//		}
//		else {
//			System.out.println("다시 입력하세요.");
//			continue;
//		}
		return 0;
	}

	public  int x(int ux){
		if (ux <= MIN) {
			System.out.println("벽에 부딫혔습니다.");
			hit = hit - 10;
			hpInfo(hit);
			return ux = MIN;}
		else if (ux >= MAX) {
			System.out.println("벽에 부딫혔습니다.");
			hit = hit - 10;
			hpInfo(hit);
			return ux = MAX;}
		return ux;
	} 
	public int y(int uy) {
		if (uy <= MIN) {
			System.out.println("벽에 부딫혔습니다.");
			hit = hit - 10;
			hpInfo(hit);
			return uy = MIN;}
		else if (uy >= MAX) {
			System.out.println("벽에 부딫혔습니다.");
			hit = hit - 10;
			hpInfo(hit);
			return uy = MAX;}
		return uy;
	}
	
	public void status() {
		System.out.println("\t\t\t\t\t  좌표값 【"+ux+", "+ uy +"】");
		System.out.println("\t  ================================================");
		
		if(ux == 60 && uy == 60) {
			item.light();
		}
		if (ux == 10 && uy == 30) {
			item.trash();
		}
		x(ux);
		y(uy);
		if (ux == 50 && uy == 90 && item.myax() == 0) {
			System.out.println("나가는 문을 발견하였습니다.");
			System.out.println("자물쇠로 잠겨져 있습니다.");
			System.out.println("자물쇠를 부슬 무언가를 찾아야할 것 같습니다.");
		}
		
		if (ux == 50 && uy == 90 && item.myax() == 1) {
			System.out.println("나가는 문을 발견하였습니다.");
			System.out.println("자물쇠로 잠겨져 있습니다.");
			System.out.println("획득한 도끼로 자물쇠를 부숩니다.");
			System.out.println("....");
			System.out.println("자물쇠가 부서졌습니다.");
			System.out.println("방을 탈출합니다.");
			uy = uy +10;
		}
		
			
		}
	}


