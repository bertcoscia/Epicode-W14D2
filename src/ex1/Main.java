package ex1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number between 1 and 10");
        int input = Integer.parseInt(scanner.nextLine());
        HashSet<String> wordsSet = new HashSet<>();
        for (int i = 0; i < input; i++) {
            System.out.println("Write a word");
            String inputWord = scanner.nextLine();
            wordsSet.add(inputWord);
        }
        for (String word : wordsSet) {
            System.out.println(word);
        }
    }
}
