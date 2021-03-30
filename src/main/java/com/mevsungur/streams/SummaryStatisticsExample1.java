package com.mevsungur.streams;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class SummaryStatisticsExample1 {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(20, 40, 100, 10, -10, -4, 2, 66);

        DoubleSummaryStatistics doubleSummaryStatistics = integers.stream().mapToDouble(i -> i).summaryStatistics();

        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getAverage());
        System.out.println(doubleSummaryStatistics.getSum());
    }
}
