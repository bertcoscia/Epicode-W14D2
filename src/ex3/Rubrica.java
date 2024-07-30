package ex3;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private static final HashMap<String, String> rubrica = new HashMap<>();

    public static void addContact(String name, int phone) {
        rubrica.put(name.toLowerCase(), Integer.toString(phone));
    }

    public static void deleteContact(String name) {
        if (rubrica.get(name) != null) {
            rubrica.remove(name);
        } else {
            System.err.println("Couldn't eliminate contact because it was not possible to find the name");
        }
    }

    public static void findContactNumber(int phone) {
        String result = "";
        String number = Integer.toString(phone);
        for (String name : rubrica.keySet()) {
            if (number.equals(rubrica.get(name))) {
                result = name;
            }
        }

        if (!result.isEmpty()) {
            System.out.println(result);
        } else {
            System.err.println("Couldn't find the contact");
        }
    }

    public static void findContactName(String name) {
        if (rubrica.get(name) != null) {
            System.out.println(name.toLowerCase() + " " + rubrica.get(name));
        } else {
            System.err.println("Couldn't find the number");
        }
    }

    public static void print() {
        Set<String> keys = rubrica.keySet();
        for (String key : keys) {
            System.out.println(key + " " + rubrica.get(key));
        }
    }

    public static void main(String[] args) {

        try {
            addContact("aldo", 11111111);
            addContact("giovanni", 2222222);
            addContact("giacomo", 333333);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(rubrica);
        findContactName("giovanni");
        findContactNumber(11111111);
    }
}
