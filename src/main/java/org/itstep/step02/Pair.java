package org.itstep.step02;

public class Pair<K extends Comparable, V extends Comparable> implements Comparable<Pair<K, V>> {

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
    public int compareTo(Pair<K, V> o) {
        return this.getSecond().compareTo(o.getSecond());
    }
}
