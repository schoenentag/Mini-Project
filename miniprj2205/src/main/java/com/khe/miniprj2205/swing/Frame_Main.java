package com.khe.miniprj2205.swing;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));// 이미지 사이즈가 패널에 맞게 조정
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	public void paintComponent(Graphics g) { //이미지 불러오는 메소드
		g.drawImage(img, 0, 0, null);
	}
}

public class Frame_Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Main window = new Frame_Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public Frame_Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("The Cottage Escape");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null); //화면 가운데로
		frame.setResizable(false); // 크기 조정 X
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이미지 출력
		ImagePanel MainImgPanel = new ImagePanel(new ImageIcon("C:\\eclipse-workspace\\miniprj2205\\src\\main\\java\\image\\main_House800.jpg").getImage());
		frame.add(MainImgPanel);
		frame.pack(); //프레임 사이즈에 맞게 조정
		
		JPanel main_panel = new JPanel(); // 판넬 생성 후 프레임에 판넬 넣음
		frame.getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		JButton btnStart = new JButton("START");
		btnStart.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 15));
		btnStart.setBounds(100, 350, 100, 50);
		main_panel.add(btnStart);
		
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 다음 화면으로 넘어가는 기능 넣기
			}
		});
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 15));
		btnExit.setBounds(100, 420, 100, 50);
		main_panel.add(btnExit);
		// 버튼을 클릭하면 종료된다.
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
//		JButton btnNewButton1 = new JButton(" 예 ");
//		btnNewButton1.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 15));
//		btnNewButton1.setBounds(550, 510, 100, 30);
//		panel.add(btnNewButton1);
//		
//		JButton btnNewButton2 = new JButton("아니오");
//		btnNewButton2.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 15));
//		btnNewButton2.setBounds(650, 510, 100, 30);
//		panel.add(btnNewButton2);
		
		//JPanel panel_1 = new JPanel();
		//frame.getContentPane().add(panel_1);
		//panel_1.setLayout(null);
		
	}
}
