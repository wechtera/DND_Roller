package Roller;



import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame {
	
	DiceRollPanel drp;

	public Gui() {
		super();
		
		setTitle("DND_DICE_ROLLER");
		setSize(500,400);
		try {
		super.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./lib/dndImg.jpg")))));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		drp = new DiceRollPanel(this);
		drp.setOpaque(false);
		add(drp);
		
		
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}

}
