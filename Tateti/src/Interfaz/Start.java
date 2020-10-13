package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Board;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 * @param game 
	 */
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton start = new JButton("Start");
		start.addMouseListener(new MouseAdapter() {
			@Override
			//Al presionar el boton start, crea el menu de imagenes del juego
			public void mouseClicked(MouseEvent e) {
				JFrame images = new Images (new Board());
				images.setVisible(true);
				dispose();
			}
		});
		start.setBounds(99, 227, 229, 23);
		contentPane.add(start);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 435, 260);
		background.setIcon (new ImageIcon ("Images/background.png"));
		contentPane.add(background);
	}
}
