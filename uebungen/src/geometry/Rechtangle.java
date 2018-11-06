package geometry;

public class Rechtangle {
	private Point startPoint;
	private double height;
	private double width;
	
	public Rechtangle() {
		startPoint=new Point(0,0);
		height=1;
		width=1;
		
	}
	public Rechtangle (Point startPoint, double height,double width) {
		this.startPoint=new Point(startPoint);
		this.height=height;
		this.width=width;
	}
	public Rechtangle(Rechtangle otherRechtangle) {
		startPoint=new Point(otherRechtangle.startPoint);
		height=otherRechtangle.height;
		width=otherRechtangle.width;
	}
	public boolean isValid() {
		return height>0&&width>0;
	}
	public void initialize() {
		do {
			System.out.println("Anfangspunkt: ");
			startPoint.initialize();
			System.out.println("Hoehe: ");
			height=Help.INPUT.nextDouble();
			System.out.println("Breite: ");
			width=Help.INPUT.nextDouble();
		}while(!isValid());
	}
	public double calculatePerimeter() {
		return height*2+width*2;
	}
	public double calculateArea() {
		return height*width;
	}
	public String getType() {
		return(height==width)?"Quadrat":"Rechteteck";
	}
	public String toString() {
		return startPoint+"-["+height+", "+width+ "]";
	}
	public void print() {
		double perimerter=calculatePerimeter();
		System.out.format("%s,%s, U=%s, F=%s\n",this,getType(),perimerter,calculateArea());
	}
	public boolean equal(Rechtangle otherRechtangle) {
		boolean sameHeight=Help.equal(height, otherRechtangle.height);
		boolean sameWidth=Help.equal(width, otherRechtangle.width);
		boolean sameHeightReversed=Help.equal(height,otherRechtangle.width);
		boolean sameWidthReversed=Help.equal(width,otherRechtangle.height );
		return (sameHeight&&sameWidth)||(sameHeightReversed&&sameWidthReversed);
	}

}
