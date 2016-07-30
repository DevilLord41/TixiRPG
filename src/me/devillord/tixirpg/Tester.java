package me.devillord.tixirpg;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tester extends JFrame{
	public static void main(String[] args) {
		Tester t = new Tester();
		t.setVisible(true);
	}
	
	public Tester() {
		final JPanel mainPanel=new JPanel();
	    JPanel panelOne=new JPanel();
	    JPanel panelTwo=new JPanel();
	    final CardLayout card=new CardLayout();
	    mainPanel.setLayout(card);
	    mainPanel.add(panelOne, "one"); // id one refers panelOne
	    mainPanel.add(panelTwo, "two"); // id two refers panelTwo

	    panelOne.add(new JLabel("first panel"));
	    JButton btn1=new JButton("Show second");
	    panelOne.add(btn1);
	    btn1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
	    card.show(mainPanel, "two"); // shows panelTwo
	    }});

	  panelTwo.add(new JLabel("second panel"));
	    JButton btn2=new JButton("Show First");
	    panelTwo.add(btn2);
	    btn2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
	    card.show(mainPanel, "one"); // shows panelOne
	    }});
	    setContentPane(mainPanel);
	}
}
