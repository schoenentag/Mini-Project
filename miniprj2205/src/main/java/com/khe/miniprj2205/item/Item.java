package com.khe.miniprj2205.item;

import java.util.Scanner;

public class Item {
	int myax = 0;
	
	public void trash() {
		System.out.println();
			System.out.println("부서진 벽 사이로 건축 부자재 폐기물 더미를 발견했습니다.");
			System.out.println();
			
			ax();
	}
	public int myax() {
		return this.myax;
	}
	
	//도끼 습득 
	public void ax(){
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t  ================================================");
		System.out.println("\t |          [Tip] 숫자키를 눌러서 행동하십시오.           |");
		System.out.println("\t |     ※ 숫자키 이외의 키는 아무 행동도 하지 않습니다. ※     |");
		System.out.println("\t  ================================================");
		System.out.println(">> ");
		System.out.println();
		int random = (int) (Math.random() * 6) + 3;
		System.out.println("랜덤값 : "+random);
		boolean run = true;
		
		while(run) {
			System.out.println("==============");
			System.out.println("|>>> 숫자키 입력 |");
			System.out.println("==============");
		int num = (int) sc.nextInt();
		if (num == random ) {
			System.out.println("건축 부자재 폐기물 더미 사이에서 도끼를 발견했습니다.");
			System.out.println("도끼를 습득했습니다.");
			myax = 1;
			run = false;
		}else {
			System.out.println("폐기물 더미 일부를 옆으로 치웁니다.");
			System.out.println("폐기물 더미를 파해쳐 봅니다.");
			continue;}
		}}
		catch (Exception e) {
			System.out.println("\t\t >>> 아무것도 하지 않습니다.");
			}
		}
	
		
		
	
		
	
	public void light() {
			System.out.println("뜯겨져 나간 나무바닥 틈 사이에 랜턴이 있습니다.");
			System.out.println("랜턴을 습득하여 사용합니다.");
			System.out.println("주변이 조금 환해집니다.");
		}// light메소드 끝
	}
	
	

