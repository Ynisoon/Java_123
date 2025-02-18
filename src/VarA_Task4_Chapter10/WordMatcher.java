package VarA_Task4_Chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordMatcher {
    public static void main(String[] args) {
        String fileName;

        if (args.length != 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите путь к файлу: ");
            fileName = scanner.nextLine();
        }else {
           fileName = args[0];
        }


        try {
            String text = readFile(fileName);
            String[] words = text.split("\\s+");
            List<String> matchingWords = new ArrayList<>();

            for (int i = 0; i < words.length - 1; i++) {
                String currentWord = words[i];  // Текущее слово
                String nextWord = words[i + 1]; // Следующее слово

                if (currentWord.charAt(currentWord.length() - 1) == nextWord.charAt(0)) {
                    matchingWords.add(currentWord + " - " + nextWord);
                }
            }

            if (matchingWords.isEmpty()) {
                System.out.println("Не найдено слов с совпадающими буквами.");
            } else {
                // Выводим найденные пары
                System.out.println("Найденные пары слов:");
                for (String pair : matchingWords) {
                    System.out.println(pair);
                }
            }
        }catch (IOException e ){
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static String readFile(String fileName) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append(" ");
        }
        reader.close();
        return content.toString();
    }
}
