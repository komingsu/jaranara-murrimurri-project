import java.util.*;

public class ForEachLoopPrac {
    public static void main(String[] args) {

        // array 나 arrayList에 있는 요소들 다 꺼내기
        String[] animals = {"cat","dog","rat","bird"};
        ArrayList<String> animal = new ArrayList<String>();

        animal.add("cat");
        animal.add("dog");
        animal.add("rat");
        animal.add("bird");
        


        for(String i : animal) {
            System.out.println(i);
        }
        
        for(String i : animals) {
            System.out.println(i);
        }











    }
}
