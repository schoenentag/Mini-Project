//package com.khe.miniprj2205.swing;
//
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Image;
////import java.io.File;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//class ImagePanel extends JPanel{
//	private Image img;
//	
//	public ImagePanel(Image img) {
//		this.img = img;
//		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));// 이미지 사이즈가 패널에 맞게 조정
//		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
//		setLayout(null);
//	}
//	public void paintComponent(Graphics g) { //이미지 불러오는 메소드
//		g.drawImage(img, 0, 0, null);
//	}
//}
//
//public class Frame_Images {
//	public static void main(String[] args) {
//		JFrame frame1 = new JFrame("TEST");
//		frame1.setSize(800, 600);
//		frame1.setLocationRelativeTo(null); //화면 가운데로
//		//frame1.setResizable(false); // 크기 조정 X
//		frame1.setVisible(true);
//
//		ImagePanel room1ImgPanel = new ImagePanel(new ImageIcon("C:\\eclipse-workspace\\miniprj2205\\src\\main\\java\\image\\main_House800.jpg").getImage()); // 이미지아이콘 클래스가 이미지로 바뀜  
//		//File f = new File("C:\\eclipse-workspace\\miniprj2205\\src\\main\\java\\image\\main_House800.jpg"); 
//		//System.out.println(f.exists()?"Exists":"dosen't exists"); // 경로확인
//		frame1.add(room1ImgPanel);
//		frame1.pack(); //프레임 사이즈에 맞게 조정
//	
//		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//}
