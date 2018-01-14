
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;


public class Gui extends JFrame {
  /**
	 * 
	 */
	private static final long serialVersionUID = 3L;
private JTextField answerfield;
  private JButton one, two, three, four, five, six, seven, eight, nine, zero ,decimal , neg ,  add, sub, multiply, div, equals, clear, backspace, on, off; 
  private JLabel  l1,l2, l3, l4, l5, l6, l7, l8, l9, l10;
  private String first_number, second_number, sanswer;
  private double answer =0.0;
  private JPanel contentPanel;
  private boolean equalsClicked= false, opChosen= false;
  char operation= ' ';
  public Gui(){
      super("Calculator");
      
      answerfield= new JTextField();
      answerfield.setEditable(false);
  

      
      
      // BUTTONS
      one= new JButton("1");
      two= new JButton("2");
      three= new JButton("3");
      four= new JButton("4");
      five= new JButton("5");
      six= new JButton("6");
      seven= new JButton("7");
      eight= new JButton("8");
      nine= new JButton("9");
      zero= new JButton("0");
      decimal= new JButton(".");
      neg= new JButton("±");
      add= new JButton("+");
      sub= new JButton("-");
      multiply= new JButton("x");
      div= new JButton("÷");
      equals= new JButton("=");
      clear = new JButton("RESET");
      backspace = new JButton("DEL");
      l1 = new JLabel("");
      l2 = new JLabel("");
      l3 = new JLabel("");
      l4 = new JLabel("");
      l5 = new JLabel("");
      l6 = new JLabel("");
      l7 = new JLabel("");
      l8 = new JLabel("");
      l9 = new JLabel("");
      l10 = new JLabel("");
      on= new JButton("ON");
      off= new JButton("OFF");
      
      
      
      //DIMENSIONS
      answerfield.setPreferredSize(new Dimension(340,100));
      one.setPreferredSize(new Dimension(60,50));
      two.setPreferredSize(new Dimension(60,50));
      three.setPreferredSize(new Dimension(60,50));
      four.setPreferredSize(new Dimension(60,50));
      five.setPreferredSize(new Dimension(60,50));
      six.setPreferredSize(new Dimension(60,50));
      seven.setPreferredSize(new Dimension(60,50));
      eight.setPreferredSize(new Dimension(60,50));
      nine.setPreferredSize(new Dimension(60,50));
      zero.setPreferredSize(new Dimension(60,50));
      decimal.setPreferredSize(new Dimension(60,50));
      neg.setPreferredSize(new Dimension(60,50));
      add.setPreferredSize(new Dimension(60,50));
      sub.setPreferredSize(new Dimension(60,50));
      multiply.setPreferredSize(new Dimension(60,50));
      div.setPreferredSize(new Dimension(60,50));
      equals.setPreferredSize(new Dimension(60,50));
      clear.setPreferredSize(new Dimension(80,50));
      backspace.setPreferredSize(new Dimension(60,50));
      on.setPreferredSize(new Dimension(60,50));
      off.setPreferredSize(new Dimension(60,50));
      l1.setPreferredSize(new Dimension(60,50));
      l2.setPreferredSize(new Dimension(60,50));
      l3.setPreferredSize(new Dimension(60,50));
      l4.setPreferredSize(new Dimension(50,50));
      l5.setPreferredSize(new Dimension(50,50));
      l6.setPreferredSize(new Dimension(10,10));
      l7.setPreferredSize(new Dimension(10,10));
      l8.setPreferredSize(new Dimension(10,10));
      l9.setPreferredSize(new Dimension(10,10));
      l10 .setPreferredSize(new Dimension(10,10));
      
      Numbers n = new Numbers();
      Calc c = new Calc();
      
      
      //ACTIONLISTENERS
      one.addActionListener(n);two.addActionListener(n);three.addActionListener(n);
      four.addActionListener(n);five.addActionListener(n);six.addActionListener(n);
      seven.addActionListener(n);eight.addActionListener(n);nine.addActionListener(n);
      zero.addActionListener(n); decimal.addActionListener(n);neg.addActionListener(n);
      backspace.addActionListener(n); on.addActionListener(n); off.addActionListener(n);
     
      
      add.addActionListener(c);sub.addActionListener(c);multiply.addActionListener(c);
      div.addActionListener(c);equals.addActionListener(c);clear.addActionListener(c);
      
   
      //PANELS
      contentPanel= new JPanel();
      contentPanel.setBackground(Color.getHSBColor(6, 90, 293));
      contentPanel.setLayout(new FlowLayout());
      contentPanel.add(answerfield, BorderLayout.NORTH);
      contentPanel.add(l4);contentPanel.add(l5);contentPanel.add(clear);contentPanel.add(l10);contentPanel.add(on);contentPanel.add(off);
      contentPanel.add(seven);contentPanel.add(l6);contentPanel.add(eight);contentPanel.add(nine);contentPanel.add(l9);contentPanel.add(add);contentPanel.add(sub);
      contentPanel.add(four);contentPanel.add(five);contentPanel.add(six);contentPanel.add(l6);contentPanel.add(multiply);contentPanel.add(div);
      contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);contentPanel.add(l7);contentPanel.add(neg);contentPanel.add(l1);contentPanel.add(l2);
      contentPanel.add(zero);contentPanel.add(decimal);contentPanel.add(l8);contentPanel.add(backspace); contentPanel.add(equals);
      this.setContentPane(contentPanel);
        
      //NUMBERS
  }

    void setJFieldSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  private class Numbers implements ActionListener{
     public void actionPerformed(ActionEvent event){
        JButton src = (JButton) event.getSource(); 
        if(event.getSource()==on)
		{
			enable();
		}
		
		else if(event.getSource()==off)
		{
			disable();
		}
        if(src.equals(one)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "1"; 
                } else{ 
                    first_number= first_number  + "1";
                }
            }else{
                if(second_number==null){
                   second_number= "1"; 
                } else{ 
                    second_number= second_number  + "1";
            }
        }
     }
        if(src.equals(two)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "2"; 
                } else{ 
                    first_number= first_number  + "2";
                }
            }else{
                if(second_number==null){
                   second_number= "2"; 
                } else{ 
                    second_number= second_number  + "2";
            }
        }
     }
        if(src.equals(three)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "3"; 
                } else{ 
                    first_number= first_number  + "3";
                }
            }else{
                if(second_number==null){
                   second_number= "3"; 
                } else{ 
                    second_number= second_number  + "3";
            }
        }
     }
        if(src.equals(four)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "4"; 
                } else{ 
                    first_number= first_number  + "4";
                }
            }else{
                if(second_number==null){
                   second_number= "4"; 
                } else{ 
                    second_number= second_number  + "4";
            }
        }
     }
        if(src.equals(five)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "5"; 
                } else{ 
                    first_number= first_number  + "5";
                }
            }else{
                if(second_number==null){
                   second_number= "5"; 
                } else{ 
                    second_number= second_number  + "5";
            }
        }
     }
        if(src.equals(six)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "6"; 
                } else{ 
                    first_number= first_number  + "6";
                }
            }else{
                if(second_number==null){
                   second_number= "6"; 
                } else{ 
                    second_number= second_number  + "6";
            }
        }
     }
        if(src.equals(seven)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "7"; 
                } else{ 
                    first_number= first_number  + "7";
                }
            }else{
                if(second_number==null){
                   second_number= "7"; 
                } else{ 
                    second_number= second_number  + "7";
            }
        }
     }
        if(src.equals(eight)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "8"; 
                } else{ 
                    first_number= first_number  + "8";
                }
            }else{
                if(second_number==null){
                   second_number= "8"; 
                } else{ 
                    second_number= second_number  + "8";
            }
        }
     }
        if(src.equals(nine)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "9"; 
                } else{ 
                    first_number= first_number  + "9";
                }
            }else{
                if(second_number==null){
                   second_number= "9"; 
                } else{ 
                    second_number= second_number  + "9";
            }
        }
     }
        if(src.equals(zero)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "0"; 
                } else{ 
                    first_number= first_number  + "0";
                }
            }else{
                if(second_number==null){
                   second_number= "0"; 
                } else{ 
                    second_number= second_number  + "0";
            }
        }
     }
        if(src.equals(decimal)){
            if(opChosen==false){
                if(first_number==null){
                   first_number= "0."; 
                } else
                	if(first_number != null) {
                	  if(first_number.contains("0.")) {
                		  System.out.println("A decimal has been detected!");
                	  }else {
                		  first_number += "0."; 
                	  } 
                  
                }
            }else{
                if(second_number==null){
                   second_number= "0."; 
                } else 
                	if(second_number != null) {
                		if(second_number.contains("0.")) {
                			System.out.println("A decimal has been detected!");
                		} else {
                			second_number += "0.";
                		}
            }
        }
     }
        
        if(src.equals(neg)) {
        	if(opChosen==false){
                if(first_number==null){
                   first_number= "-"; 
                } else 
                	if(first_number != null && first_number.startsWith("-")) { 
                    first_number= first_number.substring(1);
                }else {
                	first_number = "-" + first_number;
               }
        	}
            else{
                if(second_number==null){
                   second_number= "-"; 
                } else
                     if(second_number != null && second_number.startsWith("-")){ 
                      second_number= second_number.substring(1);
            }else {
            	second_number = "-" + second_number;
            }
        }
        }
        
        if(src.equals(backspace)) {
        	 if(opChosen==false){
                 if(first_number==null) {
                	 System.out.print("Can't delete");
                 } else {
                	 first_number= first_number.substring(0, first_number.length()-1);
                 }
        	 }else {
        		 if(second_number==null) {
                	 System.out.print("Can't delete");
                 } else {
                	 second_number= second_number.substring(0, second_number.length()-1);
        	 }
          }
        }
        
        if(equalsClicked==false){
            if(opChosen==false){
           answerfield.setText(first_number);
        }else{
             answerfield.setText(second_number);
        }
       } 
     }
  } 
  
  
  
  //CALC
   private class Calc implements ActionListener{
        public void actionPerformed(ActionEvent event){
          JButton src = (JButton) event.getSource(); 
          
          if(src.equals(add)){
              if(first_number==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(first_number != null && second_number == null){
                      opChosen= true;
                      operation = '+';
                  }else
                      if(first_number != null && second_number != null){
                          System.out.println("Two operations only");
                      }
          }
          if(src.equals(sub)){
              if(first_number==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(first_number != null && second_number == null){
                      opChosen= true;
                      operation = '-';
                  }else
                      if(first_number != null && second_number != null){
                          System.out.println("Two operations only");
                      }
          }
          if(src.equals(multiply)){
              if(first_number==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(first_number != null && second_number == null){
                      opChosen= true;
                      operation = '*';
                  }else
                      if(first_number != null && second_number != null){
                          System.out.println("Two operations only");
                      }
          }
          if(src.equals(div)){
              if(first_number==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(first_number != null && second_number == null){
                      opChosen= true;
                      operation = '/';
                  }else
                      if(first_number != null && second_number != null){
                          System.out.println("Two operations only");
                      }
          }
          if(src.equals(equals)){
              if(first_number==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(first_number != null && second_number == null){
                    System.out.println("Choose BOTH numbers first");
                  }
              if(first_number != null && second_number !=null){
                  double r1 = 0.0, r2=0.0;
                  
                  r1= Double.parseDouble(first_number);
                  r2= Double.parseDouble(second_number);
                  
                  switch(operation){
                  case '+': 
                     answer= r1 + r2;
                     break;
                  case '-': 
                      answer= r1 - r2;
                      break;
                  case '*': 
                      answer= r1 * r2;
                      break;
                  case '/': 
                      answer= r1 / r2;
                      break;
                  } 
                  
                  sanswer= Double.toString(answer);
                  answerfield.setText(sanswer); 
                  if(operation == '/' && r2 == 0.0) {
                	  answerfield.setText("Math ERROR");
                  }
                 }
               }
              
                 if(src.equals(clear)) {
                	 first_number = null;
                	 second_number = null;
                	 equalsClicked= false;
                	 opChosen = false;
                	 operation = ' ';
                	 answerfield.setText(null);
                	 sanswer = null;
               }
          }
     }

	public void disable()
	{
		answerfield.setText(" ");
		off.setEnabled(false);
		on.setEnabled(true);
		answerfield.setEnabled(false);
		decimal.setEnabled(false);
		zero.setEnabled(false);
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		add.setEnabled(false);
		sub.setEnabled(false);
		multiply.setEnabled(false);
		div.setEnabled(false);
		equals.setEnabled(false);
		clear.setEnabled(false);
		backspace.setEnabled(false);
	}
	
	public void enable()
	{
		on.setEnabled(false);
		off.setEnabled(true);
		answerfield.setEnabled(true);
		decimal.setEnabled(true);
		zero.setEnabled(true);
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		add.setEnabled(true);
		sub.setEnabled(true);
		multiply.setEnabled(true);
		div.setEnabled(true);
		equals.setEnabled(true);
		clear.setEnabled(true);
		backspace.setEnabled(true);
		
	}
	}

	
  



