/*
 * File: CenteredText.java
 * -----------------------
 * This programs displays a message centered in the graphics window.
 */

import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Toolkit;
import acm.graphics.*;
import acm.program.*;

public class CenteredText extends GraphicsProgram {	

	public void run() {
		setSize(800, 600);
		// You fill the codes here
		GLabel label = new GLabel("Programming is Awesome!");
	    label.setFont("Courier-52");
	    add(label, 10, centerY);
	}
	public static void main(String[] args)
	{
		Frame frame = new Frame("?");
		frame.setVisible(true);
	}
	
}