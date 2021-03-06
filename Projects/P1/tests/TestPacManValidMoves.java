import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		// Creates A New Map With Walls and Tokens Initialized
		NoFrame frame = new NoFrame();

		// Creates a PacMan at location 1,1
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		
		// Created expected result
		ArrayList<Location> expected = new ArrayList<Location>();
		expected.add(new Location(1, 2));		// Up
		expected.add(new Location(2, 1)); 		// Right

		// Test Expected result
		assertEquals(expected, pacman.get_valid_moves());
	}
}
