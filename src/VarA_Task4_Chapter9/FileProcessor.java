package VarA_Task4_Chapter9;

import java.io.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.Locale;

public class FileProcessor {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Дима\\IdeaProjects\\Java_123\\src\\VarA_Task4_Chapter9\\numbers.txt";

        try {
            // Чтение данных из файла
            List<Double> numbers = readNumbersFromFile(fileName);

            // Вычисление суммы и среднего значения
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            double average = sum / numbers.size();

            // Вывод результатов
            System.out.println("Сумма чисел: " + sum);
            System.out.println("Среднее значение: " + average);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл не найден.");
        } catch (OutOfMemoryError e) {
            System.err.println("Ошибка: Недостаточно памяти для обработки.");
        } catch (InvalidNumberException e) {
            System.err.println("Ошибка: Некорректное число в файле - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    // Метод для чтения чисел из файла
    public static List<Double> readNumbersFromFile(String fileName) throws InvalidNumberException, IOException {
        List<Double> numbers = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                try {

                    String[] parts = line.split(",");
                    if (parts.length != 2) {
                        throw new InvalidNumberException("Неверный формат записи: " + line);
                    }
                    String numberStr = parts[0].trim();
                    String localeStr = parts[1].trim();

                    Locale locale = localeStr.equals("US") ? Locale.US : Locale.FRANCE; // Можно добавлять другие локали

                    // Создаем объект для форматирования чисел
                    NumberFormat format = NumberFormat.getInstance(locale);
                    Number number = format.parse(numberStr);

                    // Проверяем пределы значений
                    if (number.doubleValue() > Double.MAX_VALUE || number.doubleValue() < Double.MIN_VALUE) {
                        throw new InvalidNumberException("Число выходит за пределы допустимого диапазона: " + numberStr);
                    }

                    // Добавляем число в список
                    numbers.add(number.doubleValue());

                } catch (ParseException e) {
                    throw new InvalidNumberException("Некорректное число: " + line);
                }
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return numbers;
    }
}