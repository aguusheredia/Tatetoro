package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HTP extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HTP frame = new HTP();
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
	public HTP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				contentPane.setVisible(false);
//				Frame[] frames = Frame.getFrames();
//				for (Frame fr : frames) {
//					String name = fr.getClass().getName();
//					if(name.equals("Interfaz.Menu")) {
//						fr.setVisible(true);
//						contentPane.setVisible(false);
//					}
//				}
			}
		});
		btnNewButton.setBounds(25, 225, 90, 25);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("BankGothic Md BT", Font.BOLD, 13));
		contentPane.add(btnNewButton);
	}
}