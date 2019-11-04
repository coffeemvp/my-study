package com.coffee.sort;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zhang.hp
 * @date 2019/10/14.
 */
public class JavaSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(4);
        list.add(20);
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(18);

        int[] ages = new int[100];
        for (Integer age : list) {
            if (ages[age] == 0) {
                ages[age] = 1;
            } else if (ages[age] >= 1) {
                ages[age] += 1;
            }
        }
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age > 0) {
                for (int j = 0; j < age; j++) {
                    System.out.println(i);
                }
            }
        }

        System.out.println("-------------------");
        final int filter = 10;
        list.forEach(item -> {
            if (item > filter) {
                System.out.println(item);
            }
        });

        System.out.println("-------------------");
        list.stream().sorted((x, y) -> x.compareTo(y)).forEach(item -> System.out.println(item));

        System.out.println("-------------------");

        long count = list.stream().filter(x -> x == 11).count();

        List<Integer> collect = list.stream().filter(x -> x > 10).collect(Collectors.toList());

        collect.forEach(System.out::println);

        System.out.println(count);

        System.out.println("-------------------");
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());

        Collections.sort(list, (x, y) -> x.compareTo(y));

        System.out.println(Arrays.toString(list.toArray()));

        list.stream().count();
        list.stream().skip(1);
        list.stream().limit(2);

        System.gc();
        System.runFinalization();

    }
}
