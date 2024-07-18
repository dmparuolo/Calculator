import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	
	
	double operationP = 0;
	double operationN = 0;
	double operationT = 0;
	String operator = "";
	double answer = 0;
	boolean dec = false;
	double dVal = .1;
	boolean sVal = true;
	
	ArrayList<JButton> buttonList = new ArrayList<JButton>();
	
	JButton zero = new JButton("0"); 
	JButton one = new JButton("1"); 
	JButton two = new JButton("2"); 
	JButton three = new JButton("3"); 
	JButton four = new JButton("4"); 
	JButton five = new JButton("5"); 
	JButton six = new JButton("6"); 
	JButton seven = new JButton("7"); 
	JButton eight = new JButton("8"); 
	JButton nine = new JButton("9"); 
	JButton decimal = new JButton("."); 
	JButton sign = new JButton("+-"); 
	JButton root = new JButton("√"); 
	JButton equals = new JButton("="); 
	JButton add = new JButton("+"); 
	JButton subtract = new JButton("-"); 
	JButton multiply = new JButton("X"); 
	JButton divide = new JButton("/"); 
	JButton delete = new JButton("⌫"); 
	JButton clear = new JButton("AC");
	
	JTextField text = new JTextField();
	
	String input = "";
	
	
	Font f = new Font("Courier", Font.BOLD, 40);
	int fx = 80;
	double dif = .9;
	
	Calculator(){
	
		JPanel buttons = new JPanel();
		buttons.setBounds(3, 144, 396, 498);
		buttons.setBackground(Color.BLACK);
	
		GridLayout buttonGrid = new GridLayout(5, 4, 2, 2);
		buttons.setLayout(buttonGrid);
		
		buttonList.add(clear);
		buttonList.add(delete);
		buttonList.add(sign);
		buttonList.add(divide);
		buttonList.add(seven);
		buttonList.add(eight);
		buttonList.add(nine);
		buttonList.add(multiply);
		buttonList.add(four);
		buttonList.add(five);
		buttonList.add(six);
		buttonList.add(subtract);
		buttonList.add(one);
		buttonList.add(two);
		buttonList.add(three);
		buttonList.add(add);
		buttonList.add(zero);
		buttonList.add(decimal);
		buttonList.add(root);
		buttonList.add(equals);
	
		
	
		for(int i = 0; i < 20; i++) {
			buttonList.get(i).setFocusPainted(false);
			buttonList.get(i).setOpaque(false);
			buttonList.get(i).setContentAreaFilled(false);
			buttonList.get(i).setFont(new Font("Courier", Font.BOLD, 40));
			buttonList.get(i).setForeground(Color.WHITE);
			buttonList.get(i).addActionListener(this);
			buttons.add(buttonList.get(i));
			
		}
		
		text.setEditable(false);
		text.setBounds(3, 4, 396, 125);
		text.setOpaque(false);
		text.setBorder(null);
		f = new Font("Courier", Font.BOLD, 80);
		text.setFont(f);
		text.setForeground(Color.WHITE);
		
		
		this.setSize(418, 684);
		this.getContentPane().setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(null);
		this.setTitle("Basic Calculator");
		this.add(buttons);
		this.add(text);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(input.length()>=8) {
			fx = (int) Math.round(fx*dif);
			f = new Font("Courier", Font.BOLD, fx);
			text.setFont(f);
			if(dif<.99) {
				dif+=.005;
			}
		}
		
		if(e.getSource()==clear) {
			input = "";
			text.setText(input);
			fx = 80;
			f = new Font("Courier", Font.BOLD, fx);
			text.setFont(f);
			operationP = 0;
			operationN = 0;
			operationT = 0;
			answer = 0;
			dVal = .1;
			operator = "";
			dif = .9;
			sVal = true;
			dec = false;
		}
		
		if(e.getSource()==zero) {
			input = input+"0";
			text.setText(input);
			if(dec) {
				operationN = operationN*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10;	
			}
		}
		
		if(e.getSource()==one) {
			input = input+"1";
			text.setText(input);
			if(dec) {
				operationN = operationN+1*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10 + 1;	
			}
			
		}
		
		if(e.getSource()==two) {
			input = input+"2";
			text.setText(input);
			if(dec) {
				operationN = operationN+2*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10 + 2;	
			}
		}
		
		if(e.getSource()==three) {
			input = input+"3";
			text.setText(input);
			if(dec) {
				operationN = operationN+3*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10 + 3;	
			}
		}
		
		if(e.getSource()==four) {
			input = input+"4";
			text.setText(input);
			if(dec) {
				operationN = operationN+4*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10 + 4;	
			}
		}
		
		if(e.getSource()==five) {
			input = input+"5";
			text.setText(input);
			if(dec) {
				operationN = operationN+5*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10 + 5;	
			}
		}
		
		if(e.getSource()==six) {
			input = input+"6";
			text.setText(input);
			if(dec) {
				operationN = operationN+6*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10 + 6;	
			}
		}
		
		if(e.getSource()==seven) {
			input = input+"7";
			text.setText(input);
			if(dec) {
				operationN = operationN+7*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10 + 7;	
			}
		}
		
		if(e.getSource()==eight) {
			input = input+"8";
			text.setText(input);
			if(dec) {
				operationN = operationN+8*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10 + 8;	
			}
		}
		
		if(e.getSource()==nine) {
			input = input+"9";
			text.setText(input);
			if(dec) {
				operationN = operationN+9*dVal;
				dVal*=.1;
			}else {
				operationP = operationP*10 + 9;	
			}
		}
		
		if(e.getSource()==decimal) {
			input = input+".";
			text.setText(input);
			dec = true;
		}
		
		if(e.getSource()==add) {
			operator = "+";
			if(operationT==0) {
				if(sVal) {
					operationT = operationP + operationN;
				}else {
					operationT = -1 * (operationP + operationN);
				}
			}
			input = "";
			text.setText(input);
			fx = 80;
			f = new Font("Courier", Font.BOLD, fx);
			text.setFont(f);
			operationP = 0;
			operationN = 0;
			dVal = .1;
			dif = .9;
			sVal = true;
			dec = false;
		}
		
		if(e.getSource()==subtract) {
			operator = "-";
			if(operationT==0) {
				if(sVal) {
					operationT = operationP + operationN;
				}else {
					operationT = -1 * (operationP + operationN);
				}
			}	
			input = "";
			text.setText(input);
			fx = 80;
			f = new Font("Courier", Font.BOLD, fx);
			text.setFont(f);
			operationP = 0;
			operationN = 0;
			dVal = .1;
			dif = .9;
			sVal = true;
			dec = false;
		}
		
		
		if(e.getSource()==multiply) {
			operator = "*";
			if(operationT==0) {
				if(sVal) {
					operationT = operationP + operationN;
				}else {
					operationT = -1 * (operationP + operationN);
				}
			}
			input = "";
			text.setText(input);
			fx = 80;
			f = new Font("Courier", Font.BOLD, fx);
			text.setFont(f);
			operationP = 0;
			operationN = 0;
			dVal = .1;
			dif = .9;
			sVal = true;
			dec = false;
		}

		if(e.getSource()==divide) {
			operator = "/";
			if(operationT==0) {
				if(sVal) {
					operationT = operationP + operationN;
				}else {
					operationT = -1 * (operationP + operationN);
				}
			}
			input = "";
			text.setText(input);
			fx = 80;
			f = new Font("Courier", Font.BOLD, fx);
			text.setFont(f);
			operationP = 0;
			operationN = 0;
			dVal = .1;
			dif = .9;
			sVal = true;
			dec = false;
		}

		if(e.getSource()==delete) {
			if(!input.equals("")) {
				if(dec) {
					dVal *= 10;
					operationN = ((operationN - (operationN%(dVal*10)))) * (dVal*10);
				}else {
					operationP = (operationP -(operationP%10)) / 10;
				}
				if(input.length()==1) {
					if(sVal == false) {
						sVal = true;
					}
					input = "";
				}else {
					input = input.substring(0,input.length()-1);
				}
			}
			text.setText(input);
		}
		
		if(e.getSource()==root) {
			if(operationT==0) {
				operationT = operationP + operationN;
			}
			answer = Math.sqrt(operationT);
			operationT = answer;
			if(sVal) {
				text.setText(Double.toString(answer));
			} else {
				text.setText(Double.toString(answer) + "i");
			}
			
		}
		
		if(e.getSource()==sign) {
			if(input.equals("")) {
				input = "-"+input;
			}else if(input.substring(0,1).equals("-")){
				input = input.substring(1);
			}else {
				input = "-"+input;
			}
			
			if(sVal) {
				sVal = false;
			} else {
				sVal = true;
			}
			text.setText(input);
		}
		
		if(e.getSource()==equals) {
			
			if(operator.equals("+")) {
				if(sVal) {
					answer = operationT + (operationP+operationN);
					operationP = 0;
					operationN = 0;
					operationT = answer;
					text.setText(Double.toString(answer));
				} else {
					answer = operationT + (-1*(operationP+operationN));
					operationP = 0;
					operationN = 0;
					operationT = answer;
					text.setText(Double.toString(answer));
				}
			}
			
			if(operator.equals("-")) {
				if(sVal) {
					answer = operationT - (operationP+operationN);
					operationP = 0;
					operationN = 0;
					operationT = answer;
					text.setText(Double.toString(answer));
				} else {
					answer = operationT - (-1*(operationP+operationN));
					operationP = 0;
					operationN = 0;
					operationT = answer;
					text.setText(Double.toString(answer));
				}
			}
			
			if(operator.equals("*")) {
				if(sVal) {
					answer = operationT * (operationP+operationN);
					operationP = 0;
					operationN = 0;
					operationT = answer;
					text.setText(Double.toString(answer));
				} else {
					answer = operationT * (-1*(operationP+operationN));
					operationP = 0;
					operationN = 0;
					operationT = answer;
					text.setText(Double.toString(answer));
				}
			}
			
			if(operator.equals("/")) {
				if(sVal) {
					answer = operationT / (operationP+operationN);
					operationT = answer;
					text.setText(Double.toString(answer));
				} else {
					answer = operationT / (-1*(operationP+operationN));
					operationT = answer;
					text.setText(Double.toString(answer));
				}
			}
						
		}
		
		if(Double.toString(answer).length()>=8) {
				fx = 80; dif = .9;
			for(int i = 8; i <= Double.toString(answer).length(); i++) {
				fx = (int) Math.round(fx*dif);
				f = new Font("Courier", Font.BOLD, fx);
				text.setFont(f);
				if(dif<.99) {
					dif+=.005;
				}
			}
		}
		
	}


	
}
