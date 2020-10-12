package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Board;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Images extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Images frame = new Images(null);
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
	public Images(Board board) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Select X Icon");
		title.setFont(new Font("Tahoma", Font.PLAIN, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(84, 11, 250, 20);
		contentPane.add(title);
		
		JLabel avatar1 = new JLabel("");
		ImageIcon avatar1Icon = new ImageIcon("Images/avatar1.png");
		avatar1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecIcon(board, avatar1Icon, title);
			}
		});
		avatar1.setBounds(46, 48, 75, 75);
		avatar1.setIcon(avatar1Icon);
		contentPane.add(avatar1);
		
		JLabel avatar2 = new JLabel("");
		ImageIcon avatar2Icon = new ImageIcon("Images/avatar2.png");
		avatar2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecIcon(board, avatar2Icon, title);
			}
		});
		avatar2.setBounds(170, 48, 75, 75);
		avatar2.setIcon(avatar2Icon);
		contentPane.add(avatar2);
		
		JLabel avatar3 = new JLabel("");
		ImageIcon avatar3Icon = new ImageIcon("Images/avatar3.png");
		avatar3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecIcon(board, avatar3Icon, title);
			}
		});
		avatar3.setBounds(306, 48, 75, 75);
		avatar3.setIcon(avatar3Icon);
		contentPane.add(avatar3);
		
		JLabel avatar4 = new JLabel("");
		ImageIcon avatar4Icon = new ImageIcon("Images/avatar4.png");
		avatar4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecIcon(board, avatar4Icon, title);
			}
		});
		avatar4.setBounds(46, 138, 75, 75);
		avatar4.setIcon(avatar4Icon);
		contentPane.add(avatar4);
		
		JLabel avatar5 = new JLabel("");
		ImageIcon avatar5Icon = new ImageIcon("Images/avatar5.png");
		avatar5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecIcon(board, avatar5Icon, title);
			}
		});
		avatar5.setBounds(170, 138, 75, 75);
		avatar5.setIcon(avatar5Icon);
		contentPane.add(avatar5);
		
		JLabel avatar6 = new JLabel("");
		ImageIcon avatar6Icon = new ImageIcon("Images/avatar6.png");
		avatar6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecIcon(board, avatar6Icon, title);
			}
		});
		avatar6.setBounds(306, 138, 75, 75);
		avatar6.setIcon(avatar6Icon);
		contentPane.add(avatar6);
		
	}
	
	public void selecIcon (Board board, ImageIcon avatar, JLabel title) {
		if (board.getPlayer1() == null) {
			board.setPlayer1(avatar);
			title.setText("Select O Icon");
			return;
		}
		else {
			board.setPlayer2(avatar);
			JFrame game = new Game (board);
			game.setVisible(true);
			dispose();
			return;
		}
	}
}
