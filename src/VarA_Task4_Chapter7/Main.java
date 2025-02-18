package VarA_Task4_Chapter7;

@FunctionalInterface
interface NumberChecker{
    boolean check (int number);
}

public class Main {
    public static void main(String[] args){
        NumberChecker By31 = (number -> number % 31 == 0);

        int[] testNumbers = {31, 62, 93, 45, 150};
        for (int num : testNumbers){
            System.out.println("Число " + num + " делится на 31: " + By31.check(num));
        }
    }
}
