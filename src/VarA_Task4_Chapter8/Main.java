package VarA_Task4_Chapter8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.println("Введите номер символа k: ");
        int k = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите подстроку для вставки: ");
        String substring = scanner.nextLine();

        if(k<0 || k>= inputString.length()){
            System.out.println("Ошибка");
        } else {
            String result = inputString.substring(0, k + 1) + substring + inputString.substring(k+1);
            System.out.println("Резульатт: " + result);
        }
        scanner.close();

    }

}
