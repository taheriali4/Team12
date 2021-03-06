import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;

public class TestMapMove extends TestCase {

	public void testMapMove() throws FileNotFoundException {
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(1, 2)); //Creates PacMan at location x, y

		Ghost ghost = frame.addGhost(new Location(1, 2), "name", Color.red);

		frame.getMap().move("pacman", new Location(1, 1), Map.Type.PACMAN);

		//Start The Game
		frame.startGame();


		HashSet<Map.Type> h = new HashSet<Map.Type>();
		h.add(Map.Type.PACMAN);
		h.add(Map.Type.COOKIE);

		assertEquals(frame.getMap().getLoc(new Location(1, 1)), h); // check we return true for a valid move

	}
}
