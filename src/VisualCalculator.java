import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double entryFirst, entrySecond, result;
	String answer, operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 294, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(165, 42, 42));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 36));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(0, 0, 276, 147);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btnNewButton = new JButton("4");
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numEnter = textField.getText() + btnNewButton.getText();
				textField.setText(numEnter);
			}
		});
		btnNewButton.setBounds(2, 253, 61, 53);
		frame.getContentPane().add(btnNewButton);
		
		final JButton button = new JButton("5");
		button.setBackground(new Color(47, 79, 79));
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numEnter = textField.getText() + button.getText();
				textField.setText(numEnter);
			}
		});
		button.setBounds(73, 253, 61, 53);
		frame.getContentPane().add(button);
		
		final JButton button_1 = new JButton("6");
		button_1.setBackground(new Color(47, 79, 79));
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numEnter = textField.getText() + button_1.getText();
				textField.setText(numEnter);
			}
		});
		button_1.setBounds(144, 253, 61, 53);
		frame.getContentPane().add(button_1);
		
		final JButton button_2 = new JButton("1");
		button_2.setBackground(new Color(47, 79, 79));
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numEnter = textField.getText() + button_2.getText();
				textField.setText(numEnter);
			}
		});
		button_2.setBounds(2, 307, 61, 53);
		frame.getContentPane().add(button_2);
		
		final JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numEnter = textField.getText() + button_3.getText();
				textField.setText(numEnter);
			}
		});
		button_3.setBackground(new Color(47, 79, 79));
		button_3.setForeground(new Color(255, 255, 255));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(73, 307, 61, 53);
		frame.getContentPane().add(button_3);
		
		final JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numEnter = textField.getText() + button_4.getText();
				textField.setText(numEnter);
			}
		});
		button_4.setBackground(new Color(47, 79, 79));
		button_4.setForeground(new Color(255, 255, 255));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(144, 307, 61, 53);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("+");
		button_5.setBackground(new Color(204, 255, 255));
		button_5.setForeground(new Color(0, 128, 128));
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryFirst = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		button_5.setBounds(215, 253, 61, 53);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("%");
		button_6.setBackground(new Color(204, 255, 255));
		button_6.setForeground(new Color(0, 128, 128));
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryFirst = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		button_6.setBounds(215, 307, 61, 53);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("-");
		button_7.setBackground(new Color(204, 255, 255));
		button_7.setForeground(new Color(0, 128, 128));
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryFirst = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		button_7.setBounds(215, 200,  61, 53);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("\uF0E7");
		button_8.setBackground(new Color(204, 255, 255));
		button_8.setForeground(new Color(0, 128, 128));
		button_8.setFont(new Font("Wingdings", Font.BOLD, 15));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String back = null;
				
				if(textField.getText().length()> 0){
					StringBuilder stb = new StringBuilder(textField.getText());
					stb.deleteCharAt(textField.getText().length()-1);
					back = stb.toString();
					textField.setText(back);
				}
			}
		});
		button_8.setBounds(215, 148, 61, 53);
		frame.getContentPane().add(button_8);
		
		final JButton button_9 = new JButton("7");
		button_9.setBackground(new Color(47, 79, 79));
		button_9.setForeground(new Color(255, 255, 255));
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numEnter = textField.getText() + button_9.getText();
				textField.setText(numEnter);
			}
		});
		button_9.setBounds(2, 200, 61, 53);
		frame.getContentPane().add(button_9);
		
		final JButton button_10 = new JButton("8");
		button_10.setBackground(new Color(47, 79, 79));
		button_10.setForeground(new Color(255, 255, 255));
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numEnter = textField.getText() + button_10.getText();
				textField.setText(numEnter);
			}
		});
		button_10.setBounds(73, 200, 61, 53);
		frame.getContentPane().add(button_10);
		
		JButton button_12 = new JButton("C");
		button_12.setBackground(new Color(204, 255, 255));
		button_12.setForeground(new Color(0, 128, 128));
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		button_12.setBounds(2, 147, 61, 53);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.setBackground(new Color(204, 255, 255));
		button_13.setForeground(new Color(0, 128, 128));
		button_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryFirst = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		button_13.setBounds(73, 147, 61, 53);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("X");
		button_14.setBackground(new Color(204, 255, 255));
		button_14.setForeground(new Color(0, 128, 128));
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entryFirst = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "X";
			}
		});
		button_14.setBounds(144, 147, 61, 53);
		frame.getContentPane().add(button_14);
		
		final JButton button_15 = new JButton("0");
		button_15.setBackground(new Color(47, 79, 79));
		button_15.setForeground(new Color(255, 255, 255));
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numEnter = textField.getText() + button_15.getText();
				textField.setText(numEnter);
			}
		});
		button_15.setBounds(2, 359, 61, 53);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.setBackground(new Color(47, 79, 79));
		button_16.setForeground(new Color(255, 255, 255));
		button_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setBounds(73, 359, 61, 53);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("+ / -");
		button_17.setBackground(new Color(47, 79, 79));
		button_17.setForeground(new Color(255, 255, 255));
		button_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double plusMinus = Double.parseDouble(String.valueOf(textField.getText()));
				plusMinus = plusMinus * (-1);
				textField.setText(String.valueOf(plusMinus));
			}	
		});
		button_17.setBounds(144, 359, 61, 53);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("=");
		
		
		
		
		
		
		button_18.setBackground(new Color(204, 255, 255));
		button_18.setForeground(new Color(0, 128, 128));
		button_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				entrySecond = Double.parseDouble(textField.getText());
				if (operations == "+"){
					result = entryFirst + entrySecond;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "-"){
					result = entryFirst - entrySecond;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "X"){
					result = entryFirst * entrySecond;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "/"){
					result = entryFirst / entrySecond;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "%"){
					result = entryFirst % entrySecond;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		button_18.setBounds(215, 359, 61, 53);
		frame.getContentPane().add(button_18);
		
		final JButton button_19 = new JButton("9");
		button_19.setBackground(new Color(47, 79, 79));
		button_19.setForeground(new Color(255, 255, 255));
		button_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numEnter = textField.getText() + button_19.getText();
				textField.setText(numEnter);
			}
		});
		button_19.setBounds(144, 200, 61, 53);
		frame.getContentPane().add(button_19);
	}
}
