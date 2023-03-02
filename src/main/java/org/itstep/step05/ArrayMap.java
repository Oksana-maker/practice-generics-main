package org.itstep.step05;

import org.itstep.step02.Pair;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayMap<K extends Comparable, V extends Comparable> implements Iterable<Pair<K, V>> {

    Pair<K, V>[] pairs = new Pair[0];

    public ArrayMap() {
    }

    public void addPair(String key, String value) {
        pairs = Arrays.copyOf(pairs, pairs.length + 1);
        pairs[pairs.length - 1] = new Pair(key, value);
    }

    @Override
    public String toString() {
        return "ArrayMap{" + Arrays.toString(pairs) +
                '}';
    }

    @Override
    public Iterator<Pair<K, V>> iterator() {
        return new Iterator<Pair<K, V>>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return pairs.length > i;
            }

            @Override
            public Pair<K, V> next() {
                return (Pair<K, V>) pairs[i++];
            }
        };
    }
}
