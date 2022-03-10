									Header?

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlateGUI implements ActionListener {
static final String FIRST_PRIZE = "tiger plush";
static final String CONSOLATION_PRIZE = "sticker";
GameBooth breakAPlate;

ImageIcon plateImage = new ImageIcon("..\\Chapter10\\plates.gif");
ImageIcon plates_all_broken = new ImageIcon("..\\Chapter10\\\\plates_all_broken.gif");
ImageIcon plates_two_broken = new ImageIcon("..\\Chapter10\\plates_two_broken.gif");
ImageIcon tiger_plush = new ImageIcon("..\\Chapter10\\tiger_plush.gif");
ImageIcon sticker = new ImageIcon("..\\Chapter10\\sticker.gif");
ImageIcon placeholder = new ImageIcon("..\\Chapter10\\placeholoder.gif");

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlateGUI window = new BreakAPlateGUI();
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
	public BreakAPlateGUI() {
		breakAPlate = new GameBooth (0, FIRST_PRIZE, CONSOLATION_PRIZE);
		
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
		
		//JLabel plates = new JLabel(new ImageIcon("plates.gif"));
		JLabel plates = new JLabel(); 
		plates.setHorizontalAlignment(SwingConstants.CENTER);
		plates.setBounds(67, 11, 281, 88);
		plates.setIcon(plateImage);
		frame.getContentPane().add(plates);
	
		JLabel prizeWon = new JLabel("");
		prizeWon.setHorizontalAlignment(SwingConstants.CENTER);
		prizeWon.setBounds(136, 133, 144, 117);
		frame.getContentPane().add(prizeWon);
		
		JButton play = new JButton("PLAY");
		play.setActionCommand("Play");
		play.addActionListener(this);
		play.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event) 
			{
				
				
				String eventName = event.getActionCommand();
				String prize;
				
				if(eventName == "Play")
				{
					prize = breakAPlate.Start();
					if(prize.equals(FIRST_PRIZE))
					{
						plates.setIcon(plates_all_broken);
						prizeWon.setIcon(tiger_plush);
					}
					else if(prize.equals(CONSOLATION_PRIZE))
					{
						plates.setIcon(plates_two_broken);
						prizeWon.setIcon(sticker);
					}
					
					
					play.setText("Play Again");
					play.setActionCommand("Play Again");
				}
				else if(eventName == "Play Again")
				{
					plates.setIcon(plateImage);
					prizeWon.setIcon(placeholder);
					play.setText("PLay");
					play.setActionCommand("Play");
				}
				
				
				
				
			}
		});
		play.setBounds(136, 99, 144, 23);
		frame.getContentPane().add(play);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
