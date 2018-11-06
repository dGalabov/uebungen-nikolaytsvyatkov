package geometry;

public class RechtangleDemo {
	public static void main(String[] args) {
		Rechtangle rechtangle1=new Rechtangle();
		Point startPoint2=new Point(1,1);
		Rechtangle rechtangle2=new Rechtangle(startPoint2,2,3);
		Rechtangle rechtangle3=new Rechtangle(rechtangle2);
		Rechtangle rechtangle4=new Rechtangle();
		rechtangle4.initialize();
		rechtangle1.print();
		rechtangle2.print();
		rechtangle3.print();
		rechtangle4.print();
		System.out.println("Rechteck 2 gleich Rechteck 1: "+rechtangle2.equal(rechtangle1));
		System.out.println("Rechtteck 2 gleich Rechtteck 3"+rechtangle2.equal(rechtangle3));
	}

}
