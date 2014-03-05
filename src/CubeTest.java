import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class CubeTest {

	private Cube cubeTest;

	@Before
	public void setupCube() {
		cubeTest = new Cube(10, 10);
	}

	@Test
	public void testGetA() {
		assertThat(cubeTest.getA(), is(10));
	}

	@Test
	public void testGetB() {
		assertThat(cubeTest.getB(), is(10));
	}

	@Test
	public void testValid() {
		assertThat(cubeTest.Valid(), is(true));
	}

	@Test
	public void testGetEdges() {
		assertThat(cubeTest.getEdges(), is(4));

	}

	@Test
	public void testGetVertexes() {
		assertThat(cubeTest.getVertexes(), is(4));
	}

}
