import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class TriangleTest {

	private Triangle triangleTest;

	@Before
	public void setupCube() {
		triangleTest = new Triangle(1, 2, 3);
	}

	@Test
	public void testGetA() {
		assertThat(triangleTest.getA(), is(1));
	}

	@Test
	public void testGetB() {
		assertThat(triangleTest.getB(), is(2));
	}
	@Test
	public void testGetC() {
		assertThat(triangleTest.getC(), is(3));
	}

	@Test
	public void testValid() {
		Triangle triangle1 = new Triangle(5, 7, 11);
		assertThat(triangleTest.Valid(), is(false));
		assertThat(triangle1.Valid(), is(true));
	}

	@Test
	public void testGetEdges() {
		assertThat(triangleTest.getEdges(), is(3));

	}

	@Test
	public void testGetVertexes() {
		assertThat(triangleTest.getVertexes(), is(3));
	}

}
