package Interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

import Logica.Board;

public class Game extends JFrame {

	private JPanel contentPane;
	private ImageIcon cross;
	private ImageIcon circle;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game(Board board) {
		setBounds(200, 200, 472, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(null);
		
		this.cross = new ImageIcon ("Images/cross.png");
		this.circle = new ImageIcon ("Images/circle.png");
		
		JLabel lblNewLabel = new JLabel("TURN :");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 65, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(String.valueOf(board.getTurn()));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(85, 11, 21, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PLAYER :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_2.setBounds(330, 11, 85, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_3.setBounds(425, 11, 21, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel avatar = new JLabel("New label");
		avatar.setBounds(185, 50, 75, 75);
		avatar.setIcon(board.getPlayer1());
		contentPane.add(avatar);

		JButton Button1 = new JButton("");
		Button1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button1.addMouseListener(new MouseAdapter() {
			int posicion = 1;

			@Override
			public void mousePressed(MouseEvent e) {
				
				pressButton(board, Button1, posicion, lblNewLabel_1, lblNewLabel_3,avatar);
				if (board.getGanador()) {
					JFrame win = new Win(board);
					win.setVisible(true);
					dispose();				
					}					
			}
		});
		Button1.setBounds(0, 135, 145, 85);
		contentPane.add(Button1);

		JButton Button4 = new JButton("");
		Button4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button4.addMouseListener(new MouseAdapter() {
			int posicion = 4;

			@Override
			public void mousePressed(MouseEvent e) {
				pressButton(board, Button4, posicion, lblNewLabel_1, lblNewLabel_3, avatar);
				if (board.getGanador()) {
					JFrame win = new Win(board);
					win.setVisible(true);
					dispose();				
					}
			}
		});
		Button4.setBounds(0, 230, 145, 85);
		contentPane.add(Button4);
		JButton Button7 = new JButton("");
		Button7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button7.addMouseListener(new MouseAdapter() {
			int posicion = 7;

			@Override
			public void mousePressed(MouseEvent e) {

				pressButton(board, Button7, posicion, lblNewLabel_1, lblNewLabel_3, avatar);
				if (board.getGanador()) {
					JFrame win = new Win(board);
					win.setVisible(true);
					dispose();				
					}

			}
		});
		Button7.setBounds(0, 325, 145, 85);
		contentPane.add(Button7);

		JButton Button2 = new JButton("");
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button2.addMouseListener(new MouseAdapter() {
			int posicion = 2;

			@Override
			public void mousePressed(MouseEvent e) {
					
				pressButton(board, Button2, posicion, lblNewLabel_1, lblNewLabel_3, avatar);
				if (board.getGanador()) {
					JFrame win = new Win(board);
					win.setVisible(true);
					dispose();				
					}
			}
		});
		Button2.setBounds(155, 135, 145, 85);
		contentPane.add(Button2);

		JButton Button3 = new JButton("");
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button3.addMouseListener(new MouseAdapter() {
			int posicion = 3;

			@Override
			public void mousePressed(MouseEvent e) {
				
				pressButton(board, Button3, posicion, lblNewLabel_1, lblNewLabel_3, avatar);
				if (board.getGanador()) {
					JFrame win = new Win(board);
					win.setVisible(true);
					dispose();				
					}
			}
		});
		Button3.setBounds(310, 135, 145, 85);
		contentPane.add(Button3);

		JButton Button5 = new JButton("");
		Button5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button5.addMouseListener(new MouseAdapter() {
			int posicion = 5;

			@Override
			public void mousePressed(MouseEvent e) {

				pressButton(board, Button5, posicion, lblNewLabel_1, lblNewLabel_3, avatar);
				if (board.getGanador()) {
					JFrame win = new Win(board);
					win.setVisible(true);
					dispose();				
					}
			}
		});
		Button5.setBounds(155, 230, 145, 85);
		contentPane.add(Button5);

		JButton Button6 = new JButton("");
		Button6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button6.addMouseListener(new MouseAdapter() {
			int posicion = 6;

			@Override
			public void mousePressed(MouseEvent e) {
					
				pressButton(board, Button6, posicion, lblNewLabel_1, lblNewLabel_3, avatar);
				if (board.getGanador()) {
					JFrame win = new Win(board);
					win.setVisible(true);
					dispose();				
					}
			}
		});
		Button6.setBounds(310, 230, 145, 85);
		contentPane.add(Button6);

		JButton Button8 = new JButton("");
		Button8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button8.addMouseListener(new MouseAdapter() {
			int posicion = 8;

			@Override
			public void mousePressed(MouseEvent e) {
					
				pressButton(board, Button8, posicion, lblNewLabel_1, lblNewLabel_3, avatar);
				if (board.getGanador()) {
					JFrame win = new Win(board);
					win.setVisible(true);
					dispose();				
					}
			}
		});
		Button8.setBounds(155, 325, 145, 85);
		contentPane.add(Button8);

		JButton Button9 = new JButton("");
		Button9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button9.addMouseListener(new MouseAdapter() {
			int posicion = 9;

			@Override
			public void mousePressed(MouseEvent e) {

				pressButton(board, Button9, posicion, lblNewLabel_1, lblNewLabel_3, avatar);
				if (board.getGanador()) {
					JFrame win = new Win(board);
					win.setVisible(true);
					dispose();
				}
			}
		});
		Button9.setBounds(310, 325, 145, 85);
		contentPane.add(Button9);
		
	}
	
	public void pressButton(Board board, JButton button, int position,JLabel label1,JLabel label2, JLabel avatar) {
		String ficha = board.pressButton(position);
		if ( ficha != "") {
			if(ficha.equals("X")) {
				button.setIcon(cross);
				avatar.setIcon(board.getPlayer2());
			}
			else {
				button.setIcon(circle);
				avatar.setIcon(board.getPlayer1());
			}
			label1.setText(String.valueOf(board.getTurn()));
			label2.setText(board.returnPlayer());
		}
	}

}
