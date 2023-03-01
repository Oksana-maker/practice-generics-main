package org.itstep.step02;

public class PairDriver {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "A");
        System.out.print(p1.getSecond());
        System.out.println(p1.getFirst());
        Pair<String, Integer> p = new Pair<>("a", 1);
        System.out.print(p.getSecond());
        System.out.println(p.getFirst());
        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[1] = new Pair<String, Integer>("Bridgeforth Stadium", 25000);
        stadiums[0] = new Pair<String, Integer>("Michigan Stadium", 109901);
        stadiums[2] = new Pair<String, Integer>("Lane Stadium", 66233);
        for (Pair s : stadiums) {
            System.out.println(s);
        }
        System.out.println(largestStadium(stadiums));
    }

    public static String largestStadium(Pair[] stadiums) {
        var max = stadiums[0];
        if (stadiums != null) {
            for (int i = 1; i < stadiums.length; i++) {
                if ((stadiums[i].compareTo(max)) > 0) {
                    max = stadiums[i];
                }
            }
        }
        return max.getFirst().toString();
    }
}
