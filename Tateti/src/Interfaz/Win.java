package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Board;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Win extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Win frame = new Win(null);
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
	public Win(Board board) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel winner = new JLabel("");
		winner.setFont(new Font("Tahoma", Font.BOLD, 19));
		winner.setBounds(51, 72, 75, 30);
		contentPane.add(winner);
		
		JLabel lblNewLabel_1 = new JLabel("WIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(136, 72, 100, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel avatar = new JLabel("");
		avatar.setBounds(297, 50, 75, 75);
		contentPane.add(avatar);
		
		JButton restart = new JButton("Restart");
		restart.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFrame start = new Start ();
				start.setVisible(true);
				dispose();
			}
		});
		restart.setBounds(159, 189, 89, 23);
		contentPane.add(restart);
		
		if (board.getGanador()) {
			
			if (board.returnPlayer().equals("X")) {
				winner.setText("CROSS");
				avatar.setIcon(board.getPlayer1());
			}
			else {
				winner.setText("CIRCLE");
				avatar.setIcon(board.getPlayer2());
			}
			
			
		}
	}
}
