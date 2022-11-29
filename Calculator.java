import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class Calculator implements ActionListener
{
	JFrame fr;
	JButton b1,b2,b3,b4,b5;
	JPanel pa;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	public Calculator()
	{
		fr = new JFrame("Calculator");
		fr.setSize(600,600);
		pa = new JPanel();
		pa.setLayout(null);
		fr.add(pa);
		
		l1 = new JLabel("First Number");
		l2 = new JLabel("Second Number");
		l3 = new JLabel("Result");
		
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		t3 = new JTextField(15);
		
		
		b1 = new JButton("ADD");
		b2 = new JButton("SUB");
		b3 = new JButton("MUL");
		b4 = new JButton("DIV");
		b5 = new JButton("CLR");
		
		l1.setBounds(100,100,150,30);
		t1.setBounds(270,100,150,30);
		l2.setBounds(100,140,150,30);
		t2.setBounds(270,140,150,30);
		l3.setBounds(100,180,150,30);
		t3.setBounds(270,180,150,30);
		
		b1.setBounds(100,240,80,30);
		b2.setBounds(180,240,80,30);
		b3.setBounds(260,240,80,30);
		b4.setBounds(340,240,80,30);
		b5.setBounds(420,240,80,30);
		pa.add(l1);pa.add(l2);pa.add(l3);
		pa.add(t1);pa.add(t2);pa.add(t3);
		pa.add(b1);pa.add(b2);pa.add(b3);
		pa.add(b4);pa.add(b5);
		fr.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt)
	{
		int num1,num2,res;
		num1=Integer.parseInt(t1.getText());
		num2=Integer.parseInt(t2.getText());
		if(evt.getSource()==b1)
		{
			res=num1+num2;
			t3.setText(String.valueOf(res));
		}
		if(evt.getSource()==b2)
		{
			res=num1-num2;
			t3.setText(String.valueOf(res));
		}
		if(evt.getSource()==b3)
		{
			res=num1*num2;
			t3.setText(String.valueOf(res));
		}
		if(evt.getSource()==b4)
		{
			res=num1/num2;
			t3.setText(String.valueOf(res));
		}
		if(evt.getSource()==b5)
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
		}
	}
	public static void main(String dd[])
	{
		Calculator rf = new Calculator();
	}
}