// 배열의 인덱스가 범위를 벗어날 때 발생하는 오류를 처리해라

// catch 를 통해 오류를 잡는것은 오류가 나면 프로그램의 작동 자체가 멈추는 것을 방지하기 위함이다.
// 오류가 뜨더라도 코드를 마저 작성시키기 위해서 오류를 처리한다.

public class HW16_3 {
    
    public static void main (String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 0;
        try {
            for (int i = 0; i<5; i++) {
                intArray[i+1] = i+1 + intArray[i];
                System.out.println("intArray["+i+"] = " + intArray[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }
    }
}