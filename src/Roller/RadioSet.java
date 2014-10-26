package Roller;

import java.awt.Color;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class RadioSet extends ButtonGroup {

	ButtonGroup rs;
	JRadioButton coin, four, six, eight, ten, twelve, twenty;
	
	
	public RadioSet() {
		super();
		
		coin = new JRadioButton("Coin");
		coin.setActionCommand("coin");
		coin.setForeground(new Color(255,255,255,255));
		coin.setVerticalTextPosition(JRadioButton.BOTTOM);
		coin.setHorizontalTextPosition(JRadioButton.CENTER);
		coin.setSelected(true);
		
		four = new JRadioButton("Four");
		four.setForeground(new Color(255,255,255,255));
		four.setVerticalTextPosition(JRadioButton.BOTTOM);
		four.setHorizontalTextPosition(JRadioButton.CENTER);
		four.setActionCommand("4");
		
		six = new JRadioButton("Six");
		six.setForeground(new Color(255,255,255,255));
		six.setVerticalTextPosition(JRadioButton.BOTTOM);
		six.setHorizontalTextPosition(JRadioButton.CENTER);
		six.setActionCommand("6");
		
		eight = new JRadioButton("Eight");
		eight.setForeground(new Color(255,255,255,255));
		eight.setVerticalTextPosition(JRadioButton.BOTTOM);
		eight.setHorizontalTextPosition(JRadioButton.CENTER);
		eight.setActionCommand("8");
		
		ten = new JRadioButton("Ten");
		ten.setVerticalTextPosition(JRadioButton.BOTTOM);
		ten.setHorizontalTextPosition(JRadioButton.CENTER);
		ten.setForeground(new Color(255,255,255,255));
		ten.setActionCommand("10");
		
		twelve = new JRadioButton("Twelve");
		twelve.setVerticalTextPosition(JRadioButton.BOTTOM);
		twelve.setHorizontalTextPosition(JRadioButton.CENTER);
		twelve.setForeground(new Color(255,255,255,255));
		twelve.setActionCommand("12");
		
		twenty = new JRadioButton("Twenty");
		twenty.setVerticalTextPosition(JRadioButton.BOTTOM);
		twenty.setHorizontalTextPosition(JRadioButton.CENTER);
		twenty.setForeground(new Color(255,255,255,255));
		twenty.setActionCommand("20");
		
		add(coin);
		add(four);
		add(six);
		add(eight);
		add(ten);
		add(twelve);
		add(twenty);
		
		//coin.addFocusListener(new FocusListener(FocusEvent e) {
		//});
		
	}
	
	public JRadioButton getCoin() {
		return coin;
	}
	public JRadioButton getFour() {
		return four;
	}
	public JRadioButton getSix() {
		return six;
	}
	public JRadioButton getEight() {
		return eight;
	}
	public JRadioButton getTen() {
		return ten;
	}
	public JRadioButton getTwelve() {
		return twelve;
	}
	public JRadioButton getTwenty() {
		return twenty;
	}
	
	
	
}
