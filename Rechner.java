package rechner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Rechner {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblX;
	private JLabel lblB;
	private JTextField textField_2;
	private JLabel lblErgebnis;
	private JButton btnNewButton;
	private JButton btnNewButton_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner window = new Rechner();
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
	public Rechner() {
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
		
		textField = new JTextField();
		textField.setBounds(77, 53, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(280, 53, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblX = new JLabel("a");
		lblX.setBounds(46, 56, 21, 14);
		frame.getContentPane().add(lblX);
		
		lblB = new JLabel("b");
		lblB.setBounds(246, 56, 21, 14);
		frame.getContentPane().add(lblB);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 118, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblErgebnis = new JLabel("Ergebnis");
		lblErgebnis.setBounds(92, 121, 71, 14);
		frame.getContentPane().add(lblErgebnis);
		
		btnNewButton = new JButton("Plus");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,ergebnis;
				
				try{
					a = Integer.parseInt(textField.getText());
					b = Integer.parseInt(textField_1.getText());
					ergebnis = a + b;
					textField_2.setText(Integer.toString(ergebnis));
				}catch(Exception exc){
					JOptionPane.showMessageDialog(null, "Bitte eine Zahl eingeben");
				}
				
			}
		});
		btnNewButton.setBounds(74, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int a,b,ergebnis;
				try{
					a = Integer.parseInt(textField.getText());
					b = Integer.parseInt(textField_1.getText());
					ergebnis = a - b;
					textField_2.setText(Integer.toString(ergebnis));
				}catch(Exception exc){
					JOptionPane.showMessageDialog(null, "Bitte eine Zahl eingeben");
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(277, 181, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	}
}

