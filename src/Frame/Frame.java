import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Frame {
	
	private int turnCount = 100;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(55, 124, 180));
		frame.setFont(new Font("Constantia", Font.PLAIN, 30));
		frame.getContentPane().setFont(new Font("Constantia", Font.PLAIN, 30));
		frame.setBounds(10, 10, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCampaign = new JButton("Campaign");
		btnCampaign.setFont(new Font("Constantia", Font.PLAIN, 30));
		btnCampaign.setBackground(new Color(118, 182,227));
		btnCampaign.setBounds(1170, 16, 188, 50);
		frame.getContentPane().add(btnCampaign);
		
		JButton btnFundraise = new JButton("Fundraise");
		btnFundraise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFundraise.setFont(new Font("Constantia", Font.PLAIN, 30));
		btnFundraise.setBackground(new Color(118, 182,227));
		btnFundraise.setBounds(967, 16, 188, 50);
		frame.getContentPane().add(btnFundraise);
		
		JButton btnDig = new JButton("Dig");
		btnDig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDig.setFont(new Font("Constantia", Font.PLAIN, 30));
		btnDig.setBackground(new Color(118, 182,227));
		btnDig.setBounds(1375, 16, 188, 50);
		frame.getContentPane().add(btnDig);
		
		JLabel lblNewLabel = new JLabel( " Turns Left: "+ turnCount);
		lblNewLabel.setBackground(new Color(246, 194, 103));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Constantia", Font.PLAIN, 30));
		lblNewLabel.setBounds(15, 16, 209, 50);
		frame.getContentPane().add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setBackground(new Color(246, 194, 103));
		textArea.setFont(new Font("Constantia", Font.PLAIN, 20));
		textArea.setEditable(false);
		textArea.setBounds(15, 88, 633, 270);
		frame.getContentPane().add(textArea);
		
		JLabel lblCardDisplay = new JLabel("                  Card Display");
		lblCardDisplay.setOpaque(true);
		lblCardDisplay.setFont(new Font("Constantia", Font.ITALIC, 25));
		lblCardDisplay.setBackground(new Color(246, 194, 103));
		lblCardDisplay.setBounds(15, 378, 350, 450);
		frame.getContentPane().add(lblCardDisplay);
		
		JButton btnCard = new JButton("Card");
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCard.setFont(new Font("Constantia", Font.PLAIN, 30));
		btnCard.setBackground(Color.WHITE);
		btnCard.setBounds(1375, 778, 188, 50);
		frame.getContentPane().add(btnCard);
		
		JButton btnDirt = new JButton("Dirt");
		btnDirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDirt.setFont(new Font("Constantia", Font.PLAIN, 30));
		btnDirt.setBackground(new Color(177, 123, 43));
		btnDirt.setBounds(764, 778, 188, 50);
		frame.getContentPane().add(btnDirt);
		
		JButton button = new JButton("Card");
		button.setFont(new Font("Constantia", Font.PLAIN, 30));
		button.setBackground(Color.WHITE);
		button.setBounds(1170, 778, 188, 50);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Card");
		button_1.setFont(new Font("Constantia", Font.PLAIN, 30));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(967, 778, 188, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Dirt");
		button_2.setFont(new Font("Constantia", Font.PLAIN, 30));
		button_2.setBackground(new Color(177, 123, 43));
		button_2.setBounds(561, 778, 188, 50);
		frame.getContentPane().add(button_2);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setFont(new Font("Constantia", Font.PLAIN, 20));
		textArea_1.setEditable(false);
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(392, 529, 1171, 230);
		frame.getContentPane().add(textArea_1);
	}
}
