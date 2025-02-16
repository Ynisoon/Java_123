package VarA_Task2_Chapter2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NumberSorter {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        /** Запрос количества чисел */
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        /** Массив для хранения введенных чисел */
        String[] numbers = new String[n];

        /** Ввод чисел с консоли */
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLine();


        }

        /** Сортировка чисел по длине в порядке возрастания */
        Arrays.sort(numbers, Comparator.comparingInt(String::length));

        /** Вывод чисел по возрастанию длины */
        System.out.println("\nЧисла по возрастанию длины:");
        for (String num : numbers) {
            System.out.println(num + " (длина: " + num.length() + ")");
        }

        /** Сортировка чисел по длине в порядке убывания */
        Arrays.sort(numbers, Comparator.comparingInt(String::length).reversed());

        /** Вывод чисел по убыванию длины */
        System.out.println("\nЧисла по убыванию длины:");
        for (String num : numbers) {
            System.out.println(num + " (длина: " + num.length() + ")");
        }
        printDeveloperInfo();
        scanner.close();
    }

    public static void printDeveloperInfo() {
        String developer = "ФИО: Фалка В.И, ЗБ-762";
        String taskReceivedTime = "Дата и время получения задания: 2025-02-15 10:00";

        /** Получение текущей даты и времени */
        LocalDateTime now = LocalDateTime.now();
        String taskCompletedTime = "Дата и время сдачи задания: " +
                now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        /** Вывод информации */
        System.out.println("\n" + developer);
        System.out.println(taskReceivedTime);
        System.out.println(taskCompletedTime);
    }
}
