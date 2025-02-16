package VarA_Task1_Chapter1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NumberLengthFinder {
    public static void main(String[] args) {
        /** Массив чисел для анализа */
        int[] numbers = {123, 45, 6789, 2, 987654, 567};
        /** Переменные для хранения самого короткого и самого длинного числа */
        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        /** Поиск самого короткого и длинного числа */
        for (int num : numbers) {
            if (String.valueOf(num).length() < String.valueOf(minNumber).length()) {
                minNumber = num;
            }
            if (String.valueOf(num).length() > String.valueOf(maxNumber).length()) {
                maxNumber = num;
            }
        }

        /** Вывод результатов */
        System.out.println("Самое короткое число: " + minNumber + ", длина: " + String.valueOf(minNumber).length());
        System.out.println("Самое длинное число: " + maxNumber + ", длина: " + String.valueOf(maxNumber).length());

        /** Вывод фамилии разработчика и времени выполнения задания */
        printDeveloperInfo();
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
