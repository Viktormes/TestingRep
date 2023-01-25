package calculator;

import java.time.LocalTime;
import java.util.Random;

public class Calculator {
    public static int test(int i, int i1) {
        return i + i1;
    }

    public static int commonCount(int[] array1, int[] array2) {
        int count = 0;
        if (array1 == null || array2 == null)
            return 0;
        for (int k : array1)
            for (int i : array2)
                if (k == i)
                    count++;
        return count;
    }

    public static String greeting(String name, LocalTime currentTime) {

        if (currentTime.isAfter(LocalTime.NOON))
            return "Good afternoon " + name;
        return "Good morning " + name;


    }

    public static class Dice {

        public int roll() {
            Random random = new Random();
            return random.nextInt(1,7);

    }




        }
    }

