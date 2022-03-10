
import java.util.*;

public class EX5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Է��� �ּ��� : ");
		int num1 = scanner.nextInt();
		
		System.out.println("������ ���� �Է��� �ּ��� : ");
		int num2 = scanner.nextInt();
		
		if(num2 != 0) {
			double num3 = num2/num1;
			System.out.println(num3);
		}
		
		else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
}
