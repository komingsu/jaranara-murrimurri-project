
import java.util.Scanner;

class ScannerEX1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");

        // scanner 의 nextInt는 \n 이 없기 때문에 새로운 nextLine 으로 내려줘야한다.
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite food");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);

    }
}