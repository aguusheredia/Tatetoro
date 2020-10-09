package Interfaz;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import Logica.Board;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Game {

	private JFrame frame;
	private Board board = new Board();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
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
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 472, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image image1 = new ImageIcon(this.getClass().getResource("/circle.png")).getImage();
		
		JLabel lblNewLabel = new JLabel("TURN :");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 65, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(String.valueOf(board.getTurn()));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(85, 11, 21, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PLAYER :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_2.setBounds(330, 11, 85, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_3.setBounds(425, 11, 21, 20);
		frame.getContentPane().add(lblNewLabel_3);

		JButton Button1 = new JButton("");
		Button1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button1.addMouseListener(new MouseAdapter() {
			int posicion = 1;

			@Override
			public void mouseClicked(MouseEvent e) {
				
				pressButton(Button1, posicion, lblNewLabel_1, lblNewLabel_3);
				if (board.getGanador()) {
					System.exit(0);
				}							//Accion a realizar una vez que se encuentra un ganador
			}
		});
		Button1.setBounds(0, 135, 145, 85);
		frame.getContentPane().add(Button1);

		JButton Button4 = new JButton("");
		Button4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button4.addMouseListener(new MouseAdapter() {
			int posicion = 4;

			@Override
			public void mouseClicked(MouseEvent e) {
				pressButton(Button4, posicion, lblNewLabel_1, lblNewLabel_3);
				if (board.getGanador()) {
					System.exit(0);
				}
			}
		});
		Button4.setBounds(0, 230, 145, 85);
		frame.getContentPane().add(Button4);
		JButton Button7 = new JButton("");
		Button7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button7.addMouseListener(new MouseAdapter() {
			int posicion = 7;

			@Override
			public void mouseClicked(MouseEvent e) {

				pressButton(Button7, posicion, lblNewLabel_1, lblNewLabel_3);
				if (board.getGanador()) {
					System.exit(0);
				}

			}
		});
		Button7.setBounds(0, 325, 145, 85);
		frame.getContentPane().add(Button7);

		JButton Button2 = new JButton("");
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button2.addMouseListener(new MouseAdapter() {
			int posicion = 2;

			@Override
			public void mouseClicked(MouseEvent e) {
					
				pressButton(Button2, posicion, lblNewLabel_1, lblNewLabel_3);
				if (board.getGanador()) {
					System.exit(0);
				}
			}
		});
		Button2.setBounds(155, 135, 145, 85);
		frame.getContentPane().add(Button2);

		JButton Button3 = new JButton("");
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button3.addMouseListener(new MouseAdapter() {
			int posicion = 3;

			@Override
			public void mouseClicked(MouseEvent e) {
				
				pressButton(Button3, posicion, lblNewLabel_1, lblNewLabel_3);
				if (board.getGanador()) {
					System.exit(0);
				}
			}
		});
		Button3.setBounds(310, 135, 145, 85);
		frame.getContentPane().add(Button3);

		JButton Button5 = new JButton("");
		Button5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button5.addMouseListener(new MouseAdapter() {
			int posicion = 5;

			@Override
			public void mouseClicked(MouseEvent e) {

				pressButton(Button5, posicion, lblNewLabel_1, lblNewLabel_3);
				if (board.getGanador()) {
					System.exit(0);
				}
			}
		});
		Button5.setBounds(155, 230, 145, 85);
		frame.getContentPane().add(Button5);

		JButton Button6 = new JButton("");
		Button6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button6.addMouseListener(new MouseAdapter() {
			int posicion = 6;

			@Override
			public void mouseClicked(MouseEvent e) {
					
				pressButton(Button6, posicion, lblNewLabel_1, lblNewLabel_3);
				if (board.getGanador()) {
					System.exit(0);
				}
			}
		});
		Button6.setBounds(310, 230, 145, 85);
		frame.getContentPane().add(Button6);

		JButton Button8 = new JButton("");
		Button8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button8.addMouseListener(new MouseAdapter() {
			int posicion = 8;

			@Override
			public void mouseClicked(MouseEvent e) {
					
				pressButton(Button8, posicion, lblNewLabel_1, lblNewLabel_3);
				if (board.getGanador()) {
					System.exit(0);
				}
			}
		});
		Button8.setBounds(155, 325, 145, 85);
		frame.getContentPane().add(Button8);

		JButton Button9 = new JButton("");
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Button9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button9.addMouseListener(new MouseAdapter() {
			int posicion = 9;

			@Override
			public void mouseClicked(MouseEvent e) {

				pressButton(Button9, posicion, lblNewLabel_1, lblNewLabel_3);
				if (board.getGanador()) {
					System.exit(0);
				}
			}
		});
		Button9.setBounds(310, 325, 145, 85);
		frame.getContentPane().add(Button9);
	}
		
	
	public void pressButton(JButton button, int position,JLabel label1,JLabel label2) {
		String ficha = board.pressButton(position);
		if ( ficha != "") {
			if(ficha == "X") {
				button.setForeground(Color.BLUE);
			}
			else {
				button.setForeground(Color.RED);
			}
			button.setText(ficha);
			//button.setEnabled(false);
			label1.setText(String.valueOf(board.getTurn()));
			label2.setText(board.returnPlayer());
		}
	}
}
