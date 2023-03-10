package org.itstep.step03;

import org.itstep.step02.Pair;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;


class PairsTest {

    @Test
    public void testPairsAddThenIterateWithinCapacity() {
        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
        for (int i = 0; i < 10; i++) {
            pairs.addPair("A" + i, i);
        }

        int i = 0;
        for (Pair<String, Integer> pair : pairs) {
            assertEquals(pair.getFirst(), "A" + i);
            assertEquals(pair.getSecond(), Integer.valueOf(i));
            i++;
        }
    }

    @Test
    public void testPairsAddBeyondCapacity() {

        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
        for (int i = 0; i < 10; i++) {
            assertTrue(pairs.addPair("A" + i, i));
        }

        assertFalse(pairs.addPair("B", 20));

        int i = 0;
        for (Pair<String, Integer> pair : pairs) {
            assertEquals(pair.getFirst(), "A" + i);
            assertEquals(pair.getSecond(), Integer.valueOf(i));
            i++;
        }
        assertEquals(10, i);
    }

    @Test
    public void testPairsRemove() {
        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
        for (int i = 0; i < 10; i++) {
            assertTrue(pairs.addPair("A" + i, i));
        }

        Iterator<Pair<String, Integer>> iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Pair<String, Integer> pair = iterator.next();
            /* Remove any with an even second value */
            if ((pair.getSecond() % 2) == 0) {
                iterator.remove();
            }
        }

        int i = 1;
        for (Pair<String, Integer> pair : pairs) {
            assertEquals(pair.getFirst(), "A" + i);
            assertEquals(pair.getSecond(), Integer.valueOf(i));
            i += 2;
        }
        assertEquals(11, i);
    }

//
//    @Test
////    public void testPairsDoubleRemoveThrowsException() {
//        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
//        for (int i = 0; i < 15; i++) {
//            pairs.addPair("A" + i, i);
//        }
//
//        Iterator<Pair<String, Integer>> iterator = pairs.iterator();
//        assertTrue(iterator.hasNext());
//        iterator.next();
//        iterator.remove();
//        assertThrows(IllegalStateException.class, () -> iterator.remove());
//
//    }
//
//    @Test
//    public void testPairsExceptionIfNextCalledWithNoMoreElements() {
//        Pairs<String, Integer> pairs = new Pairs<String, Integer>();
//
//        pairs.addPair("A", 1);
//
//        Iterator<Pair<String, Integer>> iterator = pairs.iterator();
//        assertTrue(iterator.hasNext());
//        iterator.next();
//        assertThrows(NoSuchElementException.class, () -> iterator.next());
//    }

}
