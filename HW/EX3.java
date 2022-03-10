
import java.util.*;

public class EX3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculate mod : 1-Plus, 2-Minus, 3-Multi, 4-Division \nEnter the mod ");
		int modtype = scanner.nextInt();
		
		if(modtype==1) {
			plus();
		}
		
		if(modtype==2) {
			minus();
		}
		
		if(modtype==3) {
			multi();
		}
		
		if(modtype==4) {
			division();
		}
		
			
		}
		
		
	static void plus() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number 1 : ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Number 2 : ");
		double num2 = scanner.nextDouble();
		
		double plus = num1 + num2;
		System.out.println(plus);
				
		}
	
	static void minus() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number 1 : ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Number 2 : ");
		double num2 = scanner.nextDouble();
		
		double minus = num1 - num2;
		System.out.println(minus);
	}
	
	static void multi() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number 1 : ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Number 2 : ");
		double num2 = scanner.nextDouble();
		
		double multi = num1 * num2;
		System.out.println(multi);
	}
	
	static void division() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number 1 : ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Number 2 : ");
		double num2 = scanner.nextDouble();
		
		double division = num1 / num2;
		System.out.println(division);
	}

}
