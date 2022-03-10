public class PrintfPrac {
    
    public static void main(String[] args) {
        
        boolean myBoolean = true;
        char myChar = '@';
        String myString ="Bro";
        int myInt = 50;
        double myDouble = 3.145296;
        
        // [conversion-character]
        System.out.printf("%b This is a format string\n", myBoolean);
        System.out.printf("%c This is a format string\n", myChar);
        System.out.printf("%s This is a format string\n", myString);
        System.out.printf("%d This is a format string\n", myInt);
        System.out.printf("%f This is a format string\n", myDouble);
        
        // [width]
        System.out.printf("Hello %10s\n", myString); //Left sapce
        System.out.printf("Hello %-10s\n", myString); //right sapce

        // [precicion]
        System.out.printf("You hace this much money %.2f\n", myDouble);
        System.out.printf("You hace this much money %20f\n", myDouble);
        System.out.printf("You hace this much money %020f\n", myDouble);
        System.out.printf("You hace this much money %+f\n", myDouble);
        System.out.printf("You hace this much money %,f\n", myDouble);


    }
}
