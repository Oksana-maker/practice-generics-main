package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Arrays;
import java.util.Iterator;

public class Pairs<K extends Comparable, V extends Comparable> implements Iterable<Pair<K, V>> {
    public static int id = 0;
    Pair<K, V>[] pairs = new Pair[10];

    public Pairs() {
    }

    public void addPair(K f, V s) {
        if (id < pairs.length) {
            pairs[id] = new Pair<>(f, s);
            id++;
        }
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

            @Override
            public boolean hasNext() {
                return i < pairs.length;
            }


            @Override
            public Pair<K, V> next() {
                return (Pair<K, V>) pairs[i++];
            }
//            @Override
//            public void remove() {
//
//                for (int j = 0; j < pairs.length-1; j++) {
//                    if (next().equals(pairs[i])) {
//                        Pair[]p = new Pair[pairs.length-1];
//                        pairs = Arrays.copyOf(pairs, pairs.length - 1);
//                        System.arraycopy(pairs,0, p, 0, pairs.length-1);
//
//                    }
//                }
//
//          }


       };


    }

    public Pair<K, V> get(int i) {
        return (Pair<K, V>) pairs[i];
    }
}
