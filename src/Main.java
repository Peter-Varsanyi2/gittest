
public class Main {

	public static void main(String[] args) {
		Cube cube1 = new Cube(10, 12);
		if (cube1.Valid()) {
			System.out.println("cube is valid");
		} else {
			System.out.println("cube is not valid");
		}
		Triangle trigangle1 = new Triangle(5, 7, 11);
		if (trigangle1.Valid()) {
			System.out.println("triangle is valid");
		} else {
			System.out.println("triangle is not valid");
		}
	}

}
