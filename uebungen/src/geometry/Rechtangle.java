package geometry;
import javafx.scene.shape.Shape;
public class Rechtangle extends GeometricObject {
	
	private double height;
	private double width;
	
	public Rechtangle() {
		super("Rectangle",1,0);
		points[0]=new Point(0,0);
		
		height=1;
		width=1;
		
	}
	public Rechtangle (Point startPoint, double height,double width) {
		super("Rectangle",1,0);
		points[0]=new Point(startPoint);
		this.height=height;
		this.width=width;
	}
	public Rechtangle(Rechtangle otherRechtangle) {
		super("Rectangle",1,0);
		points[0]=new Point(otherRechtangle.points[0]);
		height=otherRechtangle.height;
		width=otherRechtangle.width;
	}
	@Override
	public boolean isValid() {
		return height>0&&width>0;
	}
	@Override
	public void initialize() {
		do {
			System.out.println("Anfangspunkt: ");
			points[0].initialize();
			System.out.println("Hoehe: ");
			height=Help.INPUT.nextDouble();
			System.out.println("Breite: ");
			width=Help.INPUT.nextDouble();
		}while(!isValid());
	}
	@Override
	public double calculatePerimeter() {
		return height*2+width*2;
	}
	@Override
	public double calculateArea() {
		return height*width;
	}
	@Override
	public String getType() {
		return(height==width)?"Quadrat":"Rechteteck";
	}
	@Override
	public String toString() {
		return points[0]+"-["+height+", "+width+ "]";
	}
	public void print() {
		double perimerter=calculatePerimeter();
		System.out.format("%s,%s, U=%s, F=%s\n",this,getType(),perimerter,calculateArea());
	}
	@Override
	public boolean equal(GeometricObject otherGeometricObject) {
		if(otherGeometricObject instanceof GeometricObject) {
			Rechtangle otherRechtangle=(Rechtangle) otherGeometricObject;
			boolean sameHeight=Help.equal(height, otherRechtangle.height);
			boolean sameWidth=Help.equal(width, otherRechtangle.width);
			boolean sameHeightReversed=Help.equal(height,otherRechtangle.width);
			boolean sameWidthReversed=Help.equal(width,otherRechtangle.height );
			return (sameHeight&&sameWidth)||(sameHeightReversed&&sameWidthReversed);
		}else {
			return false;
		}
	}
	@Override
	public Shape createShape(int scale) {
	double scaledX=points[0].x*scale;
	double scaledY=points[0].y*scale;
	double scaledHeight=height*scale;
	double scaledWidth=width*scale;
	return new javafx.scene.shape.Rectangle(scaledX,scaledY,scaledWidth,scaledHeight);
	}
	@Override
	public boolean contains(double x, double y) {
		boolean xInside=points[0].x<x&&x<(points[0].x+width);
		boolean yInside=points[0].y<y&&y<(points[0].y+height);
		return xInside&&yInside;
	
	}
	

}
