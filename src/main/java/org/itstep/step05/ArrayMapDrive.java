package org.itstep.step05;

import org.itstep.step02.Pair;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayMapDrive {
    public static void main(String[] args) {
        ArrayMap<String, String> dictionary = new ArrayMap<>();
        dictionary.addPair("dictionary", "словник");
        dictionary.addPair("food", "їжа");
        dictionary.addPair("wave", "хвиля");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:  ");

        String s = scanner.nextLine();

        Iterator<Pair<String, String>> iterator = dictionary.iterator();
        while (iterator.hasNext()) {
            Pair<String, String> pair = iterator.next();
            if (pair.getFirst().equals(s)) {
                System.out.println(pair.getSecond());
            }
        }
    }

}
