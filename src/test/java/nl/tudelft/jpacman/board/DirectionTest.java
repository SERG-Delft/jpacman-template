package nl.tudelft.jpacman.board;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * A very simple test class to have a starting point where to put tests.
 * 
 * @author Arie van Deursen
 *
 */
public class DirectionTest {

	/**
	 * Do we get the correct horizontal delta when moving north?
	 */
	@Test
	public void directionTest() {
		assertEquals(0, Direction.NORTH.getDeltaX());
	}

}
