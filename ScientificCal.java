package Main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ScientificCal extends Frame implements ActionListener {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,eql,plus,minus,mul,div,close,sin,cos,tan,ln,log,x1,x2,x3,open,close1,expo,cama;
	TextField display;
	Panel p1,p2,p3;
	String s1="";
public ScientificCal() {
	//super(s);
	setSize(400,400);
	setLayout(new BorderLayout());
	display=new TextField(6);
	display.setBounds(20,50,280,50);
	add(display);
	p1=new Panel();
	p1.setBackground(Color.blue);
	p1.setBounds(20,125,280,200);
	add(p1);
	p2=new Panel();
	p2.setBackground(Color.red);
	p2.setBounds(310,125,100,200);
	add(p2);
	open=new Button("(");
	close1=new Button(")");
	x1=new Button("π");
	sin=new Button("sin");
	cos=new Button("cos");
	tan=new Button("tan");
	ln=new Button("ln");
	log=new Button("log10");
	expo=new Button("e");
	b1=new Button("1");
	b2=new Button("2");
	b3=new Button("3");
	b4=new Button("4");
	b5=new Button("5");
	b6=new Button("6");
	b7=new Button("7");
	b8=new Button("8");
	b9=new Button("9");
	b10=new Button("0");
	b11=new Button(".");
	x2=new Button("X!");
	x3=new Button(" x^y");
	cama=new Button("√");
	eql=new Button("=");
	plus=new Button("+");
	minus=new Button("-");
	mul=new Button("*");
	div=new Button("/");
	close=new Button("close");
	add(close,"South");
	p1.add(open);
	p1.add(close1);
	p1.add(x1);
	p1.add(sin);
	p1.add(cos);
	p1.add(tan);
	p1.add(ln);
	p1.add(log);
	p1.add(expo);
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);
	p1.add(b5);
	p1.add(b6);
	p1.add(b7);
	p1.add(b8);
	p1.add(b9);
	p1.add(b10);
	p1.add(b11);
	p1.add(eql);
	p1.setLayout(new GridLayout(7,4));
	p2.add(x2);
	p2.add(x3);
	p2.add(cama);
	p2.add(plus);
	p2.add(minus);
	p2.add(mul);
	p2.add(div);
	p2.setLayout(new GridLayout(7,1));
	p3=new Panel();
	p3.setBackground(Color.magenta);
	p3.setLayout(null);
	add(p3);
	open.addActionListener(this);
	close1.addActionListener(this);
	x1.addActionListener(this);
	sin.addActionListener(this);
	cos.addActionListener(this);
	tan.addActionListener(this);
	ln.addActionListener(this);
	log.addActionListener(this);
	expo.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);
	b11.addActionListener(this);
	close.addActionListener(this);
	eql.addActionListener(this);
	x2.addActionListener(this);
	x3.addActionListener(this);
	cama.addActionListener(this);
	plus.addActionListener(this);
	minus.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	setVisible(true);
	
	
}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==close) {
		dispose();
		}
	if(e.getSource()!=close&&e.getSource()!=eql) {
		String command = e.getActionCommand();
		s1=s1+command;
		display.setText(s1);
	}
	
	if(e.getSource()==eql) {
		char[] dis=display.getText().toCharArray();
		String s=display.getText();
		
		String operand1 = "";String operand2 = "";String operator = "";
	     int result = 0;
		for(int i=0;i<dis.length;i++) {
			if (dis[i] >= '0' && dis[i] <= '9' || dis[i] == '.') {
	            if(operator.isEmpty()){
	               operand1 += dis[i];
	            }else{
	               operand2 += dis[i];
	            }
			}else {
				operator=Character.toString(dis[i]);
			}
			}
		    if (operator.equals("+")) {
	            result = (Integer.parseInt(operand1) + Integer.parseInt(operand2));
	            //System.out.println(String.valueOf(result));
	            display.setText(String.valueOf(result));
	            }
	         else if (operator.equals("-")) {
	            result = (Integer.parseInt(operand1) - Integer.parseInt(operand2));
	            display.setText(String.valueOf(result));}
	         else if (operator.equals("/")) {
	            result = (Integer.parseInt(operand1) / Integer.parseInt(operand2));
	            display.setText(String.valueOf(result));}
	         else {
	            result = (Integer.parseInt(operand1) * Integer.parseInt(operand2));
	            display.setText(String.valueOf(result));}
		    
			
			
			
				
			
				
		}
	}
	
	
}
