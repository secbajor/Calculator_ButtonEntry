import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class week2 extends JFrame implements ActionListener{

    JFrame frame = new JFrame("Calculator");
    JPanel pane = new JPanel(new FlowLayout());
    //new panel
    JTextArea text = new JTextArea(1,12);
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton plus = new JButton("+");
    JButton equals = new JButton("=");
    
    Double number1, number2, result;
    int addc=0, subc=0, multic=0, divc=0;
    
    
	public double number_reader()
    {
        Double num1;
        String a;
        a=text.getText();
        num1=Double.valueOf(a);
        return num1;
        //converts "a" from String to Double
    }
	
    week2()
    {
        super("Calculator");
        setBounds(600,300,175,254);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.add(pane);
        pane.add(text);
        pane.add(zero);
        pane.add(one);
        pane.add(two);
        pane.add(plus); 
        pane.add(equals);
        setVisible(true); // make frame visible
        
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        plus.addActionListener(this);
        equals.addActionListener(this);
    }
    
        public void actionPerformed(ActionEvent event)
        {
        	Object source=event.getSource();
        	
        	if(source==zero)
            {
                text.append("0");
            }
            if(source==one)
            {
                text.append("1");
            }
            if(source==two)
            {
                text.append("2");
            }
            if(source==plus)
            { 
            	number1=number_reader();
                text.setText("");
                addc=1;
                subc=0;
                multic=0;
                divc=0;
            }
            if(source==equals)
            {
                number2=number_reader();
                if(addc>0)
                {
                    result=number1+number2;
                    text.setText(Double.toString(result));
                }
            }
        	
        }


    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new week2();
	}

}
