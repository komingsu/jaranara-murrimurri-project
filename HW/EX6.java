
import java.util.*;
public class EX6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int num3=0;
		
		System.out.println("서로 다른 숫자 3개를 입력해 주세요");
		System.out.println("첫번째 숫자");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자");
		num2 = sc.nextInt();
		System.out.println("세번째 숫자");
		num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {}
		else if(num2>=num2 && num2>=num3) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if(num3>num2 && num3>num1) {
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num3>num2) {
			int temp=num2;
			num2=num3;
			num3=temp;
		}
		
		System.out.println(num1+">>"+num2+">>"+num3);
	}
}