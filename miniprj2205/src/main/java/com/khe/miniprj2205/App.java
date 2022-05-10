package com.khe.miniprj2205;

import java.util.Scanner;

import com.khe.miniprj2205.chr.*;
import com.khe.miniprj2205.room.*;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Room1 room1 = new Room1();
		room1.starttxt();
		room1.tip1();

		Char user = new Char();
		CharMove moving = new CharMove();
		boolean run = true;

		moving.move();
		
	
		

	}

}
