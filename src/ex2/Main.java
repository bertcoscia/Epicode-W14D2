package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static List randomNumbers(int num) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Random random = new Random();
            numbersList.add(random.nextInt(0, 100));
        }
        System.out.println(numbersList);
        return numbersList;
    }

    public static List listHandler(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        newList.addAll(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            int number = list.get(i);
            newList.add(number);
        }
        System.out.println(newList);
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = randomNumbers(3);
        List<Integer> list2 = listHandler(list1);
    }
}