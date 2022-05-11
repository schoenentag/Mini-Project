package com.khe.miniprj2205.room;

import java.util.Scanner;

public class Hallway {
	private static Hallway singleton = new Hallway();
	
	private Hallway() {
		title2();
		starttxt();
		roomchoice();	
	}
	
	static Hallway getInstance() {
		return singleton;
	}
	
	public int hallwaystarttxtcount = 0;
	Scanner sc = new Scanner(System.in);
	
//	public  Hallway() {
//		
//		title2();
//		if(starttxtcount == 0) {
//			starttxt();
//		}
//			roomchoice();	
//	}
	
	public void title2() {
		System.out.println(
				  "\t\t ===============================\n"
				+ "\t\t ## Hallway. 복도 ##\n"
				+ "\t\t ===============================\n");
		System.out.println();
		System.out.println(hallwaystarttxtcount);
	}
	
	public void starttxt() {
		System.out.println(
				 "\r\n"
				+"....\n"
				+ "방을 빠져나와 복도로 나왔다.\n"
				+ "복도의 창문을 통해 들어오는 달빛에 어렴풋이 시야가 트인다.\n"
				+"긴장을 늦추지 않은 채 주변을 살펴봤으나 다른 인기척은 느껴지지 않는다.\r\n"
				+ "\r\n"
				+ "...\n"
				+ "이곳이 어딘지 알 수 없으나...\r\n"
				+ "계속 이곳에 있는 것이 위험한 것은 안다.\r\n"
				+ "나가는 문을 찾아야 할 것 같다.\r\n"
				+ "...\r\n"
				+ "......\r\n"
				+ ".........\r\n"
				+ "숨죽여 걸음에도 불구하고 부식된 나무판자들로 인해 끼익- 끼익- 불쾌한 소리가 당신을 따라다닌다.\n"
				+ "...\r\n"
				+ "마침내 현관문으로 추정되는 곳에 도착을 했다.\n"
				+ "문고리를 돌려보았으나 잠겨져 있다.\r\n"
				+ "당신은 잠시 도끼를 떠올려보았으나 이내 포기했다.\r\n"
				+ "아까 자물쇠를 부수면서 도끼도 같이 파손이 되어 더이상 사용이 불가능했기 때문이다.\r\n"
				+ "다른 방법을 찾아야 할 것 같다.\r\n"
				+ "아까 전에 복도를 지나며 세아려본 방의 갯수는 6개 정도로 추정.\r\n"
				+ "일단 나가기 위해 다른 방들을 둘러보기로 한다.\r\n"
				+ "\r\n"
				);
		hallwaystarttxtcount++;
	}
	
	private void roomchoice() {
		
		System.out.println();
		System.out.println("\t ★============================================================★");
		System.out.println("\t ≡ 1.ROOM1 | 2.ROOM2 | 3.ROOM3 | 4.ROOM4 | 5.ROOM5 | 6. ROOM6 ≡");
		System.out.println("\t ★============================================================★");
		System.out.println();
		
		boolean run = true;
		while (run) {
			try {
			System.out.println(">>>");
			int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					
					System.out.println("\t\t===============================\n");
					System.out.println("\t\t ## ROOM1. 다 무너져 내린 방 ##\n");
					System.out.println("\t\t===============================\n");
					System.out.println("\t\t >>> 들어갔던 방입니다.");
					break;
				case 2:
					new Room2();
					break;
				case 3:
					System.out.println();
					run = false;
					break;
				case 4:
					run = false;
					break;
				case 5:
					System.out.println();
					run = false;
					break;
				case 6:
					run = false;
					break;
				default:
					System.out.println("\t>>> 다시 입력하세요.");
					System.out.println();
					break;
				}
			} catch (Exception e) {
				System.out.println("\t>>> 숫자 키를 입력하세요.");
				System.out.println();
			}
		}//while문 끝
		
	}

}
