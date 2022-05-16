package com.khe.miniprj2205.room;


public class Room4 {
	//Item item = new Item();
	
	public static int starttxtcount4 = 0;
	public static int room4clear = 0; // 아직 0
	public static int hint = 0; // 침실에서 정보를 얻어야 1로 해금됨

	public Room4() {
		title4();
		starttxt4();
	}

	public void title4() {
		System.out.println();
		System.out.println("\t\t====================================");
		System.out.println("\t\t ## ROOM4. 화장실 ##");
		System.out.println("\t\t====================================");
		System.out.println();
	}

	public void starttxt4() {
		if ((starttxtcount4 == 0 && Item.mybed() == 0) || (starttxtcount4 == 0 && Item.mybed() == 1)) {
			System.out.println();
			System.out.println("부서진 문짝을 밀어 화장실에 들어오자마자 퀴퀴한 곰팡이 냄새와 알 수 없는 냄새가 코를 찌른다.");
			System.out.println("속이 메스꺼워오고 당장 탈출하고 싶지만 참고 좀 더 조사를 하기로 한다.");
			System.out.println();
			System.out.println("화장실 벽면 전체에 곰팡이가 피어있다.");
			System.out.println("물론 변기와 세면대도 마찬가지였다.");
			System.out.println();
			System.out.println("...");
			System.out.println("바닥에는 공구들과 함께 포대자루가 늘어져있다.");
			System.out.println("포대자루 안을 열어보니 먼지와 모래가루가 날리며 잠시 시야를 가렸다.");
			System.out.println("이윽고 포대자루 안이 보였는데, 진흙따위와 건축 부자재 등 잡동사니들이 담겨있었다.");
			System.out.println();
			System.out.println("...");
			System.out.println(".......");
			System.out.println("포대자루의 진흙더미를 더 파헤쳐보았으나 특이점은 없었다.");
			System.out.println();
			starttxtcount4 = 1;
			Hallway.getInstance().hallreturn();
			}
		if (starttxtcount4 == 1 && Item.mybed() == 0 ) {
			System.out.println();
			System.out.println("다 둘러보았습니다.");
			System.out.println();
			Hallway.getInstance().hallreturn();
			}
		// ======================================================================
		// ROOM5에서 mybed를 확인하고 난 뒤...
		if(starttxtcount4 == 1 && Item.mybed() == 1 ) {
			System.out.println();
			System.out.println("화장실 쪽의 포대더미를 다시 한 번 살펴보기로 한다.");
			System.out.println("벽에 널부러져 있는 포대 자루들을 차례차례 바닥으로 부어보았다.");
			System.out.println("계속 되는 반복 작업...");
			System.out.println();
			System.out.println("...");
			System.out.println("......");
			System.out.println("포대 자루의 묵직한 무게 때문에 에너지가 빠른 속도로 빠진다.");
			System.out.println("...");
			System.out.println();
			System.out.println("...");
			System.out.println("여전히 진흙따위와 건축 부자재 등 잡동사니들만 나온다");
			System.out.println();
			System.out.println("...");
			System.out.println("......");
			System.out.println();
			System.out.println("시간이 한 참 흐른 후...");
			System.out.println("널부러진 공구들 중 망치를 잡아 자물쇠를 부숴볼까 생각 해 본다.");
			System.out.println();
			System.out.println("포대 자루에서 나온 흙더미 따위에 덮여있던 망치를 쥐기 위해 주변의 것들을 치웠다.");
			System.out.println("흙더미 사이에서 열쇠가 나왔다.");
			System.out.println();
			System.out.println("망치와 열쇠를 챙겨 그 방으로 이동하기로 한다.");
			System.out.println();
			Item.mybed = 2;
			Item.mykey = 1;
			Hallway.getInstance().hallreturn();
		}
	} // starttxt4 end
	


}
