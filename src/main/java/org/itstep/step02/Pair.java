package org.itstep.step02;


import java.util.Iterator;

public class Pair<K, V extends Comparable> implements Iterable,Comparable <Pair> {

    private final K first;
    private final V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "<" + first.toString() + ", " + second.toString() + ">";
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int compareTo(Pair o) {
        return o.compareTo((Pair) this.getSecond());
    }
}
