package net.codejava.javaee;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class MainPageTest {

	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainPageTest window = new MainPageTest();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(62, 109, 94, 27);
		btnNewButton.setText("Fake Button");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(75, 59, 64, 19);
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		lblUsername.setBounds(0, 62, 69, 14);
		lblUsername.setText("First Name:");
		
		Label lblLastName = new Label(shell, SWT.NONE);
		lblLastName.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		lblLastName.setBounds(163, 62, 64, 14);
		lblLastName.setText(" Last Name:");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(233, 59, 64, 19);

	}
}
