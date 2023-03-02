package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Пример применения класса Pairs123
 *
 * @author Michael S. Kirkpatrick
 * @version V1, 8/2017
 */

public class PairsDriver {

    public static void main(String[] args) {
        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
        for (int i = 0; i < 15; i++) {
            pairs.addPair("A" + i, i);
        }
        for (Pair<String, Integer> pair : pairs) {
            System.out.print(pair.toString());
        }
        System.out.println();
        Iterator<Pair<String, Integer>> iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Pair<String, Integer> pair = iterator.next();
            if ((pair.getSecond() % 2) == 0) {
                iterator.remove();
            }
        }

        for (Pair<String, Integer> pair : pairs) {
            System.out.print(pair.toString());
        }
        System.out.println();

        pairs.addPair("B", 10);

        for (Pair<String, Integer> pair : pairs) {
            System.out.print(pair.toString());
        }
        System.out.println();

    }
}

