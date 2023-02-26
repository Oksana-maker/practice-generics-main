package org.itstep.step01;

/**
 * Класс для тестирования кортежа ObjectPair
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class ObjectPairDriver {

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
    public static void main(String[] args) {

        ObjectPair[] stadiums = new ObjectPair[5];
        stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
        stadiums[1] = new ObjectPair("Michigan Stadium", 109901);
        stadiums[2] = new ObjectPair("Buffalo", 250000);
        stadiums[3] = new ObjectPair("Kiev", 309901);
        stadiums[4] = new ObjectPair("Lane Stadium", "66,233");//???
        for (ObjectPair s:stadiums) {
            System.out.println(s);
        }

//        System.out.println(stadiums);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Возвращает название стадиона с наибольшей вместимостью.
     *
     * @param stadiums Массив ObjectPairs, где каждая пара содержит название стадиона, за которым следует целое число
     * @return Название стадиона с наибольшей вместимостью
     */
    public static String largestStadium(ObjectPair[] stadiums) {
       if (stadiums!=null){
           Object name = null;
           for (int i = 0; i < stadiums.length-2; i++) {
               if ((int)(stadiums[i].getSecond())>(int)(stadiums[i+1]).getSecond()){
                   name = stadiums[i].getFirst();
               }else {
                   name = stadiums[i+1].getFirst();
               }
           } 
           return (String)(name);
       }else {
           return null;
       }


    }

}
