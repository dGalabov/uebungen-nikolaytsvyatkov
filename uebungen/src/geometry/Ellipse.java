package geometry;

public class Ellipse {
	private Point startPoint;
	private double a;
	private double b;
	public Ellipse() {
		startPoint=new Point(0,0);
		a=1;
		b=1;
		
	}
	public Ellipse(Point startPoint,double a,double b) {
		this.startPoint=new Point(startPoint);
		this.a=a;
		this.b=b;
		
	}
	public Ellipse(Ellipse otherEllipse) {
		startPoint=new Point(otherEllipse.startPoint);
		a=otherEllipse.a;
		b=otherEllipse.b;
	}
	public boolean isValid() {
		return a>0&&b>0;
	}
	public void initialize() {
		do {
			System.out.println("Anfangspunkt: ");
			startPoint.initialize();
			System.out.println(" A= ");
			a=Help.INPUT.nextDouble();
			System.out.println(" B= ");
			b=Help.INPUT.nextDouble();
		}while(!isValid());
	}
	public double calculatePerimeter() {
		return Math.PI*(3*(a+b)-Math.sqrt((3*a+b)*(a+3*b)));
	}
	public double calculateArea() {
		return Math.PI*a*b;
	}
	public String getType() {
		return(a==b)?"Kreis":"Ellipse";
	}
	public String toString() {
		return startPoint+"-["+a+","+b+"]";
	}
	public void print() {
		double perimeter=calculatePerimeter();
		System.out.format("%s,%s,U=%s,F=%s\n",this,getType(),perimeter,calculateArea());
	}
	public boolean equal(Ellipse otherEllipse) {
		boolean samea=Help.equal(a, otherEllipse.a);
		boolean sameb=Help.equal(b, otherEllipse.b);
		boolean sameAReversed=Help.equal(a,otherEllipse.b);
		boolean sameBReversed=Help.equal(b,otherEllipse.a );
		return (samea&&sameb)||(sameAReversed&&sameBReversed);
	
	}
}
