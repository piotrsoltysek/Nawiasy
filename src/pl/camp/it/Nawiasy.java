package pl.camp.it;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nawiasy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz tekst do sprawdzenia:");
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();

            List<Character> charList = new ArrayList<>();

            for (char tempChar : chars) {
                charList.add(tempChar);
            }

            for (int i = 0; i < charList.size(); i++) {
                if (charList.get(i).equals('(')) {
                    for (int j = i + 1; j < charList.size(); j++) {
                        if (charList.get(j).equals(')')) {
                            charList.set(i, 'X');
                            charList.set(j, 'X');
                            break;
                        }
                    }
                }
            }

            boolean stringIsOk = true;
            if (charList.contains('(') || charList.contains(')')) {
                stringIsOk = false;
            }

            if (stringIsOk) {
                System.out.println("Nawiasy się zgadzają");
            } else {
                System.out.println("Nawiasy się nie zgadzają");
            }
            System.out.println("----------------------");
        }
    }
}
