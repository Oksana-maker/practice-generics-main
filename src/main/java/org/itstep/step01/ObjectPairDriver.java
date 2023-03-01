package org.itstep.step01;

public class ObjectPairDriver {
    public static void main(String[] args) {

        ObjectPair[] stadiums = new ObjectPair[3];
        stadiums[1] = new ObjectPair("Bridgeforth Stadium", 25000);
        stadiums[2] = new ObjectPair("Michigan Stadium", 109901);
        stadiums[0] = new ObjectPair("Lane Stadium", 66233);//???
        for (ObjectPair s : stadiums) {
            System.out.println(s);
        }

        System.out.println(largestStadium(stadiums));
    }

    public static String largestStadium(ObjectPair[] stadiums) {
        if (stadiums != null) {
            Object name = null;
            int max = 0;
            for (int i = 0; i < stadiums.length; i++) {
                if ((int) (stadiums[i].getSecond()) > max) {
                    max = (int) stadiums[i].getSecond();
                    name = stadiums[i].getFirst();
                }
            }
            return (String) (name);
        } else {
            return null;
        }


    }

}
