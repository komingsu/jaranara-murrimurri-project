package HW20_7;

// 예제 4-12 static을 이용한 환율 계산기

import java.util.*;

class CurrencyConverter {

    private static double rate; // 1달러-원화

    public static double toDollar(double won) {
        return won/rate;
    }

    public static double toKWR(double dollar) {
        return dollar*rate;
    }

    public static void setRate(double r) {
        rate = r;
    }
}

public class StaticMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("환율(1달러) : ");
        double rate = sc.nextDouble();
        CurrencyConverter.setRate(rate);
        System.out.println("한화 1000000원은 "+CurrencyConverter.toDollar(1000000)+"달러 입니다.");
        System.out.println("100달러는 한화"+CurrencyConverter.toKWR(100)+"원 입니다.");
        sc.close();
    }
}
