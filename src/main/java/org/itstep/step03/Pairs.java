package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Arrays;
import java.util.Iterator;

public class Pairs<K extends Comparable, V extends Comparable> implements Iterable<Pair<K, V>> {
    public static int id = 0;
    Pair<K, V>[] pairs = new Pair[10];

    public Pairs() {
    }

    public boolean addPair(K f, V s) {
        if (id < pairs.length) {
            pairs[id] = new Pair<>(f, s);
            id++;
            return true;
        }
        addSize();
        return false;
    }

    public void addSize() {
        pairs = Arrays.copyOf(pairs, pairs.length + 1);
    }

    @Override
    public String toString() {
        return "Pairs{" +
                "pairs=" + Arrays.toString(pairs) + '}';
    }

    @Override
    public Iterator<Pair<K, V>> iterator
            () {
        return new Iterator<Pair<K, V>>() {
            int i = 0;
            int cursor = -1;

            @Override
            public boolean hasNext() {
                return i < id;
            }

            @Override
            public Pair<K, V> next() {
                cursor++;
                return (Pair<K, V>) pairs[i++];

            }

            @Override
            public void remove() {
                for (int j = cursor; j < id - 1; j++) {
                    pairs[j] = pairs[j + 1];
                }
                id--;

            }
        };
    }

    public Pair<K, V> get(int i) {
        return (Pair<K, V>) pairs[i];
    }
}
