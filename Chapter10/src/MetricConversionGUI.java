import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversionGUI {

	private JFrame frame;
	private JTextField in;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversionGUI window = new MetricConversionGUI();
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
	public MetricConversionGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 270, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comB = new JComboBox();
		comB.setModel(new DefaultComboBoxModel(new String[] {"Feet to Meters", "Inches to Centimeters", "Pounds to Kilograms", "Gallons to Liters"}));
		comB.setMaximumRowCount(8);
		comB.setToolTipText("");
		comB.setBounds(57, 72, 122, 36);
		frame.getContentPane().add(comB);
		
		JLabel out1 = new JLabel("");
		out1.setHorizontalAlignment(SwingConstants.CENTER);
		out1.setBounds(32, 191, 179, 29);
		frame.getContentPane().add(out1);
		
		in = new JTextField();
		in.setBounds(57, 111, 122, 29);
		frame.getContentPane().add(in);
		in.setColumns(10);
		
		JLabel prompt = new JLabel("Enter a number:");
		prompt.setHorizontalAlignment(SwingConstants.CENTER);
		prompt.setBounds(54, 31, 127, 14);
		frame.getContentPane().add(prompt);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setting = (String)comB.getSelectedItem();
				double a = Double.parseDouble(in.getText());
				if(setting == "Feet to Meters")
				{
					out1.setText(a + " feet is " + a * 0.3048 + " meters.");
				}
				else if(setting == "Inches to Centimeters")
				{
					out1.setText(a + " inches is " + a * 2.54 + " centimeters.");
				}
				else if(setting == "Pounds to Kilograms")
				{
					out1.setText(a + " pounds is " + a * 0.4536 + " kilograms.");
				}
				else if(setting == "Gallons to Liters")
				{
					out1.setText(a + " gallons is " + a * 4.5461 + " liters.");
				}
			}
		});
		submit.setBounds(57, 144, 122, 36);
		frame.getContentPane().add(submit);
		
		
		
		
	}
}
