
							Header?
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DivisibleBy3GUI {

	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3GUI window = new DivisibleBy3GUI();
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
	public DivisibleBy3GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 501, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(48, 33, 410, 20);
		panel.add(tf);
		tf.setColumns(10);
		
		JLabel lb = new JLabel("");
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lb.setBounds(48, 145, 410, 70);
		panel.add(lb);
		
	JButton submit = new JButton("SUBMIT");
		submit.setFont(new Font("Tahoma", Font.BOLD, 22));
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String msg = tf.getText();
				int dIN = Integer.parseInt(msg);
				if(dIN % 3 == 0)
				{
					lb.setText(tf.getText() + " is divisible by 3.");
				}
				else
				{
					lb.setText(tf.getText() + " is not divisible by 3.");
				}
			}
		});
	submit.setBounds(171, 64, 146, 70);
		panel.add(submit);
		
		JLabel prompt = new JLabel("Enter an integer:");
		prompt.setHorizontalAlignment(SwingConstants.CENTER);
		prompt.setBounds(48, 11, 410, 14);
		panel.add(prompt);
	
	}
}
