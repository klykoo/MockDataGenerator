package com.marajy.MockDataGenerator.gui;



import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class MyMenu {

	public MyMenu(Shell shell, Display display) {

		org.eclipse.swt.widgets.Menu appMenuBar = display.getMenuBar();
		if (appMenuBar == null) {
			appMenuBar = new Menu(shell, SWT.BAR);
			shell.setMenuBar(appMenuBar);
		}
		MenuItem file = new MenuItem(appMenuBar, SWT.CASCADE);
		file.setText("File");
		Menu dropdown = new Menu(appMenuBar);
		file.setMenu(dropdown);
		// -------------------------------------------------
		MenuItem nouveau = new MenuItem(dropdown, SWT.PUSH);
		nouveau.setText("New");
		nouveau.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			};
		});
		// -------------------------------------------------
		new MenuItem(dropdown, SWT.SEPARATOR);
		// -------------------------------------------------
		MenuItem open = new MenuItem(dropdown, SWT.PUSH);
		open.setText("Open");
		open.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			};
		});
		// -------------------------------------------------
		MenuItem save = new MenuItem(dropdown, SWT.PUSH);
		save.setText("Save");
		save.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			};
		});
		// -------------------------------------------------
		MenuItem saveAs = new MenuItem(dropdown, SWT.PUSH);
		saveAs.setText("Save as");
		saveAs.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			};
		});
		// -------------------------------------------------
		new MenuItem(dropdown, SWT.SEPARATOR);
		// -------------------------------------------------
		MenuItem exit = new MenuItem(dropdown, SWT.PUSH);
		exit.setText("Exit");
		exit.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			};
		});
		// -------------------------------------------------
		Menu aboutMenuBar = display.getMenuBar();
		if (aboutMenuBar == null) {
			aboutMenuBar = new Menu(shell, SWT.BAR);
			shell.setMenuBar(aboutMenuBar);
		}
		MenuItem about = new MenuItem(aboutMenuBar, SWT.CASCADE);
		about.setText("?");
		Menu aboutMenu = new Menu(aboutMenuBar);
		about.setMenu(aboutMenu);
		// -------------------------------------------------
		MenuItem aboutItem = new MenuItem(aboutMenu, SWT.PUSH);
		aboutItem.setText("About");
		aboutItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			};
		});
	}

}
