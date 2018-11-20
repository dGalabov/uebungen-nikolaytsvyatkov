package geometry;

public class Quadrangle {
	private Point[] points = new Point[4];
	private double[] sides = new double[4];

	public Quadrangle() {
		points[0] = new Point(0, 0);
		points[1] = new Point(1, 0);
		points[2] = new Point(1, 1);
		points[3] = new Point(0, 1);
		calculateSides();
	}

	public Quadrangle(Point point1, Point point2, Point point3, Point point4) {
		points[0] = new Point(point1);
		points[1] = new Point(point2);
		points[2] = new Point(point3);
		points[3] = new Point(point4);
		calculateSides();
	}

	public Quadrangle(Point[] points) {
		for (int index = 0; index < points.length; index++) {
			this.points[index] = points[index];
		}
		calculateSides();
	}

	public Quadrangle(Quadrangle otherQuadrangle) {
		for (int index = 0; index < points.length; index++) {
			points[index] = new Point(otherQuadrangle.points[index]);
			sides[index] = otherQuadrangle.sides[index];
		}
	}

	private void calculateSides() {
		sides[0] = Help.calculateDsitance(points[0], points[1]);
		sides[1] = Help.calculateDsitance(points[1], points[2]);
		sides[2] = Help.calculateDsitance(points[2], points[3]);
		sides[3] = Help.calculateDsitance(points[3], points[0]);
	}

	public boolean isValid() {
		double quadrangleArea = calculateArea();
		Triangle[] triangles = new Triangle[4];
		triangles[0] = new Triangle(points[0], points[1], points[2]);
		triangles[1] = new Triangle(points[1], points[2], points[3]);
		triangles[2] = new Triangle(points[2], points[3], points[0]);
		triangles[3] = new Triangle(points[3], points[0], points[1]);
		for (Triangle triangle : triangles) {
			boolean triangleNotValid = !triangle.isValid();
			boolean triangleAreaBigger = triangle.calculateArea() > quadrangleArea;
			if (triangleNotValid || triangleAreaBigger) {
				return false;
			}
		}
		return true;
	}

	public void initialize() {
		do {
			for (Point point : points) {
				point.initialize();
			}
		} while (!isValid());
		calculateSides();
	}

	public double calculatePerimeter() {
		return sides[0] + sides[1] + sides[2] + sides[3];
	}

	public double calculateArea() {
		double results1 = (points[0].x * points[1].y - points[0].y * points[1].x);
		double results2 = (points[1].x * points[2].y - points[1].y * points[2].x);
		double results3 = (points[2].x * points[3].y - points[2].y * points[3].x);
		double results4 = (points[3].x * points[0].y - points[3].y * points[0].x);
		return (results1 + results2 + results3 + results4) / 2;
	}

	public String getType() {
		double coefficent1 = Help.calculateLineCoefficient(points[0], points[1]);
		double coefficent2 = Help.calculateLineCoefficient(points[1], points[2]);
		double coefficent3 = Help.calculateLineCoefficient(points[2], points[3]);
		double coefficent4 = Help.calculateLineCoefficient(points[3], points[0]);
		if (Help.equal(coefficent1, coefficent3) && Help.equal(coefficent2, coefficent4)) {
			return "Parallelogramm";
		} else if (Help.equal(coefficent1, coefficent3) || Help.equal(coefficent2, coefficent4)) {
			return "Trapez";
		} else {
			return "gewoehnliches Viereck";
		}
	}

	public String toString() {
		return points[0] + "-" + points[1] + "-" + points[2] + "-" + points[3];
	}

	public void print() {
		System.out.format("%s,%s,U=%s,F=%s\n", this, getType(), calculatePerimeter(), calculateArea());
	}

	public boolean equal(Quadrangle otherQuadrangle) {
		Triangle triangle1 = new Triangle(points[0], points[1], points[2]);
		Triangle triangle2 = new Triangle(points[0], points[2], points[3]);
		Point[] otherPoints = otherQuadrangle.points;
		Triangle otherTriangle1 = new Triangle(otherPoints[0], otherPoints[1], otherPoints[2]);
		Triangle otherTriangle2 = new Triangle(otherPoints[0], otherPoints[2], otherPoints[3]);
		boolean a = triangle1.equal(otherTriangle1);
		boolean b = triangle2.equal(otherTriangle2);
		return triangle1.equal(otherTriangle1) && triangle2.equal(otherTriangle2);
	}
}
