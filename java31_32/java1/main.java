package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 2, 1);
        List<Integer> list2 = List.of(3, 2, 11);
        List<Integer> list3 = List.of(3, 21, 11);

        int sum1 = calculateSum(list1);
        int sum2 = calculateSum(list2);
        int sum3 = calculateSum(list3);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    private static int calculateSum(List<Integer> list) {
        int sum = 0;
        for (Integer e : list) {
            sum += e;
        }
        return sum;
    }
}
