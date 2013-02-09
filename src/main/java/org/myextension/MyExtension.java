package org.myextension;

import org.jpacman.framework.factory.FactoryException;
import org.jpacman.framework.ui.MainUI;

/**
 * Extend the JPacman framework by subclassing relevant classes.
 * Creation of the subclass instances requires adjusting the factory,
 * and injecting the relevant instances at the right places.
 */

public class MyExtension extends MainUI {

	private static final long serialVersionUID = -2368505776408908204L;

	/**
	 * Start the pacman user interface.
	 * @param argv Ignored
	 * @throws FactoryException If board can't be read.
	 */
	public static void main(String[] argv) throws FactoryException {
		(new MyExtension()).main();
	}

}
