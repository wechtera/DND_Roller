package Roller;

import java.util.Random;

import javax.swing.JTextPane;



public class Roller {
	
	public static void rollLander(String s, int num, int mod, JTextPane rollDisplay) {
		if(s.equals("coin"))
			flipCoin(rollDisplay);
		else {
			int face = Integer.parseInt(s);
			switch(face) {
				case 4: rollDie(4, num, mod, rollDisplay);
						break;
				case 6: rollDie(6, num, mod, rollDisplay);
						break;
				case 8: rollDie(8, num, mod, rollDisplay);
						break;
				case 10: rollDie(10, num, mod, rollDisplay);
						break;
				case 12: rollDie(12, num, mod, rollDisplay);
						break;
				case 20: rollDie(20, num, mod, rollDisplay);
						break;
			}
		}
	}
	public static void flipCoin(JTextPane rollDisplay) {
		int roll = new Random(System.currentTimeMillis()).nextInt() % 2;
		if(roll == 1)
			rollDisplay.setText("Heads");
		else
			rollDisplay.setText("Tails");
	}
	public static void rollDie(int sides, int num, int mod, JTextPane rollDisplay) {
		int sum = 0;
		int roll = 0;
		
		if(num == 1 || num == 0) {
			roll = new Random(System.currentTimeMillis()).nextInt();
			if(roll < 0)
				roll = roll*-1;
			roll = (roll % sides) + 1;
			sum += roll;
		}
		else {  //if multiple die need to be rolled
			for(int i =0; i < num; i++) {
				roll = roll(sides);
				sum += roll;
				System.out.println("Sum : " + sum);
			}
		}
		
		//Displaying
		if(sides == 20  && roll == 1)
			rollDisplay.setText("Crit Fail");
		else if(sides == 20 && (num == 1 || num == 0) && sum == 20)
			rollDisplay.setText("Crit");
		else {
			sum += mod;
			System.out.println("Sum End : " + sum);
			String s = ""+sum;
			System.out.println("String s : " + s);
			rollDisplay.setText(s);
		}
		
		System.out.println("\n\n\n");
		
	}
	
	public static int roll(int sides) {
		int roll = new Random(System.nanoTime()).nextInt();
		if(roll < 0)
			roll *= -1;
		roll = (roll% sides) +1;
		System.out.println(roll);
		return roll;
	}

}
