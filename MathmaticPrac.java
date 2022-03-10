import java.util.Scanner;
import java.math.*;

public class MathmaticPrac {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		
		double z1 = Math.max(x, y);
		double z2 = Math.abs(y);
		double z3 = Math.sqrt(z2);
		double z4 = Math.ceil(x);
		double z5 = Math.floor(x);
		
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		System.out.println(Math.log(25));

		double x1;
		double y1;
		double z6;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter side x: ");
		x1 = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y1 = scanner.nextDouble();
		
		z6 = Math.sqrt((x1*x1)+(y1*y1));
		
		System.out.println("The hypotenuse is " + z6);
		
		scanner.close();
		
	}

}
