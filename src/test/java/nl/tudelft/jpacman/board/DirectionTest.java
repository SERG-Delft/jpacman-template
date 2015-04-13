package nl.tudelft.jpacman.board;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 * 
 * @author Arie van Deursen
 *
 */
public class DirectionTest {

	/**
	 * Do we get the correct delta when moving north?
	 */
	@Test
	public void testNorth() {
		Direction north = Direction.valueOf("NORTH");
		assertEquals(-1, north.getDeltaY());
	}

}
