package com.khe.miniprj2205.chr;

public interface Character {
	void w(); // 앞으로 가는 기능
	void a(); // 왼쪽으로 가는 기능
	void s(); // 뒤로 가는 기능
	void d(); // 오른쪽으로 가는 기능
	
	void hp(); //캐릭터의 체력
	
	void touch(); // 물건을 만지는 기능
	
	int choice();
	
	void have(); // 아이템을 소지할 수 있는 저장공간
	
}
