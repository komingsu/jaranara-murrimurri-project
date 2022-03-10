
import java.util.*;

public class EX4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter seconds : ");
		int time = scanner.nextInt();
		
		int hour = time / 3600;
				
		int minute = (time - hour*3600)/60;

		int second = time - hour*3600 - minute*60;

		System.out.printf("����ð��� %d �ð� %d �� %d �� �Դϴ�", hour, minute, second);
		
		scanner.close();
		
	}
}
