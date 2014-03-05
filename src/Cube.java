
public class Cube implements Shape {
	private int a,b;

	public Cube(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	@Override
	public boolean Valid() {
		System.out.println("A: "+ a + ", B: "+b);
		return true;
	}

	@Override
	public int getEdges() {
		return 4;
	}

	@Override
	public int getVertexes() {
		return 4;
	}

}
