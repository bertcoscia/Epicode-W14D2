package ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number between 1 and 10");
        int input = Integer.parseInt(scanner.nextLine());

        Set<String> wordsSet = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            System.out.println("Write a word");
            String inputWord = scanner.nextLine();
            if (!wordsSet.add(inputWord)) {
                duplicates.add(inputWord);
            }
        }

        System.out.println("Duplicated words: " + duplicates);

        System.out.println("Number of unique words: " + wordsSet.size());

        for (String word : wordsSet) {
            System.out.println(word);
        }
    }
}
