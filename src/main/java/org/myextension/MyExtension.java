package org.myextension;

import org.jpacman.framework.factory.FactoryException;
import org.jpacman.framework.ui.MainUI;

public class MyExtension extends MainUI {
	
	private static final long serialVersionUID = -2368505776408908204L;

	public static void main(String[] argv) throws FactoryException {
		(new MyExtension()).main();
	}

}
