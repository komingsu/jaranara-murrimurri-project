import java.util.*;

public class LocalGlobalPrac {
    
    public static void main(String[] args) {

        DiceRoller diceRoller = new DiceRoller();
        
    }
}

class DiceRoller {

// 전역변수로 지정
    Random random;
    int number;


    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
