import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class VarA_Task4_Chapter2 {
    public static void main(String[] args) {
        int[] numbers = readNumbersFromConsole();

        int result = findMinUniqueDigitsNumber(numbers);
        System.out.println("Число с минимальным количеством различных цифр: " + result);
    }

    private static int[] readNumbersFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через пробел: ");

        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        return numbers;
    }

    private static int findMinUniqueDigitsNumber(int[] numbers) {
        int minUnique = Integer.MAX_VALUE;
        int result = numbers[0];

        for (int num : numbers) {
            int unique = countUniqueDigits(num);
            if (unique < minUnique) {
                minUnique = unique;
                result = num;
            }
        }
        return result;
    }

    // Подсчет цифр
    private static int countUniqueDigits(int number) {
        Set<Character> digits = new HashSet<>();
        for (char c : String.valueOf(number).toCharArray()) {
            digits.add(c);
        }
        return digits.size();
    }
}