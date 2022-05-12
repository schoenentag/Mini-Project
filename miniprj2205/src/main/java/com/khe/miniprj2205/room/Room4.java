package com.khe.miniprj2205.room;


public class Room4 {
	public static int starttxtcount4 = 0;
	public static int room4clear = 0; // 아직 0
	public static int hint = 0; // 침실에서 정보를 얻어야 1로 해금됨

	public Room4() {
		title4();
		starttxt4();
	}

	public void title4() {
		System.out.println(
				"\t\t ===============================\n"
			  + "\t\t ## ROOM4. 화장실 ##\n"
			  + "\t\t ===============================\n");
		System.out.println();
	}

	public void starttxt4() {
		if (starttxtcount4 == 0) {
			System.out.println(
					 "부서진 문짝을 밀어 화장실에 들어오자마자 퀴퀴한 곰팡이 냄새와 알 수 없는 냄새가 코를 찌른다.\r\\n"
					+ "속이 메스꺼워오고 당장 탈출하고 싶지만 참고 좀 더 조사를 하기로 한다.\\r\\n"
					+ "화장실 벽면 전체에 곰팡이가 피어있다.\r\\n"
					+ "물론 변기와 세면대도 마찬가지였다.\r\\n"
					+ "\r\n"
					+ "...\n"
					+ "바닥에는 공구들과 함께 포대자루가 늘어져있다.\r\n"
					+ "포대자루 안을 열어보니 먼지와 모래가루가 날리며 잠시 시야를 가렸다.\r\n"
					+ "이윽고 포대자루 안이 보였는데, 진흙따위와 건축 부자재 등 잡동사니들이 담겨있었다.\r\n"
					+ "\r\n"
					+ "....\r\n"
					+ "포대자루의 진흙더미를 더 파헤쳐보았으나 특이점은 없었다.\r\n"
					+ "\r\n"
					+ "다시 복도로 나왔다.\r\n"
					);
			starttxtcount4 = 1;
			}else {
				System.out.println("다 둘러보았습니다.");
				Hallway.getInstance().hallreturn();
			}
	} // starttxt4 end
	//만약 침실에서 아이템을 습득하면... 추가 정보 공개

}
