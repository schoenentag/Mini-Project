package com.khe.miniprj2205.swing;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Room1_X {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room1_X window = new Room1_X();
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
	public Room1_X() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>빛 한 점 들지 않는 음침한 공간 속 한 가운데에 어떤 한 인영이 쓰러져 있다."
				+ "<br/>얕은 신음소리로 인해 사람의 존재는 알 수 있으나 정확히 어디인지 어떤 곳인지 알기는 어렵다."
				+ "<br/>다만 오랫동안 방치 된 듯한 온기 한 점 없는 스산한 공기와 쿰쿰한 곰팡이 냄새로 인해 사람이 살지 않는 오래된 폐가임을 짐작 할 뿐이다."
				+" <br/>"
				+"<br/>싸늘한 침묵이 드디어 깨졌다.\r\n"
				+ "\r\n"
				+ "당신은 깨질듯이 아파오는 머리를 부여잡고 눈을 떴다.\r\n"
				+ "\r\n"
				+ "손에 찝찝한 액체가 묻어나는 것이 왠지 땀은 아닐 것만 같은 느낌이다. 눈동자를 굴려 상황파악을 하고자 했지만 쉽지 않다.\r\n"
				+ "\r\n"
				+ "쌔까맣게 내려앉은 어둠 탓에 아무것도 보이지 않고 그리고...\r\n"
				+ "\r\n"
				+ "아무것도 생각나지 않는다..."
				+"<br/>"
				+"<br/>"
				+ "새하얗게 비어버린 머릿속을 거칠게 헤메며 기억을 더듬어 봐도 소용이 없었다. \r\n"
				+ "\r\n"
				+ "이윽고 거칠어진 숨을 차분히 다듬으며 진정하려 노력하며, 일단 이곳을 파악하고 빠져나가기로 한다."
				+ "</html>");
		lblNewLabel.setLayout(null);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(42, 44, 701, 507);
		lblNewLabel.setFont(new Font("궁서체", Font.PLAIN, 16));
		//lblNewLabel.setOpaque(true);
		//lblNewLabel.setBackground(Color.lightGray);
		lblNewLabel.setForeground(Color.white);
		panel.add(lblNewLabel);
		
//		txtLabel.setForeground(Color.RED);
//		txtLabel.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 15));
		
		

	}

	
	
}

