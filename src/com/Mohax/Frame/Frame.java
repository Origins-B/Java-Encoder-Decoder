package com.Mohax.Frame;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import com.Mohax.Utils.*;
import com.Mohax.Encoder.*;

import javax.swing.*;

import com.Mohax.main.*;
public class Frame extends JFrame {
JTextField field = new JTextField("Enter a string");
JTextField field2 = new JTextField("Enter a number sequence");
Action act = new AbstractAction(){
	public void actionPerformed(ActionEvent e){
		AlphabetSwitcher.AlphaS(Encoder.cutterz(field.getText(), 1));
		Main.Lo();
		label.setText(Main.g);
	}

};
Action act2 = new AbstractAction(){
public void actionPerformed(ActionEvent e){
	say(AlphabetSwitcher.AlphaSwitch(Integer.parseInt(Encoder.cutter(field2.getText(), 2))));
}
};
public static String j ="["+new Date()+"]";
JLabel label = new JLabel("Your code");
public static void say(String g){
	Main.say(g);
}
public Frame(){
super();
say(j+"Initializing the Frame");
this.setLayout(new BorderLayout());
this.setVisible(true);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setSize(500, 150);
say(j+"Initializiting the GUI");
this.add(field, BorderLayout.PAGE_START);

JButton button = new JButton();
button.setAction(act);
this.add(button, BorderLayout.LINE_END);

JButton button2 = new JButton();
this.add(button2, BorderLayout.LINE_START);

this.add(label, BorderLayout.CENTER);
this.add(field2, BorderLayout.PAGE_END);
button2.setAction(act2);
say(j+"Done Initializing");
}
}
