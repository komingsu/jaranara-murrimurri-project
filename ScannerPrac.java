import java.util.Scanner;

public class ScannerPrac {

	public static void main(String[] args) {
		
		Scanner taker = new Scanner(System.in);
		
		System.out.println("What is your name");
		String name = taker.nextLine();
		System.out.println("How old are you?");
		
		// scanner 의 nextInt는 \n 이 없기 때문에 새로운 nextLine 을 추가해줘야 내용을 받을수 있다.
		int age = taker.nextInt();
		taker.nextLine();
		
		System.out.println("What is your favorite food?");
		String food = taker.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You like " + food);
	}
}
