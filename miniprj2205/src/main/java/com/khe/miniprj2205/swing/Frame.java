//package com.khe.miniprj2205.swing;
//
//import java.awt.BorderLayout;
//import java.awt.Dimension;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//
//public class Frame {
//
//	public static void main(String[] args) {
//		JFrame frame = new JFrame(); // 프레임 생성
//		JPanel panel = new JPanel();
//		JLabel label = new JLabel("Some text"); 
//
//			
//		//프레임 설정
//		frame.setTitle("별장 탈출 게임 test");
//		frame.setResizable(false); // false : 크기 조절 X (크기 고정)
//		frame.setVisible(true);
//		frame.setPreferredSize(new Dimension(840, 840/12*9));
//		frame.setSize(840,840/12*9);
//		frame.setLocationRelativeTo(null); // null로 설정시 중간으로 창이 뜸
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 끄면 메모리상에서도 종료 
//		
//		
//		
//		panel.setLayout(new BorderLayout()); // 원하는 곳으로 레이아웃설정
//
//		panel.add(label, BorderLayout.CENTER);
//		frame.add(panel);		//프레임안에 패널을 넣어줘야함
//
//
//		
//
//	}
//
//}
