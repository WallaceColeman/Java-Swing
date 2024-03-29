package JS;

import javax.swing.*;

public class Java_Swing_Examples {
	
	public static void main(String[] args) {
		textExample();

	}
	
	private static void textExample() {
		//create the frame (window)
		JFrame frame = new JFrame("Text Example");
		
		
		//Create the text area to add to the window
		JTextArea text = new JTextArea("Text in a window");
		
		//             X   Y   W    H
		text.setBounds(50, 50, 150, 20);
		//X - Position on the X axis
		//Y - Position on the Y axis
		//W - Width
		//H - Height
		
		text.setEditable(false);
		
		
		JTextArea text2 = new JTextArea("This text is editable");
		text2.setBounds(50, 100, 150, 20);
		
		
		//add parameters to the frame indcluding text
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(text);
		frame.add(text2);
		frame.setSize(250,250);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
}
