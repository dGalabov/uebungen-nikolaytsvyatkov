package geometry;

import javafx.scene.shape.Shape;

public class Rhomboid extends GeometricObject {
	private double a;
	private double b;
	private Quadrangle quadrangle;

	public Rhomboid() {
		super("Rhomboid", 1, 0);
		points[0] = new Point(0, 0);
		a = 1;
		b = 1;
		calculateFigure();
	}

	public Rhomboid(Point startPoint, double a, double b) {
		super("Rhomboid", 1, 0);
		points[0] = new Point(startPoint);
		this.a = a;
		this.b = b;
	}

	public Rhomboid(Rhomboid otherRhomboid) {
		super("Rhomboid", 1, 0);
		points[0] = new Point(otherRhomboid.points[0]);
		a = otherRhomboid.a;
		b = otherRhomboid.b;
	}
	public void  calculateFigure() {
		Point p1=new Point(points[0].x + a / 2, points[0].y);
		Point p2=new Point(points[0].x+a,points[0].y+b/2);
		Point p3=new Point(points[0].x+a/2,points[0].y+b);
		Point p4=new Point(points[0].x,points[0].y+b/2);
		quadrangle = new Quadrangle(p1, p2, p3, p4);
	}

	@Override
	public Shape createShape(int scale) {
		 return quadrangle.createShape(scale);
	}

	@Override
	public boolean contains(double x, double y) {
		return quadrangle.contains(x, y);
	}

	@Override
	public boolean isValid() {

		return a > 0 && b > 0;
	}

	@Override
	public void initialize() {
		do {
			System.out.println("Anfangspunkt: ");
			points[0].initialize();
			System.out.println("Hoehe: ");
			a=Help.INPUT.nextDouble();
			System.out.println("Breite: ");
			b=Help.INPUT.nextDouble();
		}while(!isValid());
		calculateFigure();
	}

	@Override
	public double calculatePerimeter() {
		return quadrangle.calculatePerimeter();
	}

	@Override
	public double calculateArea() {
		return quadrangle.calculateArea();
	}

	@Override
	public String getType() {
		return(a==b)?"Rhombus":"Rhomboid";
	}

	@Override
	public String toString() {
		return points[0]+"-["+a+", "+b+ "]";
	}

	@Override
	public boolean equal(GeometricObject otherGeometricObject) {
		if(otherGeometricObject instanceof Rhomboid) {
			Rhomboid otherRhomboid=(Rhomboid) otherGeometricObject;
			boolean sameA=Help.equal(a, otherRhomboid.a);
			boolean sameB=Help.equal(b, otherRhomboid.b);
			return (sameA&&sameB);
		}else {
			return false;
		}
	}

}
