package VarA_Task4_Chapter3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Массив Абитурентов
        Abiturient[] abiturients = {
                new Abiturient(1, "Иванов", "Иван", "Иванович", "ул. Ленина, 10", "123-456", new int[]{5, 4, 3}),
                new Abiturient(2, "Петров", "Петр", "Петрович", "ул. Пушкина, 5", "234-567", new int[]{2, 3, 4}),
                new Abiturient(3, "Сидорова", "Мария", "Сергеевна", "ул. Гагарина, 15", "345-678", new int[]{5, 5, 5}),
                new Abiturient(4, "Козлов", "Алексей", "Алексеевич", "ул. Мира, 20", "456-789", new int[]{4, 4, 4}),
                new Abiturient(5, "Смирнова", "Ольга", "Игоревна", "ул. Солнечная, 30", "567-890", new int[]{3, 3, 2})
        };

        AbiturientManager manager = new AbiturientManager(abiturients);

        //Список абитуриентов с неудовлетворительными оценками
        System.out.println("Список абитуриентов с неудовлетворительными оценками:");
        manager.printAbiturientsWithUnsatisfactoryGrades();

        //Список абитуриентов с суммой баллов выше заданной
        System.out.println("\nСписок абитуриентов с суммой баллов выше 12:");
        manager.printAbiturientsWithSumAbove(12);

        //Топ абитуриентов с самой высокой суммой баллов
        System.out.println("\nТоп 2 абитуриентов с самой высокой суммой баллов:");
        manager.printTopNAbiturients(2);
    }
}
