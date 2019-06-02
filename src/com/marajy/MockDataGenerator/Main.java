package com.marajy.MockDataGenerator;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.marajy.MockDataGenerator.gui.MyMenu;
import com.marajy.MockDataGenerator.gui.MyToolbar;



public class Main {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ============================================
		// GUI
		// ============================================

		final Display display = new Display();
		final Shell shell = new Shell(display);
		
		new MyMenu(shell, display);
		new MyToolbar(shell, display);
		
		shell.setText("MockDataGenerator");
		final Image imageMusic = new Image(display, Main.class.getClassLoader().getResourceAsStream("music.png"));
		shell.setImage(imageMusic);
		shell.setMaximized(true);
		
		
		
		

		
		
		

		

		
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	

	
	

	

	
}
