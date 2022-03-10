
import java.util.*;

public class EX1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number 1 : ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Number 2 : ");
		double num2 = scanner.nextDouble();
		
		double plus = num1 + num2;
		double minus = num1 - num2;
		double multi = num1 * num2;
		double division = num1 / num2;
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multi);
		System.out.println(division);
		
	}
}
