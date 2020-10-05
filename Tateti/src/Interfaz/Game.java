package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Logica.Board;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;


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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton Button1 = new JButton("");
		Button1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button1.addMouseListener(new MouseAdapter() {
			int posicion = 1;

			@Override
			public void mouseClicked(MouseEvent e) {
				
				pressButton(Button1, posicion);
				if (board.getGanador())
					System.exit(0);		//Accion a realizar una vez que se encuentra un ganador
			}
		});
		Button1.setBounds(0, 0, 145, 92);
		frame.getContentPane().add(Button1);

		JButton Button4 = new JButton("");
		Button4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button4.addMouseListener(new MouseAdapter() {
			int posicion = 4;

			@Override
			public void mouseClicked(MouseEvent e) {
				pressButton(Button4, posicion);
				if (board.getGanador())
					System.exit(0);
			}
		});
		Button4.setBounds(0, 93, 146, 82);
		frame.getContentPane().add(Button4);
		JButton Button7 = new JButton("");
		Button7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button7.addMouseListener(new MouseAdapter() {
			int posicion = 7;

			@Override
			public void mouseClicked(MouseEvent e) {

				pressButton(Button7, posicion);
				if (board.getGanador())
					System.exit(0);

			}
		});
		Button7.setBounds(0, 175, 146, 86);
		frame.getContentPane().add(Button7);

		JButton Button2 = new JButton("");
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button2.addMouseListener(new MouseAdapter() {
			int posicion = 2;

			@Override
			public void mouseClicked(MouseEvent e) {
					
				pressButton(Button2, posicion);
				if (board.getGanador())
					System.exit(0);
			}
		});
		Button2.setBounds(144, 0, 146, 92);
		frame.getContentPane().add(Button2);

		JButton Button3 = new JButton("");
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button3.addMouseListener(new MouseAdapter() {
			int posicion = 3;

			@Override
			public void mouseClicked(MouseEvent e) {
				
				pressButton(Button3, posicion);
				if (board.getGanador())
					System.exit(0);
			}
		});
		Button3.setBounds(289, 0, 145, 92);
		frame.getContentPane().add(Button3);

		JButton Button5 = new JButton("");
		Button5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button5.addMouseListener(new MouseAdapter() {
			int posicion = 5;

			@Override
			public void mouseClicked(MouseEvent e) {

				pressButton(Button5, posicion);
				if (board.getGanador())
					System.exit(0);
			}
		});
		Button5.setBounds(144, 93, 146, 82);
		frame.getContentPane().add(Button5);

		JButton Button6 = new JButton("");
		Button6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button6.addMouseListener(new MouseAdapter() {
			int posicion = 6;

			@Override
			public void mouseClicked(MouseEvent e) {
					
				pressButton(Button6, posicion);
				if (board.getGanador())
					System.exit(0);
			}
		});
		Button6.setBounds(289, 93, 145, 82);
		frame.getContentPane().add(Button6);

		JButton Button8 = new JButton("");
		Button8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button8.addMouseListener(new MouseAdapter() {
			int posicion = 8;

			@Override
			public void mouseClicked(MouseEvent e) {
					
				pressButton(Button8, posicion);
				if (board.getGanador())
					System.exit(0);

			}
		});
		Button8.setBounds(145, 175, 145, 86);
		frame.getContentPane().add(Button8);

		JButton Button9 = new JButton("");
		Button9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Button9.addMouseListener(new MouseAdapter() {
			int posicion = 9;

			@Override
			public void mouseClicked(MouseEvent e) {

				pressButton(Button9, posicion);
				if (board.getGanador())
					System.exit(0);
			}
		});
		Button9.setBounds(289, 175, 145, 88);
		frame.getContentPane().add(Button9);
	}
	
	public void pressButton(JButton button, int position) {
		String ficha = board.pressButton(position);
		if ( ficha != "") {
			button.setText(ficha);
		}
	}
}
