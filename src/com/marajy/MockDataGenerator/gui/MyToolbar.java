package com.marajy.MockDataGenerator.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import com.marajy.MockDataGenerator.Main;

public class MyToolbar {

	public MyToolbar(Shell shell, Display display) {
	ToolBar bar = new ToolBar(shell, SWT.BORDER | SWT.FLAT);
	final Image imageSave = new Image(display, Main.class.getClassLoader().getResourceAsStream("save.png"));
	Rectangle clientArea = shell.getClientArea();
	bar.setBounds(clientArea.x, clientArea.y, 200, 32);

	Image image = new Image(display, 20, 20);
	Color color = display.getSystemColor(SWT.COLOR_BLUE);
	GC gc = new GC(image);
	gc.setBackground(color);
	gc.fillRectangle(image.getBounds());
	gc.dispose();
	
	Image disabledImage = new Image(display, 20, 20);
	color = display.getSystemColor(SWT.COLOR_GREEN);
	gc = new GC(disabledImage);
	gc.setBackground(color);
	gc.fillRectangle(disabledImage.getBounds());
	gc.dispose();

	Image hotImage = new Image(display, 20, 20);
	color = display.getSystemColor(SWT.COLOR_RED);
	gc = new GC(hotImage);
	gc.setBackground(color);
	gc.fillRectangle(hotImage.getBounds());
	gc.dispose();
	
	ToolItem item = new ToolItem(bar, 0);
	item.setImage(imageSave);
	item.setDisabledImage(disabledImage);
	item.setHotImage(hotImage);
	}
}
