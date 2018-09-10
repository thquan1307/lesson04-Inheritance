package quan.dev;

import quan.dev.Circle;
import quan.dev.Shape;
import quan.dev.Square;
import quan.dev.Triangle;

public class JavaInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double max = 0;
		double min = 0;
		Shape shapes[] = new Shape[10];
		shapes[0] = new Square(1,2);
		shapes[1] = new Square(3, 4);
		shapes[2] = new Square(3, 7);
		shapes[3] = new Circle(7);
		shapes[4] = new Circle(8);
		shapes[5] = new Circle(2);
		shapes[6] = new Circle(5);
		shapes[7] = new Triangle(2, 3, 4);
		shapes[8] = new Triangle(7, 8, 9);
		shapes[9] = new Triangle(5, 3, 4);
		
		for(int i = 0; i < shapes.length; i++)
			System.out.println("Dien tich: " + shapes[i].dienTich());
		
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i].dienTich() > max)
				max = shapes[i].dienTich();
		}
		
		min = shapes[0].dienTich();
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i].dienTich() < min)
				min = shapes[i].dienTich();
		}
		
		System.out.println("Dien tich lon nhat la: "+ max);
		System.out.println("Dien tich be nhat la: "+min);
		
	}

}
