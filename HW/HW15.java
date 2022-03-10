import java.util.*;

public class HW15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String stringArray[] = new String[5];
        int intArray[] = new int[5];

        for (int i = 0; i<stringArray.length; i++) {

            System.out.print((i+1)+"번째 사람의 이름을 입력해주세요 :");
            stringArray[i] = sc.next();
            System.out.print((i+1)+"번째 사람의 나이을 입력해주세요 :");
            intArray[i] = sc.nextInt();
        }

        for (int i = 0; i<stringArray.length; i++) {
            System.out.println("["+(i+1)+"] "+stringArray[i]+" "+intArray[i]);
        }
    } 
}