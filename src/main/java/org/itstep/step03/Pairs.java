package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Arrays;
import java.util.Iterator;

public class Pairs<K, V extends Comparable> implements Iterable<Pair<K, V>> {
    public static int id = 0;
    Pair<K,V>[] pairs = new Pair[15];

    public Pairs() {
    }

    public boolean addPair(K f, V s) {
        boolean add = false;
        if (id < pairs.length-1) {
            pairs[id] = new Pair(f,s);
            id++;
            add = true;
        }
        return add;
    }

//    public boolean remove() {
//        Pair<K, V>[] temps = new Pair[pairs.length - 1];
//        for (int i = 0; i < pairs.length - 1; i++) {
//            if (i < t) {
//                temps[i] = pairs[i];
//            } else if (i > t) {
//                temps[i] = pairs[i + 1];
//            }
//        }
//
//    }

    @Override
    public Iterator<Pair<K, V>> iterator() {
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
        };
    }

    public Pair<K, V> get(int i) {
        return (Pair<K, V>) pairs[i];
    }
//    @Override
//    public void remove() {
//        throw new UnsupportedOperationException();
//    }
    @Override
    public String toString() {
        return "";
    }

}


//    @Override
//    public Iterator<Pair<K, V>> iterator() {
//        return new PairIterator();
//    }
//
//    /*
//     * TODO: Реализуйте итератор здесь на основе документации API по адресу
//     * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html Throw the exceptions as
//     * specified
//
//        /**
//         * TODO: Удалите предыдущую пару, возвращенную функцией next()
//         */
//        @Override
//        public void remove() {
//            throw new UnsupportedOperationException();
//        }
//    }
//}
