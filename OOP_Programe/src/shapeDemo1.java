import java.util.*;

public class shapeDemo1 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

		System.out.print("Enter radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();

		circle Cir =new circle(null,radius);
		System.out.println("Circle["+Cir+"]");
		System.out.println("Circle[area="+Cir.getArea()+"]");


		System.out.println();

		cylinder Cyl =new cylinder(radius,height);
		System.out.println("Cylinder["+Cyl+"]");
		System.out.println("Cylinder[area="+Cyl.getArea()+"]");
		System.out.println("Cylinder[volume="+Cyl.getVolume()+"]");



	}

}