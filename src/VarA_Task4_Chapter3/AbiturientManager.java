package VarA_Task4_Chapter3;

import java.util.Arrays;

public class AbiturientManager {
    private Abiturient[] abiturients;

    // Конструктор
    public AbiturientManager(Abiturient[] abiturients) {
        this.abiturients = abiturients;
    }

    // Метод для вывода абитуриентов с неудовлетворительными оценками
    public void printAbiturientsWithUnsatisfactoryGrades() {
        printTableHeader();
        for (Abiturient abiturient : abiturients) {
            if (abiturient.hasUnsatisfactoryGrades()) {
                printAbiturientRow(abiturient);
            }
        }
    }

    // Метод для вывода абитуриентов с суммой баллов выше заданной
    public void printAbiturientsWithSumAbove(int threshold) {
        printTableHeader();
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getSumOfGrades() > threshold) {
                printAbiturientRow(abiturient);
            }
        }
    }

    // Метод для выбора n абитуриентов с самой высокой суммой баллов
    public void printTopNAbiturients(int n) {
        // Сортируем абитуриентов по сумме баллов в порядке убывания
        Arrays.sort(abiturients, (a1, a2) -> Integer.compare(a2.getSumOfGrades(), a1.getSumOfGrades()));

        System.out.println("Топ " + n + " абитуриентов с самой высокой суммой баллов:");
        printTableHeader();
        for (int i = 0; i < n && i < abiturients.length; i++) {
            printAbiturientRow(abiturients[i]);
        }

        // Вывод абитуриентов с полупроходной суммой
        if (n < abiturients.length) {
            System.out.println("\nАбитуриенты с полупроходной суммой:");
            printTableHeader();
            for (int i = n; i < abiturients.length; i++) {
                if (abiturients[i].getSumOfGrades() == abiturients[n - 1].getSumOfGrades()) {
                    printAbiturientRow(abiturients[i]);
                }
            }
        }
    }

    // Метод для вывода заголовка таблицы
    private void printTableHeader() {
        System.out.println("+----+-----------------+-----------------+-----------------+-------------------+------------+------------+");
        System.out.println("| ID | Фамилия         | Имя             | Отчество        | Адрес             | Телефон    | Сумма баллов |");
        System.out.println("+----+-----------------+-----------------+-----------------+-------------------+------------+------------+");
    }

    // Метод для вывода строки таблицы с данными абитуриента
    private void printAbiturientRow(Abiturient abiturient) {
        System.out.format("| %2d | %-15s | %-15s | %-15s | %-17s | %-10s | %11d |\n",
                abiturient.getId(),
                abiturient.getLastName(),
                abiturient.getFirstName(),
                abiturient.getMiddleName(),
                abiturient.getAddress(),
                abiturient.getPhone(),
                abiturient.getSumOfGrades());
        System.out.println("+----+-----------------+-----------------+-----------------+-------------------+------------+------------+");
    }
}