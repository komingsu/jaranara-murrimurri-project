import java.util.Scanner;

public class ScannerPrac {

	public static void main(String[] args) {
		
		Scanner taker = new Scanner(System.in);
		
		System.out.println("What is your name");
		String name = taker.nextLine();
		System.out.println("How old are you?");
		
		// scanner �� nextInt�� \n �� ���� ������ ���ο� nextLine �� �߰������ ������ ������ �ִ�.
		int age = taker.nextInt();
		taker.nextLine();
		
		System.out.println("What is your favorite food?");
		String food = taker.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You like " + food);
	}
}
