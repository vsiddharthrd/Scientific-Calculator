package scientificCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(99, 10, 179, 33);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(10, 53, 354, 63);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.setEnabled(false);
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRoot.setBounds(10, 145, 63, 63);
		contentPane.add(btnRoot);
		
		JButton btnOneBy = new JButton("1/x");
		btnOneBy.setEnabled(false);
		btnOneBy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnOneBy.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOneBy.setBounds(10, 209, 63, 63);
		contentPane.add(btnOneBy);
		
		JButton btnXPowerY = new JButton("x^y");
		btnXPowerY.setEnabled(false);
		btnXPowerY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnXPowerY.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXPowerY.setBounds(10, 273, 63, 63);
		contentPane.add(btnXPowerY);
		
		JButton btnCube = new JButton("x^3");
		btnCube.setEnabled(false);
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a * a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCube.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCube.setBounds(10, 337, 63, 63);
		contentPane.add(btnCube);
		
		JButton btnSquare = new JButton("x^2");
		btnSquare.setEnabled(false);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSquare.setBounds(10, 402, 63, 63);
		contentPane.add(btnSquare);
		
		JButton btnFactorial = new JButton("n!");
		btnFactorial.setEnabled(false);
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while (a != 0) {
					fact = fact * a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText() + fact);
			}
		});
		btnFactorial.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnFactorial.setBounds(10, 467, 63, 63);
		contentPane.add(btnFactorial);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlusMinus.setBounds(10, 530, 63, 63);
		contentPane.add(btnPlusMinus);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(83, 467, 63, 63);
		contentPane.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBounds(83, 530, 136, 63);
		contentPane.add(btn0);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDiv.setBounds(301, 467, 63, 63);
		contentPane.add(btnDiv);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(156, 467, 63, 63);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(229, 467, 63, 63);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(83, 402, 63, 63);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(156, 402, 63, 63);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(229, 402, 63, 63);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(83, 337, 63, 63);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(156, 337, 63, 63);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(229, 337, 63, 63);
		contentPane.add(btn9);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setEnabled(false);
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPoint.setBounds(229, 530, 63, 63);
		contentPane.add(btnPoint);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setEnabled(false);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMultiply.setBounds(301, 402, 63, 63);
		contentPane.add(btnMultiply);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSub.setBounds(301, 337, 63, 63);
		contentPane.add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnAdd.setBounds(301, 273, 63, 63);
		contentPane.add(btnAdd);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "X^Y") {
					double resultt = 1;
					for (int i = 0; i < second; i++) {
						resultt = first * resultt;
					}
					answer = String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEqual.setBounds(301, 530, 63, 63);
		contentPane.add(btnEqual);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setEnabled(false);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 25));
		btnBackspace.setBounds(229, 273, 63, 63);
		contentPane.add(btnBackspace);
		
		JButton btnClear = new JButton("c");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(156, 273, 63, 63);
		contentPane.add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPercent.setBounds(83, 273, 63, 63);
		contentPane.add(btnPercent);
		
		JButton btnLog = new JButton("log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLog.setBounds(83, 209, 63, 63);
		contentPane.add(btnLog);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSinh.setBounds(156, 209, 63, 63);
		contentPane.add(btnSinh);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCosh.setBounds(229, 209, 63, 63);
		contentPane.add(btnCosh);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTanh.setBounds(301, 209, 63, 63);
		contentPane.add(btnTanh);
		
		JButton btnTan = new JButton("tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTan.setBounds(301, 145, 63, 63);
		contentPane.add(btnTan);
		
		JButton btnCos = new JButton("cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCos.setBounds(229, 145, 63, 63);
		contentPane.add(btnCos);
		
		JButton btnSin = new JButton("sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSin.setBounds(156, 145, 63, 63);
		contentPane.add(btnSin);
		
		JButton btnExp = new JButton("e^x");
		btnExp.setEnabled(false);
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnExp.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExp.setBounds(83, 145, 63, 63);
		contentPane.add(btnExp);
		
		JRadioButton rdbtnOn = new JRadioButton("On");
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRoot.setEnabled(true);
				btnOneBy.setEnabled(true);
				btnXPowerY.setEnabled(true);
				btnCube.setEnabled(true);
				btnSquare.setEnabled(true);
				btnFactorial.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btn1.setEnabled(true);
				btn0.setEnabled(true);
				btnDiv.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnPoint.setEnabled(true);
				btnMultiply.setEnabled(true);
				btnSub.setEnabled(true);
				btnAdd.setEnabled(true);
				btnEqual.setEnabled(true);
				btnBackspace.setEnabled(true);
				btnClear.setEnabled(true);
				btnPercent.setEnabled(true);
				btnLog.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnTan.setEnabled(true);
				btnCos.setEnabled(true);
				btnSin.setEnabled(true);
				btnExp.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnOn.setBounds(10, 122, 39, 21);
		contentPane.add(rdbtnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("Off");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btnRoot.setEnabled(false);
				btnOneBy.setEnabled(false);
				btnXPowerY.setEnabled(false);
				btnCube.setEnabled(false);
				btnSquare.setEnabled(false);
				btnFactorial.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btn1.setEnabled(false);
				btn0.setEnabled(false);
				btnDiv.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnPoint.setEnabled(false);
				btnMultiply.setEnabled(false);
				btnSub.setEnabled(false);
				btnAdd.setEnabled(false);
				btnEqual.setEnabled(false);
				btnBackspace.setEnabled(false);
				btnClear.setEnabled(false);
				btnPercent.setEnabled(false);
				btnLog.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnTan.setEnabled(false);
				btnCos.setEnabled(false);
				btnSin.setEnabled(false);
				btnExp.setEnabled(false);
				textField.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnOff.setBounds(51, 122, 41, 21);
		contentPane.add(rdbtnOff);
	}
}
