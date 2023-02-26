package org.itstep.step02;

public class PairDriver {

    public static void main(String[] args) {

        Pair<String,Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<String, Integer>("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair<String, Integer>("Michigan Stadium", 109901);
        stadiums[2] = new Pair<String, Integer>("Lane Stadium", 66233);//???
        for (Pair s : stadiums) {
            System.out.println(s);
        }
        System.out.println(largestStadium(stadiums));
    }
    public static String largestStadium(Pair[] stadiums) {
        Object name = null;
        if (stadiums != null) {
            for (int i = 0; i < stadiums.length - 1; i++) {
                if ((stadiums[i+1].getSecond().compareTo(stadiums[i].getSecond()))>0) {
                    name = stadiums[i].getFirst();
                } else {
                    name = stadiums[i + 1].getFirst();
                }
            }
        }
        return name.toString();
    }

}
