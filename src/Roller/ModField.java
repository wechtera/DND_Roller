package Roller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

import javax.swing.JFormattedTextField;

/**
 * Can only take numbers thats why we use formatted :)
 * Borrowed grey text stuff from https://code.google.com/p/cakehat/source/browse/branches/2.5dev/src/gradesystem/components/ShadowJTextField.java?r=698
 * 
 * @author wechtera
 *
 */
public class ModField extends JFormattedTextField {
	
	private static final Color SHADOWCOLOR = Color.LIGHT_GRAY;
	private boolean isInShadow;
	private final String STARTTEXT;
	private Color prevColor;
	
	
	
	public ModField(String startText) {
		super(startText);
		
		
		STARTTEXT = startText;
		isInShadow = true;
		prevColor = this.getForeground();
		setForeground(SHADOWCOLOR);
		
		
		this.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(isInShadow) {
					isInShadow = false;
					setForeground(prevColor);
					setText("");
				}
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				//nothing written
				if(getText() == null || getText().isEmpty()) {  
					isInShadow = true;
					prevColor = getForeground();
					setForeground(SHADOWCOLOR);
					setText(STARTTEXT);
				}
				
			}
		});
		
		
		setColumns(4);
		setPreferredSize(new Dimension(10,40));
		setEditable(true);
		
	}
	@Override
	public String getText() {
		if(isInShadow) 
			return null;
		else
			return super.getText();

	}
	
	public int getFieldsNum() {
		if(getText() == null)
			return 0;
		return Integer.parseInt(this.getText().replaceAll(",","")); //for formatted text field adds comma DUM
	}
	
}
