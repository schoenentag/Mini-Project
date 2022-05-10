package com.khe.miniprj2205.chr;

import java.util.ArrayList;
import java.util.List;

import com.khe.miniprj2205.item.Item;

public class Char implements IChar {
	Item item = new Item();
	
	public int hp = 100;
	public int hit = 0;
	public int totalhp;
	
	
	public int ux = 80;
	public int uy = 50;

	@Override
	public void w() {
		System.out.println("||| >>> 앞으로 1칸 이동하였습니다. >>> |||");
	}

	@Override
	public void a() {
		System.out.println("||| >>> 왼쪽으로 1칸 이동하였습니다. >>> |||");
	}

	@Override
	public void s() {
		System.out.println("||| >>> 뒤로 1칸 이동하였습니다. >>> |||");

	}

	@Override
	public void d() {
		System.out.println("||| >>> 오른쪽로 1칸 이동하였습니다. >>> |||");
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
			System.out.println("||| 당신의 체력이 "+hit+"만큼 깎였습니다. |||");
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

	@Override
	public void have() {
		// TODO Auto-generated method stub

	}
	
	public void status() {
		System.out.println("\t 좌표값 ("+ux+", "+ uy +")");
		if(ux == 60 && uy == 60) {
			item.light();
		}
	}

}
