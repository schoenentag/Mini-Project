package com.khe.miniprj2205.swing;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class button {

	private static final Color White = null;
	private static final Color RED = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					button window = new button();
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
	public button() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("asdasdfasdfasdfasdfasddsafasdfsasdffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.lightGray);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		
		
		lblNewLabel.setBounds(100, 319, 600, 190);
		panel.add(lblNewLabel);
		
		
		
		
		// 밑에 깔려있는거 어떻게 올리는지 모르겠음..ㅠ
//		JPanel btnText = new JPanel();
//		btnText.setBounds(100, 62, 137, 50);
//		panel.add(btnText);
//		JLabel label = new JLabel("START");
//		btnText.add(label);
	}
}
