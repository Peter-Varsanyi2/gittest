
public class Triangle implements Shape {

	private int a,b,c;
	
	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public boolean Valid() {
		if (a + b > c && a + c > b && b + c > a) return true;
		return false;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	@Override
	public int getEdges() {
		return 3;
	}

	@Override
	public int getVertexes() {
		return 3;
	}

}
