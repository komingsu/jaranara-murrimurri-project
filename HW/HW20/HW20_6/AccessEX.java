package HW20.HW20_6;
// 예제 4-10 멤버의 접근 지정자
// Sample 과 AccessEX 클래스는 같은 패키지에 저장된다
// 컴파일 오류를 찾고 이유를 찾아라

class Sample {
    public int a;
    private int b;
    int c;
}

public class AccessEX {

    public static void main(String[] args) {
        
        Sample sample = new Sample();
        sample.a = 10;
        sample.b = 10;
        sample.c = 10;

        System.out.println(sample.a);
        System.out.println(sample.b);
        System.out.println(sample.c);
    }
}
// 오류가 발생한 이유는 b 의 경우 private 이기 때문에 같은 패키지 일지라도 변수값을 공유받을 수 없다.
// private는 class 안에서만 정보가 유효하다
// default, protected 는 같은 패키지 안에서 까지
// public 은 모든 영역에서 공유가능하다