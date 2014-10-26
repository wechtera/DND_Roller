package Roller;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
//TODO:  Fix dice label location
//TODO:  put panels into different classes for cleaner
public class DiceRollPanel extends JPanel {
	static int rollNum;
	RadioSet rs;
	ModField mod;
	ModField numOfDice;
	JTextPane rollDisplay;
	
	public DiceRollPanel(JFrame frame) {
		super();
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		//Add Top Label
		JLabel diceLabel = new JLabel("Dice Selection");
		diceLabel.setForeground(new Color(255,255,255,255));
		add(diceLabel);
		
		//Add Dice selection Buttons
		JPanel buttonPanel = new JPanel();
		rs = new RadioSet();
		diceLabel.setHorizontalTextPosition(getWidth()/2);
		buttonPanel.setOpaque(true);
		buttonPanel.add(rs.getCoin());
		buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(rs.getFour());
		buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(rs.getSix());
		buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(rs.getEight());
		buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(rs.getTen());
		buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(rs.getTwelve());
		buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(rs.getTwenty());
		buttonPanel.setOpaque(false);
		add(buttonPanel);
		
		
		//Add Modifier Panel
		mod = new ModField("Dice Modifier");
		numOfDice = new ModField("Num of Dice");
		JLabel modLabel = new JLabel("Roll Modifier:  ");
		modLabel.setForeground(new Color(255,255,255,255));
		JLabel numDiceLabel = new JLabel("Number of Dice:  ");
		numDiceLabel.setForeground(new Color(255,255,255,255));
		JPanel modPanel = new JPanel();
		
		modPanel.setLayout(new BoxLayout(modPanel, BoxLayout.LINE_AXIS));
		modPanel.add(modLabel);
		modPanel.setBorder(BorderFactory.createEmptyBorder(10, 70, 0,70)); //magic numbers are bad  I should fix these
		modPanel.add(mod);
		modPanel.add(Box.createHorizontalStrut(20));
		modPanel.add(numDiceLabel);
		modPanel.add(numOfDice);
		modPanel.setOpaque(false);
		add(modPanel);
		
		
		//This is where result will be posted
		JPanel resultPanel = new JPanel();
		rollDisplay = new JTextPane();
		rollDisplay.setFont(new Font("SansSerif", Font.BOLD, 36));
		rollDisplay.setForeground(new Color(255,255,255,255));
		rollDisplay.setOpaque(false);
		resultPanel.setOpaque(false);
		resultPanel.add(rollDisplay);
		
		//Add Rolling Button
		JButton rollButton = new JButton("Roll!");
		rollButton.setToolTipText("Roll");
		rollButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				Roller.rollLander(rs.getSelection().getActionCommand(), numOfDice.getFieldsNum(), mod.getFieldsNum(), rollDisplay);
			}
		});
		JPanel rollPanel = new JPanel();
		rollPanel.add(rollButton);
		rollPanel.setOpaque(false);
		add(rollPanel);
		
		//add results panel here though but we needed to create it before
		add(resultPanel);
		
		//Space Formatting
		add(Box.createVerticalStrut(220));
		
		setSize(frame.getSize());
		setVisible(true);
		
	}

}
