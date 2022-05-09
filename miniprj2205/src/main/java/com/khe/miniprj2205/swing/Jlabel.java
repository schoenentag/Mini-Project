//package com.khe.miniprj2205.swing;
//
//import java.awt.Color;
//import java.awt.Toolkit;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class Jlabel {
//	JPanel back_panel = new JPanel();
//	JLabel jlabel;
//	JLabel lb_text1, JLabel;
//
//	public void Test() {
//
//		// Container container = new Container();
//
//		JPanel panel = new JPanel(); // 판넬 만들기
//		panel.setBounds(500, 500, 450, 200); /// 없으면 안뜨고,, 있어도 뭐가 다른지 모르겠고..
//		panel.setBackground(Color.white);
//		back_panel.add(panel);
//		panel.setVisible(true);
//		// panel.setLayout(null);
//
//		lb_text1 = new JLabel("TEST입니다.");
//
//		lb_text1.setSize(500, 200); // 프레임 크기 조정(픽셀)
//		lb_text1.setOpaque(true); // 불투명도를 true로 해서 배경색을 보이게 한다.
//		lb_text1.setBackground(Color.white); // 라벨의 배경색을 설정
//		lb_text1.setForeground(Color.red); // 라벨의 글자색 설정
//		String strNextLine = "<html> JLable도 <br/> 개행 가능합니다!</html>";
//		// html문법을 사용하여 \n으로도 안되는 개행을 가능하게 한다.
//
//		JLabel lb_text2 = new JLabel(strNextLine);
//
//		back_panel.add(lb_text1); // 메인 패널에 텍스트필드1 붙이기
//		back_panel.add(lb_text2); // 메인 패널에 텍스트필드2 붙이기
//
////		add(back_panel); // 메인 프레임에 메인패널을 붙여주는 작업
////
////		setVisible(true); // 프레임 보이게 하기
//	}
//	
//	// Frame_background 호출
//		public void paint_panel() {
//			Frame_background back = new Frame_background();
//			Toolkit tk = Toolkit.getDefaultToolkit();
//		}
//}