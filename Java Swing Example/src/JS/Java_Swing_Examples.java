package JS;

import javax.swing.*;

public class Java_Swing_Examples {
	
	public static void main(String[] args) {
		textExample();

	}
	
	private static void textExample() {
		JFrame frame = new JFrame("Text Example");
		JTextArea text = new JTextArea("Text in a window");
		
		//             X   Y   W    H
		text.setBounds(50, 50, 150, 20);
		//X - Position on the X axis
		//Y - Position on the Y axis
		//W - Width
		//H - Height
		text.setEditable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(text);
		frame.setSize(250,250);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
}
