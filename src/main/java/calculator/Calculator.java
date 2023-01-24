package calculator;

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
}
