package nl.tudelft.jpacman.board;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DirectionTest {

	@Test
	public void directionTest() {
		assertEquals(0, Direction.NORTH.getDeltaX());
	}

}
