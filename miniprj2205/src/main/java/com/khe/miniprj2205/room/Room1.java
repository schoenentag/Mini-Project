package com.khe.miniprj2205.room;

public class Room1  {
	public static int starttxtcount1 = 0;
	//Item item = new Item();
	Char user = new Char();
	final int mx = 100;
	final int my = 100;
	
	public void Romm1() {
		starttxt1();
		tip1();
		//status();
		//room1exit();
	}
	
	public void starttxt1() {
		if (starttxtcount1 == 0) {
		System.out.println(
				"\t\t===============================\n"
				+"\t\t ## ROOM1. 다 무너져 내린 방 ##\n"
				+"\t\t===============================\n"
				+ "\r\n"
				+"빛 한 점 들지 않는 음침한 공간 속 한 가운데에 어떤 한 인영이 쓰러져 있다.\n"
				+ "얕은 신음소리로 인해 사람의 존재는 알 수 있으나 정확히 어디인지 어떤 곳인지 알기는 어렵다.\n"
				+ "다만 오랫동안 방치 된 듯한 온기 한 점 없는 스산한 공기와 쿰쿰한 곰팡이 냄새로 인해 사람이 살지 않는 오래된 폐가임을 짐작 할 뿐이다.\n"
				+"싸늘한 침묵이 드디어 깨졌다.\r\n"
				+ "당신은 깨질듯이 아파오는 머리를 부여잡고 눈을 떴다.\r\n"
				+ "손에 찝찝한 액체가 묻어나는 것이 왠지 땀은 아닐 것만 같은 느낌이다. \n"
				+ "눈동자를 굴려 상황파악을 하고자 했지만 쉽지 않다.\r\n"
				+ "\r\n"
				+ "쌔까맣게 내려앉은 어둠 탓에 아무것도 보이지 않고 그리고...\r\n"
				+ "\r\n"
				+ "아무것도 생각나지 않는다...\n"
				+ "새하얗게 비어버린 머릿속을 거칠게 헤메며 기억을 더듬어 봐도 소용이 없었다. \r\n"
				+ "이윽고 거칠어진 숨을 차분히 다듬으며 진정하려 노력하며, 일단 이곳을 파악하고 빠져나가기로 한다."
				+ "\r\n"
				);
		starttxtcount1++;
		}
	}
	
	public void tip1() {
		System.out.println("\t\t[Tip] 이제 방향키로 움직일 수 있습니다!!");
		System.out.println("\t ★===============================================★");
		System.out.println("\t ≡    w : ▲ | a : ◀ | s : ▼ | d : ▶ | 0 : 종료    ≡");
		System.out.println("\t ★===============================================★");
		System.out.println();
	}
	
	
}
